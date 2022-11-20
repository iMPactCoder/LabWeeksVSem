import java.util.Scanner;

public class W5Q4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        double n = sc.nextDouble();
        double sum = 0;
        for (double i = 1; i <= n; i++) {
            sum = sum + (1/i);
        }
        System.out.println("Sum = " + sum);
        sc.close();
    }
}
