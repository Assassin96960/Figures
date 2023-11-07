public class Circle extends ColoredFigure {
    Circle(String color, int r)
    {
        super(color, r);
    }
    String getName(){
        return "circle";
    }
    double getArea(){
        double k=Math.PI;
        return size*size*k;
    }
    String getSizeName(){
        return "radius";
    }
}
