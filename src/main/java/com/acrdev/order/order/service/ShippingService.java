package com.acrdev.order.order.service;

import com.acrdev.order.order.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {

    public double shipment(Order order){

        double valorFrete = 0;

        if(order.getBasic() < 100.0){
            valorFrete = 20.0;
        } else if (order.getBasic() < 200.0) {
            valorFrete = 12.0;
        }

        return valorFrete;
    }
}
