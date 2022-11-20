import java.util.Scanner;

public class W6Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int n = sc.nextInt();
        boolean prime = true;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                prime = false;
                break;
            }
        }
        if (n == 1) {
            System.out.println("Neither Prime nor Composite");
        } else if (n < 0) {
            System.out.println("Enter a Positive Number");
        } else if (prime) {
            System.out.println("Prime");
        } else {
            System.out.println("not prime");
        }
        sc.close();
    }
}
