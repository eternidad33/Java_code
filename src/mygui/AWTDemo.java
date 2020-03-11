package mygui;

import java.awt.*;

/**
 * @author Vigilr
 * @project Java_code
 * @package mygui
 * @time 2020/3/11 12:36
 */
public class AWTDemo extends Frame {
    public static void main(String[] args) {
        AWTDemo awt=new AWTDemo("第一个AWT窗口");
        awt.setSize(500,500);
        awt.setLayout(null);//取消布局管理器
        awt.setLocation(700,200);
        awt.setBackground(Color.cyan);
        Panel pan=new Panel();
        pan.setSize(100,100);
        pan.setBackground(Color.GREEN);
        pan.setLocation(100,100);
        awt.add(pan);
        awt.setVisible(true);
    }
    public AWTDemo(String str){
        super(str);//调用父类设置标题
    }
}
