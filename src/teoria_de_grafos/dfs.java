static boolean[] visited; //Arreglo de Visitados
static int AdjList[][];   //Lista de Adyacencias

/*
Inputs:
    u: nodo de inicio
    vec: Arreglo que almacena el recorrido
    n: Número de nodos 
*/
public static void dfs(int u, Vector<Integer>vec, int n){
   visited[u] = true;
   vec.add(u);
   for(int j=0; j<n; j++){
       if(AdjList[u][j] == 1 && !visited[j]){
           dfs(j,vec, n);
       }   
   }
}