import java.util.Scanner;

public class Zad4 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Wyswietle ci pierwsza i ostatnia litere wpisanego tekstu");
        System.out.println("Wprowadz zdanie : ");
        String nfzdanie = sc.next();
        int nfdlugosc = nfzdanie.length();
        System.out.println("Pierwsza litera z zdania : " + nfzdanie.charAt(0) + " Ostatnia litera z zdania: " + nfzdanie.charAt(nfdlugosc - 1));



    }

}
