package javaWeb;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;
import java.util.stream.Stream;

/**
 * 项目名 Java_code
 * <br>包名 javaWeb
 * <br>创建时间 2020/4/8 20:20
 * <br>描述
 *
 * @author Vigilr
 */
public class EchoClient {
    public static final BufferedReader KEYBOARD_INPUT = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws Exception {
        Socket client = new Socket("localhost", 9999);
        //接收服务器端的输入内容
        Scanner scanner = new Scanner(client.getInputStream());
        scanner.useDelimiter("\n");
        //向服务器端发出数据
        PrintWriter out = new PrintWriter(client.getOutputStream());
        boolean flag = true;
        while (flag) {
            String input = getString("请输入要发送的内容").trim();
            out.println(input);
            //服务器有回应了
            if (scanner.hasNext()) {
                System.out.println(scanner.next());
            }
            if ("bye-bye".equalsIgnoreCase(input)) {
                flag = false;
            }
        }
        scanner.close();
        out.close();
        client.close();
    }

    public static String getString(String prompt) throws Exception {
        System.out.println(prompt);
        return KEYBOARD_INPUT.readLine();
    }
}
