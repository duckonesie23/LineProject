public class Point{
    private int x;
    private int y;
    public Point(){
        x = 0;
        y = 0;
    }
    public Point(int ecks, int why){
        x = ecks;
        y = why;
    }

    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    
    public void setX(int ecks){
        x = ecks;
    }
    public void setY(int why){
        y = why;
    }

    public int manhattanDistance(Point other){
        return Math.abs(x-other.getX()) + Math.abs(y-other.getY());
    }

    public boolean isCollinear(Point p1, Point p2){
        if(p2.getX()-x!=0 && p2.getX()-p1.getX()!=0){
            double ab = (p1.getY()-y)/(p2.getX()-x);
            double bc = (p2.getY()-p1.getY())/(p2.getX()-p1.getX());
            if(Math.abs(ab-bc)<0.01){
                return true;
            }else{
                return false;
            }
        }else{
            if(x == p1.getX() && p1.getX() == p2.getX()){
                return true;
            }else{
                return false;
            }
            
        }
    }
}