/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schoolerpinvoicemydata.main;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import schoolerpinvoicemydata.swingClasses.MainWindowFrame;




/**
 *
 * Evangelos Batsalis
 */
public class MainClass {

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MainWindowFrame mainWindowsFrame = new MainWindowFrame();
        mainWindowsFrame.pack();
        mainWindowsFrame.setLocationRelativeTo(null);
        mainWindowsFrame.setVisible(true);   
    }
}
    

