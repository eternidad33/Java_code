package mygui;

import java.awt.*;

/**
 * @author Vigilr
 * @project Java_code
 * @package mygui
 * @time 2020/3/12 11:43
 */
public class ShowImage extends Frame {
    String filename;

    public ShowImage(String filename) {
        setSize(500, 500);
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

    public static void main(String[] args) {
        new ShowImage("F:\\WASD.jpg");
    }
}
