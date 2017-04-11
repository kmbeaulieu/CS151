
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Krystle
 */
public class MenuReader {
    String filename;
    FileReader fr;
    BufferedReader bufRead;
    Menu menu;
    String toBeItemName="";
    String toBePrice="";

    public MenuReader(String filename) throws FileNotFoundException {
        this.filename = filename;
        this.fr = new FileReader(this.filename);
        bufRead = new BufferedReader(fr);    
        menu = new Menu(filename);

        
    }
    
    public void readMenu() throws IOException{
        String line = null;
        while((line = bufRead.readLine()) != null){
            //clean up the line
            line = line.replaceAll("[\n\t\"-]", "");
            line = line.replaceAll("\\\\n\\\\t","");
            
            
            
          
            String[] item = line.split("|");
            fixuparray(item);
            if(MenuItem.isNameValid(toBeItemName) && MenuItem.isPriceValid(Double.valueOf(toBePrice))){
                //if both are valid, make a new menu item
                menu.addMenuItem(new MenuItem(toBeItemName,Double.valueOf(toBePrice)));
            }
           
        }
    }
    
    
    
//   public String printMenu(){
//      
//   }

    private void fixuparray(String[]s) {
       toBeItemName= "";
       toBePrice= "";
        boolean pipepassed = false;
        for (String item : s) {
            //check if pipe occured
            if (item.equals("|")) {
                pipepassed=true;
                continue;
            }
            if (pipepassed==false) {
                if(toBeItemName.length()>0 && Character.isUpperCase(item.charAt(0)) && !Character.isWhitespace(toBeItemName.charAt(toBeItemName.length()-1)) ){
                    //make sure it isnt the first character.
                    //if there is no space before something that has a capitol letter, 
                    //then insert a space. will trim any beginning/trailing ones later
                    toBeItemName += " " + item;
                }else{
                    toBeItemName += item;
                }
            } else {
                toBePrice += item;
            }
            
            toBeItemName = toBeItemName.trim();
        }
       
    }
    
    
}
