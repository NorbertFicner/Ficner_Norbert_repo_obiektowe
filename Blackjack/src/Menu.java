import javax.swing.*;
import java.util.Scanner;

public class Menu {
    GameLogic gameLogic = new GameLogic();
    public void initMenu(){
        Scanner sc = new Scanner(System.in);
        boolean on = true;

        while (on){
            System.out.println("Podaj opcje, którą chcesz wybrać:\n" +
                    "1 - Rozpocznij grę \n"+
                    "2 - Wyjdz");
            String option = sc.nextLine();
            switch (option){
                case "1":
                    gameLogic.initGame();
                    break;
                case "2":
                    on = false;
                    break;
                default:
                    System.out.println("Nie ma takiej opcji");
            }
        }
    }
}
