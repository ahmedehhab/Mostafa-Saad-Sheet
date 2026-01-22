import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        char arr[][]=new char[n][n];
        for(int i=0;i<n;i++){
            String s=sc.next();
            for(int j=0;j<n;j++){
                arr[i][j]=s.charAt(j);
            }
        }
        char firstLetter=arr[0][0];
        char secondLetter=arr[0][1];
        boolean valid=(firstLetter!=secondLetter);
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j||i+j==n-1){
                    if(arr[i][j]!=firstLetter){
                        valid=false;
                        break;
                    }
                }else if(arr[i][j]!=secondLetter) {
                    valid=false;
                    break;

                }

            }
        }
        if(valid)System.out.print("YES");
            else System.out.print("NO");
        
    }
}