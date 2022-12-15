package CashierProgram;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;


public class Cashier extends JFrame {

    static int ITEM_CHOSEN = -1;
    static int[] Amount = {0, 0,0,0,0,0,0,0};
    static int[] Total = {0, 0,0,0,0,0,0,0};
    static int Method = -1;
    static int Copies = 0;
    static String[] Content={"","","","","","","",""};
    static String PRINT_CONTENT = "";
    private JPanel CASH_REGISTER_MAIN_FRAME;
    private JTabbedPane BIGPANE;
    private JPanel FRIES_PANEL;
    private JPanel BURGER_PANEL;
    private JButton FRIES_BUTTON;
    private JButton CURLY_FRIES_BUTTON;
    private JPanel RECEIPT;
    private JTextPane Reciepttext;
    private JRadioButton TAKEOUT_RADIOBUTTON;
    private JRadioButton DINEIN_RADIOBUTTON;
    private JButton CALC_BUTTON;
    private JButton CLEAR_BUTTON;
    private JLabel LOGO;
    private JButton CHICK_FILLET_BUTTON;
    private JButton CHICKEN_DRUMSTICK_BUTTON;
    private JPanel RICE_MEAL_PANEL;
    private JButton CHICKEN_BURGER_BUTTON;
    private JButton DELUXE_BURGER_BUTTON;
    private JPanel DRINKS_PANEL;
    private JButton APPLE_JUICE_BUTTON;
    private JButton COKE_BUTTON;
    private JRadioButton FRIES;

