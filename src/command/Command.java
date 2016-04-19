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

/**
 *
 * @author Kai Hempel
 */
public class Command {

    /**
     * Command name
     */
    private String name = "";

    /**
     * Command value
     */
    private String value = "";

    /**
     *
     * @param name
     * @return
     */
    public Command setName(String name) {
        this.name = name;
        return this;
    }

    /**
     *
     * @return
     */
    public String getName() {
        return this.name;
    }

    /**
     *
     * @param value
     * @return
     */
    public Command setValue(String value) {
        this.value = value;
        return this;
    }

    /**
     *
     * @return
     */
    public String getValue() {
        return this.value;
    }
}
