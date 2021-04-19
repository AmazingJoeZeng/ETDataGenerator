import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.util.ArrayList;
import java.util.Random;

/**
 * Copyright Copyright 2021 ChuXin WuHan Inc.
 *
 * @author 曾明旺
 * @date 2021/4/16 4:37 下午
 * @Version 1.0
 */
public class DateGenerator {
    public void date_generator(int low_range,int high_range,int num_num) {
        int date_num = num_num;
        ArrayList<Integer> year_list =new ArrayList<>();
        ArrayList<Integer> month_list = new ArrayList<>();
        ArrayList<Integer> day_list = new ArrayList<>();

        for (int i = 0; i < date_num; i++) {
            Random num=new Random();
            int temp_year=num.nextInt(high_range-low_range)+low_range;
            int temp_month= num.nextInt(12)+1;
            int temp_day= num.nextInt(27)+1;
            year_list.add(temp_year);
            month_list.add(temp_month);
            day_list.add(temp_day);
        }

        StringBuilder buf =new StringBuilder();

        for (int i = 0; i < date_num; i++) {
            buf.append(Integer.toString(year_list.get(i))).append('/').append(Integer.toString(month_list.get(i))).append('/').append(Integer.toString(day_list.get(i))).append("\n");
        }
        StringSelection selection = new StringSelection(buf.toString());
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection,selection);
    }

}
