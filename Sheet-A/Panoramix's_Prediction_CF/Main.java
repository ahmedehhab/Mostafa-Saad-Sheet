import java.util.*;
public class Main {
    static boolean isPrime[];
   static void getPrimes(){
        isPrime=new boolean[51];
        Arrays.fill(isPrime, true);
        isPrime[0]=isPrime[1]=false;
        for(int i=2;i*i<=50;i++){
            if(isPrime[i]){
                for(int j=i*i;j<=50;j+=i){
                    isPrime[j]=false;

                }
            }
        }
    }
     public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
          getPrimes();
        int n=sc.nextInt();
        int m=sc.nextInt();
        boolean notNext=false;
        for(int i=n+1;i<m;i++){
            if(isPrime[i]){
                notNext=true;
                break;
            }
        }
        if(!isPrime[m]||notNext){
            System.out.print("NO");
        }else{
            System.out.print("YES");
        }


    }
}