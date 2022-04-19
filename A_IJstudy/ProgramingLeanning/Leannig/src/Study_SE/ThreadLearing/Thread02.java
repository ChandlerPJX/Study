package Study_SE.ThreadLearing;


import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.net.URL;

//实现多线程同步下载图片
public class Thread02 extends Thread {

    private String url;  //下载图片地址
    private String name; //保存的文件名字

    public Thread02(String url, String name) {
        this.name = name;
        this.url = url;
    }

    public void run() {
        webdownload wb = new webdownload();
        wb.downloader(url, name);
        System.out.println("下载了文件名字是：" + name);
    }

    public static void main(String[] args) {
        Thread02 thread02 = new Thread02("https://img1.bdstatic.com/static/common/img/icon_cf1b905.png", "loli.png");
        Thread02 thread01 = new Thread02("https://gimg2.baidu.com/image_search/src=http%3A%2F%2F05imgmini.eastday.com%2Fmobile%2F20210108%2F2021010817_43d16d9d096c4b129ddd435a6cc28339_6307_wmk.jpg&refer=http%3A%2F%2F05imgmini.eastday.com&app=2002&size=f9999,10000&q=a80&n=0&g=0n&fmt=auto?sec=1652101357&t=0557aa910e4c6bb447e1b98170ec8086", "loli01.png");
        Thread02 thread03 = new Thread02("https://gimg2.baidu.com/image_search/src=http%3A%2F%2Fbkimg.cdn.bcebos.com%2Fpic%2Fd50735fae6cd7b899e51505e636e55a7d933c995a09e%3Fx-bce-process%3Dimage%2Fresize%2Cm_lfit%2Cw_268%2Climit_1%2Fformat%2Cf_jpg&refer=http%3A%2F%2Fbkimg.cdn.bcebos.com&app=2002&size=f9999,10000&q=a80&n=0&g=0n&fmt=auto?sec=1652101357&t=b7f8fae9636777cd870854ad204c593d", "loli03.png");
        thread01.start();
        thread02.start();
        thread03.start();
    }
}

class webdownload {
    public void downloader(String url, String name) {
        try {
            FileUtils.copyURLToFile(new URL(url), new File(name));

        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("downloader Wrong");
        }
    }
}
