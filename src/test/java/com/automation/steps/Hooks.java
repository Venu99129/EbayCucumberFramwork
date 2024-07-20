package com.automation.steps;


import com.automation.utils.DriverManager;
import com.automation.utils.PropertiesReader;
import io.cucumber.java.After;
import io.cucumber.java.Before;

import java.io.IOException;
import java.sql.Driver;

public class Hooks {

    @Before
    public void init() throws IOException {
        DriverManager.createDriver();
        PropertiesReader.loadFile();
    }

    @After
    public void close(){
        DriverManager.getDriver().quit();
    }
}
