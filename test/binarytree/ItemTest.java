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
public class ItemTest {

    public ItemTest() {
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
     * Test of Item method, of class Item.
     */
    @Test
    public void testItem() {

        System.out.println("Item");

        String value = "Test";
        Item instance = new Item(value);

    }

    /**
     * Test of getValue method, of class Item.
     */
    @Test
    public void testGetValue() {

        System.out.println("getValue");

        Item instance = new Item(new String("TEST"));

        String expResult = "TEST";
        String result = instance.getValue();

        assertEquals(expResult, result);

    }

    /**
     * Test of getValue method, of class Item.
     */
    @Test
    public void testSetValue() {

        System.out.println("setValue");

        Item instance = new Item(new String("TEST"));

        String expResult = "TEST2";
        String result = instance.setValue(expResult).getValue();

        assertEquals(expResult, result);

    }

    /**
     * Test of getValue method, of class Item.
     */
    @Test
    public void testCompare() {

        System.out.println("Compare");

        Item itemA = new Item("A");
        Item itemB = new Item("B");

        int expResult = -1;
        int result = itemA.compare(itemB);

        assertEquals(expResult, result);

        expResult = 1;
        result = itemB.compare(itemA);
    }

    /**
     * Test of getValue method, of class Item.
     */
    @Test
    public void testIsGreaterThan() {

        System.out.println("GreaterThan");

        Item itemA = new Item(new String("A"));
        Item itemB = new Item(new String("B"));

        boolean expResult = false;
        boolean result = itemA.isGreaterThan(itemB);

        assertEquals(expResult, result);

        expResult = true;
        result = itemB.isGreaterThan(itemA);
    }

    /**
     * Test of getValue method, of class Item.
     */
    @Test
    public void testIsLowerThan() {

        System.out.println("LowerThan");

        Item itemA = new Item(new String("A"));
        Item itemB = new Item(new String("B"));

        boolean expResult = true;
        boolean result = itemA.isLowerThan(itemB);

        assertEquals(expResult, result);

        expResult = false;
        result = itemB.isLowerThan(itemA);
    }

}
