package encapsulation;
//Encapsulation is mainly for security reasons.
//We don't want that anyone can access anything from anywhere.
public class Encapsulation{
        public static void main(String[] args){
            Laptop l1 = new Laptop();
            l1.setPrice(20000);
        }
        //Access modifiers
        //Because this method is public, it can be accessed from anywhere.
        public void doWork(){
            System.out.println("Doing work");
        }
        //Similarly, Private can be only accessed within the same class
        //And Protected can be only accessed by child classes of parent class
}

class Laptop{
    int price;
    //We don't want that anyone can change the price.
    //We only want that the shop owner can change its price

    //Setters
    public void setPrice(int price){
        this.price = price;
    }

    //Getters
    public int getPrice(){
        return price;
    }
}