import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int a=sc.nextInt();
        int h=Math.ceilDiv(m, a);
        int w=Math.ceilDiv(n, a);
        System.out.print((long)h*w);
    }
}