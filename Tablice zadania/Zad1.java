import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Random;
import java.util.Scanner;

public class Zad1 {
    public static void main(String[]args) throws FileNotFoundException {
        Random nfr = new Random();
        FileReader fr = new FileReader("src\\Uczniowie.txt");
        Scanner nfsc = new Scanner(fr);

        String tabucniowie[] = new String[10];
        int tabocena[] = new int [10];

        for (int i=0;i<tabucniowie.length;i++){
            tabocena[i]= nfr.nextInt(6)+1;
        }
        for(int i=0;i<10;i++){
            tabucniowie[i] = nfsc.nextLine();
            System.out.println(i+ 1 +  "  -  " + tabucniowie[i] + "  :  "+ tabocena[i]);
        }

    }
}

