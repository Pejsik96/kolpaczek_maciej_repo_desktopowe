import java.util.Scanner;
class pionowe{
    public static void main(String []arg){
        Scanner sc=new Scanner(System.in);
        System.out.println("Podaj zdanie: ");
        String zdanie=sc.nextLine();
        int zdanie1=zdanie.length();

        for(int i=0; i<zdanie1; i++){
            System.out.println(zdanie.charAt(i));
        }
    }
}