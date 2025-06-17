package com.xmacedo.builder;

public class UserProfile {
    private String name;
    private String email;
    private String phone;
    private int age;

    private UserProfile(Builder builder) {
        this.name = builder.name;
        this.email = builder.email;
        this.phone = builder.phone;
        this.age = builder.age;
    }

    public static class Builder {
        private String name;
        private String email;
        private String phone;
        private int age;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder setPhone(String phone) {
            this.phone = phone;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public UserProfile build() {
            return new UserProfile(this);
        }
    }

    public String toString() {
        return "Name: " + this.name + "\n" +
               "Email: " + this.email + "\n" +
               "Phone: " + this.phone + "\n" +
               "Age: " + this.age;
    }
}
