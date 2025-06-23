package com.xmacedo.decorator;

public class DecoratorExample {
    public static void main(String[] args) {
        Service service = new LoggingDecorator(new BasicService());
        service.execute();
    }
}
