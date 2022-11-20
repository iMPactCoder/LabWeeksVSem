public class W6Q4 {
     public static void main(String[] args) {
         int[] arr = { 53, 42, 153, 112, 12, 6, 7, 1, 200, 4 };
         int min = arr[0], max = arr[0];
 
         for (int i = 0; i < arr.length; i++) {
             if (arr[i] < min) {
                 min = arr[i];
             }
         }
         for (int i = 0; i < arr.length; i++) {
             if (arr[i] > max) {
                 max = arr[i];
             }
         }
         System.out.println("Maximum Among Array Elements is " + max);
         System.out.println("Minimum Among Array Elements is " + min);
 
     }
 }
