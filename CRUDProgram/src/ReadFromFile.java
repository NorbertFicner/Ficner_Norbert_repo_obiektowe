import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadFromFile {
    Scanner sc;
    private String data,email,dateOfBirth,name,surname;
    public void readFromFile(ArrayList<UserData> list){
        File f = new File("tajne_dane.csv");
        try{
            sc = new Scanner(f);
            while(sc.hasNext()){
                data = sc.nextLine();
                String tab[] = data.split(";");
                email = tab[0];
                dateOfBirth = tab[1];
                name = tab[2];
                surname = tab[3];
                list.add(new UserData(email,dateOfBirth,name,surname));
            }
        }
        catch (IOException e){
        }

    }
}
