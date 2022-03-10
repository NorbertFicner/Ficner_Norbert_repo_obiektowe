import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Boolean on = true;
        PersonNumbers personNumbers = new PersonNumbers();
        Scanner sc = new Scanner(System.in);
        String choose = "";
        BigDecimal number;
        File f = new File("Data.csv");
        while(on){
            System.out.println("Podaj co chcesz podac ");
            System.out.println("1 - Wzrost");
            System.out.println("2 - Waga");
            System.out.println("3 - Wiek");
            System.out.println("4 - Zapisz");
            System.out.println("5 - Odczytaj dane z pliku");

            choose = sc.nextLine();

            switch (choose) {
                case "1":
                    System.out.println("Podaj wzrost: ");
                    number = sc.nextBigDecimal();
                    personNumbers.setNumber(number, "1");
                    System.out.println("Podales  wzrost : "+number);
                    sc.nextLine();
                    break;
                case "2":
                    System.out.println("Podaj wage: ");
                    number = sc.nextBigDecimal();
                    personNumbers.setNumber(number, "2");
                    sc.nextLine();
                    break;
                case "3":
                    System.out.println("Podaj wiek: ");
                    number = sc.nextBigDecimal();
                    personNumbers.setNumber(number, "3");
                    sc.nextLine();
                    break;

                case "4":
                    try {
                        FileWriter fw = new FileWriter(f);
                        String age = personNumbers.getAge();
                        String height = personNumbers.getHeight();
                        String weight = personNumbers.getWeight();

                        fw.write(height + ";" + weight + ";" + age+";\n");
                        fw.close();
                        on = false;

                    } catch (IOException e) {

                    }
                    break;
                case "5":
                    try {
                        sc = new Scanner(f);
                        while (sc.hasNext()){
                            String loaded = sc.nextLine();
                            String loadedTab[] = loaded.split(";");
                            System.out.println("Wzrost: "+loadedTab[0]);
                            System.out.println("Waga: "+loadedTab[1]);
                            System.out.println("Wiek: "+loadedTab[2]);
                        }
                        on = false;
                    }catch (IOException e) {

                    }

                    break;
                default:
                    System.out.println("Nie ma takiej opcji");
                    break;

            }

        }

    }
}
