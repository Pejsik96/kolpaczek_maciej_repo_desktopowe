import java.util.Scanner;
class Zad4{
    public static void main(String [] arg){
        Scanner sc = new Scanner(System.in);
        System.out.print("Podaj pierwsza liczbe: ");
        float liczba1 = sc.nextFloat();
        System.out.print("Podaj druga liczbe: ");
        float liczba2 = sc.nextFloat();
        System.out.print("Podaj dzialanie (+ - * /): ");
        String dzialanie = sc.next();
        
        if(dzialanie.equals("+")){
            System.out.println(liczba1+" "+dzialanie+" "+liczba2+" = "+(liczba1+liczba2));
        }
        else if(dzialanie.equals("-")){
            System.out.println(liczba1+" "+dzialanie+" "+liczba2+" = "+(liczba1-liczba2));
        }
        else if(dzialanie.equals("*")){
            System.out.println(liczba1+" "+dzialanie+" "+liczba2+" = "+(liczba1*liczba2));
        }
        else if(dzialanie.equals("/")){
            System.out.println(liczba1+" "+dzialanie+" "+liczba2+" = "+(liczba1/liczba2));
        }
        else{
            System.out.println("\""+dzialanie+"\" nie ma takiego dzialania");
        }
    }
}