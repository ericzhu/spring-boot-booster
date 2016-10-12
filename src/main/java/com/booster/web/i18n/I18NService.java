package com.booster.web.i18n;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Service;

@Service
public class I18NService {

    @Autowired
    private MessageSource messageSource;

    /**
     * Returns a message for the given message key and the default locale is in the session context.
     * 
     * @param key The message key
     * @return The message
     */
    public String getMessage(String key) {
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
