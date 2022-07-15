package com.jeachnuy.til.spring.principles.sample.exam;

public class OrderApp {
    public static void main(String[] args) {
        AppConfig appConfig = new AppConfig();

        MemberService memberService = appConfig.memberService();
        OrderService orderService = appConfig.orderService();

        var memberId = 1L;

        var member = new Member(memberId, "memberA", Grade.VIP);
        memberService.join(member);

        var order = orderService.createOrder(memberId, "itemA", 10000);
        System.out.println("order = " + order);
    }
}
