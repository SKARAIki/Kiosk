package kioskRequired.lv4;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Menu {
    Scanner sc = new Scanner(System.in);
    //속성
    List<MenuItem> menuItemList = new ArrayList<>();


    //생성자
    public Menu() {
    }

    //기능
    public void addBurgerMenu() {

    }

    public int mainMenu() {



        while (true) {
            MenuItem shackBurger = new MenuItem("쉑버거", 6900, "토마토, 양상추, 쉑소스가 토핑된 시그니처 버거");
            MenuItem smokeBurger = new MenuItem("스모크버거", 8900, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거");
            MenuItem cheeseBurger = new MenuItem("치즈버거", 6900, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거");
            MenuItem hamBurger = new MenuItem("햄버거", 5400, "비프패티를 기반으로 채소가 들어간 기본버거");
            this.menuItemList.add(shackBurger);
            this.menuItemList.add(smokeBurger);
            this.menuItemList.add(cheeseBurger);
            this.menuItemList.add(hamBurger);

            System.out.print("원하시는 메뉴의 숫자를 입력해주세요 : ");
            System.out.println("-------------------------------------------------");
            System.out.println("[ 메인 메뉴 ]");
            System.out.println("1. 버거");
            System.out.println("2. 음료");
            System.out.println("3. 디저트");
            System.out.println("0. 종료");
            System.out.println("-------------------------------------------------");
            System.out.print("원하시는 기능을 숫자로 입력해주세요 : ");
            try {
                int mainInputBox = sc.nextInt();
                return mainInputBox;
            } catch (InputMismatchException e) {
                System.out.println("*********경고*********");
                System.out.println("숫자로 입력하여 주십시오");
                sc.next(); // 문자열을 입력했기 때문에 nextInt는 불가
                // 트러블슈팅 예외처리
            }
        }

//        while ((0 <= mainInputBox) != (mainInputBox <= 3)) {
//            try {
//                while ((0 <= mainInputBox) != (mainInputBox <= 4)) {
//                    System.out.print("정해진 범위의 숫자만 입력해 주세요 : ");
//                    mainInputBox = sc.nextInt();
//                }
//            } catch ( ) {
//                System.out.print(" 숫자만 입력 해 주세요 : ");
//                mainInputBox = sc.nextInt();
//            }
//
//        }


    }
}
//
//      int mainInputBox = sc.nextInt();
//
//      switch (mainInputBox) {
//         case 1:
//            System.out.println("-------------------------------------------------");
//            System.out.println("[ 쉑쉑 메뉴 ]");
//            int burgerIndex = 0;
//            for (kioskRequired.lv4.MenuItem burger : menuItemList) {
//               System.out.println((burgerIndex + 1) + ". " + burger.toString());
//               burgerIndex++;
//            }
//            // ArrayList<>()를 객체화 하여 List<MenuItem>에 add한 데이터들을 MenuItem클래스에서 toString하여 for문으로 출력
//            System.out.println("0. 종료         | 종료");
//            System.out.println("-------------------------------------------------");
//            System.out.print("원하시는 메뉴를 숫자로 입력해 주세요 : ");
//
//            int burgerInputBox = sc.nextInt();
//            try {
//               while ((0 <= burgerInputBox) != (burgerInputBox <= menuItemList.size())) {
//                  System.out.print("정해진 범위의 숫자만 입력해 주세요 : ");
//                  burgerInputBox = sc.nextInt();
//               }
//            } catch (RuntimeException e2) {
//               //숫자 외의 문자열을 입력 하였을 때
//               System.out.print(" 숫자만 입력 해 주세요 : ");
//               burgerInputBox = sc.nextInt();
//            }
//            if (burgerInputBox == 0) {
//               System.out.println("주문을 종료합니다");
//               sc.close();
//               break;
//            }
//         case 0:
//            System.out.println("주문을 종료합니다");
//            sc.close();
//            break;
//
//      }
//
//   }
//}


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