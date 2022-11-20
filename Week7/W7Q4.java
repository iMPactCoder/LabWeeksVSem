package Week7;

import java.util.Scanner;
public class W7Q4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String : ");
        String str = sc.nextLine();
        System.out.println("Original String : " + str);

        String rev = " ";
        char ch;

        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            rev = ch + rev;
        }

        System.out.println("Reversed String : " + rev);
        sc.close();
    }    
}
