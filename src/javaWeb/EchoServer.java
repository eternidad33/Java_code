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
    private static class ClientThread implements Runnable{
        private Socket client=null;
        private Scanner scanner=null;
        private PrintStream out=null;
        private boolean flag=true;

        public ClientThread(Socket client) throws IOException {
            this.client = client;
            this.scanner = new Scanner(client.getInputStream());
            this.scanner.useDelimiter("\n");
            this.out = new PrintStream(client.getOutputStream());
        }

        @Override
        public void run() {
            while (this.flag) {
                if (scanner.hasNext()) {
                    String value = scanner.next().trim();
                    if ("bye-bye".equalsIgnoreCase(value)) {
                        out.print("bye-bye.......");
                        this.flag = false;
                    } else {
                        out.print("【echo】" + value);
                    }
                }
            }
            try {
                scanner.close();
                out.close();
                client.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args) throws IOException {
        //设置服务器监听端口
        ServerSocket server = new ServerSocket(9999);
        System.out.println("等待客户端连接....");
        boolean flag = true;
        while (flag){
            Socket client =server.accept();
            new Thread(new ClientThread(client)).start();
        }
        server.close();
    }
}
