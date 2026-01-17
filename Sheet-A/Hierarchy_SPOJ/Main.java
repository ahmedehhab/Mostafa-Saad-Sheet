import java.util.*;
import java.io.*;

public class Main {
   static public LinkedList<Integer> adj[];

    public static void main(String[] args) {
        FastReader sc = new FastReader();
         
        int n,m ;
        n=sc.nextInt();
        m=sc.nextInt();
        adj=new LinkedList [n+1];
        boolean visited[]=new boolean[n+1];
        ArrayList<Integer> topologicalSort=new ArrayList<>();
        for(int i=1;i<=n;i++){
            adj[i]=new LinkedList<>();

        }
        for(int i=1;i<=m;i++){
            int numberOfChild=sc.nextInt();
            while (numberOfChild-- >0) {
                 int child=sc.nextInt();
                 adj[i].add(child);
                
            }
        }
        for(int i=1;i<=n;i++){
            if(!visited[i])dfs(i, visited, topologicalSort);
        }
       int ans []=new int [n+1];
       for(int i=0;i<n-1;i++){
        ans[topologicalSort.get(i)]=topologicalSort.get(i+1);
       } 
       StringBuilder out = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            out.append(ans[i]).append("\n");
        }
        System.out.print(out);

        
    }
    
     static void dfs(int node ,boolean visited[],ArrayList<Integer> topologicalSort){
        visited[node]=true;
        for(int i:adj[node]){
            if(!visited[i])dfs(i, visited,topologicalSort);
        }
        topologicalSort.add(node);

     }
  

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }
    }
}