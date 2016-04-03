/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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

        System.out.println("BTree Demo von \"Kai Hempel\"");
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
