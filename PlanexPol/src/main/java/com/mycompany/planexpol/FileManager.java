/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.planexpol;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author michalzuterek
 */
public class FileManager {
    private File file;
    
    public FileManager(String fileName) {
        this.file = new File(fileName);
    }
    public String readFromFile() {
        String text = "";
        if(file.exists()) {
            try {
                Scanner sc = new Scanner(file);
                while (sc.hasNextLine()) text += sc.nextLine() + "\n";
                sc.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        } else {
            try {
                file.createNewFile();
            } catch(IOException e) {
                e.printStackTrace();
            }
        }
        return text;
    }
}
