

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class PolaFigurPlaskich {

    private static void zapisdopliku(){
      //  FileWriter nffile = new FileWriter("prostokat.txt");
      //  FileWriter nffile = new FileWriter("kwadrat.txt");
    }

    private static void kwadrat() {
        Scanner nfsc = new Scanner(System.in);

        System.out.print("Podaj dlugosc boku: ");
        int nfbokkwadrat = nfsc.nextInt();
        if (nfbokkwadrat < 1) {
            System.out.println("Nie mozna wprowadzac wartosci zerowych lub ujemnych");
        }
        else {
            int nfpolekwadrat = nfbokkwadrat * nfbokkwadrat;
            int nfobwodkwa = 4 * nfbokkwadrat;

            for (int nfi = 0; nfi < nfbokkwadrat; nfi++) {
                for (int nfj = 0; nfj < nfbokkwadrat; nfj++)
                    if ((nfi == 0) || (nfi == nfbokkwadrat - 1))
                        System.out.print("*");
                    else if ((nfj == 0) || (nfj == nfbokkwadrat - 1)) System.out.print("*");
                    else System.out.print(" ");
                System.out.println();
            }
            System.out.print("Pole kwadratu wynioslo: " + nfpolekwadrat + "\nA obwód: " + nfobwodkwa);
        }
    }

    private static void prostokat(){
        Scanner nfsc = new Scanner(System.in);

        System.out.print("Podaj dlugosc pierwszego boku: ");
        int nfbokprostokat1 = nfsc.nextInt();
        System.out.print("Podaj dlugosc drugiego boku: ");
        int nfbokprostokat2 = nfsc.nextInt();
        if (nfbokprostokat1 < 1 || nfbokprostokat2 < 1) {
            System.out.println("Nie mozna wprowadzac wartosci zerowych lub ujemnych");
        }
        else {
            int nfpoleprostokat = nfbokprostokat1 * nfbokprostokat2;
            int nfobwodpro = 2 * nfbokprostokat1 + 2 * nfbokprostokat2;

            for (int nfi = 0; nfi < nfbokprostokat2; nfi++) {
                for (int nfj = 0; nfj < nfbokprostokat1; nfj++)
                    if ((nfi == 0) || (nfi == nfbokprostokat2 - 1))
                        System.out.print("*");
                    else if ((nfj == 0) || (nfj == nfbokprostokat1 - 1)) System.out.print("*");
                    else System.out.print(" ");
                System.out.println();

            }
            System.out.print("Pole prostokata wynioslo: " + nfpoleprostokat + "\nA obwód: " + nfobwodpro);
        }
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
            kwadrat();
        }
        else if (nfwybor == 2){
            System.out.println("Wybrales prostokat");
            prostokat();

        }
        else{
            System.out.println("Nie ma takiej opcji");
        }

    }
}

