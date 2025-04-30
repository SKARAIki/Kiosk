package kioskRequired.lv4;

import java.util.Scanner;

public class Kiosk {
    //속성
    private final Menu menu = new Menu();
    private final Scanner sc = new Scanner(System.in);

    //생성자
    public Kiosk() {

    }

    //기능
//    public void burgerList(){
//        for (MenuItem list : menu.menuItemList){
//             System.out.println("리스트"+ list);
//        }
//
//    }
//menu.menuItemList.get(0) 이거였꾸나아아아아아아아 gygim thanks
    public void startKiosk() {
        menu.addBurgerMenu();
        switch (menu.mainMenu()) {

            case 1:
                System.out.println("-------------------------------------------------");
                System.out.println("[ 쉑쉑 메뉴 ]");
                int burgerIndex = 0;
                // menu.menuItemList -> menu클래스안에서 생성된 List<MenuItem>menuItemList를 사용하겠다
//                burgerList();
                for (MenuItem burger : menu.menuItemList) {
                    System.out.println((burgerIndex + 1) + ". " + burger.toString());
                    burgerIndex++;
                }
                // ArrayList<>()를 객체화 하여 List<MenuItem>에 add한 데이터들을 MenuItem클래스에서 toString하여 for문으로 출력
                System.out.println("0. 뒤로가기");
                System.out.println("-------------------------------------------------");
                System.out.print("원하시는 메뉴를 숫자로 입력해 주세요 : ");
                int burgerInputBox = sc.nextInt();
                while ((0 <= burgerInputBox) != (burgerInputBox <= menu.menuItemList.size())) {
                    try {
                        while ((0 <= burgerInputBox) != (burgerInputBox <= menu.menuItemList.size())) {
                            System.out.print("정해진 범위의 숫자만 입력해 주세요 : ");
                            burgerInputBox = sc.nextInt();
                        }
                    } catch (NumberFormatException e) {
                        System.out.print(" 숫자만 입력 해 주세요 : ");
                        burgerInputBox = sc.nextInt();
                    }
                }
                switch (burgerInputBox) {
                    case 1:
                        System.out.println(menu.menuItemList.get(0));
                        break;
                    case 2:
                        System.out.println(menu.menuItemList.get(1));
                        break;
                    case 3:
                        System.out.println(menu.menuItemList.get(2));
                        break;
                    case 4:
                        System.out.println(menu.menuItemList.get(4));
                        break;
                    case 0:
                        menu.mainMenu();

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