package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.CouriersGroupOrders;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.LocalDate;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OrderAssignResponse
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-05-10T17:23:51.424035655Z[GMT]")


public class OrderAssignResponse   {
  @JsonProperty("date")
  private LocalDate date = null;

  @JsonProperty("couriers")
  @Valid
  private List<CouriersGroupOrders> couriers = new ArrayList<CouriersGroupOrders>();

  public OrderAssignResponse date(LocalDate date) {
    this.date = date;
    return this;
  }

  /**
   * Get date
   * @return date
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public LocalDate getDate() {
    return date;
  }

  public void setDate(LocalDate date) {
    this.date = date;
  }

  public OrderAssignResponse couriers(List<CouriersGroupOrders> couriers) {
    this.couriers = couriers;
    return this;
  }

  public OrderAssignResponse addCouriersItem(CouriersGroupOrders couriersItem) {
    this.couriers.add(couriersItem);
    return this;
  }

  /**
   * Get couriers
   * @return couriers
   **/
  @Schema(required = true, description = "")
      @NotNull
    @Valid
    public List<CouriersGroupOrders> getCouriers() {
    return couriers;
  }

  public void setCouriers(List<CouriersGroupOrders> couriers) {
    this.couriers = couriers;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderAssignResponse orderAssignResponse = (OrderAssignResponse) o;
    return Objects.equals(this.date, orderAssignResponse.date) &&
        Objects.equals(this.couriers, orderAssignResponse.couriers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, couriers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderAssignResponse {\n");
    
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    couriers: ").append(toIndentedString(couriers)).append("\n");
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
