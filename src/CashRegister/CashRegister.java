package CashRegister;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class CashRegister extends JFrame {
    private JPanel CASH_REGISTER_MAIN_FRAME;

    public CashRegister(String CASH_REGISTER){
    super(CASH_REGISTER);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setContentPane(CASH_REGISTER_MAIN_FRAME);
    this.pack();
            }
public static void main(String[] args){
JFrame frame = new CashRegister("Cash Register");
frame.setVisible(true);
}
}
