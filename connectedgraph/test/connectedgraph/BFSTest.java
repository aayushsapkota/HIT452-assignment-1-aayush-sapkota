/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connectedgraph;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Aayush Sapkota
 */
public class BFSTest {
    
    public BFSTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of breadthFristSearch method, of class BFS.
     */
    @Test
    public void testBreadthFristSearch() {
       // System.out.println("breadthFristSearch");
        int[][] adj_matrix = {{3,8},{9,7}};
        int origin = 1;
        BFS instance = new BFS();
       String result = instance.breadthFristSearch(adj_matrix, origin);
        String expectedResult = "Graph is connected";
        String expectedResult2 = "Graph is not connected";
        
        if(expectedResult.equals(result)){
            System.out.println("Pass");
            System.out.println(result);
        }
        else if(expectedResult2.equals(result)){
         System.out.println("Pass");
             System.out.println(result);
        }else{
         fail("The test case is a prototype.");   
        }
        
    }
    
}
