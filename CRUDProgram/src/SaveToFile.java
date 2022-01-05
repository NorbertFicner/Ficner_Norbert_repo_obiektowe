import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class SaveToFile {
    public void saveToFile(ArrayList<UserData> list) throws IOException{
        File f = new File( "tajne_dane.csv");

        FileWriter fw = new FileWriter(f);
        for(int i=0;i< list.size();i++) {
            fw.write(list.get(i)+ "\n");
        }
        fw.close();
    }
}
