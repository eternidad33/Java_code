package mygui;

import java.awt.*;
import java.awt.event.*;
import java.io.*;

/**
 * @author Vigilr
 * @project Java_code
 * @package mygui
 * @time 2020/3/12 10:16
 */
public class FileEditor extends WindowAdapter implements ActionListener {
    private Frame frame;
    private TextArea textArea;
    private String fileName;

    /**
     * @Description:创建主页面
     * @Param: []
     * @return: void
     * @Author: vigilr
     * @Date: 2020/3/12
     */
    public void createEditor() {
        MenuBar menuBar = new MenuBar();

        //创建文件菜单
        Menu fileMenu = new Menu("文件");
        MenuItem menuNew = new MenuItem("新建", new MenuShortcut(KeyEvent.VK_N));//设置选项并设置快捷键
        MenuItem menuOpen = new MenuItem("打开", new MenuShortcut(KeyEvent.VK_O));
        MenuItem menuSive = new MenuItem("保存", new MenuShortcut(KeyEvent.VK_S));
        fileMenu.add(menuNew);
        fileMenu.add(menuOpen);
        fileMenu.add(menuSive);
        fileMenu.add("另存为");
        fileMenu.addSeparator();
        fileMenu.add("退出");
        fileMenu.addActionListener(this);//注册文件菜单事件监听器
        menuBar.add(fileMenu);

        //创建帮助菜单
        Menu helpMenu = new Menu("帮助");
        helpMenu.add("关于");
        helpMenu.addActionListener(this);//注册帮助菜单事件监听器
        menuBar.add(helpMenu);

        //创建主窗口
        frame = new Frame("文本编辑器");
        frame.setMenuBar(menuBar);
        textArea = new TextArea();
        frame.add("Center", textArea);
        frame.addWindowListener(this);//注册窗口监听器
        frame.setSize(600, 600);
        frame.setLocation(600, 200);
        frame.setVisible(true);
    }

    /**
     * Invoked when an action occurs.
     * 菜单选择事件
     *
     * @param e
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            if (e.getActionCommand() == "新建") {
                textArea.setText("");
            } else if (e.getActionCommand() == "打开") {
                //先打开文件
                FileDialog fileDialog = new FileDialog(frame, "open", 0);
                fileDialog.setVisible(true);
                fileName = fileDialog.getDirectory() + fileDialog.getFile();
                //然后读取文件
                FileReader fr = new FileReader(fileName);
                BufferedReader br=new BufferedReader(fr);
                String str="";
                while (br.ready()){
                    int c=br.read();
                    str+=(char)c;
                }
                textArea.setText(str);
                br.close();
                fr.close();
                frame.setTitle("Java文本编辑器-"+fileName);
            }else if(e.getActionCommand()=="保存"){
                //写入文件
                File file=new File(fileName);
                FileWriter fos=new FileWriter(file,true);
                BufferedWriter bos=new BufferedWriter(fos);
                PrintWriter pos=new PrintWriter(bos);
                //写入数据
                pos.print(textArea.getText());
                //关闭输出流
                bos.close();
                pos.close();
                fos.close();
            }else if(e.getActionCommand()=="另存为"){
                //选择文件
                FileDialog fileDialog = new FileDialog(frame, "open", 0);
                fileDialog.setVisible(true);
                fileName = fileDialog.getDirectory() + fileDialog.getFile();
                //写入文件
                File file=new File(fileName);
                FileWriter fos=new FileWriter(file,true);
                BufferedWriter bos=new BufferedWriter(fos);
                PrintWriter pos=new PrintWriter(bos);
                //写入数据
                pos.print(textArea.getText());
                //关闭输出流
                bos.close();
                pos.close();
                fos.close();
            }else if(e.getActionCommand()=="退出"){
                System.exit(0);
            }else if(e.getActionCommand()=="关于"){
                //显示关于对话框
                final Dialog dialog=new Dialog(frame,"关于",true);
                dialog.setSize(200,200);
                dialog.setLayout(new GridLayout(2,1));
                //设置关闭事件
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
                //显示消息
                Panel panel=new Panel();
                Label label=new Label("Java文本编辑器");
                label.setForeground(Color.RED);
                Label l=new Label("作者：Vigilr");
                l.setForeground(Color.cyan);
                panel.add(label,BorderLayout.NORTH);
                panel.add(l,BorderLayout.CENTER);
                dialog.setLocation(500,200);
                dialog.add(panel);
                dialog.setVisible(true);
            }
        }catch (FileNotFoundException e1){
//            e1.printStackTrace();
        } catch (IOException ex) {
//            ex.printStackTrace();
        }
    }

    /**
     * @Description:窗口关闭事件
     * @Param: [e]
     * @return: void
     * @Author: vigilr
     * @Date: 2020/3/12
     */
    @Override
    public void windowClosing(WindowEvent e) {
        System.exit(0);
    }

    public static void main(String[] args) {
        new FileEditor().createEditor();
    }
}
