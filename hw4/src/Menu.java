
import java.util.ArrayList;

/**
 *
 * @author Krystle
 */
public class Menu {
    ArrayList<MenuItem> menuItemList;
    String menuName;
    
    /**
     * A menu is a collection of MenuItems
     * @param menuName the name for the collection
     */
    public Menu(String menuName){
        this.menuName = menuName;
        menuItemList = new ArrayList<>();
    }
    /**
     * Add a menu item to a given menu
     * @param mi (a menu item for the menu to hold)
     */
    void addMenuItem(MenuItem mi){
       menuItemList.add(mi);
   }

    @Override
    public String toString() {
        
        String menuItems="";
        for(int i = 0;i<menuItemList.size();i++){
            menuItems+= "name " + menuItemList.get(i).getName()+ " price " + menuItemList.get(i).getPrice() +", \n";
        }
        return "Menu{" + "menuName= " + menuName + ", menu= \n" +menuItems+ '}';
    }
}
