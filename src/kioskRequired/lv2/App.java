package kioskRequired.lv2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        List<MenuItem> menuItemList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        // 버거들의 객체화
        MenuItem shackBurger = new MenuItem("쉑버거", 6900, "토마토, 양상추, 쉑소스가 토핑된 시그니처 버거");
        MenuItem smokeBurger = new MenuItem("스모크버거", 8900, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거");
        MenuItem cheeseBurger = new MenuItem("치즈버거", 6900, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거");
        MenuItem hamBurger = new MenuItem("햄버거", 5400, "비프패티를 기반으로 채소가 들어간 기본버거");
        MenuItem hamBurger2 = new MenuItem("햄버거", 5400, "비프패티를 기반으로 채소가 들어간 기본버거");
        menuItemList.add(shackBurger);
        menuItemList.add(smokeBurger);
        menuItemList.add(cheeseBurger);
        menuItemList.add(hamBurger);
        menuItemList.add(hamBurger2);
        System.out.print("원하시는 메뉴의 숫자를 입력해주세요 : ");
        System.out.println("-------------------------------------------------");
        System.out.println("[ 메인 메뉴 ]");
        System.out.println("1. 버거");
        System.out.println("2. 음료");
        System.out.println("3. 디저트");
        System.out.println("메뉴를 선택해 주세요");
        System.out.println("-------------------------------------------------");
        System.out.print("원하시는 기능을 숫자로 입력해주세요 : ");
        String mainInputBox = sc.next();


        switch (mainInputBox) {
            case "1":
                System.out.println("-------------------------------------------------");
                System.out.println("[ 쉑쉑 메뉴 ]");
                int burgerIndex = 0;
                for (MenuItem burger : menuItemList) {
                    System.out.println((burgerIndex + 1) + ". " + burger.toString());
                    burgerIndex++;
                }
                // ArrayList<>()를 객체화 하여 List<MenuItem>에 add한 데이터들을 MenuItem클래스에서 toString하여 for문으로 출력
                System.out.println("0. 종료         | 종료");
                System.out.println("-------------------------------------------------");
                System.out.print("원하시는 기능을 숫자로 입력해주세요 : ");
                String burgerInputBox = sc.next();
                while (burgerIndex + 1 <= Integer.parseInt(burgerInputBox)) {
                    // 0                    3 = true -> false
                    System.out.print("0 ~ " + burgerIndex + "의 범위의 숫자를 입력해주세요 : ");
                    burgerInputBox = sc.next();
                    if (burgerInputBox.equals("0")){
                        System.out.println("프로그램을 종료합니다");
                        break;
                    }

                }
            case "2":
                System.out.println("종료");
        }

    }
}
