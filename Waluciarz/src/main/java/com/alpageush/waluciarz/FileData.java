/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.alpageush.waluciarz;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author User
 */
public class FileData {
    public FileData(){
        
    }
    /*
        nazwa funkcji: saveData();
        argumenty: action(sell/buy), currency, amount(kupionej/sprzedanej), getted(ile otrzymano), price(cena) ;
        typ zwracany: -
        informacje: Zapisuje dane do pliku importantdata.csv
        autor: Tomasz Stepien;
    */
    public static void saveData(String action, String currency, BigDecimal amount,  BigDecimal getted, BigDecimal price){
        try{
            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
            Date date = new Date();  
            File f = new File("data.csv");  
            FileWriter myWriter = new FileWriter(f, true);   
            myWriter.write("\nAKCJA:"+action+";WALUTA:"+currency+";ILOSC:"+amount+";DOSTANIESZ:"+getted+";CENA:"+price+";DATA:"+formatter.format(date));
            myWriter.close();
        }catch(IOException e) {
            System.out.println("error");
            e.printStackTrace();
        }
    }
}
