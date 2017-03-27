package java1702.javase.oop;

/**
 * Created by mingfei.net@gmail.com
 * 3/27/17 10:34
 * JavaSE_20171
 */
public class Main {
    public static void main(String[] args) {
        Foo f = new Foo("f");
        changeReference(f); // It won't change the reference!
        modifyReference(f); // It will modify the object that the reference variable "f" refers to!
        System.out.println(f.s); // f ? b
    }

    /*
        f ------> obj f
        a ---------\/
        b ------> obj b

        f ------> obj f > c
        c ---------^

     */
    public static void changeReference(Foo a) {
        Foo b = new Foo("b");

        // 1: stack: b
        // 2: heap: object
        // 3: b ---> object

        a = b;
        System.out.println("-->" + a.s); //  b
    }

    public static void modifyReference(Foo c) {
        c.setAttribute("c");
    }
}

class Foo {
    public String s;

    public Foo(String s) {
        this.s = s;
    }

    public void setAttribute(String s) {
        this.s = s;
    }
}

/*
f -------|
         |
a -------|---------|
b--------|---------|
-------- 01---------02---------03----04-05-----------
    |    "f"   |      "b"        |      |    | |
----------------------------------------------
 */
