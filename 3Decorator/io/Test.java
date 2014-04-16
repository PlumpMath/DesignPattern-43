package com.mattycao.Chapter3.io;

/**
 * Created by caoyangkaka on 4/16/14.
 */

import java.io.*;

public class Test {
    public static void main(String[] args) throws IOException {
        int c;
        System.out.println(new File(".").getAbsolutePath());
        try {
            InputStream in =
                    new LowerCaseInputStream(
                            new BufferedInputStream(
                                    new FileInputStream("src/resource/test.txt"))
                    );

            while ((c = in.read()) >= 0) {
                System.out.print((char) c);
            }

            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
