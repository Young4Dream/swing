package com.yan.t02_card;

import org.apache.commons.lang3.SystemUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Card extends JFrame implements ActionListener {
    private JButton b0, b1;
    private Panel cardPanel = new Panel();
    //定义卡片布局对象
    private CardLayout card = new CardLayout();
    //定义字符数组，为卡片命名
    private String cardName[] = {"wsd", "wnd"};

    //定义构造函数
    private Card() {
        super("MSSM");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);

        //设置cardPanel面板对象为卡片布局
        cardPanel.setLayout(card);

        //循环，在cardPanel面板对象中添加4个按钮
        //因为cardPanel面板对象为卡片布局，因此初始时显示最先添加的组件
        for (int i = 0; i < cardName.length; i++) {
            //面板中添加的每个按钮对应设置一个卡片名
            cardPanel.add(cardName[i], new Content());
        }
        //实例化按钮对象
        b0 = new JButton("wsd");
        b1 = new JButton("wnd");

        //为按钮对象注册监听器
        b0.addActionListener(this);
        b1.addActionListener(this);

        Panel controlpaPanel = new Panel();
        controlpaPanel.add(b0);
        controlpaPanel.add(b1);
        //定义容器对象为当前窗体容器对象
        Container container = getContentPane();

        //将 cardPanel面板放置在窗口边界布局的中间，窗口默认为边界布局
        container.add(cardPanel, BorderLayout.CENTER);
        // 将controlpaPanel面板放置在窗口边界布局的南边，
        container.add(controlpaPanel, BorderLayout.SOUTH);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension screenSize = toolkit.getScreenSize();
        int screenHeight = screenSize.height;
        int screenWidth = screenSize.width;

        setSize(screenWidth >> 1, screenHeight >> 1);
        setLocation(screenWidth >> 2, screenHeight >> 2);
//        System.getProperty();
        String projectPath = SystemUtils.getUserDir().getAbsolutePath();
        Image img = toolkit.getImage(getClass().getResource("/img/a.png"));
        setIconImage(img);
        setResizable(false);
    }

    public static void main(String[] args) {
        Card kapian = new Card();
    }

    //实现按钮的监听触发时的处理
    @Override
    public void actionPerformed(ActionEvent e) {
        //用户单击b0按钮时执行的语句
        if (e.getSource() == b0) {
            //通过show()方法中的卡片名称，显示容器中的组件。
            card.show(cardPanel, cardName[0]);
        }
        if (e.getSource() == b1) {
            card.show(cardPanel, cardName[1]);
        }
    }

}
