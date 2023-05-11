package io.swagger.api;

import io.swagger.model.BadRequestResponse;
import io.swagger.model.CourierDto;
import io.swagger.model.CreateCourierRequest;
import io.swagger.model.CreateCouriersResponse;
import io.swagger.model.GetCourierMetaInfoResponse;
import io.swagger.model.GetCouriersResponse;
import org.threeten.bp.LocalDate;
import io.swagger.model.NotFoundResponse;
import io.swagger.model.OrderAssignResponse;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-05-10T17:23:51.424035655Z[GMT]")
@RestController
public class CouriersApiController implements CouriersApi {

    private static final Logger log = LoggerFactory.getLogger(CouriersApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public CouriersApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<OrderAssignResponse> couriersAssignments(@Parameter(in = ParameterIn.QUERY, description = "Дата распределения заказов. Если не указана, то используется текущий день" ,schema=@Schema()) @Valid @RequestParam(value = "date", required = false) LocalDate date,@Parameter(in = ParameterIn.QUERY, description = "Идентификатор курьера для получения списка распредленных заказов. Если не указан, возвращаются данные по всем курьерам." ,schema=@Schema()) @Valid @RequestParam(value = "courier_id", required = false) Integer courierId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<OrderAssignResponse>(objectMapper.readValue("{\n  \"date\" : \"2000-01-23\",\n  \"couriers\" : [ {\n    \"courier_id\" : 0,\n    \"orders\" : [ {\n      \"group_order_id\" : 6,\n      \"orders\" : [ {\n        \"regions\" : 1,\n        \"cost\" : 5,\n        \"completed_time\" : \"2000-01-23T04:56:07.000+00:00\",\n        \"weight\" : 6.0274563,\n        \"delivery_hours\" : [ \"delivery_hours\", \"delivery_hours\" ],\n        \"order_id\" : 0\n      }, {\n        \"regions\" : 1,\n        \"cost\" : 5,\n        \"completed_time\" : \"2000-01-23T04:56:07.000+00:00\",\n        \"weight\" : 6.0274563,\n        \"delivery_hours\" : [ \"delivery_hours\", \"delivery_hours\" ],\n        \"order_id\" : 0\n      } ]\n    }, {\n      \"group_order_id\" : 6,\n      \"orders\" : [ {\n        \"regions\" : 1,\n        \"cost\" : 5,\n        \"completed_time\" : \"2000-01-23T04:56:07.000+00:00\",\n        \"weight\" : 6.0274563,\n        \"delivery_hours\" : [ \"delivery_hours\", \"delivery_hours\" ],\n        \"order_id\" : 0\n      }, {\n        \"regions\" : 1,\n        \"cost\" : 5,\n        \"completed_time\" : \"2000-01-23T04:56:07.000+00:00\",\n        \"weight\" : 6.0274563,\n        \"delivery_hours\" : [ \"delivery_hours\", \"delivery_hours\" ],\n        \"order_id\" : 0\n      } ]\n    } ]\n  }, {\n    \"courier_id\" : 0,\n    \"orders\" : [ {\n      \"group_order_id\" : 6,\n      \"orders\" : [ {\n        \"regions\" : 1,\n        \"cost\" : 5,\n        \"completed_time\" : \"2000-01-23T04:56:07.000+00:00\",\n        \"weight\" : 6.0274563,\n        \"delivery_hours\" : [ \"delivery_hours\", \"delivery_hours\" ],\n        \"order_id\" : 0\n      }, {\n        \"regions\" : 1,\n        \"cost\" : 5,\n        \"completed_time\" : \"2000-01-23T04:56:07.000+00:00\",\n        \"weight\" : 6.0274563,\n        \"delivery_hours\" : [ \"delivery_hours\", \"delivery_hours\" ],\n        \"order_id\" : 0\n      } ]\n    }, {\n      \"group_order_id\" : 6,\n      \"orders\" : [ {\n        \"regions\" : 1,\n        \"cost\" : 5,\n        \"completed_time\" : \"2000-01-23T04:56:07.000+00:00\",\n        \"weight\" : 6.0274563,\n        \"delivery_hours\" : [ \"delivery_hours\", \"delivery_hours\" ],\n        \"order_id\" : 0\n      }, {\n        \"regions\" : 1,\n        \"cost\" : 5,\n        \"completed_time\" : \"2000-01-23T04:56:07.000+00:00\",\n        \"weight\" : 6.0274563,\n        \"delivery_hours\" : [ \"delivery_hours\", \"delivery_hours\" ],\n        \"order_id\" : 0\n      } ]\n    } ]\n  } ]\n}", OrderAssignResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<OrderAssignResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<OrderAssignResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<CreateCouriersResponse> createCourier(@Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody CreateCourierRequest body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<CreateCouriersResponse>(objectMapper.readValue("{\n  \"couriers\" : [ {\n    \"regions\" : [ 6, 6 ],\n    \"working_hours\" : [ \"working_hours\", \"working_hours\" ],\n    \"courier_id\" : 0,\n    \"courier_type\" : \"FOOT\"\n  }, {\n    \"regions\" : [ 6, 6 ],\n    \"working_hours\" : [ \"working_hours\", \"working_hours\" ],\n    \"courier_id\" : 0,\n    \"courier_type\" : \"FOOT\"\n  } ]\n}", CreateCouriersResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<CreateCouriersResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<CreateCouriersResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<CourierDto> getCourierById(@Parameter(in = ParameterIn.PATH, description = "Courier identifier", required=true, schema=@Schema()) @PathVariable("courier_id") Long courierId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<CourierDto>(objectMapper.readValue("{\n  \"regions\" : [ 6, 6 ],\n  \"working_hours\" : [ \"working_hours\", \"working_hours\" ],\n  \"courier_id\" : 0,\n  \"courier_type\" : \"FOOT\"\n}", CourierDto.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<CourierDto>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<CourierDto>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<GetCourierMetaInfoResponse> getCourierMetaInfo(@Parameter(in = ParameterIn.PATH, description = "Courier identifier", required=true, schema=@Schema()) @PathVariable("courier_id") Long courierId,@NotNull @Parameter(in = ParameterIn.QUERY, description = "Rating calculation start date" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "startDate", required = true) LocalDate startDate,@NotNull @Parameter(in = ParameterIn.QUERY, description = "Rating calculation end date" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "endDate", required = true) LocalDate endDate) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<GetCourierMetaInfoResponse>(objectMapper.readValue("{\n  \"earnings\" : 5,\n  \"regions\" : [ 6, 6 ],\n  \"working_hours\" : [ \"working_hours\", \"working_hours\" ],\n  \"rating\" : 1,\n  \"courier_id\" : 0,\n  \"courier_type\" : \"FOOT\"\n}", GetCourierMetaInfoResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<GetCourierMetaInfoResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<GetCourierMetaInfoResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<GetCouriersResponse> getCouriers(@Parameter(in = ParameterIn.QUERY, description = "Максимальное количество курьеров в выдаче. Если параметр не передан, то значение по умолчанию равно 1." ,schema=@Schema()) @Valid @RequestParam(value = "limit", required = false) Integer limit,@Parameter(in = ParameterIn.QUERY, description = "Количество курьеров, которое нужно пропустить для отображения текущей страницы. Если параметр не передан, то значение по умолчанию равно 0." ,schema=@Schema()) @Valid @RequestParam(value = "offset", required = false) Integer offset) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<GetCouriersResponse>(objectMapper.readValue("{\n  \"couriers\" : [ {\n    \"regions\" : [ 6, 6 ],\n    \"working_hours\" : [ \"working_hours\", \"working_hours\" ],\n    \"courier_id\" : 0,\n    \"courier_type\" : \"FOOT\"\n  }, {\n    \"regions\" : [ 6, 6 ],\n    \"working_hours\" : [ \"working_hours\", \"working_hours\" ],\n    \"courier_id\" : 0,\n    \"courier_type\" : \"FOOT\"\n  } ],\n  \"offset\" : 5,\n  \"limit\" : 1\n}", GetCouriersResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<GetCouriersResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<GetCouriersResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

}
