import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        long l=sc.nextLong();
        long r=sc.nextLong();
        if(l%2==1)l++;
        if(r-l<2){
            System.out.print(-1);
        }else{
            
           for(int i=0;i<=2;i++){
            System.out.print((l+i)+(i!=2?" ":""));
           }
        }
    }
}