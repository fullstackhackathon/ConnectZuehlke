# Insight API
To view the insight API specification please execute:

```
docker run -d -p 8090:8080 -e API_URL=https://insight.zuehlke.com/swagger/docs/v1 swaggerapi/swagger-ui
open http://localhost:8090
```

> Please make sure that you are connected to the internal VPN, otherwise you will not be able to connect to the Insight Swagger Documentation.

