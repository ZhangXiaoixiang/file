package fileoutputstream;


import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * FileOutPutStreamDemo
 * 字节输出流----写
 * 1创建对象
 * 2调用方法写入数据
 * 3关闭流
 * @author 10905 2019/2/23
 * @version 1.0
 */
public class FileOutPutStreamDemo {



    public void test(){
        OutputStream outputStream=null;
//        写入内容
        String s="我是字节输出流,写入数据的";
//        转换为字节数组
        byte[] bytes = s.getBytes();
//        1创建流对象
        try {
            outputStream=  new FileOutputStream("D:\\Aworkspace\\idea\\javase\\chapter03\\testfile\\FileOutS.txt");
//            2写入文件
            outputStream.write(bytes,0,bytes.length);
            System.out.println("写入成功!");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("写入失败!");
        }finally {
//            3关闭流
            if (outputStream!=null){
                try {
                    outputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /**
     * 测试写字节
     * @param args
     */
    public static void main(String[] args) {
        FileOutPutStreamDemo outPutStreamDemo=new FileOutPutStreamDemo();
        outPutStreamDemo.test();
    }
}
