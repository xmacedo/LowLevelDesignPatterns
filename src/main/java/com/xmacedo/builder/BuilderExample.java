package com.xmacedo.builder;

public class BuilderExample {
    public static void main(String[] args) {
        System.out.println("Builder Pattern Example");
        UserProfile userProfile = new UserProfile.Builder()
                .setName("Xmacedo")
                .setEmail("felipe.x.macedo@gmail.com")
                .setPhone("123456789")
                .setAge(25)
                .build();

        System.out.println(userProfile.toString());
    }
}
