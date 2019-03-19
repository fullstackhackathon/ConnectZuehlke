package ch.zuehlke.fullstack.ConnectZuehlke.apis.insight.config;

import org.apache.http.auth.AuthSchemeProvider;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.NTCredentials;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.client.config.AuthSchemes;
import org.apache.http.config.Registry;
import org.apache.http.config.RegistryBuilder;
import org.apache.http.impl.auth.BasicSchemeFactory;
import org.apache.http.impl.auth.NTLMSchemeFactory;
import org.apache.http.impl.client.BasicCredentialsProvider;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.http.converter.ByteArrayHttpMessageConverter;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RemoteInsightRestTemplateConfiguration {
    private Logger logger = LoggerFactory.getLogger(RemoteInsightRestTemplateConfiguration.class);

    @Bean()
    public RestTemplate getInsightRestTemplate(RestTemplateBuilder restTemplateBuilder, InsightProperties insightProperties) {
        RestTemplate restTemplate = restTemplateBuilder
                .rootUri(insightProperties.getUrl())
                .build();

        String user = insightProperties.getAuthentication().getUsername();
        String password = insightProperties.getAuthentication().getPassword();

        logger.info("Authenticating on Insight-API {} with {}:", insightProperties.getUrl(), user);

        CredentialsProvider credentialsProvider = new BasicCredentialsProvider();
        credentialsProvider.setCredentials(AuthScope.ANY, new NTCredentials(user, password, null, null));

        Registry<AuthSchemeProvider> authSchemeRegistry = RegistryBuilder.<AuthSchemeProvider>create()
                .register(AuthSchemes.NTLM, new NTLMSchemeFactory())
                .register(AuthSchemes.BASIC, new BasicSchemeFactory())
                .build();

        CloseableHttpClient httpclient = HttpClientBuilder.create()
                .setDefaultCredentialsProvider(credentialsProvider)
                .setDefaultAuthSchemeRegistry(authSchemeRegistry)
                .build();

        restTemplate.setRequestFactory(new HttpComponentsClientHttpRequestFactory(httpclient));

        restTemplate.getMessageConverters().add(new ByteArrayHttpMessageConverter());

        return restTemplate;
    }
}
