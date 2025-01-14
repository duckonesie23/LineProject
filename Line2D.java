public class Line2D {
    private Point P1;
    private Point P2;
    public Line2D(Point p1, Point p2){
        P1 = p1;
        P2 = p2;
    }
    public Line2D(int x1, int y1, int x2, int y2){
        P1 = new Point(x1,y1);
        P2 = new Point(x2,y2);
    }
    public Point getP1(){
        return P1;
    }
    public Point getP2(){
        return P2;
    }
    public String toString(){
        return "[("+P1.getX()+", "+P1.getY()+"), ("+P2.getX()+", "+P2.getY()+")]";
    }

    public double getSlope(){
        if(P2.getX()-P1.getX()!=0)
            return (P2.getY()-P1.getY())/(P2.getX()-P1.getX());
        else
            throw new IllegalArgumentException("undefined slope");
    }
    public boolean isCollinear(Point p){
        double bc = (P2.getY()-p.getY())/(P2.getX()-p.getX());
        if(Math.abs(getSlope()-bc)<0.01){
            return true;
        }else{
            return false;
        }
    }
}
