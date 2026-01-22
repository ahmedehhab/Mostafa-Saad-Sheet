import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        long ans=n/2;
        if(n%2==1){
            ans++;
            ans*=-1;
        }
        System.out.print(ans);

    }
}