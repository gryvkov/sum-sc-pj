package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.CompleteOrder;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CompleteOrderRequestDto
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-05-10T17:23:51.424035655Z[GMT]")


public class CompleteOrderRequestDto   {
  @JsonProperty("complete_info")
  @Valid
  private List<CompleteOrder> completeInfo = new ArrayList<CompleteOrder>();

  public CompleteOrderRequestDto completeInfo(List<CompleteOrder> completeInfo) {
    this.completeInfo = completeInfo;
    return this;
  }

  public CompleteOrderRequestDto addCompleteInfoItem(CompleteOrder completeInfoItem) {
    this.completeInfo.add(completeInfoItem);
    return this;
  }

  /**
   * Get completeInfo
   * @return completeInfo
   **/
  @Schema(required = true, description = "")
      @NotNull
    @Valid
    public List<CompleteOrder> getCompleteInfo() {
    return completeInfo;
  }

  public void setCompleteInfo(List<CompleteOrder> completeInfo) {
    this.completeInfo = completeInfo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CompleteOrderRequestDto completeOrderRequestDto = (CompleteOrderRequestDto) o;
    return Objects.equals(this.completeInfo, completeOrderRequestDto.completeInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(completeInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompleteOrderRequestDto {\n");
    
    sb.append("    completeInfo: ").append(toIndentedString(completeInfo)).append("\n");
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
