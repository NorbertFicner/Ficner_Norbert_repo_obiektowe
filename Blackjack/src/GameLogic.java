import java.util.ArrayList;
import java.util.Scanner;

public class GameLogic {
    DrawCard drawCard = new DrawCard();
    private int playerCardsScore,dealerCardsScore;
    ShowInformationToPlayer showInformationToPlayer = new ShowInformationToPlayer();
    Scanner sc = new Scanner(System.in);
    public void initGame(){

        ArrayList<CardObject> playerCards = new ArrayList<CardObject>();
        ArrayList<CardObject> dealerCars = new ArrayList<CardObject>();
        for(int i=0;i<2;i++){
            playerCards.add(drawCard.draw());
            dealerCars.add(drawCard.draw());
        }
        for(int i=0;i<2;i++){
            System.out.println("Twoja karta: "+playerCards.get(i));
            playerCardsScore =
        }
        System.out.println("Krupier posiada kartę : "+dealerCars.get(0));
        showInformationToPlayer.showOpitons();
    }
    public void makeAMove(){
        String choose = sc.nextLine().toLowerCase();

        switch (choose){
            case "s":

                break;
            case "h":

                break;
            case "p":

                break;
            case "w":

                break;
            default:
                showInformationToPlayer.defaultInSwitch();
                break;

        }
    }

}
