package io.swagger.services.order;

import io.swagger.model.OrderDto;
// серивс для заказов
public interface OrderService {
     OrderDto getOrder(long id);

}
