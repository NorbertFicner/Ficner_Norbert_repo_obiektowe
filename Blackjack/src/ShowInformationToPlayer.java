import java.util.Scanner;

public class ShowInformationToPlayer {

    public void showOpitons(){
        System.out.println("Wybierz opcje \n"+
                "S - stand/czekam\n"+
                "H - hit/dobieram\n"+
                "P - split/podziel\n"+
                "W - automatically win/zwycięstwo automatyczne");
    }
    public void showMenu(){
        System.out.println("Podaj opcje, którą chcesz wybrać:\n" +
                "1 - Rozpocznij grę \n"+
                "2 - Wyjdz");
    }
    public void defaultInSwitch(){
        System.out.println("Nie ma takiej opcji");
    }


}
