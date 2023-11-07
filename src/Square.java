public class Square extends ColoredFigure{
    Square(String c, int s){
        super(c, s);
    }
    String getName(){
        return "square";
    }
    double getArea(){
        return size*size;
    }
}
