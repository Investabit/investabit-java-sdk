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
 * PublicPriceCurrentResponseDataCurrent
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-02-03T10:36:25.366-05:00")
public class PublicPriceCurrentResponseDataCurrent {
  @SerializedName("symbol")
  private String symbol = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("price")
  private BigDecimal price = null;

  @SerializedName("change_usd")
  private BigDecimal changeUsd = null;

  @SerializedName("change_pct")
  private BigDecimal changePct = null;

  public PublicPriceCurrentResponseDataCurrent symbol(String symbol) {
    this.symbol = symbol;
    return this;
  }

   /**
   * Get symbol
   * @return symbol
  **/
  @ApiModelProperty(required = true, value = "")
  public String getSymbol() {
    return symbol;
  }

  public void setSymbol(String symbol) {
    this.symbol = symbol;
  }

  public PublicPriceCurrentResponseDataCurrent name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(required = true, value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PublicPriceCurrentResponseDataCurrent price(BigDecimal price) {
    this.price = price;
    return this;
  }

   /**
   * Get price
   * @return price
  **/
  @ApiModelProperty(required = true, value = "")
  public BigDecimal getPrice() {
    return price;
  }

  public void setPrice(BigDecimal price) {
    this.price = price;
  }

  public PublicPriceCurrentResponseDataCurrent changeUsd(BigDecimal changeUsd) {
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

  public PublicPriceCurrentResponseDataCurrent changePct(BigDecimal changePct) {
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
    PublicPriceCurrentResponseDataCurrent publicPriceCurrentResponseDataCurrent = (PublicPriceCurrentResponseDataCurrent) o;
    return Objects.equals(this.symbol, publicPriceCurrentResponseDataCurrent.symbol) &&
        Objects.equals(this.name, publicPriceCurrentResponseDataCurrent.name) &&
        Objects.equals(this.price, publicPriceCurrentResponseDataCurrent.price) &&
        Objects.equals(this.changeUsd, publicPriceCurrentResponseDataCurrent.changeUsd) &&
        Objects.equals(this.changePct, publicPriceCurrentResponseDataCurrent.changePct);
  }

  @Override
  public int hashCode() {
    return Objects.hash(symbol, name, price, changeUsd, changePct);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PublicPriceCurrentResponseDataCurrent {\n");
    
    sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
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

