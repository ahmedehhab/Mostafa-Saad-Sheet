import java.util.*;
public class Main{
    public static int tasks;
    public static void dfsUtil(int v,boolean visited[],ArrayList<Integer> topological,LinkedList<Integer> []adj){
        visited[v]=true;
        for (int n : adj[v]) {
            if (!visited[n]) {
                dfsUtil(n, visited,topological,adj);
            }
        }
        topological.add(v);
    }
    public static ArrayList<Integer> topologicalSorting(LinkedList<Integer> []adj) {
        
       ArrayList<Integer> topological =new ArrayList<>();
        boolean visited[] = new boolean[tasks+1];
        for(int i=1;i<=tasks;i++){
            if(!visited[i]) dfsUtil(i,visited,topological,adj);
        }
        Collections.reverse(topological);
         return  topological;
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
         while (sc.hasNext()) {
             tasks=sc.nextInt();
        int edge=sc.nextInt();
        if(tasks==0&&edge==0)break;
        LinkedList<Integer> adj[]=new LinkedList[tasks+1];
        for(int i=1;i<=tasks;i++){
            adj[i]=new LinkedList<>();
        }
        for(int i=0;i<edge;i++){
            int x=sc.nextInt();
            int y=sc.nextInt();
            adj[x].add(y);
        }
       
        ArrayList<Integer> topological =topologicalSorting(adj);
        for (int i = 0; i < topological.size(); i++) {
            System.out.print(topological.get(i) + (i == topological.size() - 1 ? "" : " "));
        }

          System.out.println();
            
         }
        
    }
}