package scmtble.day10;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.net.URL;

// 利用多线程下载图片

public class PicsDown extends Thread{

    private String url;
    private String name;

    public PicsDown(String url, String name) {
        this.url = url;
        this.name = name;
    }

    @Override
    public void run() {
        PicDownloader d = new PicDownloader();
        d.downloader(url,name);
        System.out.println("下载了文件：" + name);
    }

    public static void main(String[] args) {
        PicsDown d1 = new PicsDown("https://scmtble.xyz/assets/img/portfolio/1.jpg","1.jpg");
        PicsDown d2 = new PicsDown("https://scmtble.xyz/assets/img/portfolio/1.png","1.png");
        PicsDown d3 = new PicsDown("https://scmtble.xyz/assets/img/portfolio/3.jpg","3.jpg");

        d1.start();
        d2.start();
        d3.start();
    }

}

class PicDownloader{
    public void downloader(String url,String name){
        try {
            FileUtils.copyURLToFile(new URL(url),new File(name));
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("IO Error ownloader function");
        }
    }
}