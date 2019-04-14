package day10;


import java.security.PrivateKey;
import java.util.ArrayList;
import java.util.Scanner;

public class calculator {
    static char c;
    public static void main(String[] args) {
        Scanner gs = new Scanner(System.in);
        System.out.print("请输入你的公式:");
        String gs2= gs.nextLine();
        char[] gs3=gs2.toCharArray();
       ArrayList<Character> gs4=new ArrayList<>();
       int L=gs3.length;
        for (int i = 0; i < gs3.length; i++) {
            gs4.add(gs3[i]);
        }

            for (int i = 0; i < gs4.size(); i++) {


                if (gs4.get(i)=='*'||gs4.get(i)=='/'){
                    if (gs4.get(i)=='*'){
                        c=(char)((gs4.get(i-1)-48)*(gs4.get(i+1)-48)+48);
                        gs4.remove(i);
                        gs4.remove(i);
                        gs4.set(i-1,c);
                        i=0;
                    }else {
                        c=(char)((gs4.get(i-1)-48)/(gs4.get(i+1)-48)+48);
                        gs4.remove(i);
                        gs4.remove(i);
                        gs4.set(i-1,c);
                        i=0;
                    }


                }

            }
        for (int i = 0; i < gs4.size(); i++) {
            if (gs4.get(i) == '+'||gs4.get(i) == '-') {

                if (gs4.get(i) == '+') {
                    char c = (char) ((gs4.get(i - 1) - 48) + (gs4.get(i + 1) - 48) + 48);
                    gs4.remove(i);
                    gs4.remove(i);
                    gs4.set(i - 1, c);
                    i = 0;
                } else {
                    char c = (char) ((gs4.get(i - 1) - 48) - (gs4.get(i + 1) - 48) + 48);
                    gs4.remove(i);
                    gs4.remove(i);
                    gs4.set(i - 1, c);
                    i = 0;
                }
            }
            if (gs4.size()==1){
                break;
            }


        }
        System.out.println( "这公式的结果是:"+(gs4.get(0)-48));
        System.out.println("不用再口算了,肯定是对的");
        }
    }
