package com.yan.t01;

import javax.swing.*;
import java.awt.*;

public class CenteredFrame extends JFrame {
    public CenteredFrame() {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension screenSize = toolkit.getScreenSize();
        int screenHeight = screenSize.height;
        int screenWidth = screenSize.width;

        setSize(screenWidth >> 1, screenHeight >> 1);
        setLocation(screenWidth >> 2, screenHeight >> 2);
        Image img = toolkit.getImage(getClass().getResource("/img/katomic.ico"));
        setIconImage(img);
        setTitle("CenteredFrame");
    }

//    public static void main(String[] args) {
//        System.out.println(2>>1);
//    }
}
