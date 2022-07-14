package com.jeachnuy.til.spring.principles.sample.exam;

public interface OrderService {
    Order createOrder(Long memberId, String itemName, int itemPrice);
}
