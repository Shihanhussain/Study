import java.util.Scanner;

public class FibonacciSeriesBasedOnInput {


    public static void main(String[] args) {
        //Scanner scn = new Scanner(System.in);
        //int n = scn.nextInt();
        int n =7;

        int a = 0;
        int b = 1;

        if(n==0){
            System.out.println(a);
        } else if (n==1) {
            System.out.println(b);
        }else {
        int  c =0;
            for (int i = 2; i <= n; i++) {
             c = a+b;
             System.out.println(c);
             a=b;
             b=c;
            }
            //System.out.println(c);
        }


    }
}