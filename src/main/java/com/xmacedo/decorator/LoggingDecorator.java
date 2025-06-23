package com.xmacedo.decorator;

public class LoggingDecorator implements Service {
    private Service service;

    public LoggingDecorator(Service service) {
        this.service = service;
    }

    public void execute() {
        System.out.println("Logging: Starting execution");
        service.execute();
        System.out.println("Logging: Execution complete");
    }
}
