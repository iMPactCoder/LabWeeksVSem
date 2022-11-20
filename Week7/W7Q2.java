package Week7;

public class W7Q2 {
    public static void main(String[] args) {
        int[] arr = { 53, 42, 153, 112, 12, 6, 7, 1, 200, 4 };

        System.out.print("Original Array : ");
        for (int i = 0; i < 10; i++) {
            System.out.print(arr[i] + ", ");
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.print("\nSorted Array : ");
        for (int i = 0; i < 10; i++) {
            System.out.print(arr[i] + ", ");
        }
    }
}
