package javaWeb;

import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 * 项目名 Java_code
 * <br>包名 javaWeb
 * <br>创建时间 2020/4/8 19:51
 * <br>描述
 *
 * @author Vigilr
 */
public class EchoServer {
    public static void main(String[] args) throws IOException {
        //设置服务器监听端口
        ServerSocket server = new ServerSocket(9999);
        System.out.println("等待客户端连接....");
        //有客户端连接
        Socket client = server.accept();
        //获取客户端的输入流
        Scanner scanner = new Scanner(client.getInputStream());
        scanner.useDelimiter("\n");
        //客户端输出流
        PrintStream out = new PrintStream(client.getOutputStream());
        boolean flag = true;
        while (flag) {
            if (scanner.hasNext()) {
                String value = scanner.next().trim();
                if ("bye-bye".equalsIgnoreCase(value)) {
                    out.print("bye-bye.......");
                    flag = false;
                } else {
                    out.print("【echo】" + value);
                }
            }
        }
        scanner.close();
        out.close();
        server.close();
    }
}
