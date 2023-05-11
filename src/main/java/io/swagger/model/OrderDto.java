package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OrderDto
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-05-10T17:23:51.424035655Z[GMT]")


public class OrderDto   {
  @JsonProperty("order_id")
  private Long orderId = null;

  @JsonProperty("weight")
  private Float weight = null;

  @JsonProperty("regions")
  private Integer regions = null;

  @JsonProperty("delivery_hours")
  @Valid
  private List<String> deliveryHours = new ArrayList<String>();

  @JsonProperty("cost")
  private Integer cost = null;

  @JsonProperty("completed_time")
  private OffsetDateTime completedTime = null;

  public OrderDto orderId(Long orderId) {
    this.orderId = orderId;
    return this;
  }

  /**
   * Get orderId
   * @return orderId
   **/
  @Schema(required = true, description = "")
      @NotNull

    public Long getOrderId() {
    return orderId;
  }

  public void setOrderId(Long orderId) {
    this.orderId = orderId;
  }

  public OrderDto weight(Float weight) {
    this.weight = weight;
    return this;
  }

  /**
   * Get weight
   * @return weight
   **/
  @Schema(required = true, description = "")
      @NotNull

    public Float getWeight() {
    return weight;
  }

  public void setWeight(Float weight) {
    this.weight = weight;
  }

  public OrderDto regions(Integer regions) {
    this.regions = regions;
    return this;
  }

  /**
   * Get regions
   * @return regions
   **/
  @Schema(required = true, description = "")
      @NotNull

    public Integer getRegions() {
    return regions;
  }

  public void setRegions(Integer regions) {
    this.regions = regions;
  }

  public OrderDto deliveryHours(List<String> deliveryHours) {
    this.deliveryHours = deliveryHours;
    return this;
  }

  public OrderDto addDeliveryHoursItem(String deliveryHoursItem) {
    this.deliveryHours.add(deliveryHoursItem);
    return this;
  }

  /**
   * Get deliveryHours
   * @return deliveryHours
   **/
  @Schema(required = true, description = "")
      @NotNull

    public List<String> getDeliveryHours() {
    return deliveryHours;
  }

  public void setDeliveryHours(List<String> deliveryHours) {
    this.deliveryHours = deliveryHours;
  }

  public OrderDto cost(Integer cost) {
    this.cost = cost;
    return this;
  }

  /**
   * Стоимость доставки заказа
   * @return cost
   **/
  @Schema(required = true, description = "Стоимость доставки заказа")
      @NotNull

    public Integer getCost() {
    return cost;
  }

  public void setCost(Integer cost) {
    this.cost = cost;
  }

  public OrderDto completedTime(OffsetDateTime completedTime) {
    this.completedTime = completedTime;
    return this;
  }

  /**
   * Get completedTime
   * @return completedTime
   **/
  @Schema(description = "")
  
    @Valid
    public OffsetDateTime getCompletedTime() {
    return completedTime;
  }

  public void setCompletedTime(OffsetDateTime completedTime) {
    this.completedTime = completedTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderDto orderDto = (OrderDto) o;
    return Objects.equals(this.orderId, orderDto.orderId) &&
        Objects.equals(this.weight, orderDto.weight) &&
        Objects.equals(this.regions, orderDto.regions) &&
        Objects.equals(this.deliveryHours, orderDto.deliveryHours) &&
        Objects.equals(this.cost, orderDto.cost) &&
        Objects.equals(this.completedTime, orderDto.completedTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderId, weight, regions, deliveryHours, cost, completedTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderDto {\n");
    
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
    sb.append("    regions: ").append(toIndentedString(regions)).append("\n");
    sb.append("    deliveryHours: ").append(toIndentedString(deliveryHours)).append("\n");
    sb.append("    cost: ").append(toIndentedString(cost)).append("\n");
    sb.append("    completedTime: ").append(toIndentedString(completedTime)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
