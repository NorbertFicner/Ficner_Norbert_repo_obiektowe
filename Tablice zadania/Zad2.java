import java.awt.*;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Zad2 {
    public static void main(String[]args) throws FileNotFoundException {
        // Poprawić FileReader i src
        FileReader czylosfr = new FileReader("src\\czylosowac.txt");
        FileReader ileliczbfr = new FileReader("src\\ileliczb.txt");
        Scanner czylossc = new Scanner(czylosfr);
        Scanner ileliczbsc = new Scanner(ileliczbfr);
        //Random r = new Random()

        String tabLos[] = new String[10];
        String ileLos[] = new String[10];
        for(int i=0;i<10;i++){
            tabLos[i]= czylossc.next();
            System.out.println(tabLos[i]);
            if(tabLos[i].equals("0")){
                System.out.println("Wczytalem liczbę 0 – nie losuję liczby");
            }
            else if(tabLos[i].equals("1")){
                for(int j=0;j<ileLos.length;j++){
                    ileLos[j] = ileliczbsc.nextLine();

                }

            }
        }

    }
}
