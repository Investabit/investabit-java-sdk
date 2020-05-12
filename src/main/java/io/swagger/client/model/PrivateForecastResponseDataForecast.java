/*
 * CryptoWeather
 * The CryptoWeather API allows for access to all of the cryptocurrency data and market forecast services provided. There are two primary categories of routes, `public` and `private`, where `public` routes are accessible to the general public and do not require API authentication, and `private` routes, which require API authentication.  ## General Overview  1. All API methods adhere to RESTful best practices as closely as possible. As such, all API calls will be made via the standard HTTP protocol using the GET/POST/PUT/DELETE request types.  2. Every request returns the status as a JSON response with the following:     - success, true if it was successful     - code, the http status code (also in the response header)         - 200 if response is successful         - 400 if bad request         - 401 if authorization JWT is wrong or limit exceeded         - 404 wrong route         - 500 for any internal errors     - status, the status of the request, default **success**     - errors, an array of any relevant error details  3. For any requests that are not successful an error message is specified and returned as an array for the **errors** key in the JSON response.  4. All authentication uses JSON Web Tokens (JWT), which is set as the **Authorization** entry in the header, see the following for more details.     - http://jwt.io     - https://scotch.io/tutorials/the-anatomy-of-a-json-web-token  ## Code Example  The following is a code example in Python, which demonstrates using the [Python Requests library](https://requests.readthedocs.io/en/master/) for both the `public` and `private` API routes.  ``` import requests  HOST = \"https://api.cryptoweather.ai/v1\"  # Your API key (JWT) API_KEY = \"<YOUR API KEY>\"  # Example public request, no API key required. requests.get(\"{}/public/symbols\".format(HOST)).json()  # Get the current btc price using the public route requests.get(\"{}/public/price-current/{}\".format(HOST, \"btc\")).json()   # Example private request, API key required. Get the btc hourly forecasts headers = {\"Authorization\": \"Bearer {}\".format(API_KEY)} requests.get(\"{}/private/forecast/{}/{}\".format(HOST, \"btc\", \"1h\"),              headers=headers).json() ```
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
 * PrivateForecastResponseDataForecast
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-11T15:47:40.106-04:00")
public class PrivateForecastResponseDataForecast {
  @SerializedName("time_start")
  private BigDecimal timeStart = null;

  @SerializedName("time_end")
  private BigDecimal timeEnd = null;

  @SerializedName("low")
  private BigDecimal low = null;

  @SerializedName("weighted_price")
  private BigDecimal weightedPrice = null;

  @SerializedName("high")
  private BigDecimal high = null;

  @SerializedName("confidence")
  private BigDecimal confidence = null;

  @SerializedName("change_usd")
  private BigDecimal changeUsd = null;

  @SerializedName("change_pct")
  private BigDecimal changePct = null;

  public PrivateForecastResponseDataForecast timeStart(BigDecimal timeStart) {
    this.timeStart = timeStart;
    return this;
  }

   /**
   * Get timeStart
   * @return timeStart
  **/
  @ApiModelProperty(required = true, value = "")
  public BigDecimal getTimeStart() {
    return timeStart;
  }

  public void setTimeStart(BigDecimal timeStart) {
    this.timeStart = timeStart;
  }

  public PrivateForecastResponseDataForecast timeEnd(BigDecimal timeEnd) {
    this.timeEnd = timeEnd;
    return this;
  }

   /**
   * Get timeEnd
   * @return timeEnd
  **/
  @ApiModelProperty(required = true, value = "")
  public BigDecimal getTimeEnd() {
    return timeEnd;
  }

  public void setTimeEnd(BigDecimal timeEnd) {
    this.timeEnd = timeEnd;
  }

  public PrivateForecastResponseDataForecast low(BigDecimal low) {
    this.low = low;
    return this;
  }

   /**
   * Get low
   * @return low
  **/
  @ApiModelProperty(required = true, value = "")
  public BigDecimal getLow() {
    return low;
  }

  public void setLow(BigDecimal low) {
    this.low = low;
  }

  public PrivateForecastResponseDataForecast weightedPrice(BigDecimal weightedPrice) {
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

  public PrivateForecastResponseDataForecast high(BigDecimal high) {
    this.high = high;
    return this;
  }

   /**
   * Get high
   * @return high
  **/
  @ApiModelProperty(required = true, value = "")
  public BigDecimal getHigh() {
    return high;
  }

  public void setHigh(BigDecimal high) {
    this.high = high;
  }

  public PrivateForecastResponseDataForecast confidence(BigDecimal confidence) {
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

  public PrivateForecastResponseDataForecast changeUsd(BigDecimal changeUsd) {
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

  public PrivateForecastResponseDataForecast changePct(BigDecimal changePct) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PrivateForecastResponseDataForecast privateForecastResponseDataForecast = (PrivateForecastResponseDataForecast) o;
    return Objects.equals(this.timeStart, privateForecastResponseDataForecast.timeStart) &&
        Objects.equals(this.timeEnd, privateForecastResponseDataForecast.timeEnd) &&
        Objects.equals(this.low, privateForecastResponseDataForecast.low) &&
        Objects.equals(this.weightedPrice, privateForecastResponseDataForecast.weightedPrice) &&
        Objects.equals(this.high, privateForecastResponseDataForecast.high) &&
        Objects.equals(this.confidence, privateForecastResponseDataForecast.confidence) &&
        Objects.equals(this.changeUsd, privateForecastResponseDataForecast.changeUsd) &&
        Objects.equals(this.changePct, privateForecastResponseDataForecast.changePct);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timeStart, timeEnd, low, weightedPrice, high, confidence, changeUsd, changePct);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PrivateForecastResponseDataForecast {\n");
    
    sb.append("    timeStart: ").append(toIndentedString(timeStart)).append("\n");
    sb.append("    timeEnd: ").append(toIndentedString(timeEnd)).append("\n");
    sb.append("    low: ").append(toIndentedString(low)).append("\n");
    sb.append("    weightedPrice: ").append(toIndentedString(weightedPrice)).append("\n");
    sb.append("    high: ").append(toIndentedString(high)).append("\n");
    sb.append("    confidence: ").append(toIndentedString(confidence)).append("\n");
    sb.append("    changeUsd: ").append(toIndentedString(changeUsd)).append("\n");
    sb.append("    changePct: ").append(toIndentedString(changePct)).append("\n");
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

