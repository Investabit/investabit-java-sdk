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
import io.swagger.client.model.PublicPriceCurrentResponseDataCurrent;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * PublicPriceCurrentResponseData
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-09-18T12:37:05.120-04:00")
public class PublicPriceCurrentResponseData {
  @SerializedName("current")
  private List<PublicPriceCurrentResponseDataCurrent> current = new ArrayList<PublicPriceCurrentResponseDataCurrent>();

  public PublicPriceCurrentResponseData current(List<PublicPriceCurrentResponseDataCurrent> current) {
    this.current = current;
    return this;
  }

  public PublicPriceCurrentResponseData addCurrentItem(PublicPriceCurrentResponseDataCurrent currentItem) {
    this.current.add(currentItem);
    return this;
  }

   /**
   * Get current
   * @return current
  **/
  @ApiModelProperty(required = true, value = "")
  public List<PublicPriceCurrentResponseDataCurrent> getCurrent() {
    return current;
  }

  public void setCurrent(List<PublicPriceCurrentResponseDataCurrent> current) {
    this.current = current;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PublicPriceCurrentResponseData publicPriceCurrentResponseData = (PublicPriceCurrentResponseData) o;
    return Objects.equals(this.current, publicPriceCurrentResponseData.current);
  }

  @Override
  public int hashCode() {
    return Objects.hash(current);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PublicPriceCurrentResponseData {\n");
    
    sb.append("    current: ").append(toIndentedString(current)).append("\n");
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
