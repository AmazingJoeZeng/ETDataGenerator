import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.util.ArrayList;

/**
 * Copyright Copyright 2021 ChuXin WuHan Inc.
 *
 * @author 曾明旺
 * @date 2021/4/16 4:39 下午
 * @Version 1.0
 */
public class TextGenerator {
    public static char getRandomChar() {
        return (char) (0x4e00 + (int) (Math.random() * (0x9fa5 - 0x4e00 + 1)));
    }

    public static String getRandomString(int length){
        char[] temp =new char[length];
        for (int i = 0; i < length; i++) {
            temp[i]=getRandomChar();
        }
        String str = new String(temp);
        return str;
    }

    public void text_generator(int length,int num_num) {
        int num_in = num_num;

        ArrayList<String> text_list = new ArrayList<>();
        StringBuffer buf = new StringBuffer();

        for (int i = 0; i < num_in; i++) {
            buf.append(getRandomString(length)).append("\n");
        }
        StringSelection selection = new StringSelection(buf.toString());
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection,selection);
    }
}
