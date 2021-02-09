
import java.util.Scanner;

public class Zad5 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Wprowadz zdanie a ja je wyświetle w poziomie");
        System.out.println("Wprowadz zdanie : ");
        String nfzdanie = sc.nextLine();

        for(int i = 0; i < nfzdanie.length();i++){
           System.out.println(nfzdanie.charAt(i));

        }

    }
}
