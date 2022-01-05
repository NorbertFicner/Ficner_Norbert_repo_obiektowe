import java.util.ArrayList;
import java.util.Scanner;

public class DeleteData {
    private int index;
    private String deleteIndex;
    Scanner sc;
    public void deleteData(ArrayList<UserData> list){
        sc = new Scanner(System.in);
        System.out.println("Podaj numer wpisu");
        index = sc.nextInt()-1;
        sc.nextLine();
        if(index<list.size()) {
            String tab[] = list.get(index).toString().split(";");
            System.out.println("Czy napewno chcesz usunac wpis\n" +
                    tab[0] + " " + tab[1] + " " + tab[2] + " " + tab[3] + "\n" +
                    "1 - tak 2 - nie");
            deleteIndex = sc.nextLine();
            if (deleteIndex.equals("1")){
                list.remove(index);
                System.out.println("Usunieto wpis");
            }
        }
        else{
            System.out.println("Nie ma wpisu o takim numerze");
        }
    }
}
