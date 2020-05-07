package com;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileTest {
    public static void main(String[] args) throws Exception {
        File file=new File("hello.txt");
//        FileWriter fr=new FileWriter(file);
//        fr.write("杨幂拍的剧烂透了\n");
//        fr.write("阅文集团宣布免费");
//        fr.close();

        FileReader fr=new FileReader(file);
        char[] buffer=new char[100];
        FileWriter fw=new FileWriter(new File("hello2.txt"));
        int len=0;
        while ((len=fr.read(buffer)) != -1) {
            fw.write(buffer, 0, len);
        }
        fr.close();
        fw.close();
    }
}
