import java.util.Scanner;

public class W5Q1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of Array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter Element " + (i + 1) + " : ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Elements of Array are : ");
        System.out.print("[ ");
        for (int i = 0; i < n-1; i++) {
            System.out.print(arr[i]+ ", ");
        }
        System.out.println(arr[n-1]+" ]");
        sc.close();
    }
}
