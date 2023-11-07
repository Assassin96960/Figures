import jdk.swing.interop.SwingInterOpUtils;

abstract class ColoredFigure {
    String color;
    int size;

    public ColoredFigure(String color, int s)  {
        this.color = color;
        this.size = s;
    }
    void show()
    {
        System.out.println("Figure "+color+ " with name "+getName());
        System.out.println("Area of Figure ist:"+ getArea());
        String line="";
        for(int i=0;i<30;i++)
        {
            line+="*";
        }
        System.out.println(line);
    }
    String getSizeName()
    {
        return "strana";
    }
    abstract String getName();
    abstract double getArea();

}
