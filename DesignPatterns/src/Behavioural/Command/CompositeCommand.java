package Behavioural.Command;

import Behavioural.Command.fx.Command;

import java.util.ArrayList;
import java.util.List;

public class CompositeCommand implements Command {
    private List<Command> commands = new ArrayList<>();

    public void add(Command command){
        commands.add(command);
    }

    @Override
    public void execute() {
        for(var command : commands){
            command.execute();
        }
    }
}

//Essentially allows us to add commands to a composite and execute them, regardless of what the commands do
//We can also use the memento pattern to store the commands and their undo functionality if we want to undo commands in a stack order

/*
        var composite = new CompositeCommand();
        composite.add(new ResizeCommand());
        composite.add(new BlackAndWhiteCommand());
        composite.execute();
 */