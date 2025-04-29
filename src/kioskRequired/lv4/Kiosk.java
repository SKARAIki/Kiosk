package kioskRequired.lv4;

import kioskRequired.lv2.MenuItem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kiosk {
    //속성
    private List<kioskRequired.lv4.MenuItem> menuItemList = new ArrayList<>();

    private Scanner sc = new Scanner(System.in);

    //생성자
    public Kiosk() {

    }
    //기능

    public void startKiosk() {

        System.out.print("원하시는 메뉴의 숫자를 입력해주세요 : ");
        System.out.println("-------------------------------------------------");
        System.out.println("[ 메인 메뉴 ]");
        System.out.println("1. 버거");
        System.out.println("2. 음료");
        System.out.println("3. 디저트");
        System.out.println("0. 종료");
        System.out.println("-------------------------------------------------");
        System.out.print("원하시는 기능을 숫자로 입력해주세요 : ");
        int mainInputBox = sc.nextInt();

        switch (mainInputBox) {
            case 1:
                System.out.println("-------------------------------------------------");
                System.out.println("[ 쉑쉑 메뉴 ]");
                int burgerIndex = 0;
                for (kioskRequired.lv4.MenuItem burger : menuItemList) {
                    System.out.println((burgerIndex + 1) + ". " + burger.toString());
                    burgerIndex++;
                }
                // ArrayList<>()를 객체화 하여 List<MenuItem>에 add한 데이터들을 MenuItem클래스에서 toString하여 for문으로 출력
                System.out.println("0. 종료         | 종료");
                System.out.println("-------------------------------------------------");
                System.out.print("원하시는 메뉴를 숫자로 입력해 주세요 : ");

                int burgerInputBox = sc.nextInt();
                try {
                    while ((0 <= burgerInputBox) != (burgerInputBox <= menuItemList.size())) {
                        System.out.print("정해진 범위의 숫자만 입력해 주세요 : ");
                        burgerInputBox = sc.nextInt();
                    }
                } catch (RuntimeException e2) {
                    //숫자 외의 문자열을 입력 하였을 때
                    System.out.print(" 숫자만 입력 해 주세요 : ");
                    burgerInputBox = sc.nextInt();
                }
                if (burgerInputBox == 0) {
                    System.out.println("주문을 종료합니다");
                    sc.close();
                    break;
                }
            case 0:
                System.out.println("주문을 종료합니다");
                sc.close();
                break;

        }

    }
}



//        try {
//            int mainInputBox = sc.nextInt();
//
//            while ((0 <= mainInputBox) && (mainInputBox <= menuItemList.size())) {
//                System.out.print("제공된 메뉴의 숫자 범위내에서 입력해 주세요 : ");
//                mainInputBox = sc.nextInt();
//            }
//        } catch (NumberFormatException e) {
//            while (true) {
//                int mainInputBox = sc.nextInt();
//                try {
//                    System.out.print("숫자만 입력해 주세요 : ");
//                    mainInputBox = sc.nextInt();
//                    break;
//                } catch (NumberFormatException ex) {
//                    System.out.print("숫자만 입력해 주세요 : ");
//                }
//            }


//                while (burgerIndex + 1 <= Integer.parseInt(burgerInputBox)) {
//                    //          0               3 = true -> false
//                    System.out.print("0 ~ " + burgerIndex + "의 범위의 숫자를 입력해주세요 : ");
//                    burgerInputBox = sc.next();


//                    String numChecked1 = burgerInputBox.replaceAll("[^0-9]","");
//                    char numChecked2 = numChecked1.charAt(0);

//        String mainNumChecked1 = mainInputBox.replaceAll("[^0-9]","");
//        char numChecked2 = mainInputBox.charAt(0);


//        Menu 클래스 생성시 구현할 기능
//        try {
//            while ((0 <= Integer.parseInt(mainInputBox)) != ((Integer.parseInt(mainInputBox)) <= menuItemList.size() - 1))
//            //               0                            !=       3
//            {
//                System.out.println("돼냐?");
//                mainInputBox = sc.next();
//            }
//        } catch (RuntimeException e) {
//            System.out.print(" 정해진 범위의 숫자만 입력 해 주세요 :  ");
//            mainInputBox = sc.next();
//        }