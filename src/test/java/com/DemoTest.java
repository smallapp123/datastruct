package com;

import org.junit.Test;

import java.io.*;

public class DemoTest {
    @Test
    public void FileTest() throws Exception {
        File file = new File("ym.jpg");
        FileInputStream fis = new FileInputStream(file);
        BufferedInputStream bis = new BufferedInputStream(fis);
        byte[] buffer = new byte[24];
        int len=0;
        BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream(new File("ym2.jpg")));
        while ((len=bis.read(buffer)) != -1) {
            bos.write(buffer, 0, len);
        }

        bis.close();
        bos.close();
    }
}
