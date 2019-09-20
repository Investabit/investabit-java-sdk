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


package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.model.DefaultResponse;
import io.swagger.client.model.PublicPriceChangeResponse;
import io.swagger.client.model.PublicPriceCurrentResponse;
import io.swagger.client.model.PublicPriceHistoryResponse;
import io.swagger.client.model.PublicSymbolsResponse;
import io.swagger.client.model.PublicTrendResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PublicApi
 */
@Ignore
public class PublicApiTest {

    private final PublicApi api = new PublicApi();

    
    /**
     * Price Change
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void v1PublicPriceChangeSymbolGetTest() throws ApiException {
        String symbol = null;
        PublicPriceChangeResponse response = api.v1PublicPriceChangeSymbolGet(symbol);

        // TODO: test validations
    }
    
    /**
     * Price Current
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void v1PublicPriceCurrentSymbolGetTest() throws ApiException {
        String symbol = null;
        PublicPriceCurrentResponse response = api.v1PublicPriceCurrentSymbolGet(symbol);

        // TODO: test validations
    }
    
    /**
     * Price History
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void v1PublicPriceHistorySymbolPeriodIntervalGetTest() throws ApiException {
        String symbol = null;
        String period = null;
        String interval = null;
        PublicPriceHistoryResponse response = api.v1PublicPriceHistorySymbolPeriodIntervalGet(symbol, period, interval);

        // TODO: test validations
    }
    
    /**
     * Symbols
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void v1PublicSymbolsGetTest() throws ApiException {
        PublicSymbolsResponse response = api.v1PublicSymbolsGet();

        // TODO: test validations
    }
    
    /**
     * Trend
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void v1PublicTrendSymbolGetTest() throws ApiException {
        String symbol = null;
        PublicTrendResponse response = api.v1PublicTrendSymbolGet(symbol);

        // TODO: test validations
    }
    
}
