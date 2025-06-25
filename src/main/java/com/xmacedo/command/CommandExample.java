package com.xmacedo.command;

public class CommandExample {
    public static void main(String[] args) {
        TaskInovoker invoker = new TaskInovoker();
        invoker.setCommand(new TaskCommand("Task Invoker 1"));
        invoker.run();
    }
}
