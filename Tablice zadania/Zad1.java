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
        for(int a=0;a<tabucniowie.length;a++){
            while(nfsc.hasNext()){
                tabucniowie[a] = nfsc.nextLine();
                }
            }
        for (int i=0;i<tabucniowie.length;i++){
            tabocena[i]= nfr.nextInt(6)+1;
        }
    }
}

