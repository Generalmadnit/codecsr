public class Rectangle {
    private double len;
    private double bre;
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
}
