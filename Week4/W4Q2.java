public class W4Q2 {

    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        int c = 4;
        if (a > b) {
            if (a > c) {
                System.out.println(a + " is the Largest");
            } else {
                System.out.println(c + " is the Largest");
            }
        } else {
            if (b > c) {
                System.out.println(b + " is Largest");
            } else {
                System.out.println(c + " is the Largest");
            }
        }
    }
}
