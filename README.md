# swagger-java-client

CryptoWeather
- API version: 
  - Build date: 2020-02-03T13:09:07.641-05:00

The CryptoWeather API allows for access to all of the cryptocurrency data and market forecast services provided. There are two primary categories of routes, `public` and `private`, where `public` routes are accessible to the general public and do not require API authentication, and `private` routes, which require API authentication.  ## General Overview  1. All API methods adhere to RESTful best practices as closely as possible. As such, all API calls will be made via the standard HTTP protocol using the GET/POST/PUT/DELETE request types.  2. Every request returns the status as a JSON response with the following:     - success, true if it was successful     - code, the http status code (also in the response header)         - 200 if response is successful         - 400 if bad request         - 401 if authorization JWT is wrong or limit exceeded         - 404 wrong route         - 500 for any internal errors     - status, the status of the request, default **success**     - errors, an array of any relevant error details  3. For any requests that are not successful an error message is specified and returned as an array for the **errors** key in the JSON response.  4. All authentication uses JSON Web Tokens (JWT), which is set as the **Authorization** entry in the header, see the following for more details.     - http://jwt.io     - https://scotch.io/tutorials/the-anatomy-of-a-json-web-token  ## Code Example  The following is a code example in Python, which demonstrates using the [Python Requests library](https://requests.readthedocs.io/en/master/) for both the `public` and `private` API routes.  ``` import requests  HOST = \"https://api.cryptoweather.ai/v1\"  # Your API key (JWT) API_KEY = \"<YOUR API KEY>\"  # Example public request, no API key required. requests.get(\"{}/public/symbols\".format(HOST)).json()  # Get the current btc price using the public route requests.get(\"{}/public/price-current/{}\".format(HOST, \"btc\")).json()   # Example private request, API key required. Get the btc hourly forecasts headers = {\"Authorization\": \"Bearer {}\".format(API_KEY)} requests.get(\"{}/private/forecast/{}/{}\".format(HOST, \"btc\", \"1h\"),              headers=headers).json() ```


