# PublicApi

All URIs are relative to *https://api.investabit.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v1PublicCurrentSymbolGet**](PublicApi.md#v1PublicCurrentSymbolGet) | **GET** /v1/public/current/{symbol} | Current
[**v1PublicPriceChangeSymbolGet**](PublicApi.md#v1PublicPriceChangeSymbolGet) | **GET** /v1/public/price-change/{symbol} | Price Change
[**v1PublicPriceHistorySymbolPeriodIntervalGet**](PublicApi.md#v1PublicPriceHistorySymbolPeriodIntervalGet) | **GET** /v1/public/price-history/{symbol}/{period}/{interval} | Price History
[**v1PublicSymbolsGet**](PublicApi.md#v1PublicSymbolsGet) | **GET** /v1/public/symbols | Symbols
[**v1PublicTrendSymbolGet**](PublicApi.md#v1PublicTrendSymbolGet) | **GET** /v1/public/trend/{symbol} | Trend


<a name="v1PublicCurrentSymbolGet"></a>
# **v1PublicCurrentSymbolGet**
> PublicCurrentResponse v1PublicCurrentSymbolGet(symbol)

Current



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PublicApi;


PublicApi apiInstance = new PublicApi();
String symbol = "\"btc\""; // String | The cryptocurrency symbol, provide `all` to get every symbol.
try {
    PublicCurrentResponse result = apiInstance.v1PublicCurrentSymbolGet(symbol);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PublicApi#v1PublicCurrentSymbolGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **String**| The cryptocurrency symbol, provide &#x60;all&#x60; to get every symbol. |

### Return type

[**PublicCurrentResponse**](PublicCurrentResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

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
String symbol = "\"btc\""; // String | The cryptocurrency symbol.
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
String symbol = "\"btc\""; // String | The cryptocurrency symbol, provide `all` to get every symbol.
String period = "\"30d\""; // String | The period to get data for, such as past 30 days.
String interval = "\"1d\""; // String | The bar interval, such as 1 day.
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



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PublicApi;


PublicApi apiInstance = new PublicApi();
String symbol = "\"btc\""; // String | The cryptocurrency symbol.
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
