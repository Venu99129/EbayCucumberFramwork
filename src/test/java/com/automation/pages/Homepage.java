package com.automation.pages;

import com.automation.utils.PropertiesReader;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Homepage extends BasePage{

    public void gotoEbay() {
        driver.get(PropertiesReader.getPropValue("base.url"));
    }



    @FindBy(id ="gh-ac")
    WebElement searchBar;
    public void searchFor(String str) {
        searchBar.clear();
        searchBar.sendKeys(str);
        searchBar.sendKeys(Keys.ENTER);


    }


}
