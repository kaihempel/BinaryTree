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
package binarytree;

import java.util.*;

/**
 *
 * @author erosol
 */
public class BinaryTree {

    /**
     * The tree
     */
    private BTree mainTree;

    /**
     * Returns the tree
     *
     * @return
     */
    public BTree getTree() {
        return mainTree;
    }

    /**
     * Creates the btree object
     *
     * @param rootValue
     */
    public void createTree(String rootValue) {

        Item rootItem   = new Item(rootValue);
        Node rootNode   = new Node(rootItem);

        mainTree        = new BTree(rootNode);
    }

    /**
     * Adds one node
     *
     * @param nodeValue
     */
    public void addNode(String nodeValue) {

        Item nodeItem   = new Item(nodeValue);
        Node newNode    = new Node(nodeItem);

        try {
            mainTree.addNode(newNode);
        } catch (Exception e) {
            System.out.println("Node konnte nicht erzeugt werden!");
        }
    }

    /**
     * Displays all nodes in correct order
     */
    public void showWholeTree() {
        List<Item> allItems = mainTree.getFlatTree();

        for (Item current : allItems) {
            System.out.println(" - " + current.getValue());
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        BinaryTree  mainTreeManager = new BinaryTree();
        Scanner     reader          = new Scanner(System.in);
        int         command         = 0;

        // Sytem start

        System.out.println("BTree Demo by \"Kai Hempel\"");
        System.out.println("");
        System.out.println("Bitte geben Sie das Root Element an:");

        String rootElement = reader.next();

        mainTreeManager.createTree(rootElement);

        System.out.println("\"BTree\" erstellt mit Root Element \"" + rootElement + "\"!");

        // System menu

        do {

            System.out.println("Möchten Sie:");
            System.out.println("- 1) weitere Elemente hinzufügen");
            System.out.println("- 2) gesamten Baum als Liste anzeigen");
            System.out.println("- 3) Programm beenden");

            command = reader.nextInt();

            switch (command) {
                case 1:
                    System.out.println("Bitte Node Inhalt angeben:");
                    String value = reader.next();
                    mainTreeManager.addNode(value);
                    break;

                case 2:
                    System.out.println("Alle Nodes:");
                    mainTreeManager.showWholeTree();
                    break;

                case 3:
                    // Do nothing
                    break;

                default:
                    System.out.println("Unbekannte option!");
                    break;

            }

        } while (command != 3);

        System.out.println("...tschüss");
    }

}
