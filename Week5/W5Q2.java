public class W5Q2 {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 7, 2};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println("Sum of all Elements of Array is : "+ sum);
    }
}
