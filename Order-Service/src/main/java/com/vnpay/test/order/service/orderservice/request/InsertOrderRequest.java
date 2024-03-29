package com.vnpay.test.order.service.orderservice.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.vnpay.test.order.service.orderservice.dto.BookOrder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@NoArgsConstructor
public class InsertOrderRequest {
    @JsonProperty("user_id")
    private String userId;
    @JsonProperty("books")
    private List<BookOrder> books;
}

