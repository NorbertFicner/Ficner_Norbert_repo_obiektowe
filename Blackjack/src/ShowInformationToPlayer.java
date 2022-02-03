import java.util.Scanner;

public class ShowInformationToPlayer {
    private String choose;
    public void showOpitons(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Wybierz opcje \n"+
                "S - stand/czekam\n"+
                "H - hit/dobieram\n"+
                "P - split/podziel\n"+
                "W - automatically win/zwycięstwo automatyczne");
        choose = sc.nextLine().toLowerCase();

        switch (choose){
            case "s":

                break;
            case "h":

                break;
            case "p":

                break;
            case "w":

                break;

        }
    }



}
