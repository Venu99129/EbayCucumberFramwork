package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchedPage extends BasePage{

    @FindBy(xpath = "//a[contains(@aria-label,'Your shopping cart')]")
    WebElement cartIcon;

    @FindBy(xpath = "//li[contains(@class,'fake-tabs__item btn')]/a/span[text()='Buy It Now']/..")
    WebElement buyItNowButton;
    
    @FindBy(xpath = "//div[@class='srp-river-results clearfix']//li[@id]//div[@class='s-item__info clearfix']/a")
    WebElement firstLink;

    public void clickOnBuyItNowButton(){
        buyItNowButton.click();
    }



    public void clickOnFirstLink(){
        firstLink.click();
        driver.switchTo().window(driver.getWindowHandles().stream().toList().get(1));
    }

    public void clickOnCartIcon(){
        cartIcon.click();
    }
}
