package com.jungmin.v2;

import java.util.Scanner;

public class Kiosk {
    private final static MenuItem menuItem1 = new MenuItem("김밥", 1000);
    private final static MenuItem menuItem2 = new MenuItem("계란 김밥", 1500);
    private final static MenuItem menuItem3 = new MenuItem("충무 김밥", 1000);
    private final static MenuItem menuItem4 = new MenuItem("떡볶이", 2000);
    Scanner sc = new Scanner(System.in);
    // 웰컴 메시지 출력
    public void welcomePrintMessage() {
        System.out.println("[안내]안녕하세요. 김밥천국에 오신 것을 환영합니다.");
        System.out.println("------------------------------");
    }

    public int selectMenu() {
        int menuNumber;
        // 주문할 음식을 선택하는 메서드를 정의 할 수 있습니다.
        do {
            PrintMenuSelectMessage();
            menuNumber = inputMenuNumber();
            switch (menuNumber) {
                case 1:
                    menuNumber = 1;
                    break;
                case 2:
                    menuNumber = 2;
                    break;
                case 3:
                    menuNumber = 3;
                    break;
                case 4:
                    menuNumber = 4;
                    break;
            }
            if(menuNumber < 1 || menuNumber > 4) {
                printMenuSelectExceptionMessage();
            }
        } while(menuNumber < 1 || menuNumber > 4);
        return menuNumber;
    }
    private void printMenuSelectExceptionMessage() {
        System.out.println("[안내]메뉴에 포함된 번호를 입력하여 주세요.\n");
    }
    // 주문 안내 메시지를 출력하는 메서드를 정의할 수 있습니다.
    private void PrintMenuSelectMessage() {
        System.out.println("[안내]원하시는 메뉴의 번호를 입력하여 주세요.");
        System.out.println("1) 김밥(1000원) 2) 계란 김밥(1500원) 3) 충무 김밥(1000원) 4) 떡볶이(2000원)");
    }
    // 주문할 음식을 선택하는 메서드를 정의 할 수 있습니다.
    private int inputMenuNumber() {
        int menuNumber = Integer.parseInt(sc.nextLine());
        return menuNumber;
    }
    // 주문할 음식의 수량을 입력하는 메서드를 정의할 수 있습니다.
    private void printMenuCountMessage() {
        System.out.println("------------------------------\n" +
                "[안내]선택하신 메뉴의 수량을 입력하여 주세요.\n" +
                "(※ 최대 주문 가능 수량 : 99)");
    }

    private int inputMenuCountNumber() {
        int count = Integer.parseInt(sc.nextLine());
        return count;
    }

    private void printMenuCountExceptionMessage(int count) {
        System.out.println("[경고]" + count + "개는 입력하실 수 없습니다.\n" +
                "[경고]수량 선택 화면으로 돌아갑니다.");
    }
    public int selectMenuCount() {
        int count = 0;
        do {
            printMenuCountMessage();
            count = inputMenuCountNumber();
            if(count < 1 || count > 99) {
                printMenuCountExceptionMessage(count);
            }
        }while(count < 1 || count > 99);
        return count;
    }
    private int getCurrentMenuPrice(int menuNumber) {
        int price = -1;
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
        return price;
    }
    // 음식 주문을 위한 메서드를 정의할 수 있습니다.
    public int calculateOrderPrice(int menuNumber, int count) {
        int price = getCurrentMenuPrice(menuNumber);
        if(price == -1) {
            return -1;
        }
        return count * price;
    }
    // 주문 결과를 출력하는 메서드를 정의할 수 있습니다.
    public void printOrderPriceMessage(int currentOrderPrice) {
        System.out.println("[안내]주문하신 메뉴의 총 금액은 : " + currentOrderPrice + "원 입니다.\n" +
                "[안내]이용해 주셔서 감사합니다.");
    }
}
