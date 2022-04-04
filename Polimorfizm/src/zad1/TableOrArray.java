package zad1;

import java.util.ArrayList;
import java.util.Scanner;

public class TableOrArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NumberOperations nO = new NumberOperations();

        System.out.println("Wybierz do czego chcesz zapisać wylosowane liczby:\n " +
                "1 - Tablica \n" +
                "2 - ArrayList \n");
        String choose = sc.nextLine();
        if (choose.equals("1")){
            int tab[] = nO.saveToTab();
            System.out.println("Tablica");
            for(int i=0;i<tab.length;i++){
                System.out.println(""+tab[i]+"\n");
            }
        }
        else if(choose.equals("2")){
            ArrayList<Integer> list = nO.saveToArray();
            System.out.println("ArrayList");
            for(int i=0;i<list.size();i++){
                System.out.println(list.get(i)+"\n");
            }
        }
        else{
            System.out.println("Nie ma takiej opcji");
        }
    }


}
