package HomeWorkApp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyWindow extends JFrame {

    public MyWindow () {

        setVisible(true);
        setTitle("HomeWorkApp");
        setSize(400,400);
        setLocation(450,250);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JButton firstButton = new JButton("Выход");
        ActionListener listener = new CloseActionListener();
        firstButton.addActionListener(listener);

        JButton secondButton = new JButton("****");
        secondButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setLocation((int)(Math.random()*800),(int)(Math.random()*400));
            }
        });

        JPanel panel =new JPanel(new GridLayout(1,2));
        panel.add(secondButton);
        panel.add(firstButton);
        add(panel,BorderLayout.SOUTH);

    }
}
