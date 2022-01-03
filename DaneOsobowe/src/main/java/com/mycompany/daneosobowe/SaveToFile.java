/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.daneosobowe;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author AMD
 */
public class SaveToFile {
        public void writeTextToFile(String text) {
        try {
          File myObj = new File("dane.txt");
          if (myObj.createNewFile()) {
            System.out.println("File created: " + myObj.getName());
          } else {
            System.out.println("File already exists.");
          }
        } catch (IOException e) {
          e.printStackTrace();
        }
    }
}
