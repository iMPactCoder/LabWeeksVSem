package Week8.Q2;


class FRUIT{
    private String color;
    private String taste;
    private int price;

    void setDetails(String c,String t,int p){
        color = c;
        taste = t;
        price = p;

    }
    void display(){
        System.out.print("Color = "+color);
        System.out.print(", Taste = "+taste);
        System.out.println(", Price = "+price);
    }
}

public class W8Q2 {
    public static void main(String[] args) {
        
        FRUIT Apple = new FRUIT();
        Apple.setDetails("Red", "Sweet", 30);

        FRUIT Banana = new FRUIT();
        Banana.setDetails("Yellow", "Sweet", 10);

        FRUIT Orange = new FRUIT();
        Orange.setDetails("Orange", "Sweet-tart", 20);


        System.out.println("Banana-");
        Banana.display();

        System.out.println("Orange-");
        Orange.display();

        System.out.println("Apple-");
        Apple.display();
        
    }
}
