package com.xmacedo.singleton;


public class SingletonExample {
    public static void main(String[] args) {
        System.out.println("Singleton Pattern Example");

        //Isnt work, because we use a private constructor to avoid instantiation.
        //DatabaseConnection dbConnection = new DatabaseConnection();

        DatabaseConnection dbConnection = DatabaseConnection.getInstance();
        dbConnection.connect();
    }
}