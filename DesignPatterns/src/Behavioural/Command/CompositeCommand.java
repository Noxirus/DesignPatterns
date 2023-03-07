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

/*
        var composite = new CompositeCommand();
        composite.add(new ResizeCommand());
        composite.add(new BlackAndWhiteCommand());
        composite.execute();
 */