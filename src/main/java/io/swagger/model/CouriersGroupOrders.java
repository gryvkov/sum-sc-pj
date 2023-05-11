package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.GroupOrders;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CouriersGroupOrders
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-05-10T17:23:51.424035655Z[GMT]")


public class CouriersGroupOrders   {
  @JsonProperty("courier_id")
  private Long courierId = null;

  @JsonProperty("orders")
  @Valid
  private List<GroupOrders> orders = new ArrayList<GroupOrders>();

  public CouriersGroupOrders courierId(Long courierId) {
    this.courierId = courierId;
    return this;
  }

  /**
   * Get courierId
   * @return courierId
   **/
  @Schema(required = true, description = "")
      @NotNull

    public Long getCourierId() {
    return courierId;
  }

  public void setCourierId(Long courierId) {
    this.courierId = courierId;
  }

  public CouriersGroupOrders orders(List<GroupOrders> orders) {
    this.orders = orders;
    return this;
  }

  public CouriersGroupOrders addOrdersItem(GroupOrders ordersItem) {
    this.orders.add(ordersItem);
    return this;
  }

  /**
   * Get orders
   * @return orders
   **/
  @Schema(required = true, description = "")
      @NotNull
    @Valid
    public List<GroupOrders> getOrders() {
    return orders;
  }

  public void setOrders(List<GroupOrders> orders) {
    this.orders = orders;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CouriersGroupOrders couriersGroupOrders = (CouriersGroupOrders) o;
    return Objects.equals(this.courierId, couriersGroupOrders.courierId) &&
        Objects.equals(this.orders, couriersGroupOrders.orders);
  }

  @Override
  public int hashCode() {
    return Objects.hash(courierId, orders);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CouriersGroupOrders {\n");
    
    sb.append("    courierId: ").append(toIndentedString(courierId)).append("\n");
    sb.append("    orders: ").append(toIndentedString(orders)).append("\n");
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
