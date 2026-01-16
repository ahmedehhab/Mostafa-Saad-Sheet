#include<bits/stdc++.h>
using namespace std;
const int dx[8]={0, 0, 1, -1, 1, -1, -1, 1}, dy[8]={1, -1, 0, 0, 1, -1, 1, -1};
int edge[101]{0},n,m;
vector<vector<int>>graph(102);
void dfs(int node){
edge[node]=1;

for(auto i:graph[node]){
    if(!edge[i])dfs(i);
}
graph[101].push_back(node);
}
void ahmed(){
int x,y;
for(int i=0;i<m;i++){
    
    cin>>x>>y;
    graph[x].push_back(y);
}
for(int i=1;i<=n;i++){
    if(!edge[i])dfs(i);
    
}
 cout<<graph[101][n-1];
for(int i=n-2;i>=0;i--){
    cout<<" "<<graph[101][i];
}
}
int main()
{
    // freopen("equal.in", "r", stdin);
    // freopen("output.txt", "w", stdout);
ios_base::sync_with_stdio(false); cin.tie(NULL);
int t=1;
// cin>>t;
while(cin>>n>>m&&n ){
    
      for(auto &i:graph) i.clear();
     memset(edge ,0,sizeof edge);

ahmed();
cout<<'\n';
}
}


		 	 		 	 	  	  	 						 	  	 	