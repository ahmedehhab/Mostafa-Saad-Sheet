import java.util.*;
public class Main {
 static public void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    boolean arr[]=new boolean[n+1];
    for(int i=0;i<2;i++){
        int levels=sc.nextInt();
        while (levels-->0) 
        {
            int level=sc.nextInt();
            arr[level]=true;
            
        }
    }
    boolean passTheGame=true;
    for(int i=1;i<=n;i++){
      if(!arr[i]){
        passTheGame=false;
        break;
      }
    }
    if(passTheGame) System.out.println("I become the guy.");
        else  System.out.println("Oh, my keyboard!");
 }
}