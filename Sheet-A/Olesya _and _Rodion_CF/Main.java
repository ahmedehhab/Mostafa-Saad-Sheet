import java.util.*;
public class Main {

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int t=sc.nextInt();
        StringBuilder ans=new StringBuilder();
        if(n==1&&t==10){
            System.out.print(-1);
        }else{
             if(t==10){
            for(int i=0;i<n-1;i++){
                ans.append('1');
            }
            ans.append('0');
           }else{
            for(int i=0;i<n;i++){
             ans.append(t);
            }
            }
      
              System.out.print(ans);

        }
       
    }
}