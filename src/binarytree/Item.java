/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarytree;

/**
 *
 * @author erosol
 */
public class Item {

    /**
     * String data
     */
    private String value = "";

    /**
     * Constuctor
     *
     * @param value
     */
    Item(String value) {
        this.value = value;
    }

    /**
     * Sets the value
     *
     * @param value
     * @return Item
     */
    public Item setValue(String value) {
        this.value = value;

        return this;
    }

    /**
     * Returns the string value
     *
     * @return String
     */
    public String getValue() {
        return this.value;
    }

    /**
     * Compares the item values between current and the given one
     *
     * @param item
     * @return
     */
    public int compare(Item item) {
        return this.getValue().compareToIgnoreCase(item.getValue());
    }

    /**
     * Checks if the given item value is greater than the current
     *
     * @param item
     * @return boolean
     */
    public boolean isGreaterThan(Item item) {
        int result = this.compare(item);

        return (result > 0);
    }

    /**
     * Checks if the given item value is lower than the current
     *
     * @param item
     * @return boolean
     */
    public boolean isLowerThan(Item item) {
        int result = this.compare(item);

        return (result < 0);
    }

    /**
     * Checks if the given item value is equal with the current one
     *
     * @param item
     * @return boolean
     */
    public boolean isEqual(Item item) {
        int result = this.compare(item);

        return (result == 0);
    }
}
