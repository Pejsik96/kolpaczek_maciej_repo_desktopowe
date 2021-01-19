import java.util.Scanner;
import java.lang.Math.*;
class Zad3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Podaj swoj wzrost: ");
        double wzrost = sc.nextDouble();
        System.out.print("Podaj swoj mase ciala: ");
        double masa = sc.nextDouble();
        double bmi = masa/Math.pow(wzrost, 2)*10000;
        System.out.print("Twoje BMI wynosi: "+bmi);
    }
 
}