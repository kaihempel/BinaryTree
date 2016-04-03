/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarytree;

import java.util.*;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author erosol
 */
public class BTreeTest {

    public BTreeTest() {
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
     * Test of getTreeNodeCount method, of class BTree.
     */
    @Test
    public void testGetTreeNodeCount() {
        System.out.println("getTreeNodeCount");

        Item itemA = new Item("A");
        Node nodeA = new Node(itemA);

        BTree instance = new BTree(nodeA);

        int expResult   = 1;
        int result      = instance.getTreeNodeCount();

        assertEquals(expResult, result);
    }

    /**
     * Test of addNode method, of class BTree.
     */
    @Test
    public void testAddNode() throws Exception {
        System.out.println("addNode");

        Item itemA = new Item("A");
        Node nodeA = new Node(itemA);

        Item itemB = new Item("B");
        Node nodeB = new Node(itemB);

        BTree instance  = new BTree(nodeB);
        BTree result    = instance.addNode(nodeA);
        int resultCount = instance.getTreeNodeCount();

        assertEquals(instance, result);
        assertEquals(2, resultCount);

    }

    /**
     * Test of getFlatTree method, of class BTree.
     *
     *          D
     *         / \
     *        B   E
     *       / \
     *      A   C
     */
    @Test
    public void testGetFlatTree() throws Exception {
        System.out.println("getFlatTree");

        Item itemA = new Item("A");
        Node nodeA = new Node(itemA);

        Item itemB = new Item("B");
        Node nodeB = new Node(itemB);

        Item itemC = new Item("C");
        Node nodeC = new Node(itemC);

        Item itemD = new Item("D");
        Node nodeD = new Node(itemD);

        Item itemE = new Item("E");
        Node nodeE = new Node(itemE);

        // Build the tree with "D" as root node

        BTree instance  = new BTree(nodeD);
        instance.addNode(nodeB).addNode(nodeE).addNode(nodeA).addNode(nodeC);

        // Build expected result list

        List<Item> expResult = new ArrayList<>();
        expResult.add(itemA);
        expResult.add(itemB);
        expResult.add(itemC);
        expResult.add(itemD);
        expResult.add(itemE);

        List resultList      = instance.getFlatTree();

        assertEquals(expResult, resultList);

    }

}
