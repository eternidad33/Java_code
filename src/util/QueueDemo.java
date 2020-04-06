package util;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * 项目名 Java_code
 * <br>包名 util
 * <br>创建时间 2020/4/6 15:07
 * <br>描述
 *
 * @author Vigilr
 */
public class QueueDemo {
    public static void main(String[] args) {
        Queue<String> queue=new LinkedList<>();
        queue.offer("Q");
        queue.offer("W");
        queue.offer("E");
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
    }
}
