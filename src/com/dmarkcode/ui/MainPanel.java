package com.dmarkcode.ui;

import com.dmarkcode.util.VideoFilterHelper;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainPanel implements BasePanle{

    private JFrame mJFrame;

    private String language = "zh";

    @Override
    public void init() {
        if (mJFrame == null){
            mJFrame = new JFrame("绅士管理器");
            mJFrame.setSize(1200, 800);
            mJFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            JPanel jPanel = new JPanel();
            mJFrame.add(jPanel);
            configJPanel(jPanel);
        }
    }

    @Override
    public void show() {

    }

    @Override
    public void changeUI(String date) {

    }

    private void configJPanel(JPanel jPanel){
        jPanel.setLayout(null);

        initTopButton(jPanel);

        mJFrame.setContentPane(jPanel);
        mJFrame.setVisible(true);
    }

    private void initTopButton(JPanel jPanel){
        DMarkButton markButton = new DMarkButton("清除种子", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                VideoFilterHelper.cleanAllSpeed("J:\\");
            }
        },0 ,0, 200, 50);
        DMarkButton markButton2 = new DMarkButton("清除广告垃圾", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                VideoFilterHelper.cleanAllAdRuddish("J:\\");
            }
        },200 ,0, 200, 50);

        DMarkButton markButton3 = new DMarkButton("清除迅雷未下载完毕资源", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                VideoFilterHelper.cleanXunLeiFailedRes("J:\\");
            }
        },400 ,0, 200, 50);

        DMarkButton markButton4 = new DMarkButton("设置工作路径", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        },600 ,0, 200, 50);


        jPanel.add(markButton);
        jPanel.add(markButton2);
        jPanel.add(markButton3);
        jPanel.add(markButton4);
    }

}
