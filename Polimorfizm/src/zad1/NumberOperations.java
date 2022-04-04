package zad1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class NumberOperations implements NumberOperationsInterface {
    private Random r;
    private FileWriter fw;
    private File f;

    @Override
    public ArrayList<Integer> saveToArray(){
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<5;i++){
            r = new Random();
            int randomNumber = r.nextInt(100)+1;
            list.add(randomNumber);
        }
        return list;
    }
    @Override
    public int[] saveToTab(){
        int tab[] = new int[5];
        for(int i=0;i<5;i++){
            r = new Random();
            int randomNumber = r.nextInt(100)+1;
            tab[i] = randomNumber;
        }
        return tab;
    }

}

