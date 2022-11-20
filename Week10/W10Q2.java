
class edible {
    static class fruit {
        static void fruitdetails() {
            System.out.println("Fruit details method");
        }

        void fruitpackaging() {
            System.out.println("Fruit packaging method");
        }
    }

    static class vegetables {
        static void vegdetails() {
            System.out.println("Vegetables details method");
        }

        void vegpackaging() {
            System.out.println("Vegetables packaging method");
        }
    }
}

public class W10Q2 {
    public static void main(String[] args) {
        edible.fruit ef1 = new edible.fruit();
        edible.vegetables ev1 = new edible.vegetables();

        edible.fruit.fruitdetails();
        ef1.fruitpackaging();
        
        edible.vegetables.vegdetails();
        ev1.vegpackaging();
    }

}
