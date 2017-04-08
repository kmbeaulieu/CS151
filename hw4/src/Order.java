
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import org.omg.CORBA.NameValuePair;

/**
 * @author Krystle
 */
public class Order {
    //double currTotal;
    //double finalTotal;
    double total;
    ArrayList<String> orderItems;
    
    
    public Order(){
        total = 0.0;
        orderItems = new ArrayList<>();
    }
    
    public void addToOrder(String item, Double price){
        total+=price;
        orderItems.add(item);
        
    }
}
