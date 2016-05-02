/*
 * Copyright (C) 2016 erosol
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
public class CommandListTest {

    public CommandListTest() {
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
     * Test of registerCommand method, of class CommandList.
     */
    @Test
    public void testRegisterCommand() {
        System.out.println("registerCommand");

        String name = "Test";
        CommandList instance = new CommandList();
        CommandList result = instance.registerCommand(name);

        assertEquals(instance, result);

    }

    /**
     * Test of isInList method, of class CommandList.
     */
    @Test
    public void testIsInList() {
        System.out.println("isInList");

        String commandName = "test";

        CommandList instance = new CommandList();

        boolean expResult = false;
        boolean result = instance.isInList(commandName);

        assertEquals(expResult, result);

        instance.registerCommand(commandName);

        expResult = true;
        result = instance.isInList(commandName);

        assertEquals(expResult, result);
    }

}
