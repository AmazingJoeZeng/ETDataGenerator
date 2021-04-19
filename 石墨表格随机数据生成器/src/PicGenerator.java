import java.awt.Image;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.Transferable;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import javax.imageio.ImageIO;


/**
 * Copyright Copyright 2021 ChuXin WuHan Inc.
 *
 * @author 曾明旺
 * @date 2021/4/16 4:38 下午
 * @Version 1.0
 */
public class PicGenerator {
    private void copyImage(String path){
        Image image =null;
        File file =new File(path);
        BufferedImage buf;

        try{
            InputStream is =new FileInputStream(file);
            buf= ImageIO.read(is);
            image=(Image) buf;
        }catch (IOException e){
            e.printStackTrace();
        }

        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        Transferable selection = new ImageSelection((BufferedImage) image);
        clipboard.setContents(selection,null);
    }

    public static String listFileFromFolder(String foldName){
        File folder1=new File(foldName);

        File[] files1=folder1.listFiles();
        int picNum=files1.length;
        int selectPicIndex=(int)(Math.random()*picNum);
        File selectFile=files1[selectPicIndex];
        String path=selectFile.getPath();
        System.out.println(path);
        return  path;
    }

    public void pic_generator() {
        String path=listFileFromFolder("pic");
        PicGenerator p_g=new PicGenerator();
        p_g.copyImage(path);
    }
}
