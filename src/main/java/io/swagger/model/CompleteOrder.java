package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CompleteOrder
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-05-10T17:23:51.424035655Z[GMT]")


public class CompleteOrder   {
  @JsonProperty("courier_id")
  private Long courierId = null;

  @JsonProperty("order_id")
  private Long orderId = null;

  @JsonProperty("complete_time")
  private OffsetDateTime completeTime = null;

  public CompleteOrder courierId(Long courierId) {
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

  public CompleteOrder orderId(Long orderId) {
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

  public CompleteOrder completeTime(OffsetDateTime completeTime) {
    this.completeTime = completeTime;
    return this;
  }

  /**
   * Get completeTime
   * @return completeTime
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public OffsetDateTime getCompleteTime() {
    return completeTime;
  }

  public void setCompleteTime(OffsetDateTime completeTime) {
    this.completeTime = completeTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CompleteOrder completeOrder = (CompleteOrder) o;
    return Objects.equals(this.courierId, completeOrder.courierId) &&
        Objects.equals(this.orderId, completeOrder.orderId) &&
        Objects.equals(this.completeTime, completeOrder.completeTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(courierId, orderId, completeTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompleteOrder {\n");
    
    sb.append("    courierId: ").append(toIndentedString(courierId)).append("\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    completeTime: ").append(toIndentedString(completeTime)).append("\n");
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
