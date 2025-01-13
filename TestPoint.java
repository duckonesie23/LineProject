public class TestPoint{
    public static void main(String[]args){
        Point p1 = new Point();
        Point p2 = new Point(3,4);
        Point p3 = new Point(-5,7);
        Point p4 = new Point(3,-10);
        Point p5 = new Point(3,10);
        Point p6 = new Point(6,8);
        System.out.println("Testing manhattanDistance: ");
        System.out.println("\tp2 to p3: "+ p2.manhattanDistance(p3));
        System.out.println("\tp3 to p4: "+ p3.manhattanDistance(p4));

        System.out.println("Testing isCollinear: ");
    }
}