package CashRegister;
import java.awt.*;
import java.util.ArrayList;

public class menu {

    ArrayList<String> MENU_PRICE_FRIES= new ArrayList<String>();
  public static String FRIES_MENU(int x){
      ArrayList<String> MENU_FRIES= new ArrayList<String>();
     MENU_FRIES.add("REGULAR FRIES...");
     MENU_FRIES.add("CURLY FRIES.....");
     String FRIES_OUTPUT = MENU_FRIES.get(x);
     return FRIES_OUTPUT;
  }
  public static Integer Fries_Price(int x){
      ArrayList<Integer> MENU_PRICE_FRIES= new ArrayList<Integer>();
      MENU_PRICE_FRIES.add(55);
      MENU_PRICE_FRIES.add(70);
      Integer FRIES_PRICE_OUTPUT = MENU_PRICE_FRIES.get(x);
      return FRIES_PRICE_OUTPUT;
  }
    }

