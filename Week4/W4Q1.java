import java.util.Scanner;

public class W4Q1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int a = sc.nextInt();
        if (a % 2 == 0) {
            System.out.println(a + " is Even");
        }
        else {
            System.out.println(a + " is Odd");
        }
        sc.close();
    }
}
