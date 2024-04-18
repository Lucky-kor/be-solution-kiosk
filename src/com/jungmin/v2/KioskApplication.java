package com.jungmin.v2;

public class KioskApplication {
    public static void main(String[] args) {
        // Kiosk 클래스의 기능을 구현 및 활용해서 프로그래밍 요구 사항에 맞는 키오스크 프로그램을 구현하세요.
        // MenuItem 클래스는 음식 정보를 표현하고 있으며 MenuItem 클래스를 이용해 주문할 음식 정보를 출력할 수 있습니다.
        // 이 외의 필요한 클래스가 있다면 자유롭게 추가해서 여러분들만의 키오스크 프로그램을 만들면 됩니다.

        // Kiosk 객체 생성
        Kiosk kiosk = new Kiosk();

        // 웰컴 메시지 출력
        kiosk.welcomePrintMessage();
        // 주문 안내 메시지를 출력하는 메서드를 정의할 수 있습니다.
        int menuNumber = kiosk.selectMenu();

        // 주문할 음식의 수량을 입력하는 메서드를 정의할 수 있습니다.
        int count = kiosk.selectMenuCount();


        // 음식 주문을 위한 메서드를 정의할 수 있습니다.
        int currentOrderPrice = kiosk.calculateOrderPrice(menuNumber, count);
        if(currentOrderPrice == -1) {
            System.out.println("알 수 없는 오류가 발생했습니다.\n" +
                    " 처음부터 다시 주문을 시작해 주세요.");
            return;
        }
        // 주문 결과를 출력하는 메서드를 정의할 수 있습니다.
        kiosk.printOrderPriceMessage(currentOrderPrice);
    }
}
