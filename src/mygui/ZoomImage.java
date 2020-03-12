package mygui;

import com.sun.image.codec.jpeg.JPEGCodec;
import com.sun.image.codec.jpeg.JPEGImageEncoder;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author Vigilr
 * @project Java_code
 * @package mygui
 * @time 2020/3/12 12:21
 */
public class ZoomImage {
    public void zoom(String file1,String file2){
        try{
            //读入图片
            File _file=new File(file1);
            Image src=javax.imageio.ImageIO.read(_file);
            int width=src.getWidth(null);//获取图片的宽度
            int height=src.getHeight(null);//获取图片的长度
            System.out.println("图片大小："+height+"*"+width);
            BufferedImage tag=new BufferedImage(width/2,height/2,BufferedImage.TYPE_INT_RGB);
            tag.getGraphics().drawImage(src,0,0,width/2,height/2,null);//绘制缩小的图
            //写入图片
            FileOutputStream out=new FileOutputStream(file2);//输出到文件流
            JPEGImageEncoder encoder= JPEGCodec.createJPEGEncoder(out);
            encoder.encode(tag);//JPEG编码
            out.close();
            System.out.println("缩放成功");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        String file1="F:\\a.jpg";
        String file2="F:\\b.jpg";
        new ZoomImage().zoom(file1,file2);
    }
}
