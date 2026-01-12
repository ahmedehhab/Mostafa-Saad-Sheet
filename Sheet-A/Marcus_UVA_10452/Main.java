import  java.util.*;
class Main {
 public static String Path="@IEHOVA#" ;
 public static int rows;
 public static int cols;

 static void dfs(int r, int c, int index, String command, Character grid[][]){
     if(r>=rows ||r<0 ||c>=cols ||c<0 ) return;

     if( grid[r][c]!=Path.charAt(index)) return;
     if(!command.equals("")){
         System.out.print(command + (Path.charAt(index) == '#' ? "" : " "));
     }
     if( Path.charAt(index)=='#')return;
     dfs(r-1,c,index+1,"forth",grid);
     dfs(r,c+1,index+1,"right",grid);
     dfs(r,c-1,index+1,"left",grid);




 }
    public  static  void  main(String[] args){
        Scanner sc =new Scanner(System.in);
        if(!sc.hasNextInt())return;
      int t=sc.nextInt();
        while(t-- !=0){
            if(!sc.hasNextInt())return;
         rows=sc.nextInt();
         cols=sc.nextInt();
        Character[][] grid =new Character[rows][cols];
        int r =-1 ;
        int c=-1;
        for(int i=0;i<rows;i++){
            String s= sc.next();
            for(int j=0;j<cols;j++){
                grid[i][j]=s.charAt(j);
                if(grid[i][j]=='@'){
                    r=i;
                    c=j;
                }
            }
        }
//            dfs(r,c,-1,"",grid);
            dfs(r,c,0,"",grid);

           System.out.println();

        }
        sc.close();
    }
  }