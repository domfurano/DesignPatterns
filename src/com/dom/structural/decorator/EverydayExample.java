package com.dom.structural.decorator;

import java.io.*;

public class EverydayExample {

    public static void main(String[] args) throws IOException {
        File file = new File("./output.txt");
        file.createNewFile();

        OutputStream outputStream = new FileOutputStream(file);

        DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
        dataOutputStream.writeChars("foo bar");

        dataOutputStream.close();
        outputStream.close();
    }
}
