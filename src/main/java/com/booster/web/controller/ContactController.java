package com.booster.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.booster.web.domain.frontend.Feedback;

@Controller
@RequestMapping(value = "/contact")
public class ContactController {

    private static final Logger LOGGER               = LoggerFactory.getLogger(ContactController.class);

    public static final String  CONTACT_US_VIEW_NAME = "contact/contact";

    public static final String  CONTACT_MODEL_KEY    = "feedback";

    @RequestMapping(method = RequestMethod.GET)
    public String contactPage(Model model) {
        model.addAttribute(CONTACT_MODEL_KEY, new Feedback());
        return CONTACT_US_VIEW_NAME;
    }

    @RequestMapping(method = RequestMethod.POST)
    public String createContact(Feedback feedback) {
        LOGGER.info(feedback.toString());
        return CONTACT_US_VIEW_NAME;
    }
}
