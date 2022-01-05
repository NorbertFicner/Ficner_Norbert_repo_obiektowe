import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    private int index;
    private String choose;
    private boolean menu;
    public void initmenu(ArrayList<UserData> list ){

        AddData aD = new AddData();
        ShowData sD = new ShowData();
        SaveToFile sTF = new SaveToFile();
        DeleteData dD = new DeleteData();
        EditData eD = new EditData();
        UserData uD;

        Scanner sc = new Scanner(System.in);

        menu = true;
        while(menu){
            System.out.println("1. Dodaj dane \n2. Wyswietl dane\n3. Edytuj dane\n4. Usun dane\n5. Wyjdz ");
            choose = sc.nextLine();
            switch (choose) {
                    //Dodawanie
                case "1":
                    aD.addData(list);
                    break;
                    //Wyswietlanie
                case "2":
                    sD.showArray(list);
                    break;
                    //Edycja
                case "3":
                     eD.editData(list);
                    break;
                    //Usuwanie
                case "4":
                    dD.deleteData(list);
                    break;
                    //Koniec programu
                case "5":
                    try {
                        sTF.saveToFile(list);
                    } catch (IOException e) {

                    }
                    menu = false;
                    System.out.println("Dane zostaly zapisane");
                    break;
                default:
                    System.out.println("Nie ma takiej opcji");
                    break;
                }
            }
        }
    }
