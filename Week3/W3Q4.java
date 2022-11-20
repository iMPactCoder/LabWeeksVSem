import java.util.Scanner;

public class W3Q4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number : ");
        int a = sc.nextInt();
        System.out.print("Enter Second Number : ");
        int b = sc.nextInt();
        System.out.print("Enter Third Number : ");
        int c = sc.nextInt();

        double Av = (a + b + c) / 3;
        System.out.println("The Average of " + a + ", " + b + " and " + c + " is " + Av);
        sc.close();

    }
}
