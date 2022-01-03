/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.daneosobowe;

/**
 *
 * @author AMD
 */
public class Dane {
    private String imie;
    private String nazwisko;
    private String klasa;
    private String rok;

    public Dane(String imie, String nazwisko, String klasa, String rok) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.klasa = klasa;
        this.rok = rok;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public String getKlasa() {
        return klasa;
    }

    public String getRok() {
        return rok;
    }
    
    
}
