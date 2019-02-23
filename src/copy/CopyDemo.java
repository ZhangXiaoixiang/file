package copy;

import java.io.*;

/**
 * CopyDemo
 * 字节输入和输入综合运用----复制文件
 * 1创建输入输出流对象
 * 2创建中转站
 * 3调用方法循环写入
 * 4关闭流
 *
 * @author 10905 2019/2/23
 * @version 1.0
 */
public class CopyDemo {
    InputStream inputStream = null;
    OutputStream outputStream = null;
    public void test() {

        try {
//            创建流对象
            inputStream = new FileInputStream("D:\\Aworkspace\\idea\\javase\\chapter03\\testfile\\copyA.txt");
            outputStream = new FileOutputStream("D:\\Aworkspace\\idea\\javase\\chapter03\\testfile\\copyB.txt", true);
//            创建中转站(长度1024也行,获取需要的也行,目前数据不大)
            byte[] words = new byte[inputStream.available()];

//            读取并写入
            inputStream.read(words);
            outputStream.write(words);
            System.out.println("复制写入完毕");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
//            关闭流
            if (inputStream != null && outputStream != null) {
                try {
                    inputStream.close();
                    outputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        }

    }

    public static void main(String[] args) {
        CopyDemo copyDemo = new CopyDemo();
        copyDemo.test();
    }
}
