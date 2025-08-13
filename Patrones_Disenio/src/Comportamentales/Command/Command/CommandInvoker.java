package Comportamentales.Command.Command;

import Comportamentales.Command.Databases.Sentences;

import java.util.HashMap;

public class CommandInvoker {
    private HashMap<Character, Command> commandHashMap = new HashMap<>();
    private Sentences sentences;

    public CommandInvoker(Sentences sentences){
        this.sentences = sentences;
        commandHashMap.put('S',new CommandSelect(this.sentences));
        commandHashMap.put('C',new CommandCreate(this.sentences));
        commandHashMap.put('D',new CommandDelete(this.sentences));
        commandHashMap.put('U',new CommandUpdate(this.sentences));
    }

    public void executeCommand(Character command){
        if (commandHashMap.containsKey(command)){
            commandHashMap.get(command).execute();
        }else {
            System.out.println("El comando no existe");
        }
    }
}
