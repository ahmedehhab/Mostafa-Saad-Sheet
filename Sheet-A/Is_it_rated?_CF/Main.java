import java.util.*;

public class Main{
    static public void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int before[]=new int[n];
        int after[]=new int[n];
        boolean isRated=false;
        for(int i=0;i<n;i++){
            before[i]=sc.nextInt();
            after[i]=sc.nextInt();
            if(after[i]!=before[i])isRated=true;
        }
        
        boolean unRated=false;
        if(!isRated){
            for(int i=1;i<n;i++){
                if(before[i]>before[i-1])unRated=true;
            }
        }
        if(isRated)System.out.print("rated");
        else if(unRated) System.out.print("unrated");
        else System.out.print("maybe");

    }
}