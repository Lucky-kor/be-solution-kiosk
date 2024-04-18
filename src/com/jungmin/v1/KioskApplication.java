package com.jungmin.v1;

import com.jungmin.v2.MenuItem;

import java.util.Scanner;

public class KioskApplication {
    private final static MenuItem menuItem1 = new MenuItem("김밥", 1000);
    private final static MenuItem menuItem2 = new MenuItem("계란 김밥", 1500);
    private final static MenuItem menuItem3 = new MenuItem("충무 김밥", 1000);
    private final static MenuItem menuItem4 = new MenuItem("떡볶이", 2000);
    private final static MenuItem[] MenuItemArray = new MenuItem[]{};
    public static void main(String[] args) {
        // Kiosk 클래스의 기능을 구현 및 활용해서 프로그래밍 요구 사항에 맞는 키오스크 프로그램을 구현하세요.
        // MenuItem 클래스는 음식 정보를 표현하고 있으며 MenuItem 클래스를 이용해 주문할 음식 정보를 출력할 수 있습니다.
        // 이 외의 필요한 클래스가 있다면 자유롭게 추가해서 여러분들만의 키오스크 프로그램을 만들면 됩니다.

        Scanner sc = new Scanner(System.in);
        // 웰컴 메시지 출력
        System.out.println("[안내]안녕하세요. 김밥천국에 오신 것을 환영합니다.");
        System.out.println("------------------------------");
        // 주문 안내 메시지를 출력하는 메서드를 정의할 수 있습니다.
        System.out.println("[안내]원하시는 메뉴의 번호를 입력하여 주세요.");
        System.out.println("1) 김밥(1000원) 2) 계란 김밥(1500원) 3) 충무 김밥(1000원) 4) 떡볶이(2000원)");
        // 주문할 음식을 선택하는 메서드를 정의 할 수 있습니다.
        int menuNumber = 0;
        do {
            menuNumber = Integer.parseInt(sc.nextLine());
            if(menuNumber < 1 || menuNumber > 4) {
                System.out.println("[안내]메뉴에 포함된 번호를 입력하여 주세요.");
                System.out.println("");
            }
        } while(menuNumber < 1 || menuNumber > 4);
        // 주문할 음식의 수량을 입력하는 메서드를 정의할 수 있습니다.

        int count = 0;
        do {
            System.out.println("------------------------------\n" +
                    "[안내]선택하신 메뉴의 수량을 입력하여 주세요.\n" +
                    "(※ 최대 주문 가능 수량 : 99)");
            count = Integer.parseInt(sc.nextLine());
            if(count < 1 || count > 99) {
                System.out.println("[경고]" + count + "개는 입력하실 수 없습니다.\n" +
                        "[경고]수량 선택 화면으로 돌아갑니다.");
            }
        }while(count < 1 || count > 99);

        // 음식 주문을 위한 메서드를 정의할 수 있습니다.
        int price = 0;
        switch (menuNumber) {
            case 1 :
                price = 1000;
                break;
            case 2 :
                price = 1500;
                break;
            case 3:
                price = 1000;
                break;
            case 4 :
                price = 2000;
                break;
            default:
        }
        int currentOrderPrice = count * price;
        // 주문 결과를 출력하는 메서드를 정의할 수 있습니다.
        System.out.println("[안내]주문하신 메뉴의 총 금액은" + currentOrderPrice + "원 입니다.\n" +
                "[안내]이용해 주셔서 감사합니다.");
    }
}
