/*
 * Investabit
 * The Investabit API allows for access to all of the public facing services provided, including market data and forecasts.  ## General Overview  1. All API methods will be built to adhere to RESTful best practices as closely as possible. As such, all API calls will be made via the standard HTTP protocol using the GET/POST/PUT/DELETE request types.  2. Every request returns the status as a JSON response with the following   - success, true if it was successful   - code, the http status code (also in the response header)          200 if response is successful          400 if bad request          401 if authorization JWT is wrong or limit exceeded          404 wrong route          500 for any internal errors  - status, the status of the request, default **success**  - errors, an array of any relevant error details  3. For any requests that are not successful an error message is specified and returned as an array for the **errors** key in the JSON response.  4. All authentication uses JSON Web Tokens (JWT), which is set as the **Authorization** entry in the header, see the following for more details.     * http://jwt.io     * https://scotch.io/tutorials/the-anatomy-of-a-json-web-token
 *
 * OpenAPI spec version: 
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;

/**
 * PublicTrendResponseDataTrend
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-08-02T22:22:40.698-04:00")
public class PublicTrendResponseDataTrend {
  @SerializedName("interval")
  private String interval = null;

  @SerializedName("weighted_price")
  private BigDecimal weightedPrice = null;

  @SerializedName("change_usd")
  private BigDecimal changeUsd = null;

  @SerializedName("change_pct")
  private BigDecimal changePct = null;

  @SerializedName("confidence")
  private BigDecimal confidence = null;

  public PublicTrendResponseDataTrend interval(String interval) {
    this.interval = interval;
    return this;
  }

   /**
   * Get interval
   * @return interval
  **/
  @ApiModelProperty(required = true, value = "")
  public String getInterval() {
    return interval;
  }

  public void setInterval(String interval) {
    this.interval = interval;
  }

  public PublicTrendResponseDataTrend weightedPrice(BigDecimal weightedPrice) {
    this.weightedPrice = weightedPrice;
    return this;
  }

   /**
   * Get weightedPrice
   * @return weightedPrice
  **/
  @ApiModelProperty(required = true, value = "")
  public BigDecimal getWeightedPrice() {
    return weightedPrice;
  }

  public void setWeightedPrice(BigDecimal weightedPrice) {
    this.weightedPrice = weightedPrice;
  }

  public PublicTrendResponseDataTrend changeUsd(BigDecimal changeUsd) {
    this.changeUsd = changeUsd;
    return this;
  }

   /**
   * Get changeUsd
   * @return changeUsd
  **/
  @ApiModelProperty(required = true, value = "")
  public BigDecimal getChangeUsd() {
    return changeUsd;
  }

  public void setChangeUsd(BigDecimal changeUsd) {
    this.changeUsd = changeUsd;
  }

  public PublicTrendResponseDataTrend changePct(BigDecimal changePct) {
    this.changePct = changePct;
    return this;
  }

   /**
   * Get changePct
   * @return changePct
  **/
  @ApiModelProperty(required = true, value = "")
  public BigDecimal getChangePct() {
    return changePct;
  }

  public void setChangePct(BigDecimal changePct) {
    this.changePct = changePct;
  }

  public PublicTrendResponseDataTrend confidence(BigDecimal confidence) {
    this.confidence = confidence;
    return this;
  }

   /**
   * Get confidence
   * @return confidence
  **/
  @ApiModelProperty(required = true, value = "")
  public BigDecimal getConfidence() {
    return confidence;
  }

  public void setConfidence(BigDecimal confidence) {
    this.confidence = confidence;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PublicTrendResponseDataTrend publicTrendResponseDataTrend = (PublicTrendResponseDataTrend) o;
    return Objects.equals(this.interval, publicTrendResponseDataTrend.interval) &&
        Objects.equals(this.weightedPrice, publicTrendResponseDataTrend.weightedPrice) &&
        Objects.equals(this.changeUsd, publicTrendResponseDataTrend.changeUsd) &&
        Objects.equals(this.changePct, publicTrendResponseDataTrend.changePct) &&
        Objects.equals(this.confidence, publicTrendResponseDataTrend.confidence);
  }

  @Override
  public int hashCode() {
    return Objects.hash(interval, weightedPrice, changeUsd, changePct, confidence);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PublicTrendResponseDataTrend {\n");
    
    sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
    sb.append("    weightedPrice: ").append(toIndentedString(weightedPrice)).append("\n");
    sb.append("    changeUsd: ").append(toIndentedString(changeUsd)).append("\n");
    sb.append("    changePct: ").append(toIndentedString(changePct)).append("\n");
    sb.append("    confidence: ").append(toIndentedString(confidence)).append("\n");
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

