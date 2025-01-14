public class TestLine2D {
    public static void main(String[]args){
        Point p1 = new Point();
        Point p2 = new Point(3,4);
        Point p3 = new Point(4,9);
        Point p4 = new Point(6,8);

        System.out.println("Testing constructor using 2 Point objects and the toString method ");
        Line2D line1 = new Line2D(p1,p2);
        Line2D line2 = new Line2D(p3,p4);
        System.out.println("\tLine 1: "+line1);
        System.out.println("\tLine 2: "+line2);

        System.out.println("Testing constructor using 4 int's and the toString method");
        Line2D line3 = new Line2D(4,9,6,8);
        System.out.println("\tLine 3: "+ line3);

        System.out.println("Testing getP1 and getP2 methods: ");
            System.out,println("Line1, getP1: x="+line1.getP1()+", y="+p1.get);
    }
}
