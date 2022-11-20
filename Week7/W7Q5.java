package Week7;

import java.util.Scanner;
public class W7Q5 {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter String : ");
            String str = sc.nextLine();
            str = str.toLowerCase();
    
            String rev = "";
            char ch;
    
            for (int i = 0; i < str.length(); i++) {
                ch = str.charAt(i);
                rev = ch + rev;
            }
            if (str.equals(rev)) {
                System.out.println("Yes, The String is Palindrome");
    
            } else {
                System.out.println("No, The String is not Palindrome");
            }
            sc.close();
    }
    
}
