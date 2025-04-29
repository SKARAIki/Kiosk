package kioskRequired.lv4;

public class MenuItem {

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
    public String toString(){
        return this.burgerName+ " | " + this.price +" | "+ this.menuDescription;
    }

}

