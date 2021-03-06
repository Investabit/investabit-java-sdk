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
import io.swagger.client.model.PublicSummaryResponseColor;
import io.swagger.client.model.PublicTrendResponseDataTrend;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * PublicSummaryResponseData
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-24T00:55:27.805-04:00")



public class PublicSummaryResponseData {
  @SerializedName("icon")
  private String icon = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("symbol_name")
  private String symbolName = null;

  @SerializedName("slug")
  private String slug = null;

  @SerializedName("added")
  private BigDecimal added = null;

  @SerializedName("color")
  private PublicSummaryResponseColor color = null;

  @SerializedName("price_btc")
  private BigDecimal priceBtc = null;

  @SerializedName("price_usd")
  private BigDecimal priceUsd = null;

  @SerializedName("market_cap")
  private BigDecimal marketCap = null;

  @SerializedName("volume_usd")
  private BigDecimal volumeUsd = null;

  @SerializedName("change_pct")
  private BigDecimal changePct = null;

  @SerializedName("market_data_time")
  private BigDecimal marketDataTime = null;

  @SerializedName("trend")
  private List<PublicTrendResponseDataTrend> trend = new ArrayList<PublicTrendResponseDataTrend>();

  public PublicSummaryResponseData icon(String icon) {
    this.icon = icon;
    return this;
  }

   /**
   * Get icon
   * @return icon
  **/
  @ApiModelProperty(required = true, value = "")
  public String getIcon() {
    return icon;
  }

  public void setIcon(String icon) {
    this.icon = icon;
  }

