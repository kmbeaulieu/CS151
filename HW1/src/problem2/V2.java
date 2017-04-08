package problem2;

/**
 * @author Krystle
 */
public class V2 {
    private double x;
    private double y;
    

    /**
     * Create a new vector with the given values.
     * @param x x length
     * @param y y length
     */
    V2(double x, double y){
        this.x = x;
        this.y = y;
    }
    
    /**
     * print the vector
     * @return the vector in string format: (x,y)
     */
    String getString(){
        String vector = "(" + x + ", " + y + ")";
        return vector;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
    
    /**
     * add a vector to another vector
     * @param a vector a
     * @param b vector b
     * @return the new vector of a and b added together
     */
    static V2 add(V2 a, V2 b){
        double newx = a.x + b.x;
        double newy = a.y + b.y;
        return new V2(newx, newy); 
    }
    
    /**
     * multiply a vector by a given scalar.
     * @param x scalar to be multiplied
     * @return a new vector with the multiplied values.
     */
    V2 multiply(int x){
        double newx = this.x * x;
        double newy = this.y * x;
        V2 newVect = new V2(newx, newy);
        return newVect;
    }
    
    /**
     * @return a vector's magnitude
     */
    double magnitude(){
        return Math.sqrt( (x * x) + (y * y) );
    }
        
    public static void main(String[] args){
//        V2 a = new V2(2,1);
//        System.out.println("x is " + a.getX());
//        System.out.println("y is " + a.getY());
//        System.out.println("magnitude is " + a.magnitude());
//        System.out.println(a.getString());
//        a.multiply(3); //returns a new vector by the requirement of assignment, not rewrites the current values
//        System.out.println(a.getString()); //should still be what a was assigned as in the beginning
//        System.out.println(V2.add(new V2(1,2), new V2(2,2)).getString());
    }
    
}

