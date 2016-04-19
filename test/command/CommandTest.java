/*
 * Copyright (C) 2016 Kai Hempel
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package command;

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
public class CommandTest {

    public CommandTest() {
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
     * Test of setName method, of class Command.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");

        String name = "Test";
        Command instance = new Command();
        instance.setName(name);

        assertEquals("Test", instance.getName());
    }

    /**
     * Test of getName method, of class Command.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");

        Command instance = new Command();
        String expResult = "";
        String result = instance.getName();

        assertEquals(expResult, result);
    }

    /**
     * Test of setValue method, of class Command.
     */
    @Test
    public void testSetValue() {
        System.out.println("setValue");

        String value = "A";
        Command instance = new Command();
        Command result = instance.setValue(value);

        assertEquals(instance, result);
        assertEquals("A", instance.getValue());

    }

    /**
     * Test of getValue method, of class Command.
     */
    @Test
    public void testGetValue() {
        System.out.println("getValue");

        Command instance = new Command();
        String expResult = "";
        String result = instance.getValue();

        assertEquals(expResult, result);

    }

}
