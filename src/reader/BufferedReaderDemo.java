package reader;

import java.io.*;

/**
 * BufferedReaderDemo
 * 带有缓冲区的字符输入流---读
 *
 * @author 10905 2019/2/23
 * @version 1.0
 */
public class BufferedReaderDemo {
    public void test(){
        BufferedReader reader=null;
        try {
            reader = new BufferedReader(new FileReader("D:\\Aworkspace\\idea\\javase\\chapter03\\testfile\\bufferReader.txt"));

            String s =reader.readLine();
            while (s!=null){
                System.out.println(s);
                s=reader.readLine();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (reader!=null){
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


    }

    public static void main(String[] args) {
        BufferedReaderDemo bufferedReaderDemo=new BufferedReaderDemo();
        bufferedReaderDemo.test();
    }
}
