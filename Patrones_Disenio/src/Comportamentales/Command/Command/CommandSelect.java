package Comportamentales.Command.Command;

import Comportamentales.Command.Databases.Sentences;


public class CommandSelect implements Command{
    private Sentences sentences;

    public CommandSelect(Sentences sentences) {
        this.sentences = sentences;
    }

    @Override
    public void execute() {
        sentences.select();
    }
}
