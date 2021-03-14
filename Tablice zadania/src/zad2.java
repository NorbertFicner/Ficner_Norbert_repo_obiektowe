import java.io.FileNotFoundException;
import java.io.*;
import java.util.Random;
import java.util.Scanner;

public class zad2 {
    public static void main(String[]args){

        File fileCzyLosowac = new File("src" + File.separator + "czylosowac.txt");
        File fileIleLiczb = new File("src" + File.separator + "ileliczb.txt");
        Random nfr = new Random();
        try{
        Scanner czylossc = new Scanner(fileCzyLosowac);


        String tabLos[] = new String[10];

        for(int i=0;i<10;i++){
            tabLos[i]= czylossc.next();
            System.out.println(tabLos[i]);
            if(tabLos[i].equals("0")){
                System.out.println("Wczytalem liczbę 0 – nie losuję liczby");
            }
            else if(tabLos[i].equals("1")){


                    try {
                        Scanner ileliczbsc = new Scanner(fileIleLiczb);
                        String ileLos = ileliczbsc.nextLine();
                        int IleLos = Integer.parseInt(ileLos);

                        int TabWylosowane[] = new int [IleLos];
                        for(int k =0;k<IleLos;k++) {
                            TabWylosowane[k] = nfr.nextInt(80)+ 1;
                            System.out.print(TabWylosowane[k] + " ");
                        }
                        System.out.println("\n");

                        }
                    catch(FileNotFoundException ex) {
                        System.out.println("ERROR : " + ex.toString());
                    }



                     }
                }

            }

        catch (FileNotFoundException ex){
            System.out.println("ERROR : "+ex.toString());
        }
        System.out.println("Odtycztałem wszystkie liczby! ");
    }
}
