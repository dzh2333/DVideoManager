package com.dmarkcode.ui;

import javax.swing.*;
import java.awt.event.ActionListener;

public class DMarkButton extends JButton {

    private DMarkButton(){

    }

    public DMarkButton(String content, ActionListener actionListener, int x, int y, int width, int height){
        setText(content);
        addActionListener(actionListener);
        setLocation(x, y);
        setSize(width, height);
    }
}
