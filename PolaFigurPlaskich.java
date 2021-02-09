import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class PolaFigurPlaskich {

    private static void obliczpolekwadrat(){
        Scanner nfsc = new Scanner(System.in);
        System.out.print("Podaj dlugosc boku: ");
        int nfbokkwadrat = nfsc.nextInt();
        int nfpolekwadrat = nfbokkwadrat * nfbokkwadrat;
        System.out.print("Pole kwadratu wynioslo: " + nfpolekwadrat);
    }

    private static void obliczpoleprostokat(){
        Scanner nfsc = new Scanner(System.in);
        System.out.print("Podaj dlugosc pierwszego boku: ");
        int nfbokprostokat1 = nfsc.nextInt();
        System.out.print("Podaj dlugosc drugiego boku: ");
        int nfbokprostokat2 = nfsc.nextInt();
        int nfpoleprostokat = nfbokprostokat1 * nfbokprostokat2;
        System.out.print("Pole prostokata wynioslo: " + nfpoleprostokat);
    }
    private static void zamknij(){
        Scanner nfsc = new Scanner(System.in);
        System.out.print("Wpisz exit zeby zamknac: ");
        String nfexit = nfsc.nextLine();;
        while(!nfexit.equals("exit")){
            System.exit(0);
        }
    }

    public static void main(String[]args){
        Scanner nfsc = new Scanner(System.in);
        System.out.println("OBLICZ POLA FIGUR PŁASKICH");
        System.out.println("1 - KWADRAT");
        System.out.println("2 - PROSTOKĄT");
        System.out.print("Wybierz cyfre oznaczającą dana figure: ");
        int nfwybor = nfsc.nextInt();

        if (nfwybor == 1){
            System.out.println("Wybrales kwadrat");
            obliczpolekwadrat();
        }
        else if (nfwybor == 2){
            System.out.println("Wybrales prostokat");
            obliczpoleprostokat();



        }
        else{
            System.out.println("Nie ma takiej opcji");
        }




    }
}

