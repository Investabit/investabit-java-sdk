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
 * PublicSummaryResponseColor
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-24T00:55:27.805-04:00")



public class PublicSummaryResponseColor {
  @SerializedName("b")
  private BigDecimal b = null;

  @SerializedName("g")
  private BigDecimal g = null;

  @SerializedName("r")
  private BigDecimal r = null;

  public PublicSummaryResponseColor b(BigDecimal b) {
    this.b = b;
    return this;
  }

   /**
   * Get b
   * @return b
  **/
  @ApiModelProperty(required = true, value = "")
  public BigDecimal getB() {
    return b;
  }

  public void setB(BigDecimal b) {
    this.b = b;
  }

  public PublicSummaryResponseColor g(BigDecimal g) {
    this.g = g;
    return this;
  }

   /**
   * Get g
   * @return g
  **/
  @ApiModelProperty(required = true, value = "")
  public BigDecimal getG() {
    return g;
  }

  public void setG(BigDecimal g) {
    this.g = g;
  }

  public PublicSummaryResponseColor r(BigDecimal r) {
    this.r = r;
    return this;
  }

   /**
   * Get r
   * @return r
  **/
  @ApiModelProperty(required = true, value = "")
  public BigDecimal getR() {
    return r;
  }

  public void setR(BigDecimal r) {
    this.r = r;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PublicSummaryResponseColor publicSummaryResponseColor = (PublicSummaryResponseColor) o;
    return Objects.equals(this.b, publicSummaryResponseColor.b) &&
        Objects.equals(this.g, publicSummaryResponseColor.g) &&
        Objects.equals(this.r, publicSummaryResponseColor.r);
  }

  @Override
  public int hashCode() {
    return Objects.hash(b, g, r);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PublicSummaryResponseColor {\n");
    
    sb.append("    b: ").append(toIndentedString(b)).append("\n");
    sb.append("    g: ").append(toIndentedString(g)).append("\n");
    sb.append("    r: ").append(toIndentedString(r)).append("\n");
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

