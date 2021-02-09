import java.util.Scanner;

public class Zad2 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("WPROWADZ SWOJE IMIE I NAZWISKO TO POLICZE ILE MAJA LITER \n");

        System.out.println("Podaj imie :");
        String nfimie = sc.next();
        System.out.println("Podaj nazwisko");
        String nfnazwisko = sc.next();
        System.out.println("Wprowadzone Imię ma: " + nfimie.length() + " a Nazwisko ma: " + nfnazwisko.length() + " znaków");
    }
}
