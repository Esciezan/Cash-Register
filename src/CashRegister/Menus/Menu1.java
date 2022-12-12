package CashRegister.Menus;


public class Menu1 {
    public static int x=0;
    public static String number(int i){
        x=x+i;
        String value=Integer.toString(x);
        return value;
    }
}
