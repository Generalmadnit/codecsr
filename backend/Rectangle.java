public class Rectangle {
    private double len;
    private double bre;
    public Rectangle(){
        len = 1.1;
        bre = 0.5;
    }
    public Rectangle(double l, double b){
        len = l;
        bre = b;
    }
    public void setDim(double l, double b){
        len = l;
        bre = b;
    }    
    public double calcArea(){
        double area;
        area = len*bre;
        return area;
    }
    public double calcPeri(){
        double peri;
        peri = 0.5 * len*bre;
        return peri;
    }
    public void setLen(double l){
        len = l;
    }
    public double getLen(){
        return len;
    }
    public void setBre(double b){
        bre = b;
    }
    public double getBre(){
        return bre;
    }
    public String toString(){
        String str="";
        str = "Rectangle length: "+len+"breadth: "+bre;
        return str;
    }
    public static void sayHello(){
        System.out.println("Hello World!");
    }
}
