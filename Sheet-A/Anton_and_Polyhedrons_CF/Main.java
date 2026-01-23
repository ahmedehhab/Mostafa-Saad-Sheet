import java.util.*;
public class Main {

     public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        HashMap<String,Integer> shapes=new HashMap<>();
        shapes.put("Tetrahedron", 4);
        shapes.put("Cube", 6);
        shapes.put("Octahedron", 8);
        shapes.put("Dodecahedron", 12);
        shapes.put("Icosahedron", 20);

        int n=sc.nextInt();
        int ans=0;
        for(int i=0;i<n;i++){
            String s=sc.next();
            ans+=shapes.get(s);
        }
        System.out.print(ans);
        
     }
}