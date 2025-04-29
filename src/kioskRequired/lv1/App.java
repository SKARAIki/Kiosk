package kioskRequired.lv1;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("원하시는 메뉴의 숫자를 입력해주세요 : ");
        System.out.println("-------------------------------------------------");
        System.out.println("[ 메인 메뉴 ]");
        System.out.println("1. 버거");
        System.out.println("2. 음료");
        System.out.println("3. 디저트");
        System.out.println("메뉴를 선택해 주세요");
        System.out.println("-------------------------------------------------");
        System.out.print("입력란 : ");
        String mainInputBox = sc.next();

        if (mainInputBox.equals("1")) {
            System.out.println("-------------------------------------------------");
            System.out.println("[ 쉑쉑 메뉴 ]");
            System.out.println("1. 쉑버거        | W 6,900 | 토마토, 양상추, 쉑소스가 토핑된 시그니처 버거");
            System.out.println("2. 스모크버거    | W 8,900 | 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거");
            System.out.println("3. 치즈버거      | W 6,900 | 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거");
            System.out.println("4. 햄버거       | W 5,400 | 비프패티를 기반으로 채소가 들어간 기본버거");
            System.out.println("0. 종료         | 종료");
            System.out.println("-------------------------------------------------");
            System.out.print("입력란 : ");
            String menuBox = sc.next();
            if (menuBox.equals("0")) {
                System.out.println("종료");
            }
        }
    }
}
