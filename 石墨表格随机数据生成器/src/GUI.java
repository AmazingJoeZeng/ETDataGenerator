import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author ZengMingwang
 * @date 2021/3/11 5:37 下午
 */
public class GUI {
    private JPanel panel1;
    private JTextField textField1;
    private JTextField textField2;
    private JButton 生成Button;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField5;
    private JTextField textField6;
    private JButton 生成Button1;
    private JTextField textField7;
    private JTextField textField8;
    private JButton 生成Button2;
    private JButton 生成Button3;
    private JTextField textField9;
    private JTextField textField10;
    private JButton 生成Button5;

    public GUI() {
        生成Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String low_range=textField1.getText();
                String high_range=textField2.getText();
                String num=textField3.getText();
                NumGenerator num_generator=new NumGenerator();
                num_generator.generator(Integer.parseInt(low_range),Integer.parseInt(high_range),Integer.parseInt(num));
                textField1.setText("");
                textField2.setText("");
                textField3.setText("");
            }
        });
        生成Button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String low_range=textField4.getText();
                String high_range=textField5.getText();
                String num=textField6.getText();
                DateGenerator date_generator=new DateGenerator();
                date_generator.date_generator(Integer.parseInt(low_range),Integer.parseInt(high_range),Integer.parseInt(num));
                textField4.setText("");
                textField5.setText("");
                textField6.setText("");
            }
        });
        生成Button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String length=textField7.getText();
                String num=textField8.getText();
                TextGenerator text_generator=new TextGenerator();
                text_generator.text_generator(Integer.parseInt(length),Integer.parseInt(num));
                textField7.setText("");
                textField8.setText("");
            }
        });
        生成Button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PicGenerator pic_generator=new PicGenerator();
                pic_generator.pic_generator();
            }
        });
        生成Button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selection=textField9.getText();
                String num=textField10.getText();
                SelectGenerator selectGenerator=new SelectGenerator();
                selectGenerator.selectgenerator(selection,Integer.parseInt(num));
                textField9.setText("");
                textField10.setText("");
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame=new JFrame("石墨表格随机数据生成器");
        frame.setContentPane(new GUI().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

}
