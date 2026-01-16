import java.util.*;
public class Main {
    public static int students;
    public static boolean isCycle(int node,int prvNode,boolean visited[],int numberOFNode[],int enmity[][]){
        visited[node]=true;
        numberOFNode[0]++;
        
    
            for(int j=1;j<=students;j++){
                    if(enmity[node][j]==1 && j!=prvNode){
                        if(visited[j])return true;
                        if(isCycle(j, node, visited, numberOFNode, enmity)) return true;

                    }
                    
            }
        
       
    return false;
    }
    public static void main(String args[]){
     Scanner sc=new Scanner(System.in);
      students=sc.nextInt();
     int numberOFEnmity=sc.nextInt();
     int enmity[][]=new int [students+1][students+1];
     for(int i=0;i<numberOFEnmity;i++){
        int first=sc.nextInt();
        int second=sc.nextInt();
        enmity[first][second]=1;
        enmity[second][first]=1;
     }
     boolean visted[]=new boolean [students+1];
     int numberOFNode[]=new int [1];
     int numberOfStudentSetOnTheBench=0;
     for(int j=1;j<=students;j++){
         if(!visted[j]) {
             numberOFNode[0]=0;
        boolean cycle =  isCycle(j, -1, visted, numberOFNode, enmity);
                  if(cycle&& numberOFNode[0]%2==1){
                     numberOfStudentSetOnTheBench++;
                  }          
            
            }

        }
      
      if((students-numberOfStudentSetOnTheBench)%2==1)numberOfStudentSetOnTheBench++;
      System.out.println(numberOfStudentSetOnTheBench);

    }
}