# PublicApi

All URIs are relative to *https://api.cryptoweather.ai*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v1PublicPriceChangeSymbolGet**](PublicApi.md#v1PublicPriceChangeSymbolGet) | **GET** /v1/public/price-change/{symbol} | Price Change
[**v1PublicPriceCurrentSymbolGet**](PublicApi.md#v1PublicPriceCurrentSymbolGet) | **GET** /v1/public/price-current/{symbol} | Price Current
[**v1PublicPriceHistorySymbolPeriodIntervalGet**](PublicApi.md#v1PublicPriceHistorySymbolPeriodIntervalGet) | **GET** /v1/public/price-history/{symbol}/{period}/{interval} | Price History
[**v1PublicSymbolsGet**](PublicApi.md#v1PublicSymbolsGet) | **GET** /v1/public/symbols | Symbols
[**v1PublicTrendSymbolGet**](PublicApi.md#v1PublicTrendSymbolGet) | **GET** /v1/public/trend/{symbol} | Trend


<a name="v1PublicPriceChangeSymbolGet"></a>
# **v1PublicPriceChangeSymbolGet**
> PublicPriceChangeResponse v1PublicPriceChangeSymbolGet(symbol)

Price Change



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PublicApi;


PublicApi apiInstance = new PublicApi();
String symbol = "btc"; // String | The cryptocurrency symbol.
try {
    PublicPriceChangeResponse result = apiInstance.v1PublicPriceChangeSymbolGet(symbol);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PublicApi#v1PublicPriceChangeSymbolGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **String**| The cryptocurrency symbol. |

### Return type

[**PublicPriceChangeResponse**](PublicPriceChangeResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="v1PublicPriceCurrentSymbolGet"></a>
# **v1PublicPriceCurrentSymbolGet**
> PublicPriceCurrentResponse v1PublicPriceCurrentSymbolGet(symbol)

Price Current



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PublicApi;


PublicApi apiInstance = new PublicApi();
String symbol = "btc"; // String | The cryptocurrency symbol, provide `all` to get every symbol.
try {
    PublicPriceCurrentResponse result = apiInstance.v1PublicPriceCurrentSymbolGet(symbol);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PublicApi#v1PublicPriceCurrentSymbolGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **String**| The cryptocurrency symbol, provide &#x60;all&#x60; to get every symbol. |

### Return type

[**PublicPriceCurrentResponse**](PublicPriceCurrentResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="v1PublicPriceHistorySymbolPeriodIntervalGet"></a>
# **v1PublicPriceHistorySymbolPeriodIntervalGet**
> PublicPriceHistoryResponse v1PublicPriceHistorySymbolPeriodIntervalGet(symbol, period, interval)

Price History



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PublicApi;


PublicApi apiInstance = new PublicApi();
String symbol = "btc"; // String | The cryptocurrency symbol, provide `all` to get every symbol.
String period = "30d"; // String | The period to get data for, such as past 30 days.
String interval = "1d"; // String | The bar interval, such as 1 day.
try {
    PublicPriceHistoryResponse result = apiInstance.v1PublicPriceHistorySymbolPeriodIntervalGet(symbol, period, interval);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PublicApi#v1PublicPriceHistorySymbolPeriodIntervalGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **String**| The cryptocurrency symbol, provide &#x60;all&#x60; to get every symbol. |
 **period** | **String**| The period to get data for, such as past 30 days. |
 **interval** | **String**| The bar interval, such as 1 day. |

### Return type

[**PublicPriceHistoryResponse**](PublicPriceHistoryResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="v1PublicSymbolsGet"></a>
# **v1PublicSymbolsGet**
> PublicSymbolsResponse v1PublicSymbolsGet()

Symbols



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PublicApi;


PublicApi apiInstance = new PublicApi();
try {
    PublicSymbolsResponse result = apiInstance.v1PublicSymbolsGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PublicApi#v1PublicSymbolsGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**PublicSymbolsResponse**](PublicSymbolsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="v1PublicTrendSymbolGet"></a>
# **v1PublicTrendSymbolGet**
> PublicTrendResponse v1PublicTrendSymbolGet(symbol)

Trend

The trend response contains a collection of forecasts for different intervals with the following attributes.  + &#x60;time_start&#x60; start time of the period the forecast is applicable for  + &#x60;time_end&#x60; end time of the period the forecast is applicable for  + &#x60;interval&#x60; interval in hours that the forecast is applicable for  + &#x60;weighted_price&#x60; forecasted weighted price during the period  + &#x60;change_pct&#x60; percent change in price for forecasted weighted_price relative to current price  + &#x60;change_usd&#x60; dollar change in price for forecasted weighted_price relative to current price

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PublicApi;


PublicApi apiInstance = new PublicApi();
String symbol = "btc"; // String | The cryptocurrency symbol.
try {
    PublicTrendResponse result = apiInstance.v1PublicTrendSymbolGet(symbol);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PublicApi#v1PublicTrendSymbolGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **String**| The cryptocurrency symbol. |

### Return type

[**PublicTrendResponse**](PublicTrendResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

