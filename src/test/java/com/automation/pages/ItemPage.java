package com.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ItemPage extends BasePage{

    @FindBy(xpath = "//button[@class='listbox-button__control btn btn--form btn--truncated']/span/span[2]")
    WebElement colorText;

    @FindBy(xpath = "//button[@class='listbox-button__control btn btn--form btn--truncated']")
    WebElement colorTextButton;

    @FindBy(xpath = "//span[text()='Buy It Now']/../..")
    WebElement buyItNowButton;

    @FindBy(xpath = "//span[text()='Add to cart']/../.. ")
    WebElement addToCartButton;

    @FindBy(xpath = "//span[text()='Check out as guest']/../..")
    WebElement guestButton;

    @FindBy(xpath = "//button[@class='icon-btn lightbox-dialog__close' and @aria-label='Close the show me how overlay' ]")
    WebElement popClose;

    public void clickOnBuyItNowButton(){
        buyItNowButton.click();
    }

    public void clickOnGuest(){
        guestButton.click();
    }

    public void clickOnAddToCartButton() {
        addToCartButton.click();
    }

    public void goToMainPage() {
        driver.close();
        driver.switchTo().window(driver.getWindowHandles().stream().toList().getFirst());
    }

    public void closeItemCartPopUp(){
        popClose.click();
    }

    public void selectColor() {
        if(colorText.isDisplayed() && colorText.getText().equals("Select")){
            colorTextButton.click();
            driver.findElement(By.xpath("//div[@class='listbox__options listbox-button__listbox']/div[2]/span")).click();
        }
    }
}
