package org.example;

public class Invoker {

    ICommand command1;

    public Invoker(ICommand command){
        command1 = command;
    }

    public void executeCommand1(){
        command1.execute();
    }

    public void unexecuteCommand1(){
        command1.unexecute();
    }

}
