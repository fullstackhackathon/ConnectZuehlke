package ch.zuehlke.fullstack.ConnectZuehlke.config;

import org.springframework.boot.autoconfigure.web.servlet.error.ErrorViewResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.web.servlet.ModelAndView;

import java.util.Collections;

@Configuration
public class GlobalSpringConfiguration {

    // Make angular html 5 routing work
    @Bean
    ErrorViewResolver supportPathBasedLocationStrategyWithoutHashes() {
        return (request, status, model) -> status == HttpStatus.NOT_FOUND
                ? new ModelAndView("/index.html", Collections.<String, Object>emptyMap(), HttpStatus.OK)
                : null;
    }
}