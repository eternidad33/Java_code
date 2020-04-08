package javaWeb;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/**
 * 项目名 Java_code
 * <br>包名 javaWeb
 * <br>创建时间 2020/4/8 21:23
 * <br>描述
 *
 * @author Vigilr
 */
public class UDPClient {
    public static void main(String[] args) throws IOException {
        //连接到9999端口
        DatagramSocket client= new DatagramSocket(9999);
        //接收信息
        byte[] data =new byte[1024];
        //接收数据
        DatagramPacket packet=new DatagramPacket(data,data.length);
        System.out.println("客户端等待接收信息发送");
        client.receive(packet);
        System.out.println("接收到的消息为："+new String(data,0,packet.getLength()));
    }
}
