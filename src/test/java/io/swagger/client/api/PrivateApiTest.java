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


package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.model.DefaultResponse;
import io.swagger.client.model.PrivateAccuracyResponse;
import io.swagger.client.model.PrivateForecastResponse;
import io.swagger.client.model.PrivateTrendTabularResponse;
import io.swagger.client.model.PublicTrendResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PrivateApi
 */
@Ignore
public class PrivateApiTest {

    private final PrivateApi api = new PrivateApi();

    
    /**
     * Accuracy
     *
     * The accuracy response contains the following attributes.  + &#x60;rmse&#x60; Root Mean Square Error  + &#x60;mae&#x60; Mean Absolute error  + &#x60;r2&#x60; R Squared  + &#x60;ci&#x60; Confidence Interval lower and upper error bounds
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void v1PrivateAccuracySymbolIntervalPeriodGetTest() throws ApiException {
        String symbol = null;
        String interval = null;
        String period = null;
        String cookie = null;
        String xCsrf = null;
        PrivateAccuracyResponse response = api.v1PrivateAccuracySymbolIntervalPeriodGet(symbol, interval, period, cookie, xCsrf);

        // TODO: test validations
    }
    
    /**
     * Forecast
     *
     * The forecast response contains a sequence of forecasts at the specified intervals, with the following attributes.  + &#x60;time_start&#x60; start time of the period the forecast is applicable for  + &#x60;time_end&#x60; end time of the period the forecast is applicable for  + &#x60;low&#x60; forecasted high during the period  + &#x60;high&#x60; forecasted low during the period  + &#x60;weighted_price&#x60; forecasted weighted price during the period  + &#x60;change_pct&#x60; percent change in price for forecasted weighted_price relative to current price  + &#x60;change_usd&#x60; dollar change in price for forecasted weighted_price relative to current price
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void v1PrivateForecastSymbolIntervalGetTest() throws ApiException {
        String symbol = null;
        String interval = null;
        String cookie = null;
        String xCsrf = null;
        PrivateForecastResponse response = api.v1PrivateForecastSymbolIntervalGet(symbol, interval, cookie, xCsrf);

        // TODO: test validations
    }
    
    /**
     * Trend
     *
     * The trend response contains a collection of forecasts for different intervals with the following attributes.  + &#x60;time_start&#x60; start time of the period the forecast is applicable for  + &#x60;time_end&#x60; end time of the period the forecast is applicable for  + &#x60;interval&#x60; interval in hours that the forecast is applicable for  + &#x60;weighted_price&#x60; forecasted weighted price during the period  + &#x60;change_pct&#x60; percent change in price for forecasted weighted_price relative to current price  + &#x60;change_usd&#x60; dollar change in price for forecasted weighted_price relative to current price
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void v1PrivateTrendSymbolGetTest() throws ApiException {
        String symbol = null;
        String cookie = null;
        String xCsrf = null;
        PublicTrendResponse response = api.v1PrivateTrendSymbolGet(symbol, cookie, xCsrf);

        // TODO: test validations
    }
    
    /**
     * Trend Tabular
     *
     * The trend tabular response contains a collection of forecasts for all supported cryptocurrencies at different intervals with the following attributes.  + &#x60;time_start&#x60; start time of the period the forecast is applicable for  + &#x60;time_end&#x60; end time of the period the forecast is applicable for  + &#x60;interval&#x60; interval in hours that the forecast is applicable for  + &#x60;weighted_price&#x60; forecasted weighted price during the period  + &#x60;change_pct&#x60; percent change in price for forecasted weighted_price relative to current price  + &#x60;change_usd&#x60; dollar change in price for forecasted weighted_price relative to current price
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void v1PrivateTrendTabularGetTest() throws ApiException {
        String cookie = null;
        String xCsrf = null;
        PrivateTrendTabularResponse response = api.v1PrivateTrendTabularGet(cookie, xCsrf);

        // TODO: test validations
    }
    
}