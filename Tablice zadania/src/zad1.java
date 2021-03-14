import java.io.*;
import java.util.Random;
import java.util.Scanner;

public class zad1 {
    public static void main(String[]args){
        Random nfr = new Random();

        File file = new File("src" + File.separator + "Uczniowie.txt");
        try {

            Scanner nfsc = new Scanner(file);
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
        catch(FileNotFoundException ex){
            System.out.println("ERROR : "+ex.toString());
        }



    }
}

