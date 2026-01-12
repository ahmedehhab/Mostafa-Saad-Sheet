import java.util.*;
class Main{

    public static void dfs(int r ,int c ,int grid[][],int n){
      if(r>=n ||r<0 ||c>=n || c<0 || grid[r][c]==0) return;
       grid[r][c]=0;
       for(int dr=-1;dr<=1;dr++){
           for(int dc=-1;dc<=1;dc++){
               if(dc==0&&dr==0)continue;
               dfs(r+dr,c+dc,grid,n);
           }
       }
    }
    public static void main(String args[]){
      Scanner sc= new Scanner(System.in);
      int imageNumber=0;
      while(sc.hasNext()){

          int n= sc.nextInt();
          int grid[][]=new int [n][n];
          for(int i=0;i<n;i++){
              String s=sc.next();
              for(int j=0;j<n;j++){
                  grid[i][j]=Character.getNumericValue(s.charAt(j));
              }
          }
          int war=0;
          for(int i=0;i<n;i++){
              for(int j=0;j<n;j++){
                  if(grid[i][j]==1) {
                      war++;
                      dfs(i,j,grid,n);
                  }
              }
          }



          System.out.println("Image number " + ++imageNumber + " contains " + war + " war eagles.");

      }
    sc.close();
    }
}