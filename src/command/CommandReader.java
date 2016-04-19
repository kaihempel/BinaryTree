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

import java.util.*;

/**
 *
 * @author Kai Hempel
 */
public class CommandReader {

    /**
     *
     */
    private Scanner reader;

    /**
     *
     */
    private ArrayList<Command> commands;

    /**
     *
     */
    private CommandList definedCommands;

    /**
     *
     * @param reader
     */
    CommandReader(Scanner reader, CommandList definedCommands) {
        this.reader             = reader;
        this.definedCommands    = definedCommands;
        this.commands           = new ArrayList<>();
    }

    /**
     *
     * @return
     */
    public int getCommadCount() {
        return this.commands.size();
    }

    /**
     *
     * @return
     */
    public ArrayList getAllCommands() {
        return this.commands;
    }

    /**
     *
     * @param index
     * @return
     */
    public Command getCommand(int index) {
        return this.commands.get(index);
    }

    /**
     *
     * @param command
     * @return
     */
    public CommandReader setCommand(Command command) {
        this.commands.add(command);
        return this;
    }

    /**
     *
     * @return
     */
    public Command readCommand() {

        Command current = new Command();

        String commandName = this.reader.next();
        String commandValue = this.reader.next();

        if (this.definedCommands.isInList(commandName) == false) {
            // Throw exception
        }

        return current.setName(commandName).setValue(commandValue);
    }
}
