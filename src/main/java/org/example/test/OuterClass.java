package org.example.test;

public class OuterClass {
    public static class InnerClass {
        private String helloWorld = "Hello world";
        public String name;
        void printSomething() {
            System.out.println(helloWorld);
        }
        boolean returnTrue () {
            return true;
        }
    }

    public static void main(String[] args) {
        InnerClass a = new InnerClass();
        a.name = "a";
        InnerClass b = new InnerClass();
        b.name = "b";
        System.out.println(a.name);
        System.out.println(b.name);
        System.out.println(a.equals(b));
        System.out.println(a);
        System.out.println(b);
    }
}
