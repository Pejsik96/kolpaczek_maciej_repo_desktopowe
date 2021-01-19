import java.util.Scanner;
class Zad1{
    public static void main(String []arg){
        Scanner sc=new Scanner(System.in);
        final String haslo1="Haslo123";
        System.out.println("Podaj haslo: ");
        String haslo2=sc.next();
        if(haslo2.equals(haslo1)){
            System.out.println("Dobre hasło");
        }
        else{
            System.out.println("Zle haslo");
        }
    }
}