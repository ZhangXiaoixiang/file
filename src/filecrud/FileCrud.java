package filecrud;

import java.io.File;
import java.io.IOException;

/**
 * FileCrud
 * 文件的增删改查
 * @author 10905 2019/2/23
 * @version 1.0
 */
public class FileCrud {
    /**
     * 创建文件
     */
    public void create(File file){
//        如果文件不存在就新建
        if (!file.exists()){
            try {
                file.createNewFile();
                System.out.println("文件创建成功!");
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("文件创建失败!");
            }
        }
    }
    /**
     * 删除文件
     */
    public void delete(File file){
//       文件存在就删除
        if (file.exists()){
            file.delete();
            System.out.println("删除成功!");
        }else {
            System.out.println("删除异常(不存在或者无法删除)!");
        }

    }

    /**
     * 查询信息
     * @param file
     */
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

    public static void main(String[] args) {
        FileCrud fileCrud=new FileCrud();
//        增
//        fileCrud.create(new File("D:\\Aworkspace\\idea\\javase\\chapter03\\testfile\\create.txt"));
//        删
//        fileCrud.delete(new File("D:\\Aworkspace\\idea\\javase\\chapter03\\testfile\\create.txt"));
//        查
        fileCrud.showFlieInfo(new File("D:\\Aworkspace\\idea\\javase\\chapter03\\testfile\\test01.txt"));
    }
}
