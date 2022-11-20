class Vehicle {
    void cost() {
        System.out.println("Cost of travelling is 1000 rupees");
    }
}

class bus extends Vehicle {
    void display() {
        System.out.println("This is a bus");
    }
}

class train extends Vehicle {
    void display() {
        System.out.println("This is a Train");
    }
}

public class W9Q1 {
    public static void main(String[] args) {

        bus b1 = new bus();
        train t1 = new train();

        b1.display();
        t1.display();
        b1.cost();
        t1.cost();

    }
}