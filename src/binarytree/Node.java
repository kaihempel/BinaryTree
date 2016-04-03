/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarytree;

//import java.lang.Exception;

/**
 * Node class
 *
 * @author erosol
 */
public class Node {

    /**
     * Item
     */
    private Item item;

    /**
     * Node connections of this node
     */
    private Node top, before, after =null;

    /**
     * Constructor
     *
     * @param item
     */
    Node(Item item) {
        this.item = item;
    }

    /**
     *
     * @param top
     * @param item
     */
    Node(Node top, Item item) {
        this.top = top;
        this.item = item;
    }

    /**
     * Returns the current item
     *
     * @return Item
     */
    public Item getItem() {
        return this.item;
    }

    /**
     * Returns the top node instance
     *
     * @return
     */
    public Node getTop() {
        return this.top;
    }

    /**
     * Returns the after node instance
     *
     * @return
     */
    public Node getAfter() {
        return this.after;
    }

    /**
     * Returns the before node instance
     *
     * @return
     */
    public Node getBefore() {
        return this.before;
    }

    /**
     *
     * @return
     */
    public boolean hasTopNode() {
        return (this.top != null);
    }

    /**
     *
     * @return
     */
    public boolean hasAfterNode() {
        return (this.after != null);
    }

    /**
     *
     * @return
     */
    public boolean hasBeforeNode() {
        return (this.before != null);
    }

    /**
     *
     * @return
     */
    public boolean isLastNode() {
        return (this.before == null && this.after == null);
    }

    /**
     * Compares the node items
     * - Given node item is greater than current: returns integer below zero;
     * - Given node item is lower than current: returns integer above zero;
     * - Given node item is equal: returns zero;
     *
     * @param node
     * @return int
     */
    public int compareNodeItems(Node node) {
        return this.item.compare(node.getItem());
    }

    /**
     * Register new sub node instance
     *
     * @param sub
     * @return Node
     * @throws Exception
     */
    public Node registerSubNode(Node sub) throws Exception {

        // Result of the register operation

        boolean registerResult = false;

        // Compare result

        int result = this.compareNodeItems(sub);

        // Below zero: given item is greater than current

        if (result < 0) {
            registerResult = this.registerInAfterPath(sub);

        // Above zero: given item is smaller than current

        } else if (result > 0) {
            registerResult = this.registerInBeforePath(sub);
        }

        // register self as top of the new sub

        if (true == registerResult) {
            sub.registerTopNode(this);
        }

        return this;
    }

    /**
     * Sets new sub node in the before path
     * - Item value is lower than current
     *
     * @param sub
     * @throws Exception
     */
    private boolean registerInBeforePath(Node sub) throws Exception {

        if (this.before == null) {
            this.before = sub;
            return true;
        } else {
            this.before.registerSubNode(sub);
        }

        return false;
    }

    /**
     * Sets new sub node into the after path
     * - Item value is great than current
     *
     * @param sub
     * @throws Exception
     */
    private boolean registerInAfterPath(Node sub) throws Exception {

        if (this.after == null) {
            this.after = sub;
            return true;
        } else {
            this.after.registerSubNode(sub);
        }

        return false;
    }

    /**
     * Register top node reference
     *
     * @param top
     * @throws Exception
     */
    private void registerTopNode(Node top) throws Exception {

        // Top node exists: Illegal operation
        if (this.top != null) {
            throw new Exception("Top node already exists!");
        }

        this.top = top;

    }
}
