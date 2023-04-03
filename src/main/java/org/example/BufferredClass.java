package org.example;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class BufferredClass {
    public static void main(String[] args) throws Exception {
        FileWriter fw = new FileWriter("D:\\testWritter.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(fw);
        bufferedWriter.write("Tamanna from Intellijv3");
        bufferedWriter.flush();
        bufferedWriter.close();
        System.out.println("DONE");
    }
}
