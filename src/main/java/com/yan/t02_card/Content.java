package com.yan.t02_card;

import javax.swing.*;
import javax.swing.border.MatteBorder;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Content extends Panel {
    private static final long serialVersionUID = 1L;

    private JTextField admin = new JTextField();
    private JTextField password = new JTextField();

    Content() {

        //初始化各组件
        admin.setText("账号/邮箱/手机号");
        password.setText("密码");
//        //实例化图片
//        ImageIcon image1 = new ImageIcon("e://JavaWS/3.jpg");
//        ImageIcon image2 = new ImageIcon("e://JavaWS/touming.png");

//        JLabel backLabel = new JLabel();
//        JLabel backLabel2 = new JLabel();
//        backLabel.setText("hh");
//        backLabel2.setText("hh");

//        JLabel label = new JLabel(image1);
//        JLabel label2 = new JLabel(image2);
//        //设置标签大小与位置
//        label.setBounds(0, 0, 500, 350);
//        label2.setBounds(0, 0, 501, 350);
        //在LayeredPane最底层上添加两个带图片的标签，并且label2在label上方
//        this.getLayeredPane().add(label2, Integer.MIN_VALUE);
//        this.getLayeredPane().add(label, Integer.MIN_VALUE);
        //将内容面板设置为透明，就能够看见添加在LayeredPane上的背景。
//        ((JPanel) this.getContentPane()).setOpaque(false);

            /*
             * 添加组件到contentPanel容器中
             * 布局方式为自由布局。
             */
        JPanel contentPanel = new JPanel();
        contentPanel.setLayout(null);
        add(new JLabel("aa"));
        add(admin);
        add(new JLabel("bb"));
        add(password);
//        JButton login = new JButton("登录");
//        add(login);
//        JCheckBox rememberAdmin = new JCheckBox("记住账号");
//        add(rememberAdmin);
//        JCheckBox rememberPassword = new JCheckBox("记住密码");
//        add(rememberPassword);
//        JButton registered = new JButton("注册");
//        add(registered);
//        JButton forgetPassword = new JButton("忘记密码");
//        add(forgetPassword);

            /*
             * 组件绝对位置
             */
//        admin.setBounds(95, 130, 300, 25);
//        password.setBounds(95, 154, 300, 25);
//        rememberAdmin.setBounds(95, 180, 100, 14);
//        rememberPassword.setBounds(195, 180, 100, 14);
//        registered.setBounds(95, 225, 90, 20);
//        forgetPassword.setBounds(205, 225, 90, 20);
//        login.setBounds(315, 225, 90, 20);



            /*
             * 组件透明化
             */
//        admin.setOpaque(false);
//        password.setOpaque(false);
//        contentPanel.setOpaque(false);
//        rememberAdmin.setOpaque(false);
//        rememberPassword.setOpaque(false);
//        getContentPane().add(contentPanel);

            /*
             * 组件边框颜色
             */
        textSet(admin);
        textSet(password);
        //rememberAdmin.setBorder(new LineBorder(null, Color.OPAQUE));

            /*
             * 监听事件
             */
        admin.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                int c = e.getButton();
                if (c == MouseEvent.BUTTON1 && admin.getText().equals("账号/邮箱/手机号") && e.getClickCount() == 1) {
//                    StringUtils.equals("账号/邮箱/手机号", admin.getText());
                    admin.setText(null);
                    password.setText("密码");
                }
            }
        });

        admin.addCaretListener(e -> {

        });

        password.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                int c = e.getButton();
                password.setName("password");
                if (c == MouseEvent.BUTTON1 && password.getText().equals("密码") && e.getClickCount() == 1) {
                    password.setText(null);
                    admin.setText("账号/邮箱/手机号");
                }
            }
        });
        setVisible(true);
    }

    /*
     * JTextField文本框设置方法.
     */
    public void textSet(JTextField field) {
        field.setBackground(new Color(255, 255, 255));
        field.setPreferredSize(new Dimension(150, 28));
        MatteBorder border = new MatteBorder(0, 0, 2, 0, new Color(192, 192,
                192));
        field.setBorder(border);
    }
}
