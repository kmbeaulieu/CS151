
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
public class Menu {
    Map<String,Double> menu;
    
    
   public void addMenuItem(String item, Double price){
       menu.put(item, price);
   }
}
