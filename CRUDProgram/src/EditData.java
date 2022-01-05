import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class EditData {
    private int index;
    private String email, name, surname, dateOfBirth,editIndex;
    Scanner sc;
    public void editData(ArrayList<UserData> list){
        sc = new Scanner(System.in);
        System.out.println("Podaj numer wpisu który chcesz edytować");
        index = sc.nextInt()-1;
        sc.nextLine();
        if(index<list.size()){
            String tab[] = list.get(index).toString().split(";");
            System.out.println("Czy napewno chcesz edytowac wpis\n" +
                    tab[0]+" "+tab[1]+" "+tab[2]+" "+tab[3]+"\n" +
                    "1 - tak 2 - nie");
            editIndex = sc.nextLine();
            if(editIndex.equals("1")){
                System.out.println("Podaj email:");
                email = sc.nextLine();
                System.out.println("Podaj date urodzenia:");
                dateOfBirth = sc.nextLine();
                System.out.println("Podaj imie:");
                name = sc.nextLine();
                System.out.println("Podaj nazwisko:");
                surname = sc.nextLine();
                list.set(index,new UserData(email,dateOfBirth,name,surname));
                System.out.println("Wpis zostal edytowany");
            }
        }
        else{
            System.out.println("Nie ma wpisu o takim numerze");
        }
    }
}
