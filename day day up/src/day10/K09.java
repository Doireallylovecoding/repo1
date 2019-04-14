package day10;

import java.util.ArrayList;
import java.util.Random;

public class K09 {
  public static void main(String[] args) {
      Factorylmp made=new Factorylmp();
      ArrayList<Hat> al =made.piliang(5);
      for (int i = 0; i < 5; i++) {
          made.describe(al.get(i));
      }
  }
}

class Hat{
    private int color;
    private  int price;
    private  String type;

    public Hat() {
    }

    public Hat(int color, int price, String type) {
        this.color = color;
        this.price = price;
        this.type = type;
    }

    public int getColor() {
        return color;
    }

    public int getPrice() {
        return price;
    }

    public String getType() {
        return type;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setType(String type) {
        this.type = type;
    }
}

  interface Factory{
    public abstract void describe(Hat hat);
    public abstract ArrayList<Hat> piliang(int num);
}

class Factorylmp  implements Factory{
    Random r=new Random();
    public void describe(Hat hat){
        String ys ;
        if (hat.getColor()%2==0){
             ys="黄色";
        }else {
             ys="红色";
        }
        System.out.println("颜色为"+ys+","+"价格为:"+hat.getPrice()+"元的太阳帽");
    }
    public  ArrayList<Hat> piliang(int num){

        ArrayList<Hat> al = new ArrayList();

        for (int i = 0; i < num; i++) {
            Hat hat =new Hat();
            hat.setColor(r.nextInt());
            hat.setPrice(r.nextInt(81)+20);
            hat.setType("太阳帽");
            al.add(hat);
        }
        return al;
    }

}