*Automatically generated by the [Swagger Codegen](https://github.com/swagger-api/swagger-codegen)*


## Requirements

Building the API client library requires:
1. Java 1.7+
2. Maven/Gradle

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>io.swagger</groupId>
  <artifactId>swagger-java-client</artifactId>
  <version>1.0.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.swagger:swagger-java-client:1.0.0"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/swagger-java-client-1.0.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.PrivateApi;

import java.io.File;
import java.util.*;

public class PrivateApiExample {

    public static void main(String[] args) {
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
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://api.cryptoweather.ai*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*PrivateApi* | [**v1PrivateAccuracySymbolIntervalPeriodGet**](docs/PrivateApi.md#v1PrivateAccuracySymbolIntervalPeriodGet) | **GET** /v1/private/accuracy/{symbol}/{interval}/{period} | Accuracy
*PrivateApi* | [**v1PrivateForecastSymbolIntervalGet**](docs/PrivateApi.md#v1PrivateForecastSymbolIntervalGet) | **GET** /v1/private/forecast/{symbol}/{interval} | Forecast
*PrivateApi* | [**v1PrivateTrendSymbolGet**](docs/PrivateApi.md#v1PrivateTrendSymbolGet) | **GET** /v1/private/trend/{symbol} | Trend
*PrivateApi* | [**v1PrivateTrendTabularGet**](docs/PrivateApi.md#v1PrivateTrendTabularGet) | **GET** /v1/private/trend-tabular | Trend Tabular
*PublicApi* | [**v1PublicPriceChangeSymbolGet**](docs/PublicApi.md#v1PublicPriceChangeSymbolGet) | **GET** /v1/public/price-change/{symbol} | Price Change
*PublicApi* | [**v1PublicPriceCurrentSymbolGet**](docs/PublicApi.md#v1PublicPriceCurrentSymbolGet) | **GET** /v1/public/price-current/{symbol} | Price Current
*PublicApi* | [**v1PublicPriceHistorySymbolPeriodIntervalGet**](docs/PublicApi.md#v1PublicPriceHistorySymbolPeriodIntervalGet) | **GET** /v1/public/price-history/{symbol}/{period}/{interval} | Price History
*PublicApi* | [**v1PublicSummaryGet**](docs/PublicApi.md#v1PublicSummaryGet) | **GET** /v1/public/summary | Summary
*PublicApi* | [**v1PublicSymbolsGet**](docs/PublicApi.md#v1PublicSymbolsGet) | **GET** /v1/public/symbols | Symbols
*PublicApi* | [**v1PublicTrendSymbolGet**](docs/PublicApi.md#v1PublicTrendSymbolGet) | **GET** /v1/public/trend/{symbol} | Trend


## Documentation for Models

 - [AccuracyRoute](docs/AccuracyRoute.md)
 - [DefaultResponse](docs/DefaultResponse.md)
 - [ForecastRoute](docs/ForecastRoute.md)
 - [PriceChangeRoute](docs/PriceChangeRoute.md)
 - [PriceCurrentRoute](docs/PriceCurrentRoute.md)
 - [PriceHistoryRoute](docs/PriceHistoryRoute.md)
 - [PrivateAccuracyResponse](docs/PrivateAccuracyResponse.md)
 - [PrivateAccuracyResponseData](docs/PrivateAccuracyResponseData.md)
 - [PrivateForecastResponse](docs/PrivateForecastResponse.md)
 - [PrivateForecastResponseData](docs/PrivateForecastResponseData.md)
 - [PrivateForecastResponseDataForecast](docs/PrivateForecastResponseDataForecast.md)
 - [PrivateTrendTabularResponse](docs/PrivateTrendTabularResponse.md)
 - [PrivateTrendTabularResponseData](docs/PrivateTrendTabularResponseData.md)
 - [PrivateTrendTabularResponseDataTrendTabular](docs/PrivateTrendTabularResponseDataTrendTabular.md)
 - [PublicPriceChangeResponse](docs/PublicPriceChangeResponse.md)
 - [PublicPriceChangeResponseData](docs/PublicPriceChangeResponseData.md)
 - [PublicPriceChangeResponseDataPriceChange](docs/PublicPriceChangeResponseDataPriceChange.md)
 - [PublicPriceCurrentResponse](docs/PublicPriceCurrentResponse.md)
 - [PublicPriceCurrentResponseData](docs/PublicPriceCurrentResponseData.md)
 - [PublicPriceCurrentResponseDataCurrent](docs/PublicPriceCurrentResponseDataCurrent.md)
 - [PublicPriceHistoryResponse](docs/PublicPriceHistoryResponse.md)
 - [PublicPriceHistoryResponseData](docs/PublicPriceHistoryResponseData.md)
 - [PublicPriceHistoryResponseDataHistory](docs/PublicPriceHistoryResponseDataHistory.md)
 - [PublicPriceHistoryResponseDataPriceHistory](docs/PublicPriceHistoryResponseDataPriceHistory.md)
 - [PublicSummaryResponse](docs/PublicSummaryResponse.md)
 - [PublicSummaryResponseColor](docs/PublicSummaryResponseColor.md)
 - [PublicSummaryResponseData](docs/PublicSummaryResponseData.md)
 - [PublicSymbolsResponse](docs/PublicSymbolsResponse.md)
 - [PublicSymbolsResponseData](docs/PublicSymbolsResponseData.md)
 - [PublicSymbolsResponseDataSymbols](docs/PublicSymbolsResponseDataSymbols.md)
 - [PublicTrendResponse](docs/PublicTrendResponse.md)
 - [PublicTrendResponseData](docs/PublicTrendResponseData.md)
 - [PublicTrendResponseDataTrend](docs/PublicTrendResponseDataTrend.md)
 - [SummaryRoute](docs/SummaryRoute.md)
 - [SymbolsRoute](docs/SymbolsRoute.md)
 - [TrendRoute](docs/TrendRoute.md)
 - [TrendTabluarRoute](docs/TrendTabluarRoute.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### oauth2

- **Type**: OAuth
- **Flow**: accessCode
- **Authorization URL**: 
- **Scopes**: N/A


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



