package io.swagger.api.controllers;

import io.swagger.api.OrdersApi;
import io.swagger.model.CompleteOrderRequestDto;
import io.swagger.model.CreateOrderRequest;
import io.swagger.services.order.OrderService;
import org.threeten.bp.LocalDate;
import io.swagger.model.OrderAssignResponse;
import io.swagger.model.OrderDto;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.media.Schema;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-05-10T17:23:51.424035655Z[GMT]")
@RestController
public class OrdersApiController implements OrdersApi {

    private static final Logger log = LoggerFactory.getLogger(OrdersApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    private final OrderService orderService;

    @org.springframework.beans.factory.annotation.Autowired
    public OrdersApiController(ObjectMapper objectMapper, HttpServletRequest request, OrderService orderService) {
        this.objectMapper = objectMapper;
        this.request = request;
        this.orderService = orderService;
    }

    public ResponseEntity<List<OrderDto>> completeOrder(@Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody CompleteOrderRequestDto body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<OrderDto>>(objectMapper.readValue("[ {\n  \"regions\" : 1,\n  \"cost\" : 5,\n  \"completed_time\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"weight\" : 6.0274563,\n  \"delivery_hours\" : [ \"delivery_hours\", \"delivery_hours\" ],\n  \"order_id\" : 0\n}, {\n  \"regions\" : 1,\n  \"cost\" : 5,\n  \"completed_time\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"weight\" : 6.0274563,\n  \"delivery_hours\" : [ \"delivery_hours\", \"delivery_hours\" ],\n  \"order_id\" : 0\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<OrderDto>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<OrderDto>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<OrderDto>> createOrder(@Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody CreateOrderRequest body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<OrderDto>>(objectMapper.readValue("[ {\n  \"regions\" : 1,\n  \"cost\" : 5,\n  \"completed_time\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"weight\" : 6.0274563,\n  \"delivery_hours\" : [ \"delivery_hours\", \"delivery_hours\" ],\n  \"order_id\" : 0\n}, {\n  \"regions\" : 1,\n  \"cost\" : 5,\n  \"completed_time\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"weight\" : 6.0274563,\n  \"delivery_hours\" : [ \"delivery_hours\", \"delivery_hours\" ],\n  \"order_id\" : 0\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<OrderDto>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<OrderDto>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<OrderDto> getOrder(@Parameter(in = ParameterIn.PATH, description = "Order identifier", required=true, schema=@Schema()) @PathVariable("order_id") Long orderId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            var od = orderService.getOrder(orderId);
            return new ResponseEntity<OrderDto>(od, HttpStatus.I_AM_A_TEAPOT);
        }

        return new ResponseEntity<OrderDto>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<OrderDto>> getOrders(@Parameter(in = ParameterIn.QUERY, description = "Максимальное количество заказов в выдаче. Если параметр не передан, то значение по умолчанию равно 1." ,schema=@Schema()) @Valid @RequestParam(value = "limit", required = false) Integer limit,@Parameter(in = ParameterIn.QUERY, description = "Количество заказов, которое нужно пропустить для отображения текущей страницы. Если параметр не передан, то значение по умолчанию равно 0." ,schema=@Schema()) @Valid @RequestParam(value = "offset", required = false) Integer offset) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<OrderDto>>(objectMapper.readValue("[ {\n  \"regions\" : 1,\n  \"cost\" : 5,\n  \"completed_time\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"weight\" : 6.0274563,\n  \"delivery_hours\" : [ \"delivery_hours\", \"delivery_hours\" ],\n  \"order_id\" : 0\n}, {\n  \"regions\" : 1,\n  \"cost\" : 5,\n  \"completed_time\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"weight\" : 6.0274563,\n  \"delivery_hours\" : [ \"delivery_hours\", \"delivery_hours\" ],\n  \"order_id\" : 0\n} ]", List.class), HttpStatus.ACCEPTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<OrderDto>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<OrderDto>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<OrderAssignResponse>> ordersAssign(@Parameter(in = ParameterIn.QUERY, description = "Дата распределения заказов. Если не указана, то используется текущий день" ,schema=@Schema()) @Valid @RequestParam(value = "date", required = false) LocalDate date) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<OrderAssignResponse>>(objectMapper.readValue("[ {\n  \"date\" : \"2000-01-23\",\n  \"couriers\" : [ {\n    \"courier_id\" : 0,\n    \"orders\" : [ {\n      \"group_order_id\" : 6,\n      \"orders\" : [ {\n        \"regions\" : 1,\n        \"cost\" : 5,\n        \"completed_time\" : \"2000-01-23T04:56:07.000+00:00\",\n        \"weight\" : 6.0274563,\n        \"delivery_hours\" : [ \"delivery_hours\", \"delivery_hours\" ],\n        \"order_id\" : 0\n      }, {\n        \"regions\" : 1,\n        \"cost\" : 5,\n        \"completed_time\" : \"2000-01-23T04:56:07.000+00:00\",\n        \"weight\" : 6.0274563,\n        \"delivery_hours\" : [ \"delivery_hours\", \"delivery_hours\" ],\n        \"order_id\" : 0\n      } ]\n    }, {\n      \"group_order_id\" : 6,\n      \"orders\" : [ {\n        \"regions\" : 1,\n        \"cost\" : 5,\n        \"completed_time\" : \"2000-01-23T04:56:07.000+00:00\",\n        \"weight\" : 6.0274563,\n        \"delivery_hours\" : [ \"delivery_hours\", \"delivery_hours\" ],\n        \"order_id\" : 0\n      }, {\n        \"regions\" : 1,\n        \"cost\" : 5,\n        \"completed_time\" : \"2000-01-23T04:56:07.000+00:00\",\n        \"weight\" : 6.0274563,\n        \"delivery_hours\" : [ \"delivery_hours\", \"delivery_hours\" ],\n        \"order_id\" : 0\n      } ]\n    } ]\n  }, {\n    \"courier_id\" : 0,\n    \"orders\" : [ {\n      \"group_order_id\" : 6,\n      \"orders\" : [ {\n        \"regions\" : 1,\n        \"cost\" : 5,\n        \"completed_time\" : \"2000-01-23T04:56:07.000+00:00\",\n        \"weight\" : 6.0274563,\n        \"delivery_hours\" : [ \"delivery_hours\", \"delivery_hours\" ],\n        \"order_id\" : 0\n      }, {\n        \"regions\" : 1,\n        \"cost\" : 5,\n        \"completed_time\" : \"2000-01-23T04:56:07.000+00:00\",\n        \"weight\" : 6.0274563,\n        \"delivery_hours\" : [ \"delivery_hours\", \"delivery_hours\" ],\n        \"order_id\" : 0\n      } ]\n    }, {\n      \"group_order_id\" : 6,\n      \"orders\" : [ {\n        \"regions\" : 1,\n        \"cost\" : 5,\n        \"completed_time\" : \"2000-01-23T04:56:07.000+00:00\",\n        \"weight\" : 6.0274563,\n        \"delivery_hours\" : [ \"delivery_hours\", \"delivery_hours\" ],\n        \"order_id\" : 0\n      }, {\n        \"regions\" : 1,\n        \"cost\" : 5,\n        \"completed_time\" : \"2000-01-23T04:56:07.000+00:00\",\n        \"weight\" : 6.0274563,\n        \"delivery_hours\" : [ \"delivery_hours\", \"delivery_hours\" ],\n        \"order_id\" : 0\n      } ]\n    } ]\n  } ]\n}, {\n  \"date\" : \"2000-01-23\",\n  \"couriers\" : [ {\n    \"courier_id\" : 0,\n    \"orders\" : [ {\n      \"group_order_id\" : 6,\n      \"orders\" : [ {\n        \"regions\" : 1,\n        \"cost\" : 5,\n        \"completed_time\" : \"2000-01-23T04:56:07.000+00:00\",\n        \"weight\" : 6.0274563,\n        \"delivery_hours\" : [ \"delivery_hours\", \"delivery_hours\" ],\n        \"order_id\" : 0\n      }, {\n        \"regions\" : 1,\n        \"cost\" : 5,\n        \"completed_time\" : \"2000-01-23T04:56:07.000+00:00\",\n        \"weight\" : 6.0274563,\n        \"delivery_hours\" : [ \"delivery_hours\", \"delivery_hours\" ],\n        \"order_id\" : 0\n      } ]\n    }, {\n      \"group_order_id\" : 6,\n      \"orders\" : [ {\n        \"regions\" : 1,\n        \"cost\" : 5,\n        \"completed_time\" : \"2000-01-23T04:56:07.000+00:00\",\n        \"weight\" : 6.0274563,\n        \"delivery_hours\" : [ \"delivery_hours\", \"delivery_hours\" ],\n        \"order_id\" : 0\n      }, {\n        \"regions\" : 1,\n        \"cost\" : 5,\n        \"completed_time\" : \"2000-01-23T04:56:07.000+00:00\",\n        \"weight\" : 6.0274563,\n        \"delivery_hours\" : [ \"delivery_hours\", \"delivery_hours\" ],\n        \"order_id\" : 0\n      } ]\n    } ]\n  }, {\n    \"courier_id\" : 0,\n    \"orders\" : [ {\n      \"group_order_id\" : 6,\n      \"orders\" : [ {\n        \"regions\" : 1,\n        \"cost\" : 5,\n        \"completed_time\" : \"2000-01-23T04:56:07.000+00:00\",\n        \"weight\" : 6.0274563,\n        \"delivery_hours\" : [ \"delivery_hours\", \"delivery_hours\" ],\n        \"order_id\" : 0\n      }, {\n        \"regions\" : 1,\n        \"cost\" : 5,\n        \"completed_time\" : \"2000-01-23T04:56:07.000+00:00\",\n        \"weight\" : 6.0274563,\n        \"delivery_hours\" : [ \"delivery_hours\", \"delivery_hours\" ],\n        \"order_id\" : 0\n      } ]\n    }, {\n      \"group_order_id\" : 6,\n      \"orders\" : [ {\n        \"regions\" : 1,\n        \"cost\" : 5,\n        \"completed_time\" : \"2000-01-23T04:56:07.000+00:00\",\n        \"weight\" : 6.0274563,\n        \"delivery_hours\" : [ \"delivery_hours\", \"delivery_hours\" ],\n        \"order_id\" : 0\n      }, {\n        \"regions\" : 1,\n        \"cost\" : 5,\n        \"completed_time\" : \"2000-01-23T04:56:07.000+00:00\",\n        \"weight\" : 6.0274563,\n        \"delivery_hours\" : [ \"delivery_hours\", \"delivery_hours\" ],\n        \"order_id\" : 0\n      } ]\n    } ]\n  } ]\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<OrderAssignResponse>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<OrderAssignResponse>>(HttpStatus.NOT_IMPLEMENTED);
    }

}
