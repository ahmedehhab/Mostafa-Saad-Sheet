import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int ans[]={6,8,4,2};
        int pow=sc.nextInt();
        int res=1;
        if(pow!=0) res=ans[pow%4];
        System.out.print(res);

    }
}


