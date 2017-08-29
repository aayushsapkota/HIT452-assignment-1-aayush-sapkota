
package connectedgraph;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Aayush Sapkota
 */
public class BFS {
    private Queue<Integer> queue;

    public BFS(){
    queue = new LinkedList<Integer>();
    }

    public boolean breadthFristSearch(int adj_matrix[][], int origin){

        int numberOfNode = adj_matrixlength(adj_matrix, origin);
        boolean isGraphConnected;
        int[] visited = new int[numberOfNode + 1];
        int i, atomObj;
        visited[origin] = 1;
        queue.add(origin);
        while(!queue.isEmpty()){
            atomObj = queue.remove();
            i = atomObj;
            while(i <= numberOfNode){
            if(adj_matrix[atomObj][i] ==1 && visited[i] ==0){
            queue.add(i);
            visited[i] = 1;
            }
            i++;
            }
        }

        boolean isConnected = false;

        for(int vertex = 1; vertex <= numberOfNode; vertex++){
        if(visited[vertex] == 1){
        isConnected = true;
        }else{
        isConnected = false;
        break;
        }

        if(isConnected){
          isGraphConnected  = true;
        }else{
            isGraphConnected = false;
        }
        }
        return isGraphConnected;
    }


    private int adj_matrixlength(int adj_matrix[][], int source){
   return adj_matrix[source].length - 1;
    }
}
