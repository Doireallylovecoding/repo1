package day10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class K04 {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        Random s=new Random();
        int c=s.nextInt(101);
        int[] b = {1, 8, 26, 45, 60, 78, 99};
        System.out.println("修改前的数组:");

        for (int i = 0; i < b.length; i++) {
            a.add(b[i]);
        }
        System.out.println(Arrays.toString(b));
        a.add(c);
        int[]d=new int[a.size()];
        for (int i = 0; i < a.size(); i++) {
            d[i]=a.get(i);
        }
        Arrays.sort(d);
        System.out.println("修改后的数组:");
        System.out.println(Arrays.toString(d));


    }
}