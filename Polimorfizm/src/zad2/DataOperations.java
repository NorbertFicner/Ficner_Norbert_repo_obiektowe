package zad2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class DataOperations implements DataOperationsInterface{
    private File f;
    private FileWriter fw;
    private Scanner sc;
    @Override
    public void loadFromFile(){
        File f = new File("DataNameAndHeight.csv");
        try{
            sc = new Scanner(f);
            while(sc.hasNext()){
                System.out.println(sc.nextLine());
            }

        }
        catch (IOException e){

        }

    }
    @Override
    public void saveToFile(String name){
        File f = new File("DataNameAndHeight.csv");
        try{
            fw = new FileWriter(f,true);
            fw.write(name+"\n");
            fw.close();
        }
        catch (IOException e){

        }

    }
    @Override
    public void saveToFile(int height){
        File f = new File("DataNameAndHeight.csv");
        try{
            fw = new FileWriter(f,true);
            fw.write(height+"\n");
            fw.close();
        }
        catch (IOException e){

        }
    }

}