    public Cashier(String CASH_REGISTER) {

        super(CASH_REGISTER);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(CASH_REGISTER_MAIN_FRAME);
        this.pack();

        FRIES_BUTTON.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ITEM_CHOSEN = 0;
                MENU_METHOD();
                PRINT();
                Reciepttext.setText(PRINT_CONTENT);
            }
        });
        CURLY_FRIES_BUTTON.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ITEM_CHOSEN = 1;
                MENU_METHOD();
                PRINT();
                Reciepttext.setText(PRINT_CONTENT);
            }
        });
        TAKEOUT_RADIOBUTTON.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DINEIN_RADIOBUTTON.setSelected(false);
                Method = 0;
                PRINT();
                Reciepttext.setText(PRINT_CONTENT);
            }
        });
        DINEIN_RADIOBUTTON.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TAKEOUT_RADIOBUTTON.setSelected(false);
                Method = 1;
                PRINT();
                Reciepttext.setText(PRINT_CONTENT);
            }
        });
        CLEAR_BUTTON.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CLEAR();
                Reciepttext.setText(PRINT_CONTENT);
                Reciepttext.setEnabled(true);
            }
        });
        CALC_BUTTON.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                COMPLETE();
                CREATE();
                Reciepttext.setText(PRINT_CONTENT);
            }
        });
        CHICKEN_BURGER_BUTTON.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ITEM_CHOSEN = 2;
                MENU_METHOD();
                PRINT();
                Reciepttext.setText(PRINT_CONTENT);

            }
        });
        DELUXE_BURGER_BUTTON.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ITEM_CHOSEN = 3;
                MENU_METHOD();
                PRINT();
                Reciepttext.setText(PRINT_CONTENT);
            }
        });
        CHICK_FILLET_BUTTON.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ITEM_CHOSEN = 4;
                MENU_METHOD();
                PRINT();
                Reciepttext.setText(PRINT_CONTENT);
            }
        });
        CHICKEN_DRUMSTICK_BUTTON.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ITEM_CHOSEN = 5;
                MENU_METHOD();
                PRINT();
                Reciepttext.setText(PRINT_CONTENT);
            }
        });
        APPLE_JUICE_BUTTON.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ITEM_CHOSEN = 6;
                MENU_METHOD();
                PRINT();
                Reciepttext.setText(PRINT_CONTENT);
            }
        });
        COKE_BUTTON.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ITEM_CHOSEN = 7;
                MENU_METHOD();
                PRINT();
                Reciepttext.setText(PRINT_CONTENT);
            }
        });
    }

    static void MENU_METHOD() {
        CashierProgram.Register MENU_REGISTER = new CashierProgram.Register();
        switch (ITEM_CHOSEN) {
            case (0):
                Amount[0]++;
                Total[0] = MENU_REGISTER.Price[0] * Amount[0];
                if (Amount[0] <= 1) {

                    Content[0]= MENU_REGISTER.Menu[0] + "\t" + MENU_REGISTER.Price[0] + "\t";
                }
                break;
            case (1):
                Amount[1]++;
                Total[1] = MENU_REGISTER.Price[1] * Amount[1];
                if (Amount[1] <= 1) {

                    Content[1]= MENU_REGISTER.Menu[1] + "\t\t" + MENU_REGISTER.Price[1] + "\t";

                }
                break;
            case (2):
                Amount[2]++;
                Total[2] = MENU_REGISTER.Price[2] * Amount[2];
                if (Amount[2] <= 1) {

                    Content[2] = MENU_REGISTER.Menu[2] + "\t" + MENU_REGISTER.Price[2] + "\t";

                }
                break;
            case (3):
                Amount[3]++;
                Total[3] = MENU_REGISTER.Price[3] * Amount[3];
                if (Amount[3] <= 1) {

                    Content[3]= MENU_REGISTER.Menu[3] + "\t" + MENU_REGISTER.Price[3] + "\t";
                }
                break;
            case (4):
                Amount[4]++;
                Total[4] = MENU_REGISTER.Price[4] * Amount[4];
                if (Amount[4] <= 1) {

                    Content[4]= MENU_REGISTER.Menu[4] + "\t\t" + MENU_REGISTER.Price[4] + "\t";
                }
                break;
            case (5):
                Amount[5]++;
                Total[5] = MENU_REGISTER.Price[5] * Amount[5];
                if (Amount[5] <= 1) {

                    Content[5]= MENU_REGISTER.Menu[5] + "\t" + MENU_REGISTER.Price[5] + "\t";
            }
            break;
            case (6):
                Amount[6]++;
                Total[6] = MENU_REGISTER.Price[6] * Amount[6];
                if (Amount[6] <= 1) {

                    Content[6]= MENU_REGISTER.Menu[6] + "\t\t" + MENU_REGISTER.Price[6] + "\t";
            }
            break;
            case (7):
                Amount[7]++;
                Total[7] = MENU_REGISTER.Price[7] * Amount[7];
                if (Amount[7] <= 1) {
                    Content[7]= MENU_REGISTER.Menu[7] + "\t\t" + MENU_REGISTER.Price[7] + "\t";
            }
                break;
        }
    }

    static void PRINT() {
        CashierProgram.Register PRINT_REGISTER = new CashierProgram.Register();
        int PRINT_LOOP = 0;
        PRINT_CONTENT = """
                \t\t PALIS FAST FOOD
                \t\t PANABO CITY
                \t\t DAVAO DEL NORTE
                """
                + "\t\t For "
                + PRINT_REGISTER.EAT_METHOD(Method)
                + "\n---------------------------------------------------------------------------------------------------------------\n";
        for (PRINT_LOOP = 0; PRINT_LOOP <= 7; PRINT_LOOP++) {
            if(Amount[PRINT_LOOP]<=0){continue;}
            PRINT_CONTENT = (PRINT_CONTENT +Content[PRINT_LOOP] + Amount[PRINT_LOOP] + "Pcs \t"
                    + Total[PRINT_LOOP] + "\n");
        }
    }

    static void CLEAR() {
        PRINT_CONTENT = "";
        for (int ARLNGTH = 0; ARLNGTH <= Amount.length - 1; ARLNGTH++) {
            Amount[ARLNGTH] = 0;
            Total[ARLNGTH] = 0;
            Content[ARLNGTH]="";
        }
        ;
    }

    static void CREATE() {
        Date Chrono = Calendar.getInstance().getTime();
        DateFormat ChronFormat = new SimpleDateFormat("yy mm dd hhmm");
        String ChronString = ChronFormat.format(Chrono);
        String FileName=("Receipt " + ChronString + " " + Copies + ".txt");
        try {
            Copies++;
            File FATHER = new File(FileName);

            if (FATHER.createNewFile()) {
            } else {
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            FileWriter AUTHOR = new FileWriter(FileName);
            AUTHOR.write(PRINT_CONTENT);
            AUTHOR.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    static void COMPLETE() {
        int FinalTotal = 0;
        for (int COMPLETELOOP = 0; COMPLETELOOP <= Total.length - 1; COMPLETELOOP++) {
            FinalTotal = FinalTotal + Total[COMPLETELOOP];
        }
        PRINT_CONTENT = PRINT_CONTENT + "\n---------------------------------------------------------------------------------------------------------------\n\t\t\t              TOTAL: "
                + FinalTotal + """
                \n
                \t          Thanks For Eating with us 
                \t           Hope to see more of you soon!
                """;
    }

    public static void main(String[] args) {
        JFrame frame = new Cashier("Cash Register");
        Point center = GraphicsEnvironment.getLocalGraphicsEnvironment().getCenterPoint();
        int width = 1000;
        int height = 500;
        frame.setBounds(center.x - width / 2, center.y - height / 2, width, height);
        frame.setVisible(true);


    }

}