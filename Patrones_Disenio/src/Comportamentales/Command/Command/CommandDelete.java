package Comportamentales.Command.Command;

import Comportamentales.Command.Databases.Sentences;

public class CommandDelete implements Command{
    private Sentences sentences;

    public CommandDelete(Sentences sentences) {
        this.sentences = sentences;
    }

    @Override
    public void execute() {
        sentences.delete();
    }
}
