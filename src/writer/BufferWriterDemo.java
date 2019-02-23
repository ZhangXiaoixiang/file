package writer;

import java.io.*;

/**
 * BufferWriterDemo
 * 带缓冲器的字符输出流---写
 *
 * @author 10905 2019/2/23
 * @version 1.0
 */
public class BufferWriterDemo {

    public void test(){
        BufferedWriter writer=null;
        BufferedReader reader=null;
        try {
             writer = new BufferedWriter(new FileWriter("D:\\Aworkspace\\idea\\javase\\chapter03\\testfile\\bufferWriter.txt"));
//             写入信息
            writer.write("我是带有缓存区");
            writer.newLine();
            writer.write("我是凑数的");
            writer.newLine();
            writer.write("我的速度快");
            writer.flush();
            System.out.println("带缓冲区的写入成功!----顺便再读一下");
            reader=new BufferedReader(new FileReader("D:\\Aworkspace\\idea\\javase\\chapter03\\testfile\\bufferWriter.txt"));
            String s = reader.readLine();
            while (s!=null){
                System.out.println(s);
                s=reader.readLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (reader!=null&&writer!=null){
               ;
                try {
                    writer.close();
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
    public static void main(String[] args) {
        BufferWriterDemo bufferWriterDemo=new BufferWriterDemo();
        bufferWriterDemo.test();
    }

}
