package io.swagger.services.order;

import io.swagger.model.OrderDto;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService{
    @Override
    public OrderDto getOrder(long id) {
        OrderDto od = new OrderDto();
        od.setOrderId(id);
        od.setWeight(1.6f);
        return od;
    }
}
