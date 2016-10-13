package com.booster;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.booster.web.i18n.I18NService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootBoosterApplicationTests {

    @Autowired
    private I18NService i18NService;

    @Test
    public void contextLoads() {}

    @Test
    public void testGetMessage() {
        String message = "Bootstrap starter template";
        Assert.assertEquals(message, i18NService.getMessage("index.h1.text"));
    }

}
