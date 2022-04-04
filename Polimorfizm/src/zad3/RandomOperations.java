package zad3;
import java.util.Random;
public class RandomOperations implements  RandomOperationsInterface{
    Random r;

    public void randomWithDuplicate(int start,int end){
        r = new Random();
        int random = r.nextInt(end)+start;
        System.out.println(random);
    }
    public void randomWithoutDuplicate(int start,int end){
        r = new Random();
        int random = r.nextInt(end)+start;
        System.out.println(random);
    }

}
