package Week8.Q1;

/**
 * W8Q1
 */

class FRUIT{
    String color;
    String taste;
    int price;

    void display(){
        System.out.print("Color = "+color);
        System.out.print(", Taste = "+taste);
        System.out.println(", Price = "+price);
    }
}

public class W8Q1 {

    public static void main(String[] args) {
        FRUIT banana = new FRUIT();
        banana.color = "Yellow";
        banana.taste = "Sweet";
        banana.price = 10;

        FRUIT orange = new FRUIT();
        orange.color = "Orange";
        orange.taste = "Sweet-tart";
        orange.price = 20;

        FRUIT Apple = new FRUIT();
        Apple.color = "Red";
        Apple.taste = "Sweet";
        Apple.price = 30;
        
        System.out.println("Banana-");
        banana.display();

        System.out.println("Orange-");
        orange.display();

        System.out.println("Apple-");
        Apple.display();
    }
}