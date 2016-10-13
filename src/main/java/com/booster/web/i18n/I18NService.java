package com.booster.web.i18n;

import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Service;

@Service
public class I18NService {

    private static final Logger LOGGER = LoggerFactory.getLogger(I18NService.class);

    @Autowired
    private MessageSource       messageSource;

    /**
     * Returns a message for the given message key and the default locale is in the session context.
     * 
     * @param key The message key
     * @return The message
     */
    public String getMessage(String key) {
        
        LOGGER.info("Returning message for key: {}", key);
        
        Locale locale = LocaleContextHolder.getLocale();
        return getMessage(key, locale);
    }

    /**
     * Returns a message for the given message key and locale.
     * 
     * @param key The message key
     * @param locale The locale
     * @return The message
     */
    public String getMessage(String key, Locale locale) {
        return messageSource.getMessage(key, null, locale);
    }
}
