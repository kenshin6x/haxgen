/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.seisxis.main;

import com.seisxis.swing.MainWindow;
import javax.swing.UIManager;

/**
 *
 * @author kenshin6x
 */
public class Haxgen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            
            MainWindow window = new MainWindow();
            window.setVisible(true);
        } catch (Exception e) { }
    }
}
