package CashierProgram;


public class Register {
    String[] Menu={"Regular Fries", "Curly Fries","Chicken Burger","Deluxe Burger","Chick Fillet","Chicken Drumstick","Apple Juice","Coca-Cola®"};
    Integer[] Price={55,60,80,120,70,55,30,40};

    public String EAT_METHOD(int METHOD){
        if (METHOD<=-1){return "";}
        else if (METHOD<1){return "Take Out";}
    else {return "Dine In";}
    }
}




