package com.company;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener {
    public static int counnt = 0;
    public static int zero = 0;
    public static int timer = 0;
    public static JLabel label02 = new JLabel("0");
    public static JButton button01 = new JButton("Potato");
    public static JButton button02 = new JButton("Potato Time (10 Potatoes)");
    public static JButton button03 = new JButton("Potato Time (100 Potatoes)");
    public static JButton button04 = new JButton("Potato Time (1000 Potatoes)");
    public static JButton button05 = new JButton("Potato Time (10000 Potatoes)");
    public static JButton button06 = new JButton("Potato Time (100000 Potatoes)");
    public static JButton button07 = new JButton("Potato Time (1000000 Potatoes)");
    public static JButton button08 = new JButton("Potato Time (10000000 Potatoes)");
    public static JPanel panel01 = new JPanel();
    public static JPanel panel02 = new JPanel();
    public static JPanel panel03 = new JPanel();
    public static JPanel panel04 = new JPanel();
    public static JPanel panel05 = new JPanel();
    public static JLabel label01 = new JLabel("                 Potatoes Clicked");
    public static JFrame frame01 = new JFrame();
    public static JTextArea Text01 = new JTextArea("                                                                                                                                                               Instructions Are Click The Potato");
    
    public GUI() {
        panel01.setBorder(BorderFactory.createEmptyBorder(30, 30, 30, 30));
        panel04.setBorder(BorderFactory.createEmptyBorder(300, 300, 100, 300));
        panel05.setBorder(BorderFactory.createEmptyBorder(100, 100, 100 ,100));
        panel01.setLayout(new GridLayout(1, 1));
        panel02.setLayout(new GridLayout(1, 1));
        panel01.add(button01);
        panel02.add(Text01);
        panel03.add(label01);
        panel04.add(label02);
        panel04.add(label01);
        panel05.add(button02);
        panel05.add(button03);
        panel05.add(button04);
        panel05.add(button05);
        panel05.add(button06);
        panel05.add(button07);
        panel05.add(button08);
        frame01.add(panel01, BorderLayout.EAST);
        frame01.add(panel02, BorderLayout.NORTH);
        frame01.add(panel03, BorderLayout.CENTER);
        frame01.add(panel04, BorderLayout.WEST);
        frame01.add(panel05, BorderLayout.SOUTH);
        frame01.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame01.setTitle("Potato Clicker Beta 0.9");
        frame01.pack();
        frame01.setVisible(true);
        frame01.setSize(1280, 720);
        frame01.setIconImage(new ImageIcon("Icon.png").getImage());
        panel01.setBackground(Color.white);
        panel02.setBackground(Color.white);
        panel03.setBackground(Color.white);
        label01.setBackground(Color.white);
        label02.setSize(1280, 720);
        button01.addActionListener(this);
        button02.setActionCommand("10Potato");
        button03.setActionCommand("100Potato");
        button04.setActionCommand("1000Potato");
        button05.setActionCommand("10000Potato");
        button06.setActionCommand("100000Potato");
        button07.setActionCommand("1000000Potato");
        button08.setActionCommand("10000000Potato");
    }
    public static void main(String[] args) {
        new GUI();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        counnt++;
        label02.setText("" + counnt);
    }
}