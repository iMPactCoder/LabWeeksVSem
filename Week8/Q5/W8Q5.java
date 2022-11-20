package Week8.Q5;


class FRUIT {
    private String color;
    private String taste;
    private int price;

    FRUIT(String color, String taste, int price) {
        this.color = color;
        this.taste = taste;
        this.price = price;
    }
    FRUIT(String color, String taste) {
        this();
        this.color = color;
        this.taste = taste;
    }
    FRUIT(String color) {
        this();
        this.color = color;
    }
    FRUIT() {
        this.color = "Unknown";
        this.taste = "Undefined";
        this.price = -1;
    }
    
    void display() {
        System.out.print("Color = " + color);
        System.out.print(", Taste = " + taste);
        System.out.println(", Price = " + price);

    }
}

public class W8Q5 {
    public static void main(String[] args) {
        FRUIT Banana = new FRUIT("Yellow","Sweet",10);
        FRUIT Orange = new FRUIT("Orange","Sweet-tart");
        FRUIT Apple = new FRUIT("red");
        FRUIT fruit1 = new FRUIT();

        System.out.println("Banana-");
        Banana.display();

        System.out.println("Orange-");
        Orange.display();

        System.out.println("Apple-");
        Apple.display();

        System.out.println("fruit1-");
        fruit1.display();
    }
}
    

