package com.xmacedo.command;

public class TaskCommand implements Command {
    private String taskName;

    public TaskCommand(String taskName) {
        this.taskName = taskName;
    }

    public void execute() {
        System.out.println("Executing task: " + taskName);
    }
}
