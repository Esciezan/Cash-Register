package CashRegister;
import java.awt.*;
import java.util.ArrayList;


public class menu {

    ArrayList<String> MENU_PRICE_FRIES= new ArrayList<String>();
  public static String FRIES_MENU(int x){
      String FRIES_OUTPUT="";
     switch(x){
      case 0:
        FRIES_OUTPUT = "REGULAR FRIES..." ;
        break;
         case 1:
             FRIES_OUTPUT ="CURLY FRIES.....";
     }
     return FRIES_OUTPUT;
  }
  public static Integer Fries_Price(int x){
      int FRIES_PRICE_OUTPUT=-1;
      switch(x){
          case 0:
              FRIES_PRICE_OUTPUT = 55 ;
              break;
          case 1:
              FRIES_PRICE_OUTPUT =75;
      }
      return FRIES_PRICE_OUTPUT;
  }
    }

