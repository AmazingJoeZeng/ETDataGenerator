import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.util.ArrayList;
import java.util.Random;

/**
 * Copyright Copyright 2021 ChuXin WuHan Inc.
 *
 * @author 曾明旺
 * @date 2021/4/16 4:38 下午
 * @Version 1.0
 */
public class NumGenerator {
    public  void generator(int low_range,int high_range,int n) {
        int num=n;
        ArrayList<Integer> num_list = new ArrayList<>();

        for (int i = 0; i < num; i++) {
            Random random_num=new Random();
            num_list.add(random_num.nextInt(high_range-low_range)+low_range);
        }
        StringBuilder buf =new StringBuilder();

        for (int temp_num : num_list) {
            buf.append(temp_num).append("\n");
        }
        StringSelection selection = new StringSelection(buf.toString());
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection,selection);
    }
}
