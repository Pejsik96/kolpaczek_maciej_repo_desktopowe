package com.mycompany.listaosobowe;

public class Student {
    public String imie, nazwisko, klasa, rok;
    
    public Student(String imie, String nazwisko, String klasa, String rok) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.klasa = klasa;
        this.rok = rok;
    }
    
    public String getObjectName() {
        return imie + " " + nazwisko + ", " + rok;
    }

    @Override
    public String toString() {
        return imie + ";" + nazwisko + ";" + klasa + ";" + rok + "\n";
    }
}
