# PrivateApi

All URIs are relative to *https://api.cryptoweather.ai*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v1PrivateAccuracySymbolIntervalPeriodGet**](PrivateApi.md#v1PrivateAccuracySymbolIntervalPeriodGet) | **GET** /v1/private/accuracy/{symbol}/{interval}/{period} | Accuracy
[**v1PrivateForecastSymbolIntervalGet**](PrivateApi.md#v1PrivateForecastSymbolIntervalGet) | **GET** /v1/private/forecast/{symbol}/{interval} | Forecast
[**v1PrivateTrendSymbolGet**](PrivateApi.md#v1PrivateTrendSymbolGet) | **GET** /v1/private/trend/{symbol} | Trend
[**v1PrivateTrendTabularGet**](PrivateApi.md#v1PrivateTrendTabularGet) | **GET** /v1/private/trend-tabular | Trend Tabular


<a name="v1PrivateAccuracySymbolIntervalPeriodGet"></a>
# **v1PrivateAccuracySymbolIntervalPeriodGet**
> PrivateAccuracyResponse v1PrivateAccuracySymbolIntervalPeriodGet(symbol, interval, period, cookie, xCsrf)

Accuracy

The accuracy response contains the following attributes.  + &#x60;rmse&#x60; Root Mean Square Error  + &#x60;mae&#x60; Mean Absolute error  + &#x60;r2&#x60; R Squared  + &#x60;ci&#x60; Confidence Interval lower and upper error bounds

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PrivateApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

PrivateApi apiInstance = new PrivateApi();
String symbol = "btc"; // String | The cryptocurrency symbol.
String interval = "1h"; // String | The forecast interval, 1h or 1d.
String period = "7d"; // String | The period for computing the accuracy, such as the past 7 days.
String cookie = "csrf=b1820141-1bad-4a9c-93c0-52022817ce89"; // String | e.g. csrf=b1820141-1bad-4a9c-93c0-52022817ce89
String xCsrf = "b1820141-1bad-4a9c-93c0-52022817ce89"; // String | e.g. b1820141-1bad-4a9c-93c0-52022817ce89
try {
    PrivateAccuracyResponse result = apiInstance.v1PrivateAccuracySymbolIntervalPeriodGet(symbol, interval, period, cookie, xCsrf);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrivateApi#v1PrivateAccuracySymbolIntervalPeriodGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **String**| The cryptocurrency symbol. |
 **interval** | **String**| The forecast interval, 1h or 1d. |
 **period** | **String**| The period for computing the accuracy, such as the past 7 days. |
 **cookie** | **String**| e.g. csrf&#x3D;b1820141-1bad-4a9c-93c0-52022817ce89 | [optional]
 **xCsrf** | **String**| e.g. b1820141-1bad-4a9c-93c0-52022817ce89 | [optional]

### Return type

[**PrivateAccuracyResponse**](PrivateAccuracyResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="v1PrivateForecastSymbolIntervalGet"></a>
# **v1PrivateForecastSymbolIntervalGet**
> PrivateForecastResponse v1PrivateForecastSymbolIntervalGet(symbol, interval, cookie, xCsrf)

Forecast

The forecast response contains a sequence of forecasts at the specified intervals, with the following attributes.  + &#x60;time_start&#x60; start time of the period the forecast is applicable for  + &#x60;time_end&#x60; end time of the period the forecast is applicable for  + &#x60;low&#x60; forecasted high during the period  + &#x60;high&#x60; forecasted low during the period  + &#x60;weighted_price&#x60; forecasted weighted price during the period  + &#x60;change_pct&#x60; percent change in price for forecasted weighted_price relative to current price  + &#x60;change_usd&#x60; dollar change in price for forecasted weighted_price relative to current price

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PrivateApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

PrivateApi apiInstance = new PrivateApi();
String symbol = "btc"; // String | The cryptocurrency symbol.
String interval = "1h"; // String | The forecast interval, 1h or 1d.
String cookie = "csrf=b1820141-1bad-4a9c-93c0-52022817ce89"; // String | e.g. csrf=b1820141-1bad-4a9c-93c0-52022817ce89
String xCsrf = "b1820141-1bad-4a9c-93c0-52022817ce89"; // String | e.g. b1820141-1bad-4a9c-93c0-52022817ce89
try {
    PrivateForecastResponse result = apiInstance.v1PrivateForecastSymbolIntervalGet(symbol, interval, cookie, xCsrf);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrivateApi#v1PrivateForecastSymbolIntervalGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **String**| The cryptocurrency symbol. |
 **interval** | **String**| The forecast interval, 1h or 1d. |
 **cookie** | **String**| e.g. csrf&#x3D;b1820141-1bad-4a9c-93c0-52022817ce89 | [optional]
 **xCsrf** | **String**| e.g. b1820141-1bad-4a9c-93c0-52022817ce89 | [optional]

### Return type

[**PrivateForecastResponse**](PrivateForecastResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="v1PrivateTrendSymbolGet"></a>
# **v1PrivateTrendSymbolGet**
> PublicTrendResponse v1PrivateTrendSymbolGet(symbol, cookie, xCsrf)

Trend

The trend response contains a collection of forecasts for different intervals with the following attributes.  + &#x60;time_start&#x60; start time of the period the forecast is applicable for  + &#x60;time_end&#x60; end time of the period the forecast is applicable for  + &#x60;interval&#x60; interval in hours that the forecast is applicable for  + &#x60;weighted_price&#x60; forecasted weighted price during the period  + &#x60;change_pct&#x60; percent change in price for forecasted weighted_price relative to current price  + &#x60;change_usd&#x60; dollar change in price for forecasted weighted_price relative to current price

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PrivateApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

PrivateApi apiInstance = new PrivateApi();
String symbol = "btc"; // String | The cryptocurrency symbol.
String cookie = "csrf=b1820141-1bad-4a9c-93c0-52022817ce89"; // String | e.g. csrf=b1820141-1bad-4a9c-93c0-52022817ce89
String xCsrf = "b1820141-1bad-4a9c-93c0-52022817ce89"; // String | e.g. b1820141-1bad-4a9c-93c0-52022817ce89
try {
    PublicTrendResponse result = apiInstance.v1PrivateTrendSymbolGet(symbol, cookie, xCsrf);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrivateApi#v1PrivateTrendSymbolGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **String**| The cryptocurrency symbol. |
 **cookie** | **String**| e.g. csrf&#x3D;b1820141-1bad-4a9c-93c0-52022817ce89 | [optional]
 **xCsrf** | **String**| e.g. b1820141-1bad-4a9c-93c0-52022817ce89 | [optional]

### Return type

[**PublicTrendResponse**](PublicTrendResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="v1PrivateTrendTabularGet"></a>
# **v1PrivateTrendTabularGet**
> PrivateTrendTabularResponse v1PrivateTrendTabularGet(cookie, xCsrf)

Trend Tabular

The trend tabular response contains a collection of forecasts for all supported cryptocurrencies at different intervals with the following attributes.  + &#x60;time_start&#x60; start time of the period the forecast is applicable for  + &#x60;time_end&#x60; end time of the period the forecast is applicable for  + &#x60;interval&#x60; interval in hours that the forecast is applicable for  + &#x60;weighted_price&#x60; forecasted weighted price during the period  + &#x60;change_pct&#x60; percent change in price for forecasted weighted_price relative to current price  + &#x60;change_usd&#x60; dollar change in price for forecasted weighted_price relative to current price

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PrivateApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

PrivateApi apiInstance = new PrivateApi();
String cookie = "csrf=b1820141-1bad-4a9c-93c0-52022817ce89"; // String | e.g. csrf=b1820141-1bad-4a9c-93c0-52022817ce89
String xCsrf = "b1820141-1bad-4a9c-93c0-52022817ce89"; // String | e.g. b1820141-1bad-4a9c-93c0-52022817ce89
try {
    PrivateTrendTabularResponse result = apiInstance.v1PrivateTrendTabularGet(cookie, xCsrf);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrivateApi#v1PrivateTrendTabularGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cookie** | **String**| e.g. csrf&#x3D;b1820141-1bad-4a9c-93c0-52022817ce89 | [optional]
 **xCsrf** | **String**| e.g. b1820141-1bad-4a9c-93c0-52022817ce89 | [optional]

### Return type

[**PrivateTrendTabularResponse**](PrivateTrendTabularResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

