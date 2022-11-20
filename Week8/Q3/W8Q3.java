package Week8.Q3;


class FRUIT {
    private final String color;
    private final String taste;
    private final int price;

    FRUIT(String color, String taste, int price) {
        this.color = color;
        this.taste = taste;
        this.price = price;
    }


    void display() {
        System.out.print("Color = " + color);
        System.out.print(", Taste = " + taste);
        System.out.println(", Price = " + price);

    }
}

public class W8Q3 {
    

    public static void main(String[] args) {
        FRUIT Banana = new FRUIT("Yellow","Sweet",10);
        FRUIT Apple = new FRUIT("red","Sweet",30);
        FRUIT Orange = new FRUIT("Orange","Sweet-tart",20);

        System.out.println("Banana-");
        Banana.display();

        System.out.println("Orange-");
        Orange.display();

        System.out.println("Apple-");
        Apple.display();


    }
}
