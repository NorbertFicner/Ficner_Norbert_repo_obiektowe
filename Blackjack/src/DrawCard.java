import java.util.Random;

public class DrawCard {
    CardObject co1;
    public CardObject draw(){

        Random r = new Random();
        int card;
        card = r.nextInt(14)+1;
        switch (card){
            case 1:
                co1 = new CardObject("as",11);
                break;
            case 2:
                co1 = new CardObject("dwa",2);
                break;
            case 3:
                co1 = new CardObject("trzy",3);
                break;
            case 4:
                co1 = new CardObject("cztery",4);
                break;
            case 5:
                co1 = new CardObject("pięc",5);
                break;
            case 6:
                co1 = new CardObject("sześć",6);
                break;
            case 7:
                co1 = new CardObject("siedem",7);
                break;
            case 8:
                co1 = new CardObject("osiem",8);
                break;
            case 9:
                co1 = new CardObject("dziewięc",9);
                break;
            case 10:
                co1 = new CardObject("dziesięc",10);
                break;
            case 11:
                co1 = new CardObject("walet",10);
                break;
            case 12:
                co1 = new CardObject("dama",10);
                break;
            case 13:
                co1 = new CardObject("król",10);
                break;
            case 14:
                co1 = new CardObject("inna",0);
                break;
        }

        return co1;
    }
}
