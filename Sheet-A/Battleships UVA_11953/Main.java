import java.util.*;

class Main{
    static public int n;
    
    public static void dfs(int i ,int j,Character grid[][]){
      if(i>=n||i<0||j>=n||j<0||grid[i][j]=='.')return;
        grid[i][j]='A';
        dfs(i+1, j, grid);
        dfs(i, j+1, grid);
    }
  public  static void main (String args[]){
     Scanner sc =new Scanner(System.in);
     int t=sc.nextInt();
     for(int a=1;a<=t;a++){
        
         n=sc.nextInt();
        Character grid[][]=new Character[n][n];
        for(int i=0;i<n;i++){
            String s=sc.next();
            for(int j=0;j<n;j++){
                grid[i][j]=s.charAt(j);
            }
        }
           int ans=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]=='x'){
                    ans++;
                    dfs(i,j,grid);
                }
            }
        }
    
          System.out.println("Case "+a+": " +ans);

     }
     sc.close();
  }
}