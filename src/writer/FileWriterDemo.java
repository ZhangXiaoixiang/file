package writer;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/**
 * FileWriterDemo
 * 字符流写入----写
 *
 * @author 10905 2019/2/23
 * @version 1.0
 */
public class FileWriterDemo {
    public void Test() {
        Writer writer=null;
        try {
            writer=new FileWriter("D:\\Aworkspace\\idea\\javase\\chapter03\\testfile\\writer.txt");
            writer.write("我是字符流写入demo");
            writer.flush();
            System.out.println("写入成功!");
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (writer!=null){
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        FileWriterDemo fileWriterDemo=new FileWriterDemo();
        fileWriterDemo.Test();
    }
}
