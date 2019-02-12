package ch.zuehlke.fullstack.ConnectZuehlke.apis.insight.config;

import java.net.Authenticator;
import java.net.PasswordAuthentication;

public class InsightAuthentication extends Authenticator {

    private final String username;
    private final char[] password;

    InsightAuthentication(final String username, final char[] password) {
        super();
        this.username = username;
        this.password = password;
    }

    @Override
    public PasswordAuthentication getPasswordAuthentication() {
        return (new PasswordAuthentication(username, password));
    }
}