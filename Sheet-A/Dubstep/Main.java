import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
     String text=sc.next();
     String parts[]=text.split("WUB");
     String ans=String.join(" ", parts);
    System.out.print(ans);
    }
}