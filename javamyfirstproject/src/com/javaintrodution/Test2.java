package com.javaintrodution;

class Test2 {
    void show(int a) {
        System.out.println(a);
    }
    void show(String a) {
        System.out.println(a);
    }
    public static void main(String[] args) {
        Test2 t2 = new Test2();
        t2.show("Java");
    }
}