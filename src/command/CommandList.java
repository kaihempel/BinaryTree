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

import java.util.ArrayList;

/**
 * Command list container
 * Stores commands
 *
 * @author Kai Hempel
 */
public class CommandList {

    /**
     * Command list
     */
    private ArrayList<String> commands;

    /**
     * Adds one command
     *
     * @param name
     * @return CommandList
     */
    public CommandList registerCommand(String name) {
        this.commands.add(name);

        return this;
    }

    /**
     *
     * @param commandName
     * @return
     */
    public boolean isInList(String commandName) {
        return this.commands.contains(commandName);
    }

}
