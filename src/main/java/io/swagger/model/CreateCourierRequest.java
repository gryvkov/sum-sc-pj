package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.CreateCourierDto;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CreateCourierRequest
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-05-10T17:23:51.424035655Z[GMT]")


public class CreateCourierRequest   {
  @JsonProperty("couriers")
  @Valid
  private List<CreateCourierDto> couriers = new ArrayList<CreateCourierDto>();

  public CreateCourierRequest couriers(List<CreateCourierDto> couriers) {
    this.couriers = couriers;
    return this;
  }

  public CreateCourierRequest addCouriersItem(CreateCourierDto couriersItem) {
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
    public List<CreateCourierDto> getCouriers() {
    return couriers;
  }

  public void setCouriers(List<CreateCourierDto> couriers) {
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
    CreateCourierRequest createCourierRequest = (CreateCourierRequest) o;
    return Objects.equals(this.couriers, createCourierRequest.couriers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(couriers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateCourierRequest {\n");
    
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
