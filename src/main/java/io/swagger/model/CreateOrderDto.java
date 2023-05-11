package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CreateOrderDto
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-05-10T17:23:51.424035655Z[GMT]")


public class CreateOrderDto   {
  @JsonProperty("weight")
  private Float weight = null;

  @JsonProperty("regions")
  private Integer regions = null;

  @JsonProperty("delivery_hours")
  @Valid
  private List<String> deliveryHours = new ArrayList<String>();

  @JsonProperty("cost")
  private Integer cost = null;

  public CreateOrderDto weight(Float weight) {
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

  public CreateOrderDto regions(Integer regions) {
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

  public CreateOrderDto deliveryHours(List<String> deliveryHours) {
    this.deliveryHours = deliveryHours;
    return this;
  }

  public CreateOrderDto addDeliveryHoursItem(String deliveryHoursItem) {
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

  public CreateOrderDto cost(Integer cost) {
    this.cost = cost;
    return this;
  }

  /**
   * Get cost
   * @return cost
   **/
  @Schema(required = true, description = "")
      @NotNull

    public Integer getCost() {
    return cost;
  }

  public void setCost(Integer cost) {
    this.cost = cost;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateOrderDto createOrderDto = (CreateOrderDto) o;
    return Objects.equals(this.weight, createOrderDto.weight) &&
        Objects.equals(this.regions, createOrderDto.regions) &&
        Objects.equals(this.deliveryHours, createOrderDto.deliveryHours) &&
        Objects.equals(this.cost, createOrderDto.cost);
  }

  @Override
  public int hashCode() {
    return Objects.hash(weight, regions, deliveryHours, cost);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateOrderDto {\n");
    
    sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
    sb.append("    regions: ").append(toIndentedString(regions)).append("\n");
    sb.append("    deliveryHours: ").append(toIndentedString(deliveryHours)).append("\n");
    sb.append("    cost: ").append(toIndentedString(cost)).append("\n");
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
