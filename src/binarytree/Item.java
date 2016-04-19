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
