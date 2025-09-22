package Comportamentales.Command.Command;

import Comportamentales.Command.Databases.Sentences;

public class CommandCreate implements  Command{
    private Sentences sentences;

    public CommandCreate(Sentences sentences) {
        this.sentences = sentences;
    }

    @Override
    public void execute() {
        sentences.created();
    }
}
