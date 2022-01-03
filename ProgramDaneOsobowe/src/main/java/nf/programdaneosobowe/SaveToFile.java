/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nf.programdaneosobowe;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author zalman
 */
public class SaveToFile {
    public void saveToFile(ArrayList<Data> list) throws IOException{
        File f = new File("Data.csv");
        
        FileWriter fw = new FileWriter(f);
        for(int i=0;i<list.size();i++){
            Data data = list.get(i);
            fw.write(data.toString() + "\n");
        }
        fw.close();
        
        
    }
}
