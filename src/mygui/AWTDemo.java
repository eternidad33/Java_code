package mygui;

import java.awt.*;
import java.awt.event.*;

/**
 * @author Vigilr
 * @project Java_code
 * @package mygui
 * @time 2020/3/11 12:36
 */
public class AWTDemo extends Frame {
    public static void main(String[] args) {
//        AWTDemo awt = new AWTDemo();
//        awt.firstWindow();
//        awt.createDialog();
//        awt.createFileDialog();
//        awt.createButton();
        new AWTDemo().run();
    }

    public void run() {
        createFrame();
//        createButton();
//        createCheckBox();
//        createCheckBoxGroup();
//        createChoice();
//        createTextField();
//        createTextArea();
//        createList();
        setVisible(true);
    }

    public void createFrame() {
        setTitle("主窗口");
        setLayout(new FlowLayout());
        setBackground(Color.cyan);
        setSize(new Dimension(500, 500));
        setLocation(700, 200);
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
    }

    /**
     * @Description:第一个AWT窗口
     * @Param: []
     * @return: void
     * @Author: vigilr
     * @Date: 2020/3/11
     */
    public void firstWindow() {
        AWTDemo awt = new AWTDemo();
        awt.setTitle("第一个AWT窗口");
        awt.setSize(500, 500);
        awt.setLayout(null);//取消布局管理器
        awt.setLocation(700, 200);
        awt.addWindowListener(new WindowAdapter() {
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
        awt.setBackground(Color.cyan);
        Panel pan = new Panel();
        pan.setSize(100, 100);
        pan.setBackground(Color.GREEN);
        pan.setLocation(100, 100);
        awt.add(pan);
        awt.setVisible(true);
    }

    /**
     * @Description:对话框设置
     * @Param: []
     * @return: void
     * @Author: vigilr
     * @Date: 2020/3/11
     */
    public void createDialog() {
        final Dialog dialog = new Dialog(AWTDemo.this, "对话框", true);
        dialog.setSize(500, 500);
        dialog.setLayout(new GridLayout(2, 1));
        //窗口关闭事件
        dialog.addWindowListener(new WindowAdapter() {
            /**
             * Invoked when a window is in the process of being closed.
             * The close operation can be overridden at this point.
             *
             * @param e
             */
            @Override
            public void windowClosing(WindowEvent e) {
                dialog.dispose();
            }
        });
        Panel panel = new Panel();
        Label label = new Label("这是一个对话框");
        dialog.setLocation(700, 200);
        panel.add(label, BorderLayout.NORTH);
        dialog.add(panel);
        dialog.setVisible(true);
    }

    /**
     * @Description:文本对话框
     * @Param: []
     * @return: void
     * @Author: vigilr
     * @Date: 2020/3/11
     */
    public void createFileDialog() {
        FileDialog fileDialog = new FileDialog(AWTDemo.this, "我是文本对话框");
        String filename = fileDialog.getFile();
        fileDialog.setVisible(true);
        System.out.println(filename);
    }

    /**
     * @Description:创建按钮
     * @Param: []
     * @return: void
     * @Author: vigilr
     * @Date: 2020/3/11
     */
    public void createButton() {
        Button button = new Button("确定");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                createDialog();
            }
        });
        add(button, BorderLayout.NORTH);
    }

    /**
     * @Description:创建复选框
     * @Param: []
     * @return: void
     * @Author: vigilr
     * @Date: 2020/3/11
     */
    public void createCheckBox() {
        Checkbox checkbox = new Checkbox("中国");
        checkbox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                String state = "deselected";
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    state = "selected";
                }
                System.out.println(e.getItem() + " " + state);
            }
        });
        add(checkbox);
    }

    public void createCheckBoxGroup() {
        CheckboxGroup group = new CheckboxGroup();
        Checkbox ch1 = new Checkbox("北京");
        Checkbox ch2 = new Checkbox("天津");
        Checkbox ch3 = new Checkbox("上海");
        add(ch1);
        add(ch2);
        add(ch3);

    }

    /**
     * @Description:创建下拉列表
     * @Param: []
     * @return: void
     * @Author: vigilr
     * @Date: 2020/3/11
     */
    public void createChoice() {
        Choice choice = new Choice();
        choice.add("A");
        choice.add("B");
        choice.add("C");
        add(choice);
    }

    /**
     * @Description:创建文本框
     * @Param: []
     * @return: void
     * @Author: vigilr
     * @Date: 2020/3/11
     */
    public void createTextField() {
        TextField tf = new TextField("这是一个文本框", 20);
        add(tf);
    }

    /**
     * @Description:文本区域
     * @Param: []
     * @return: void
     * @Author: vigilr
     * @Date: 2020/3/11
     */
    public void createTextArea() {
        TextArea textArea = new TextArea("这是文本区域", 3, 20, 3);
        add(textArea);
    }

    /**
     * @Description:创建列表
     * @Param: []
     * @return: void
     * @Author: vigilr
     * @Date: 2020/3/11
     */
    public void createList() {
        List list = new List();
        list.add("red");
        list.add("blue");
        list.add("green");
        add(list);
    }
}
