package com.shopping.service;

import java.math.BigDecimal;
import com.shopping.bo.Basket;

public interface ShopingService {
    BigDecimal generateBill(Basket basket);
}
