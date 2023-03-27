/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.alpageush.waluciarz;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class FileData {
    public FileData(){
        
    }
    public static void saveData(String action, String currency, BigDecimal amount,  BigDecimal getted, BigDecimal price){
        try{
            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
            Date date = new Date();  
            File f = new File("data.csv");  
            FileWriter myWriter = new FileWriter(f, true);   
            myWriter.write("\nAKCJA:"+action+";WALUTA:"+currency+";ILOSC:"+amount+";TYLE DOSTANIESZ:"+getted+";CENA:"+price+";DATA:"+formatter.format(date));
            myWriter.close();
        }catch(IOException e) {
            System.out.println("error");
            e.printStackTrace();
        }
    }
    public static String readData(String action, String currency){
        try {
            File myObj = new File("data.csv");
            Scanner myReader = new Scanner(myObj);
            ArrayList<String> prices = new ArrayList<>();
            int i=0;
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                if(data.contains(currency) && data.contains(action)){
                    String test = data.substring(data.indexOf("CENA:")+3);
                    test = test.substring(0, data.indexOf(";"));
                    prices.add(test);
                    i++;
                }
            }
            if(i>0){
                Collections.sort(prices);
                String smallest = prices.get(0);
                String biggest = prices.get(prices.size() - 1);
                myReader.close();
                return smallest+"/"+biggest;
            }else{
                return null;
            }
            
        }catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }     
        return null;
    }
}
