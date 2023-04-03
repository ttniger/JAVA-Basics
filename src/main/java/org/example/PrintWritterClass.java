package org.example;

import java.io.File;
import java.io.PrintWriter;

public class PrintWritterClass {
    public static void main(String[] args) throws Exception {
        PrintWriter PW = new PrintWriter(System.out);
        PW.write("I am posting in the console");
        PW.flush();
        PW.close();

        PrintWriter pw = new PrintWriter(new File("D:\\testprint.txt"));
        pw.write("To notepad");
        pw.close();
//        System.out.println("DONE The run");
//        PW.write("DONE");
//        PW.flush();
//        PW.close();
    }
}
