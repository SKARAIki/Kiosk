package kioskRequired.lv4;

public class MainMenu {
    //속성
    private String burgers;
    private String beverage;
    private String dessert;
    //생성자
    public MainMenu(String burgers, String beverage, String dessert){
        this.burgers = burgers;
    }
    public MainMenu(String burgers, String beverage){
        this.beverage = beverage;
    }
    public MainMenu(String dessert){
        this.dessert = dessert;
    }
    //기능
}
