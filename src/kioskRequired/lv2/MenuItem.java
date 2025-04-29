package kioskRequired.lv2;

import java.util.Scanner;

public class MenuItem {
    Scanner sc = new Scanner(System.in);

    //속성
    private String burgerName;
    private int price;
    private String menuDescription;

    //생성자
    public MenuItem(String burgerName, int price, String menuDescription){
        this.burgerName = burgerName;
        this.price = price;
        this.menuDescription = menuDescription;
    }
    // 기능
    public String getBurgerName() {
        return burgerName;
    }

    public int getPrice() {
        return price;
    }

    public String getMenuDescription() {
        return menuDescription;
    }


    public String toString(){
           return this.burgerName+ " | " + this.price +" | "+ this.menuDescription;
    }

}


