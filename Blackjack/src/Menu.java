import javax.swing.*;
import java.util.Scanner;

public class Menu {
    GameLogic gameLogic = new GameLogic();
    ShowInformationToPlayer showInformationToPlayer = new ShowInformationToPlayer();
    public void initMenu(){
        Scanner sc = new Scanner(System.in);
        boolean on = true;

        while (on){
            showInformationToPlayer.showMenu();
            String option = sc.nextLine();
            switch (option){
                case "1":
                    gameLogic.initGame();
                    break;

                case "2":
                    on = false;
                    break;
                default:
                    showInformationToPlayer.defaultInSwitch();
            }
        }
    }
}
