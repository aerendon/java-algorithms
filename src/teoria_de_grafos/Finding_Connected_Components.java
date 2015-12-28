import java.io.*;
import java.util.*;

public class Main { 
    static boolean[] visited; 
    static int AdjList[][];  

    public static void dfs(int u, Vector<Integer>vec, int n){
       visited[u] = true;
       vec.add(u);
       for(int j=0; j<n; j++){
           if(AdjList[u][j] == 1 && !visited[j]){
               dfs(j,vec, n);
           }   
       }
    } 
    
    public static void DisplayDFS(Vector<Integer> vec){
        for(int i=0; i<vec.size(); i++){
            System.out.print(vec.get(i)+" ");
        }
        System.out.println("");
    }
    
    public static void main(String[]args) throws IOException{
        Scanner sc = new Scanner(System.in);
        int t, e, x, y;  
        e = sc.nextInt();
        AdjList = new int[e][e];
        visited = new boolean[e];
        Vector<Integer> vec;
        
        for(int i=0; i<e; i++){
            Arrays.fill(AdjList[i], -1);
        }
        
        t = sc.nextInt();
        for(int i=0; i<t; i++){
            x = sc.nextInt();
            y = sc.nextInt();
            AdjList[x][y] = 1;
        }
        
        //scc
        int ncc = 0;
        for(int i=0; i<e; i++){
            if(!visited[i]){
                vec = new Vector<Integer>(); 
                System.out.print("CC "+(++ncc)+":  ");
                dfs(i, vec, e);
                DisplayDFS(vec);
            }
        }   
    }       
}
