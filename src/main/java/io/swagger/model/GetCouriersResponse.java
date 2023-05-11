package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.CourierDto;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * GetCouriersResponse
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-05-10T17:23:51.424035655Z[GMT]")


public class GetCouriersResponse   {
  @JsonProperty("couriers")
  @Valid
  private List<CourierDto> couriers = new ArrayList<CourierDto>();

  @JsonProperty("limit")
  private Integer limit = null;

  @JsonProperty("offset")
  private Integer offset = null;

  public GetCouriersResponse couriers(List<CourierDto> couriers) {
    this.couriers = couriers;
    return this;
  }

  public GetCouriersResponse addCouriersItem(CourierDto couriersItem) {
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
    public List<CourierDto> getCouriers() {
    return couriers;
  }

  public void setCouriers(List<CourierDto> couriers) {
    this.couriers = couriers;
  }

  public GetCouriersResponse limit(Integer limit) {
    this.limit = limit;
    return this;
  }

  /**
   * Get limit
   * @return limit
   **/
  @Schema(required = true, description = "")
      @NotNull

    public Integer getLimit() {
    return limit;
  }

  public void setLimit(Integer limit) {
    this.limit = limit;
  }

  public GetCouriersResponse offset(Integer offset) {
    this.offset = offset;
    return this;
  }

  /**
   * Get offset
   * @return offset
   **/
  @Schema(required = true, description = "")
      @NotNull

    public Integer getOffset() {
    return offset;
  }

  public void setOffset(Integer offset) {
    this.offset = offset;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetCouriersResponse getCouriersResponse = (GetCouriersResponse) o;
    return Objects.equals(this.couriers, getCouriersResponse.couriers) &&
        Objects.equals(this.limit, getCouriersResponse.limit) &&
        Objects.equals(this.offset, getCouriersResponse.offset);
  }

  @Override
  public int hashCode() {
    return Objects.hash(couriers, limit, offset);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCouriersResponse {\n");
    
    sb.append("    couriers: ").append(toIndentedString(couriers)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
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
