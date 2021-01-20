import java.util.Scanner;
class duze{
    public static void main(String []arg){
        Scanner sc=new Scanner(System.in);
        String zdanie=sc.next();
        int dlugosc=zdanie.length()-1;
        char zdanie1=zdanie.charAt(0);
        char zdanie2=zdanie.charAt(dlugosc);
        System.out.println(zdanie1+" "+zdanie2);
    }
}