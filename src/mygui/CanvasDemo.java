package mygui;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * @author Vigilr
 * @project Java_code
 * @package mygui
 * @time 2020/3/11 21:51
 */
public class CanvasDemo implements KeyListener, MouseListener {
    /**
     * Invoked when a key has been typed.
     * See the class description for {@link KeyEvent} for a definition of
     * a key typed event.
     *
     * @param e
     */
    @Override
    public void keyTyped(KeyEvent e) {
        System.out.println("获取键盘输入");
        s+=e.getKeyChar();//获取键盘输入，保存到s中
        c.getGraphics().drawString(s,0,20);
    }

    /**
     * Invoked when a key has been pressed.
     * See the class description for {@link KeyEvent} for a definition of
     * a key pressed event.
     *
     * @param e
     */
    @Override
    public void keyPressed(KeyEvent e) {

    }

    /**
     * Invoked when a key has been released.
     * See the class description for {@link KeyEvent} for a definition of
     * a key released event.
     *
     * @param e
     */
    @Override
    public void keyReleased(KeyEvent e) {

    }

    /**
     * Invoked when the mouse button has been clicked (pressed
     * and released) on a component.
     *
     * @param e
     */
    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("鼠标点击");
        c.requestFocus();
    }

    /**
     * Invoked when a mouse button has been pressed on a component.
     *
     * @param e
     */
    @Override
    public void mousePressed(MouseEvent e) {

    }

    /**
     * Invoked when a mouse button has been released on a component.
     *
     * @param e
     */
    @Override
    public void mouseReleased(MouseEvent e) {

    }

    /**
     * Invoked when the mouse enters a component.
     *
     * @param e
     */
    @Override
    public void mouseEntered(MouseEvent e) {

    }

    /**
     * Invoked when the mouse exits a component.
     *
     * @param e
     */
    @Override
    public void mouseExited(MouseEvent e) {

    }
    Canvas c;
    String s="";

    public static void main(String[] args) {
        Frame f=new Frame("画布");
        CanvasDemo cd=new CanvasDemo();
        cd.c=new Canvas();
        f.add("Center",cd.c);
        f.setSize(500,500);
        cd.c.addMouseListener(cd);//注册监听器
        cd.c.addKeyListener(cd);
        f.setVisible(true);
    }
}
