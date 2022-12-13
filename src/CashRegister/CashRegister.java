package CashRegister;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static CashRegister.menu.FRIES_MENU;
import static CashRegister.menu.Fries_Price;


public class CashRegister extends JFrame {

    private JPanel CASH_REGISTER_MAIN_FRAME;
    private JTabbedPane BIGPANE;
    private JPanel FRIES_PANEL;
    private JPanel BURGER_PANEL;
    private JButton FRIES_BUTTON;
    private JButton CURLY_FRIES_BUTTON;
    private JPanel RECIEPT;
    private JTextPane Reciepttext;
    private JRadioButton TAKEOUT_RADIOBUTTON;
    private JRadioButton DINEIN_RADIOBUTTON;
    private JButton button1;
    private JButton button2;
    private JRadioButton FRIES;

    String EAT_STATUS="Reciept:";
    String order="";
    String reciepttext="";

    public CashRegister(String CASH_REGISTER) {

        super(CASH_REGISTER);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(CASH_REGISTER_MAIN_FRAME);
        this.pack();
        FRIES_BUTTON.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                order=order +"\n" +FRIES_MENU(0) +String.valueOf(Fries_Price(0));
                reciepttext =EAT_STATUS +order;
                Reciepttext.setText(reciepttext);
            }
        });
        TAKEOUT_RADIOBUTTON.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DINEIN_RADIOBUTTON.setSelected(false);
                EAT_STATUS="Reciept:"+"\nTake out";

            }
        });
        CURLY_FRIES_BUTTON.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                order=order +"\n" +FRIES_MENU(1) +String.valueOf(Fries_Price(1));
                reciepttext =EAT_STATUS +order;
                Reciepttext.setText(reciepttext);
            }
        });
        DINEIN_RADIOBUTTON.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TAKEOUT_RADIOBUTTON.setSelected(false);
                EAT_STATUS="Reciept:"+"\nDine In";
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new CashRegister("Cash Register");
        Point center = GraphicsEnvironment.getLocalGraphicsEnvironment().getCenterPoint();
        int width = 1000;
        int height = 1000;
        frame.setBounds(center.x - width / 2, center.y - height / 2, width, height);
        frame.setVisible(true);

    }

}