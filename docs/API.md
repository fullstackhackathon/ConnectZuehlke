# Insight API
To view the insight API specification please execute:

```

#Local swagger doc
docker run -d -p 8090:8080 -e "SWAGGER_JSON=/docs/insight.json" -v `pwd`/docs:/docs swaggerapi/swagger-ui

# OR remote sawagger doc
docker run -d -p 8090:8080 -e API_URL=https://insight.zuehlke.com/swagger/docs/v1 swaggerapi/swagger-ui

open http://localhost:8090
```

> Please make sure that you are connected to the internal VPN, otherwise you will not be able to connect to the Insight Swagger Documentation.

Please make sure, that you modify your run configuration to provide the credentials to access the Insight API.

To do so, please provide your username and password as overwrite parameters in your Spring Boot Devtools Property Configuration.


To do so, please create a file at the following location: `~/.spring-boot-devtools.properties` with the following content:

```
insight.authentication.username=szil
insight.authentication.password=<YOUR-PASSWORD>
```

> Please note: This file contains your Zuehlke Password in **plain text**.
> 
> Don't share it, don't commit it, don't even think about it!

For further reference, please read [Externalized Configuration](https://docs.spring.io/spring-boot/docs/current/reference/html/boot-features-external-config.html).
