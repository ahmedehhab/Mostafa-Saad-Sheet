import java.util.*;
public class Main{
 public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n =sc.nextInt();
    String arr[]=new String[n];
    String team1=arr[0]=sc.next();
    String team2="";
    int goalsTeam1=0;
    int goalsTeam2=0;
    for(int i=1;i<n;i++){
        arr[i]=sc.next();
        if(!arr[i].equals(team1)&&team2.equals(""))team2+=arr[i];
    }
   for(int i=0;i<n;i++){
    if(arr[i].equals(team1))goalsTeam1++;
    else goalsTeam2++;
   }
   if(goalsTeam1>goalsTeam2){

       System.out.print(team1);
   }else{
       System.out.print(team2);
   }
 }
}