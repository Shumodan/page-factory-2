package ru.sbtqa.tag.pagefactory.mobile.stepdefs;

import cucumber.api.java.Before;
import ru.sbtqa.tag.pagefactory.environment.Environment;
import ru.sbtqa.tag.pagefactory.mobile.drivers.MobileDriverService;

public class MobileSetupStepDefs {

    @Before(order = 1)
    public void setUp() {
        Environment.setDriverService(new MobileDriverService());
    }
}
