package day10;

public class K12 {
    public static void main(String[] args) {
        Brush b1=new Brush();
        b1.setColor("红色");
        b1.setPrice(5.8f);
        Pencil b2=new Pencil();
        b2.setColor("黑色");
        b2.setPrice(2.5f);
        Painter hj=new Painter();
        hj.name="王流氓";
        hj.draw(b1);
        hj.draw(b2);


    }
}

interface writeAction{
      abstract void write();
}

class Pen implements writeAction{
    public void write(){}
    float Price;
    String Color;

    public Pen() {
    }

    public Pen(float price, String color) {
        Price = price;
        Color = color;
    }

    public float getPrice() {
        return Price;
    }

    public String getColor() {
        return Color;
    }

    public void setPrice(float price) {
        Price = price;
    }

    public void setColor(String color) {
        Color = color;
    }
}

class Brush extends Pen{
    public void write(){
        System.out.println("现在使用的是价格为"+getPrice()+"的"+getColor()+"颜色的画笔");
    }

    public  Brush() {
    }

    public  Brush(float price, String color) {
        super(price, color);
    }
}
class Pencil extends Pen{
   public void write(){
        System.out.println("现在使用的是价格为"+getPrice()+"的"+getColor()+"颜色的铅笔");
    }

    public Pencil() {
    }

    public Pencil(float price, String color) {
        super(price, color);
    }
}

class Painter{
    String name;


    public Painter() {
    }

    public Painter(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    void draw(Pen p){
        System.out.println("画家"+name+"正在绘画");
        p.write();
        }
    }

