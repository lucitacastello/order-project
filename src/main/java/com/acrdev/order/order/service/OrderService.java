package com.acrdev.order.order.service;

import com.acrdev.order.order.entities.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private ShippingService service;

    public double total(Order order){
        double valorFrete = service.shipment(order);

        double valorTotal = order.getBasic() - (order.getBasic() * (order.getDiscount()/100)) + valorFrete;
        return valorTotal;
    }
}
