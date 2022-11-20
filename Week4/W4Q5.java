import java.util.Scanner;

public class W4Q5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        double n = sc.nextDouble();
        if (n >= 10) {
            while (n > 10) {
                n = n / 2;
                System.out.println("Now, Number is " + n);
            }
        }
        else {
            System.out.println("Enter Number Greater than 10");
        }
        sc.close();
    }
}
