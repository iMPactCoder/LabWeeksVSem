import java.util.Scanner;

public class W6Q6 {

    public static void main(String[] args) {

        int[] arr = { 2, 3, 8, 6, 9, 5, 1, 6, 4, 7 };
        System.out.print("Array is : [");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ",");
        }
        System.out.println("]");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n = sc.nextInt();
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
                System.out.println("Index of " + n + " is " + i);
                found = true;
            }
        }
        if (found == false) {
            System.out.println("Element is not in array");
        }
        sc.close();
    }
}
