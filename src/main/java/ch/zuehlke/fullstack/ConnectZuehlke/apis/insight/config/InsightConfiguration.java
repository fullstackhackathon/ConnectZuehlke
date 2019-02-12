package ch.zuehlke.fullstack.ConnectZuehlke.apis.insight.config;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

import java.net.Authenticator;

@Configuration
public class InsightConfiguration {
    @Value("${insight.authentication.username}")
    private String username;
    @Value("${insight.authentication.password}")
    private char[] password;
    @Value("{insight.url}")
    private String url;

    public Authenticator getAuthenticator() {
        if (StringUtils.isEmpty(username) || password == null || password.length == 0) {
            throw new IllegalArgumentException("Please provide the insight credentials.");
        }

        return new InsightAuthentication(username, password);
    }

    public String getUrl() {
        return url;
    }
}
