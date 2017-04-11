
/**
 * This is seperated from the menu so that you can add extra fields later possibly
 * like isSeasonal, making portion sizes, etc
 * @author Krystle
 */
class MenuItem{
    private String name;
    private double price;
    
    /**
     * make a new menuitem with a given name and price
     * @param name of menu item
     * @param price of said menu item
     */
    public MenuItem(String name, double price){
        this.name = name;
        this.price = price;
    }
    
    public static boolean isNameValid(String name){
        //enter any checks here for name validity
        return true;
    }
    
    /**
     * this is for the menureader or any other readers who want to create a menu. 
     * This will see if a given price from a menu file is valid to whatever 
     * standards implemented inside
     * @param price to check validity for
     * @return if it is valid or not
     */
    public static boolean isPriceValid(double price){
      //  enter any checks for price validity
        return price>=0.0;
    }
    
    public String getName(){
        return name;
    }
    
    public double getPrice(){
        return price;
    }

    @Override
    public String toString() {
        return "MenuItem{" + "name=" + name + ", price=" + price + '}';
    }

    
}
