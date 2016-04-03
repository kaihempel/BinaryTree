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
public class BTree {

    /**
     * Node count
     */
    private int nodeCount = 0;

    /**
     * Root node
     */
    private Node root = null;

    /**
     *
     * @param root
     */
    public BTree(Node root) {
        this.nodeCount++;
        this.root = root;
    }

    /**
     * Returns the current node count
     *
     * @return int
     */
    public int getTreeNodeCount() {
        return this.nodeCount;
    }

    /**
     *
     * @param node
     * @return
     * @throws Exception
     */
    public BTree addNode(Node node) throws Exception {
        this.nodeCount++;
        this.root.registerSubNode(node);

        return this;
    }

    /**
     * Returns a list of all tree items in correct order
     *
     * @return List
     */
    public List getFlatTree() {
        List<Item> ItemList = new ArrayList<>();

        this.recursivFlatTree(root, ItemList);

        return ItemList;
    }

    /**
     * Move recursivly thru the nodes and reads the items
     *
     * @param current
     * @param ItemList
     */
    private void recursivFlatTree(Node current, List<Item> ItemList) {

        // The last added item

        Item lastAdded = null;

        if (ItemList.isEmpty() == false) {
            lastAdded = ItemList.get(ItemList.size() - 1);
        }

        // Check the sub nodes
        //
        // We have to find the frist Node in the tree:
        // So the before path is checked first.

        if (current.hasBeforeNode()) {

            // Only check the before node if the last add is lower than the
            // item of the before node. Otherwise this node was already added.

            if (lastAdded == null || lastAdded.isLowerThan(current.getBefore().getItem())) {
                this.recursivFlatTree(current.getBefore(), ItemList);

            // The item below was successful and: Stack moves to the node above.

            } else if (lastAdded.isEqual(current.getBefore().getItem())) {
                ItemList.add(current.getItem());

                // Check the after path

                if (current.hasAfterNode()) {
                    this.recursivFlatTree(current.getAfter(), ItemList);

                } else if (current.hasTopNode()) {
                    return;
                }
            }
        }

        // Before path done, check the after path

        if (current.hasAfterNode()) {

            // Only add the current node item,
            // if it is greater than the last added one.

            if (lastAdded == null || lastAdded.isLowerThan(current.getItem())) {

                // Add the current node and go down into the after path.

                ItemList.add(current.getItem());
                this.recursivFlatTree(current.getAfter(), ItemList);

            // The item below was successful and: Stack moves to the node above.
            // In the after path, every node of this path was added, so we only move up.

            } else if (current.hasTopNode()) {
                return;
            }

        }

        // Last item in the current tree path.
        // This have to be added anyway and
        // the node above have to be checked again.

        if (current.isLastNode()) {
            ItemList.add(current.getItem());
        }
    }
}
