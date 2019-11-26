import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
public class HttpUrlTest{
    public static void main(String[] args){
        try{
            URL shiyanlou=new URL("https://www.shiyanlou.com");
            HttpURLConnection urlConnection=(HttpURLConnection)shiyanlou.openConnection();
            urlConnection.setRequestMethod("GET");
            urlConnection.setConnectTimeout(1000);
            //获取输入流
            InputStream inputStream=urlConnection.getInputStream();
            BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(inputStream));
            //打印结果
            bufferedReader.lines().forEach(System.out::println);
            //关闭链接
            inputStream.close();
            bufferedReader.close();
            urlConnection.disconnect();

        }catch(IOException e){
            e.printStackTrace();
        }
    }
}