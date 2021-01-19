import java.util.Scanner;
class Zad2{
    public static void main(String []arg){
        Scanner sc=new Scanner(System.in);
        System.out.println("Podaj linijke tekstu");
        String tekst=sc.nextLine();
        int liczba=tekst.length();
        System.out.println("Dlugos tekstu wynosi: "+liczba);
    }
}