package com

import org.junit.Test
import java.io.*


class FileTest {
    @Test
    fun testBufferedRead() {
        val br=BufferedReader(FileReader(File("hello.txt")))
        val bw=BufferedWriter(FileWriter(File("hello3.txt")))
        val buffer=CharArray(1024)
        var len=br.read(buffer)
        while (len!=-1) {
            bw.write(buffer, 0, len);
            len=br.read(buffer)
        }
        br.close()
        bw.close()

    }
}