  public PublicSummaryResponseData name(String name) {
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

  public PublicSummaryResponseData symbolName(String symbolName) {
    this.symbolName = symbolName;
    return this;
  }

   /**
   * Get symbolName
   * @return symbolName
  **/
  @ApiModelProperty(required = true, value = "")
  public String getSymbolName() {
    return symbolName;
  }

  public void setSymbolName(String symbolName) {
    this.symbolName = symbolName;
  }

  public PublicSummaryResponseData slug(String slug) {
    this.slug = slug;
    return this;
  }

   /**
   * Get slug
   * @return slug
  **/
  @ApiModelProperty(required = true, value = "")
  public String getSlug() {
    return slug;
  }

  public void setSlug(String slug) {
    this.slug = slug;
  }

  public PublicSummaryResponseData added(BigDecimal added) {
    this.added = added;
    return this;
  }

   /**
   * Get added
   * @return added
  **/
  @ApiModelProperty(required = true, value = "")
  public BigDecimal getAdded() {
    return added;
  }

  public void setAdded(BigDecimal added) {
    this.added = added;
  }

  public PublicSummaryResponseData color(PublicSummaryResponseColor color) {
    this.color = color;
    return this;
  }

   /**
   * Get color
   * @return color
  **/
  @ApiModelProperty(required = true, value = "")
  public PublicSummaryResponseColor getColor() {
    return color;
  }

  public void setColor(PublicSummaryResponseColor color) {
    this.color = color;
  }

  public PublicSummaryResponseData priceBtc(BigDecimal priceBtc) {
    this.priceBtc = priceBtc;
    return this;
  }

   /**
   * Get priceBtc
   * @return priceBtc
  **/
  @ApiModelProperty(required = true, value = "")
  public BigDecimal getPriceBtc() {
    return priceBtc;
  }

  public void setPriceBtc(BigDecimal priceBtc) {
    this.priceBtc = priceBtc;
  }

  public PublicSummaryResponseData priceUsd(BigDecimal priceUsd) {
    this.priceUsd = priceUsd;
    return this;
  }

   /**
   * Get priceUsd
   * @return priceUsd
  **/
  @ApiModelProperty(required = true, value = "")
  public BigDecimal getPriceUsd() {
    return priceUsd;
  }

  public void setPriceUsd(BigDecimal priceUsd) {
    this.priceUsd = priceUsd;
  }

  public PublicSummaryResponseData marketCap(BigDecimal marketCap) {
    this.marketCap = marketCap;
    return this;
  }

   /**
   * Get marketCap
   * @return marketCap
  **/
  @ApiModelProperty(required = true, value = "")
  public BigDecimal getMarketCap() {
    return marketCap;
  }

  public void setMarketCap(BigDecimal marketCap) {
    this.marketCap = marketCap;
  }

  public PublicSummaryResponseData volumeUsd(BigDecimal volumeUsd) {
    this.volumeUsd = volumeUsd;
    return this;
  }

   /**
   * Get volumeUsd
   * @return volumeUsd
  **/
  @ApiModelProperty(required = true, value = "")
  public BigDecimal getVolumeUsd() {
    return volumeUsd;
  }

  public void setVolumeUsd(BigDecimal volumeUsd) {
    this.volumeUsd = volumeUsd;
  }

  public PublicSummaryResponseData changePct(BigDecimal changePct) {
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

  public PublicSummaryResponseData marketDataTime(BigDecimal marketDataTime) {
    this.marketDataTime = marketDataTime;
    return this;
  }

   /**
   * Get marketDataTime
   * @return marketDataTime
  **/
  @ApiModelProperty(required = true, value = "")
  public BigDecimal getMarketDataTime() {
    return marketDataTime;
  }

  public void setMarketDataTime(BigDecimal marketDataTime) {
    this.marketDataTime = marketDataTime;
  }

  public PublicSummaryResponseData trend(List<PublicTrendResponseDataTrend> trend) {
    this.trend = trend;
    return this;
  }

  public PublicSummaryResponseData addTrendItem(PublicTrendResponseDataTrend trendItem) {
    this.trend.add(trendItem);
    return this;
  }

   /**
   * Get trend
   * @return trend
  **/
  @ApiModelProperty(required = true, value = "")
  public List<PublicTrendResponseDataTrend> getTrend() {
    return trend;
  }

  public void setTrend(List<PublicTrendResponseDataTrend> trend) {
    this.trend = trend;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PublicSummaryResponseData publicSummaryResponseData = (PublicSummaryResponseData) o;
    return Objects.equals(this.icon, publicSummaryResponseData.icon) &&
        Objects.equals(this.name, publicSummaryResponseData.name) &&
        Objects.equals(this.symbolName, publicSummaryResponseData.symbolName) &&
        Objects.equals(this.slug, publicSummaryResponseData.slug) &&
        Objects.equals(this.added, publicSummaryResponseData.added) &&
        Objects.equals(this.color, publicSummaryResponseData.color) &&
        Objects.equals(this.priceBtc, publicSummaryResponseData.priceBtc) &&
        Objects.equals(this.priceUsd, publicSummaryResponseData.priceUsd) &&
        Objects.equals(this.marketCap, publicSummaryResponseData.marketCap) &&
        Objects.equals(this.volumeUsd, publicSummaryResponseData.volumeUsd) &&
        Objects.equals(this.changePct, publicSummaryResponseData.changePct) &&
        Objects.equals(this.marketDataTime, publicSummaryResponseData.marketDataTime) &&
        Objects.equals(this.trend, publicSummaryResponseData.trend);
  }

  @Override
  public int hashCode() {
    return Objects.hash(icon, name, symbolName, slug, added, color, priceBtc, priceUsd, marketCap, volumeUsd, changePct, marketDataTime, trend);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PublicSummaryResponseData {\n");
    
    sb.append("    icon: ").append(toIndentedString(icon)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    symbolName: ").append(toIndentedString(symbolName)).append("\n");
    sb.append("    slug: ").append(toIndentedString(slug)).append("\n");
    sb.append("    added: ").append(toIndentedString(added)).append("\n");
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
    sb.append("    priceBtc: ").append(toIndentedString(priceBtc)).append("\n");
    sb.append("    priceUsd: ").append(toIndentedString(priceUsd)).append("\n");
    sb.append("    marketCap: ").append(toIndentedString(marketCap)).append("\n");
    sb.append("    volumeUsd: ").append(toIndentedString(volumeUsd)).append("\n");
    sb.append("    changePct: ").append(toIndentedString(changePct)).append("\n");
    sb.append("    marketDataTime: ").append(toIndentedString(marketDataTime)).append("\n");
    sb.append("    trend: ").append(toIndentedString(trend)).append("\n");
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

