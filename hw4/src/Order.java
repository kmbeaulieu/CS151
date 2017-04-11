
import java.util.ArrayList;
import java.util.Date;


/**
 * @author Krystle
 */
public class Order {
    //double currTotal;
    //double finalTotal;
    double total;
    Date created;
    ArrayList<MenuItem> orderItems;
    String paymentType;
    CreditCard cc;
    //String paymentType = "CREDIT CARD";
    
    
    
    public Order(){
        total = 0.0;
        orderItems = new ArrayList<>();
        paymentType = "CREDIT CARD";
    }
    
    public void addToOrder(MenuItem item){
        total+=item.getPrice();
        orderItems.add(item);
        
    }

    
    @Override
    public String toString() {
        String orderStarter = "========Order========\n";
        String orderTimer = "Created: " + created + "\n";
       // String orderPayment = "Paid by: " + paymentType + " " + cc.ccNumber + "\n"; 
        String orderEnder =   "---------------------\n"+ "total= " + total+ "\n"+"=====================";
        String orderMiddle = "";
        for(int i = 0;i<orderItems.size();i++){
            orderMiddle += orderItems.get(i).getName() + " " + orderItems.get(i).getPrice() + "\n";
        }
        return orderStarter + orderTimer+ orderMiddle + orderEnder;
    }
    
    
}
