import java.util.ArrayList;
import java.util.Scanner;

public class ShowData {
    Scanner sc;
    private int index,choose;
    public void showArray(ArrayList<UserData> list){
        sc = new Scanner(System.in);
        System.out.println("1 - wyświetl wszystkie dane \n2 - wyświetl dany wpis po numerze");
        choose = sc.nextInt();
        switch (choose){
            case 1:
                for(int i=0;i<list.size();i++){
                     System.out.println((i+1)+" "+list.get(i));
                }
                break;
            case 2:
                System.out.println("Podaj numer wpisu");
                index = sc.nextInt()-1;
                if(index<list.size()){
                    System.out.println(list.get(index));
                }
                else{
                    System.out.println("Nie ma wpisu o takim numerze");
                }
                break;
            default:
                System.out.println("Nie ma takiej opcji");
                break;
        }
        System.out.print("\n");

    }
}
