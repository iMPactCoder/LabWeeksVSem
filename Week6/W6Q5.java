public class W6Q5 {
    public static void main(String[] args) {
        boolean prime = true;
        System.out.println("Prime numbers between 0 and 100 ");
        for (int i = 2; i < 100; i++) {
            for (int j = 2; j < i; j++) {
                prime = true;
                if (i % j == 0) {
                    prime = false;
                    break;
                }
            }
            if (prime) {
                System.out.print(i + ", ");
            }

        }
    }

}
