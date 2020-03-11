package mygui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * @author Vigilr
 * @project Java_code
 * @package mygui
 * @time 2020/3/11 11:26
 */
public class HelloSwing extends JFrame {
    public static void main(String[] args) {
        new HelloSwing().run();
    }

    /**
     * @Description:运行程序
     * @Param: []
     * @return: void
     * @Author: vigilr
     * @Date: 2020/3/11
     */
    private void run() {
        configureJFrame();
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
                System.exit(0);
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
    private void configureJFrame() {
        setTitle("helloSwing");
        getContentPane().setLayout(new FlowLayout());
        setSize(new Dimension(500, 500));
        setLocation(300, 300);
    }

    /**
     * @Description:创建按钮
     * @Param: []
     * @return: void
     * @Author: vigilr
     * @Date: 2020/3/11
     */
    private void createButton() {
        Button button = new Button("打开");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                createDialog();
            }
        });
        getContentPane().add(button, BorderLayout.NORTH);
    }

    /**
     * @Description:创建对话框
     * @Param: []
     * @return: void
     * @Author: vigilr
     * @Date: 2020/3/11
     */
    private void createDialog() {
        JOptionPane.showMessageDialog(HelloSwing.this, "这是一个对话框", "对话框", JOptionPane.INFORMATION_MESSAGE);
    }
}
