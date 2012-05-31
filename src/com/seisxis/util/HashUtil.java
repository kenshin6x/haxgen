/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.seisxis.util;

import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 *
 * @author kenshin6x
 */
public class HashUtil {

    public static String generate(String message, String algorithm) {
        try {
            java.security.MessageDigest md = java.security.MessageDigest.getInstance(algorithm.toUpperCase());
            byte[] array = md.digest(message.getBytes());
            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < array.length; ++i) {
                sb.append(Integer.toHexString((array[i] & 0xFF) | 0x100).substring(1, 3));
            }
            return sb.toString();
        } catch (java.security.NoSuchAlgorithmException e) { }
        
        return null;
    }
    
}
