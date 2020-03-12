package mygui;

import java.awt.*;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * @author Vigilr
 * @project Java_code
 * @package mygui
 * @time 2020/3/12 11:43
 */
public class ShowImage extends Frame {
    URL filename;

    public ShowImage(URL filename) {
        setSize(1000, 1000);
        setVisible(true);
        this.filename = filename;
    }

    @Override
    public void paint(Graphics graphics) {
        //取得图像
        Image image = getToolkit().getImage(filename);
        //画图
        graphics.drawImage(image, 0, 0, this);

    }

    public static void main(String[] args) throws MalformedURLException {
//        new ShowImage("F:\\WASD.jpg");
        new ShowImage(new URL("https://cdn.jsdelivr.net/gh/eternidad33/picbed@master/img/weizhuang.jpg\n"));
    }
}
