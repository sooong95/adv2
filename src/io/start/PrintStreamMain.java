package io.start;

import java.io.IOException;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

import static java.nio.charset.StandardCharsets.UTF_8;

public class PrintStreamMain {

    public static void main(String[] args) throws IOException {
        System.out.println("hello");

        PrintStream printStream = System.out;
        printStream.println("hello");

        byte[] bytes = "Hello!\n".getBytes(UTF_8);
        printStream.write(bytes);
    }
}
