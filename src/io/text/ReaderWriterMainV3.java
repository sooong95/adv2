package io.text;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

import static io.text.TextConst.FILE_NAME;
import static java.nio.charset.StandardCharsets.UTF_8;

public class ReaderWriterMainV3 {

    public static void main(String[] args) throws IOException {

        String writerString = "abc";
        System.out.println("writerString = " + writerString);

        // 파일에 쓰기
        FileWriter fw = new FileWriter(FILE_NAME, UTF_8);
        fw.write(writerString);
        fw.close();

        // 파일에서 읽기
        StringBuilder content = new StringBuilder();
        FileReader fr = new FileReader(FILE_NAME, UTF_8);

        int ch;
        while ((ch = fr.read()) != -1) {
            content.append((char) ch);
        }

        fr.close();

        System.out.println("content = " + content);
    }
}
