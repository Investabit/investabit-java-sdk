# swagger-java-client

Investabit
- API version: 
  - Build date: 2019-08-02T22:22:40.698-04:00

The Investabit API allows for access to all of the public facing services provided, including market data and forecasts.  ## General Overview  1. All API methods will be built to adhere to RESTful best practices as closely as possible. As such, all API calls will be made via the standard HTTP protocol using the GET/POST/PUT/DELETE request types.  2. Every request returns the status as a JSON response with the following   - success, true if it was successful   - code, the http status code (also in the response header)          200 if response is successful          400 if bad request          401 if authorization JWT is wrong or limit exceeded          404 wrong route          500 for any internal errors  - status, the status of the request, default **success**  - errors, an array of any relevant error details  3. For any requests that are not successful an error message is specified and returned as an array for the **errors** key in the JSON response.  4. All authentication uses JSON Web Tokens (JWT), which is set as the **Authorization** entry in the header, see the following for more details.     * http://jwt.io     * https://scotch.io/tutorials/the-anatomy-of-a-json-web-token


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
import io.swagger.client.api.PublicApi;

import java.io.File;
import java.util.*;

public class PublicApiExample {

    public static void main(String[] args) {
        
        PublicApi apiInstance = new PublicApi();
        String symbol = "\"btc\""; // String | The cryptocurrency symbol, provide `all` to get every symbol.
        try {
            PublicCurrentResponse result = apiInstance.v1PublicCurrentSymbolGet(symbol);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PublicApi#v1PublicCurrentSymbolGet");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://api.investabit.com*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*PublicApi* | [**v1PublicCurrentSymbolGet**](docs/PublicApi.md#v1PublicCurrentSymbolGet) | **GET** /v1/public/current/{symbol} | Current
*PublicApi* | [**v1PublicPriceChangeSymbolGet**](docs/PublicApi.md#v1PublicPriceChangeSymbolGet) | **GET** /v1/public/price-change/{symbol} | Price Change
*PublicApi* | [**v1PublicPriceHistorySymbolPeriodIntervalGet**](docs/PublicApi.md#v1PublicPriceHistorySymbolPeriodIntervalGet) | **GET** /v1/public/price-history/{symbol}/{period}/{interval} | Price History
*PublicApi* | [**v1PublicSymbolsGet**](docs/PublicApi.md#v1PublicSymbolsGet) | **GET** /v1/public/symbols | Symbols
*PublicApi* | [**v1PublicTrendSymbolGet**](docs/PublicApi.md#v1PublicTrendSymbolGet) | **GET** /v1/public/trend/{symbol} | Trend


## Documentation for Models

 - [CurrentRoute](docs/CurrentRoute.md)
 - [DefaultResponse](docs/DefaultResponse.md)
 - [PriceChangeRoute](docs/PriceChangeRoute.md)
 - [PriceHistoryRoute](docs/PriceHistoryRoute.md)
 - [PublicCurrentResponse](docs/PublicCurrentResponse.md)
 - [PublicCurrentResponseData](docs/PublicCurrentResponseData.md)
 - [PublicCurrentResponseDataCurrent](docs/PublicCurrentResponseDataCurrent.md)
 - [PublicPriceChangeResponse](docs/PublicPriceChangeResponse.md)
 - [PublicPriceChangeResponseData](docs/PublicPriceChangeResponseData.md)
 - [PublicPriceChangeResponseDataPriceChange](docs/PublicPriceChangeResponseDataPriceChange.md)
 - [PublicPriceHistoryResponse](docs/PublicPriceHistoryResponse.md)
 - [PublicPriceHistoryResponseData](docs/PublicPriceHistoryResponseData.md)
 - [PublicPriceHistoryResponseDataHistory](docs/PublicPriceHistoryResponseDataHistory.md)
 - [PublicPriceHistoryResponseDataPriceHistory](docs/PublicPriceHistoryResponseDataPriceHistory.md)
 - [PublicSymbolsResponse](docs/PublicSymbolsResponse.md)
 - [PublicSymbolsResponseData](docs/PublicSymbolsResponseData.md)
 - [PublicSymbolsResponseDataSymbols](docs/PublicSymbolsResponseDataSymbols.md)
 - [PublicTrendResponse](docs/PublicTrendResponse.md)
 - [PublicTrendResponseData](docs/PublicTrendResponseData.md)
 - [PublicTrendResponseDataTrend](docs/PublicTrendResponseDataTrend.md)
 - [SymbolsRoute](docs/SymbolsRoute.md)
 - [TrendRoute](docs/TrendRoute.md)


## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



