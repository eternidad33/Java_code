package mygui;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * @author Vigilr
 * @project Java_code
 * @package myGUI
 * @time 2020/3/11 10:56
 */
public class helloAWT extends Frame {
    public static void main(String[] args) {
        new helloAWT().run();
    }

    /**
     * @Description:运行程序
     * @Param: []
     * @return: void
     * @Author: vigilr
     * @Date: 2020/3/11
     */
    public void run() {
        configureFrame();
        createButton();

        addWindowListener(new WindowAdapter() {
            /**
             * Invoked when a window is in the process of being closed.
             * The close operation can be overridden at this point.
             *
             * @param e
             */
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
            }
        });

        setVisible(true);
    }

    /**
     * @Description:创建主窗体
     * @Param: []
     * @return: void
     * @Author: vigilr
     * @Date: 2020/3/11
     */
    private void configureFrame() {
        setTitle("Hello Java");//设置标题
        setLayout(new FlowLayout());//设置布局方式
        setSize(new Dimension(800, 800));//设置大小
        setLocation(500, 500);//设置坐标
    }

    /**
     * @Description:创建按钮
     * @Param: []
     * @return: void
     * @Author: vigilr
     * @Date: 2020/3/11
     */
    private void createButton() {
        Button open = new Button("打开");
        open.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                createDialog();
            }
        });
        add(open, BorderLayout.NORTH);
    }

    /**
     * @Description:创建对话框
     * @Param: []
     * @return: void
     * @Author: vigilr
     * @Date: 2020/3/11
     */
    private void createDialog() {

    }
}
