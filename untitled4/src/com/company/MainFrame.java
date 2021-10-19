//package com.company;
//
//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
//public class MainFrame extends JFrame  {
//    private JButton button;
//    private JLabel label;
//    public MainFrame() {
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        setTitle("");
//        setSize(500, 500);
//        setLayout(null);
//
//        label = new JLabel("#");
//        label.setSize(100,100);
//        label.setLocation(225,100);
//        add(label);
//
//        button = new JButton("FIRE");
//        button.setSize(100, 50);
//        button.setLocation(180, 50);
//        add(button);
//        button.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                setLocation l1 = new setLocation(225, 100);
//                for(int i =0; i<20; i++) {
//                    label.setLocation(l1.y_res, l1.x_res);
//
//                }
//
//            }
//        });
//    }
//}
