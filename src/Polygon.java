public interface Polygon {
    void getArea(int length,int breadth);
}

class Rectangle implements Polygon{
    @Override
    public void getArea(int length, int breadth) {
        System.out.println("the area of rectangle is "+ (length*breadth));
    }

    public static void main(String[] args) {
        Rectangle r1= new Rectangle();
        r1.getArea(12,10);
    }
}
