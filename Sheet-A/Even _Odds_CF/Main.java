import java.util.*;
public class Main {

     static public void main(String args[]){
        Scanner sc= new Scanner(System.in);

        long number=sc.nextLong();
        long index=sc.nextLong();
        long ans=0;
        if((number+1)/2 >=index){ //for odd
            ans=(index*2)-1;
          
        }else{ // for even 
            index-=(number+1)/2;
            ans=index*2;
           
        }
        System.out.println(ans);
     }
}

// 1 3 5 7 2 4 6
