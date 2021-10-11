/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.listy;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;

/**
 *
 * @author maciejkolpaczek
 */
public class ReadDataForJList {
    public static DefaultListModel readData(File filename) throws IOException{
        BufferedReader in = null;
        String line;
        DefaultListModel defaultListModel=new DefaultListModel();
        try{
            in = new BufferedReader(new FileReader(filename));
            while ((line = in.readLine()) !=null){
                defaultListModel.addElement(line);
            }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ReadDataForJList.class.getName()).log(Level.SEVERE, null, ex);
        } finally{
            if (in !=null){
                in.close();
            }
        }
        //defaultListModel.addElement(4_day.txt);
        return defaultListModel;
    }
}
