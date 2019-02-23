package showfileinfo;

import java.io.File;

/**
 * FileDemo
 * 测试对File类的常用方法的使用
 *
 * @author 10905 2019/2/23
 * @version 1.0
 */
public class FileDemo {

    public void showFlieInfo(File file) {
        System.out.println("----------注意路径转义的问题-------------");
//        判断File是否属于文件或者目录
        if (file.exists()){
//            判断是否是文件
            if (file.isFile()){
                System.out.println("名称:"+file.getName());
                System.out.println("相对路径:"+file.getPath());
                System.out.println("绝对路径:"+file.getAbsolutePath());
                System.out.println("文件大小:"+file.length()+"字节");
            }
            //            判断是否是目录
            if (file.isDirectory()){
                System.out.println("此文件是目录,路径是   "+file.getPath()+"\n");
            }
        }else {
            System.out.println("文件或者目录不存在!");
        }
    }
    /**
     * 测试file
     */
    public static void main(String[] args) {
        FileDemo fileDemo=new FileDemo();
        fileDemo.showFlieInfo(new File("D:\\Aworkspace\\idea\\javase\\chapter03\\testfile"));
        fileDemo.showFlieInfo(new File("D:\\Aworkspace\\idea\\javase\\chapter03\\testfile\\test01.txt"));

    }

}
