
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Krystle
 */
public class MenuReader {
    String filename;
    FileReader fr;
    BufferedReader bufRead;
    
    Map<String,String> menu;

    public MenuReader(String filename) throws FileNotFoundException {
        this.filename = filename;
        this.fr = new FileReader(this.filename);
        bufRead = new BufferedReader(fr);
        
    }
    
    public void readMenu() throws IOException{
        String line = null;
        while((line = bufRead.readLine()) != null){
            String[] item = line.split("|");
            //valid input
            if(item.length==2){
                menu.put(item[0], item[1]);
            }
        }
    }
    
//   public String printMenu(){
//      
//   }
    
}
