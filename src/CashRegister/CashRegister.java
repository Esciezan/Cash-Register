package CashRegister;

import javax.swing.*;


public class CashRegister extends JFrame {

    private JPanel CASH_REGISTER_MAIN_FRAME;
    private JTabbedPane BIGPANE;
    private JTextPane ASDFTextPane;
    private JPanel FRIES_PANEL;
    private JPanel BURGER_PANEL;
    private JButton FRIES_BUTTON;
    private JButton CURLY_FRIES_BUTTON;
    private JPanel RECIEPT;
    private JRadioButton FRIES;

    public CashRegister(String CASH_REGISTER) {

        super(CASH_REGISTER);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(CASH_REGISTER_MAIN_FRAME);
        this.pack();
    }

    public static void main(String[] args) {
        JFrame frame = new CashRegister("Cash Register");
        frame.setSize(500, 500);
        frame.setVisible(true);

    }

}