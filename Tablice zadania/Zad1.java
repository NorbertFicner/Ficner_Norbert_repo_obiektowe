import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Zad1 {
    public static void main(String[]args) throws IOException {
        Random nfr = new Random();
        File nffile = new File("Uczniowie.txt");
        Scanner nfsc = new Scanner(nffile);


        String tabucniowie[] = new String[10];
        for(int a=0;a<tabucniowie.length;a++){

        }


        int tabocena[] = new int [6];
        for (int i=0;i<tabocena.length;i++){
            tabocena[i]= nfr.nextInt(6)+1;
            System.out.println(tabocena[i]);
        }





    }
}
