package io.start;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class StreamStartMain4 {

    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("temp/hello.dat", false);
        byte[] input = {65, 66, 67, 68};
        fos.write(input);
        fos.close();

        FileInputStream fis = new FileInputStream("temp/hello.dat");
        byte[] readAllBytes = fis.readAllBytes();
        System.out.println("readAllBytes = " + Arrays.toString(readAllBytes));
        fis.close();
    }
}
