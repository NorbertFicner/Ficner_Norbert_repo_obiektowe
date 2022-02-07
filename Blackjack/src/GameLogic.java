import java.awt.image.CropImageFilter;
import java.util.ArrayList;
import java.util.Scanner;

public class GameLogic {
    ArrayList<CardObject> playerCards = new ArrayList<CardObject>();
    ArrayList<CardObject> dealerCards = new ArrayList<CardObject>();
    DrawCard drawCard = new DrawCard();
    public boolean correctMove;
    private int playerCardsScore,dealerCardsScore;
    ShowInformationToPlayer showInformationToPlayer = new ShowInformationToPlayer();
    Scanner sc;
    public void initGame(){
        sc = new Scanner(System.in);
        for(int i=0;i<2;i++){
            playerCards.add(drawCard.draw());
            playerCardsScore = getCardsScore(playerCards);
            dealerCards.add(drawCard.draw());
            dealerCardsScore = getCardsScore(dealerCards);
        }
        for(int i=0;i<playerCards.size();i++){
            System.out.println("Twoja karta: "+playerCards.get(i));
        }
        System.out.println("Wartość twoich kart wynosi: "+playerCardsScore+"\n"+
                "Krupier posiada kartę : "+dealerCards.get(0));

        showInformationToPlayer.showOpitons();
    }
    public void makeAMove(){
        while (correctMove){
            sc = new Scanner(System.in);
            String choose = sc.nextLine().toLowerCase();

        switch (choose) {
            case "s":

                break;
            case "h":

                break;
            case "p":

                break;
            case "w":
                isBlackJack(playerCardsScore,dealerCards.get(0).getValue());
                break;
            default:
                showInformationToPlayer.defaultInSwitch();
                break;
            }
        }
    }

    public int getValueOfCard(ArrayList<CardObject> list,int value){
        CardObject cO = list.get(value);
        return  cO.getValue();
    }
    public int getCardsScore(ArrayList<CardObject> list){
        int score = 0;
        for(int i=0;i<list.size();i++){
            score = score + list.get(i).getValue();
        }
        return score;


    }
    public void isBlackJack(int playerCardsScore,int dealerCard){
        if(playerCardsScore == 21 && dealerCard != 10 || dealerCard != 11){
            correctMove = false;
        }
        else{
            showInformationToPlayer.incorrectMove();
        }
    }
}
