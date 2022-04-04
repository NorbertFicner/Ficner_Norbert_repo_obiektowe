package zad3;

import java.util.Scanner;

public class Random {
    public static void main(String[] args) {
        RandomOperations rO = new RandomOperations();
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj od jakiej liczby chcesz losowac: ");
        int numberStart = sc.nextInt();
        System.out.println("Podaj do jakiej liczby chcesz losowac: ");
        int numberEnd = sc.nextInt();

        System.out.println("Jak chcesz wylosowac: \n"+
                "1 - Z duplikatami \n"+
                "2 - Bez duplikatów");
        sc.nextLine();

        String choose = sc.nextLine();

        if(choose.equals("1")){
            rO.randomWithoutDuplicate(numberStart,numberEnd);
        }
        else if(choose.equals("2")){
            rO.randomWithDuplicate(numberStart,numberEnd);
        }

    }

}
