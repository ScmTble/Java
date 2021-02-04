package scmtble.day09;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;


public class demotest {

    @Test
    public void FileTest() throws Exception{
        File f = new File("D://a.txt");
        f.createNewFile();
    }
    @Test
    public void WriteFile() throws Exception{
        // 创建输出流管道并指向文件
        OutputStream os = new FileOutputStream("D://b.txt");
        os.write(1);

        // 刷新
        // 缓冲区（将东西写入文件）
        os.flush();
        // 关闭流
        os.close();
    }
}
