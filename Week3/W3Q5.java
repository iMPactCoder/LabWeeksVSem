public class W3Q5 {

    public static void main(String[] args) {
        double x1 = 4;
        double y1 = 5;
        double x2 = 7;
        double y2 = 1;

        double temp = Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2);
        double dist = Math.sqrt(temp);
        System.out.println("The Distance Between (" + x1 + " , " + y1 + ") and (" + x2 + " , " + y2 + ") is " + dist);

    }
}
