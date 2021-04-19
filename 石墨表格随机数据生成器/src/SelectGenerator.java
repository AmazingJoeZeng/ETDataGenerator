import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.util.ArrayList;
import java.util.Random;

/**
 * Copyright Copyright 2021 ChuXin WuHan Inc.
 *
 * @author 曾明旺
 * @date 2021/4/16 4:39 下午
 * @Version 1.0
 */
public class SelectGenerator {
    public void selectgenerator(String str,int row_num){
        if(str==null){
            return;
        }
        if(str.contains("，")){
            String[] str_arr=str.split("，");
            ArrayList<String> text_list = new ArrayList<>();
            StringBuffer buf = new StringBuffer();

            for (int i = 0; i < row_num; i++) {
                int index=new Random().nextInt(str_arr.length);
                buf.append(str_arr[index]).append("\n");
            }
            StringSelection selection = new StringSelection(buf.toString());
            Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection,selection);
        }
        if(str.contains(",")){
            String[] str_arr=str.split(",");
            ArrayList<String> text_list = new ArrayList<>();
            StringBuffer buf = new StringBuffer();

            for (int i = 0; i < row_num; i++) {
                int index=new Random().nextInt(str_arr.length);
                buf.append(str_arr[index]).append("\n");
            }
            StringSelection selection = new StringSelection(buf.toString());
            Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection,selection);
        }
        return;
    }
}
