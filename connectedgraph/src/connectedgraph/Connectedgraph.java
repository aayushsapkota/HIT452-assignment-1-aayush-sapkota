/**
 *
 * @author Aayush Sapkota
 */
package connectedgraph;

import java.util.Scanner;

public class Connectedgraph {

    public static void main(String[] args) {

        int numberOnNode, origin;

        System.out.println("Please, Enter the number of nodes in the graph");
        Scanner scan = new Scanner(System.in);
        numberOnNode = scan.nextInt();

        int adj_matrix[][] = new int[numberOnNode + 1][numberOnNode + 1];
        System.out.println("Please, Enter the adjacency matrix");

        for (int i = 0; i < numberOnNode; i++) 
            for (int j = 1; j < numberOnNode; j++) 
                adj_matrix[i][j] = scan.nextInt();
            

        for (int i = 0; i < numberOnNode; i++) {
            for (int j = 1; j < numberOnNode; j++) {
                if (adj_matrix[i][j] == 1 && adj_matrix[i][j] == 0) {
                    adj_matrix[i][j] = 1;
                }
            }
        }
        System.out.println("Please, Enter the origin for the graph");
        origin = scan.nextInt();
        BFS checkGraphConnection = new BFS();
        checkGraphConnection.breadthFristSearch(adj_matrix, origin);
        scan.close();

    }

}
