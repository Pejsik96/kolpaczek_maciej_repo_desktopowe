package com.mycompany.listaosobowe;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileManager {
    private File file;
    
    public FileManager(String fileName) {
        this.file = new File(fileName);
    }
    
    public void writeTextToFile(String text) {
        try {
            if(!file.exists()) file.createNewFile();
            FileWriter w = new FileWriter(file);
            w.write(text);
            w.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
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
