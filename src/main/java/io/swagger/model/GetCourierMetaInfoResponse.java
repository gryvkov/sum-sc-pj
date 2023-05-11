package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * GetCourierMetaInfoResponse
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-05-10T17:23:51.424035655Z[GMT]")


public class GetCourierMetaInfoResponse   {
  @JsonProperty("courier_id")
  private Long courierId = null;

  /**
   * Gets or Sets courierType
   */
  public enum CourierTypeEnum {
    FOOT("FOOT"),
    
    BIKE("BIKE"),
    
    AUTO("AUTO");

    private String value;

    CourierTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static CourierTypeEnum fromValue(String text) {
      for (CourierTypeEnum b : CourierTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("courier_type")
  private CourierTypeEnum courierType = null;

  @JsonProperty("regions")
  @Valid
  private List<Integer> regions = new ArrayList<Integer>();

  @JsonProperty("working_hours")
  @Valid
  private List<String> workingHours = new ArrayList<String>();

  @JsonProperty("rating")
  private Integer rating = null;

  @JsonProperty("earnings")
  private Integer earnings = null;

  public GetCourierMetaInfoResponse courierId(Long courierId) {
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

  public GetCourierMetaInfoResponse courierType(CourierTypeEnum courierType) {
    this.courierType = courierType;
    return this;
  }

  /**
   * Get courierType
   * @return courierType
   **/
  @Schema(required = true, description = "")
      @NotNull

    public CourierTypeEnum getCourierType() {
    return courierType;
  }

  public void setCourierType(CourierTypeEnum courierType) {
    this.courierType = courierType;
  }

  public GetCourierMetaInfoResponse regions(List<Integer> regions) {
    this.regions = regions;
    return this;
  }

  public GetCourierMetaInfoResponse addRegionsItem(Integer regionsItem) {
    this.regions.add(regionsItem);
    return this;
  }

  /**
   * Get regions
   * @return regions
   **/
  @Schema(required = true, description = "")
      @NotNull

    public List<Integer> getRegions() {
    return regions;
  }

  public void setRegions(List<Integer> regions) {
    this.regions = regions;
  }

  public GetCourierMetaInfoResponse workingHours(List<String> workingHours) {
    this.workingHours = workingHours;
    return this;
  }

  public GetCourierMetaInfoResponse addWorkingHoursItem(String workingHoursItem) {
    this.workingHours.add(workingHoursItem);
    return this;
  }

  /**
   * Get workingHours
   * @return workingHours
   **/
  @Schema(required = true, description = "")
      @NotNull

    public List<String> getWorkingHours() {
    return workingHours;
  }

  public void setWorkingHours(List<String> workingHours) {
    this.workingHours = workingHours;
  }

  public GetCourierMetaInfoResponse rating(Integer rating) {
    this.rating = rating;
    return this;
  }

  /**
   * Get rating
   * @return rating
   **/
  @Schema(description = "")
  
    public Integer getRating() {
    return rating;
  }

  public void setRating(Integer rating) {
    this.rating = rating;
  }

  public GetCourierMetaInfoResponse earnings(Integer earnings) {
    this.earnings = earnings;
    return this;
  }

  /**
   * Get earnings
   * @return earnings
   **/
  @Schema(description = "")
  
    public Integer getEarnings() {
    return earnings;
  }

  public void setEarnings(Integer earnings) {
    this.earnings = earnings;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetCourierMetaInfoResponse getCourierMetaInfoResponse = (GetCourierMetaInfoResponse) o;
    return Objects.equals(this.courierId, getCourierMetaInfoResponse.courierId) &&
        Objects.equals(this.courierType, getCourierMetaInfoResponse.courierType) &&
        Objects.equals(this.regions, getCourierMetaInfoResponse.regions) &&
        Objects.equals(this.workingHours, getCourierMetaInfoResponse.workingHours) &&
        Objects.equals(this.rating, getCourierMetaInfoResponse.rating) &&
        Objects.equals(this.earnings, getCourierMetaInfoResponse.earnings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(courierId, courierType, regions, workingHours, rating, earnings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCourierMetaInfoResponse {\n");
    
    sb.append("    courierId: ").append(toIndentedString(courierId)).append("\n");
    sb.append("    courierType: ").append(toIndentedString(courierType)).append("\n");
    sb.append("    regions: ").append(toIndentedString(regions)).append("\n");
    sb.append("    workingHours: ").append(toIndentedString(workingHours)).append("\n");
    sb.append("    rating: ").append(toIndentedString(rating)).append("\n");
    sb.append("    earnings: ").append(toIndentedString(earnings)).append("\n");
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
