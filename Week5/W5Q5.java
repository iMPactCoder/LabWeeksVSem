import java.util.Scanner;

public class W5Q5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int n = sc.nextInt();
        int n1 = n;
        int sum = 0;
        while (n > 0) {
            sum = sum + n % 10;
            n = n / 10;
        }
        System.out.println("The sum of Digits of " + n1 + " is " + sum);
        sc.close();
    }
}
