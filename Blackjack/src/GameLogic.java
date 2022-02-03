import java.util.ArrayList;

public class GameLogic {
    DrawCard drawCard = new DrawCard();
    public void initGame(){
        ArrayList<CardObject> playerCards = new ArrayList<CardObject>();
        for(int i=0;i<2;i++){
            playerCards.add(drawCard.draw());

        }
    }
}
