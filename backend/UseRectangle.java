public class UseRectangle{
    public static void main(String []ar){
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle();
        r1.setDim(1.5, 6.30);
        r2.setDim(1.9,6.1);
        double a1 = r1.calcArea();
        double p1 = r1.calcPeri();
        double a2 = r2.calcArea();
        double p2 = r2.calcPeri();
        System.out.println("Area of r1 is :      "+a1);
        System.out.println("Perimeter of r1 is : "+p1);
        System.out.println("Area of r2 is :      "+a2);
        System.out.println("Perimeter of r2 is : "+p2);
    }
}