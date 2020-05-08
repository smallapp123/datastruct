package com

import org.junit.Test
import java.io.*


class FileTest {
    @Test
    fun testBufferedRead() {
        val br=BufferedReader(FileReader(File("hello.txt")))
        val bw=BufferedWriter(FileWriter(File("hello3.txt")))
//        val buffer=CharArray(1024)
        var line:String?=null
//        var len=br.read(buffer)
        line=br.readLine()
        while (line!=null) {
            bw.write(line)
            bw.newLine()
            line=br.readLine()
        }
        br.close()
        bw.close()

    }
}