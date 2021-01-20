import java.util.Scanner;
class dlugosc{
    public static void main(String []arg){
        Scanner sc=new Scanner(System.in);
        System.out.println("Podaj swoje imie: ");
        String imie=sc.nextLine();
        System.out.println("Podaj swoje nazwisko: ");
        String nazwisko=sc.nextLine();
        int imie1=imie.length();
        int nazwisko1=nazwisko.length();
        System.out.println("Imie ma: "+imie1+" a Nazwisko ma: "+nazwisko1);
    }
}