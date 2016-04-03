/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarytree;

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
public class NodeTest {

    public NodeTest() {
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
     * Test of getItem method, of class Node.
     */
    @Test
    public void testGetItem() {
        System.out.println("getItem");

        Item expResult  = new Item("TEST");
        Node instance   = new Node(expResult);

        assertEquals(expResult, instance.getItem());
    }

    /**
     * Test of compareNodeItems method, of class Node.
     */
    @Test
    public void testCompareNodeItems() {
        System.out.println("compareNodeItems");

        // Equal

        Item testItem = new Item("TEST");

        Node node       = new Node(testItem);
        Node instance   = new Node(testItem);

        int expResult   = 0;
        int result      = instance.compareNodeItems(node);

        assertEquals(expResult, result);

        // Lower

        Item testItemA = new Item("A");
        Item testItemB = new Item("B");

        node            = new Node(testItemA);
        instance        = new Node(testItemB);

        expResult       = 1;
        result          = instance.compareNodeItems(node);

        assertEquals(expResult, result);

    }

    /**
     * Test of registerSubNode method, of class Node.
     *
     * @throws Exception
     */
    @Test
    public void testRegisterSubNode() throws Exception {
        System.out.println("registerSubNode");

        Item itemA = new Item("A");
        Item itemB = new Item("B");

        Node sub        = new Node(itemA);
        Node instance   = new Node(itemB);
        Node expResult  = instance;

        assertEquals(expResult, instance.registerSubNode(sub));
        assertFalse(instance.hasAfterNode());
        assertTrue(instance.hasBeforeNode());

        Item itemC      = new Item("C");
        Node subAfter   = new Node(itemC);

        assertEquals(expResult, instance.registerSubNode(subAfter));

        assertTrue(instance.hasAfterNode());
    }

    /**
     *
     * @throws Exception
     */
    public void testRegisterTopNode() throws Exception {
        System.out.println("registerTopNode");

        Item itemA = new Item("A");
        Item itemB = new Item("B");

        Node sub        = new Node(itemA);
        Node instance   = new Node(itemB);
        Node expResult  = instance;

        assertEquals(expResult, instance.registerSubNode(sub));
        assertFalse(instance.hasAfterNode());
        assertTrue(instance.hasBeforeNode());
        assertTrue(sub.hasTopNode());

        Item itemC      = new Item("C");
        Node subAfter   = new Node(itemC);

        assertEquals(expResult, instance.registerSubNode(subAfter));

        assertTrue(instance.hasAfterNode());
    }
}
