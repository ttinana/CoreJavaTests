package com.test.java8.l03.generics;

import java.util.*;
import java.io.*;

public class Foo {
    public static void main(String[] args) throws Exception{
        RandomAccessFile input1 = new RandomAccessFile("c:\\temp\\Foo.java", "rw");
        System.out.println("1" + read(input1));
        DataInputStream  input2 = new DataInputStream(new FileInputStream("c:\\temp\\Foo.java"));
        System.out.println("2" + read(input2));
    }
    private static <I extends Closeable & DataInput> String read(I source) {
        try (I input = source) {
            return input.readLine();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
