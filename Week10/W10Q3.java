
public class W10Q3 {
    static void minMaxAdd(int a, int b) {
        if (a > b) {
            System.out.println("Min : " + b);
            System.out.println("Max : " + a);
        } else {
            System.out.println("Min : " + a);
            System.out.println("Max : " + b);
        }
        System.out.println("Add : " + (a + b));
    }

    static void minMaxAdd(double a,double b){
        if(a>b){
            System.out.println("Min : "+b);
            System.out.println("Max : "+a);
          }
          else{
            System.out.println("Min : "+a);
            System.out.println("Max : "+b);
          }
        System.out.println("Add : "+(a+b));
    }

    static void minMaxAdd(char a, char b) {
        if (a > b) {
            System.out.println("Min : " + b);
            System.out.println("Max : " + a);
        } else {
            System.out.println("Min : " + a);
            System.out.println("Max : " + b);
        }

        System.out.println("Add : " + a + b);
    }

    public static void main(String[] args) {
        minMaxAdd('a', 'b');

    }
}
