import java.util.Scanner;

public class Zad3 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Wporwadz zdanie a ja je zamienie na duże litery :");
        String nfzdanie = sc.nextLine();

        System.out.println("Twoje wpisane zdanie dużymi literami : " + nfzdanie.toUpperCase());

    }
}
