package com.jeachnuy.til.spring.principles.sample.exam;

public class FixDiscountPolicy implements DiscountPolicy {
    private int discountFixAmount = 1000;

    @Override
    public int discount(Member member, int price) {
        return member.getGrade() == Grade.VIP ? discountFixAmount : 0;
    }
}
