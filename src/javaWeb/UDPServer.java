package javaWeb;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * 项目名 Java_code
 * <br>包名 javaWeb
 * <br>创建时间 2020/4/8 21:34
 * <br>描述
 *
 * @author Vigilr
 */
public class UDPServer {
    public static void main(String[] args) throws IOException {
        DatagramSocket server = new DatagramSocket(999);
        String str = "hello Java";
        DatagramPacket packet = new DatagramPacket(str.getBytes(), 0, str.length(), InetAddress.getByName("localhost")
                , 9999);
        server.send(packet);
        System.out.println("消息发送完毕.....");
        server.close();
    }
}
