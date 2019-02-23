package fileinputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * FileInputStreamDemo
 * 字节输入流
 * 1创建对象
 * 2调用方法循环读取
 * 3关闭流
 * @author 10905 2019/2/23
 * @version 1.0
 */
public class FileInputStreamDemo {
    public void test(){

//    新建输入流的简单方式(直接使用构造方法传入文件数据源即可)
        InputStream inputStream = null;

        {
            try {
//            由于是读取数据,所以事先在文件里写入内容
                inputStream = new FileInputStream("D:\\Aworkspace\\idea\\javase\\chapter03\\testfile\\FileInS.txt");
                System.out.println("字节数为(注意空格回车哪些也算):"+inputStream.available());
                System.out.println("创建数据流对象成功!读取到的数据是");
//            字节流读取数据返回int类型,使用一个变量去接收,直到返回为-1表示读取完毕
                int data;
                while ((data=inputStream.read())!=-1){
//                    整数转换为字节(中文不行的)
                    System.out.print((char) data+" ");
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }finally {
//            记得要关不流
                if (inputStream!=null){
                    try {
                        inputStream.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    /**
     * 测试字节输入流
     */
    public static void main(String[] args) {
        FileInputStreamDemo fileInputStreamDemo=new FileInputStreamDemo();
        fileInputStreamDemo.test();
    }
}
