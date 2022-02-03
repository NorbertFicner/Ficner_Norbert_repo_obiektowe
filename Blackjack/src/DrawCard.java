import java.util.Random;

public class DrawCard {
    public void draw(){

        Random r = new Random();
        int card1,card2;

        card1 = r.nextInt(14)+1;
        card2 = r.nextInt(14)+1;

        switch (card1){
            case 1:
                CardObject co = new CardObject();
                break;
            case 2:

                break;
            case 3:

                break;
            case 4:

                break;
            case 5:

                break;
            case 6:

                break;
            case 7:

                break;
            case 8:

                break;
            case 9:

                break;
            case 10:

                break;
            case 11:

                break;
            case 12:

                break;
            case 13:

                break;
            case 14:

                break;


        }
    }
}
