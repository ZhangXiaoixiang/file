package reader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/**
 * FileReaderDemo
 * 字符输入流----读
 *
 * @author 10905 2019/2/23
 * @version 1.0
 */
public class FileReaderDemo {
    public void test(){
        Reader reader =null;
        StringBuffer stringBuffer=null;
        try {
//            创建流对象
             reader = new FileReader("D:\\Aworkspace\\idea\\javase\\chapter03\\testfile\\reader.txt");
//             创建中转站
            char ch[]=new char[1024];
//            套缓冲
             stringBuffer = new StringBuffer();
             int length=reader.read(ch);
//             循环读取并追加
            while (length!=-1){
                stringBuffer.append(ch);
                /*继续读*/
                length=reader.read();
            }
            System.out.println(stringBuffer);

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
        System.out.println("注意txt格式保存为UTF-8--------");
        FileReaderDemo fileReaderDemo=new FileReaderDemo();
        fileReaderDemo.test();
    }
}
