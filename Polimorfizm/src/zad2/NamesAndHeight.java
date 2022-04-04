package zad2;

import java.util.Scanner;

public class NamesAndHeight {
    public static void main(String[] args) {
        DataOperations dO = new DataOperations();
        Scanner sc = new Scanner(System.in);

        System.out.println("Wybierz co chcesz zapisać\n"+
                "1 - Imie\n"+
                "2 - Wzrost\n"+
                "3 - Odczytaj plik");
        String choose = sc.nextLine();

        if(choose.equals("1")){
            System.out.println("Podaj imie: ");
            dO.saveToFile(sc.nextLine());
        }
        else if(choose.equals("2")){
            System.out.println("Podaj Wzrost: ");
            dO.saveToFile(sc.nextInt());
        }
        else if(choose.equals("3")){
            dO.loadFromFile();
        }
        else{
            System.out.println("Nie ma takiej opcji");
        }

    }
}
