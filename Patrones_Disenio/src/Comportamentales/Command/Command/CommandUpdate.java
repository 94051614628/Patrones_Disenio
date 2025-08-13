package Comportamentales.Command.Command;

import Comportamentales.Command.Databases.Sentences;

public class CommandUpdate implements Command{
    private Sentences sentences;

    public CommandUpdate(Sentences sentences) {
        this.sentences = sentences;
    }

    @Override
    public void execute() {
        sentences.update();
    }
}
