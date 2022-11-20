import java.util.Scanner;

public class W7Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = sc.nextInt();
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int start = 0;
        int end = arr.length - 1;
        int mid = (start + end) / 2;

        while (end >= start) {
            if (n > arr[mid]) {
                start = mid + 1;
            } else if (n == arr[mid]) {
                System.out.println(n + " found at index " + mid);
                break;
            } else {
                end = mid - 1;
            }
            mid = (start + end) / 2;
        }
        if (start > end) {
            System.out.println("Number not found in Array");
        }
        sc.close();
    }

}