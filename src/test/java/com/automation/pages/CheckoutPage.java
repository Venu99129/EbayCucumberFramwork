package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutPage extends BasePage {
    @FindBy(xpath = "//dl[@data-test-id='SUB_TOTAL']/dd/span/span")
    WebElement itemPrice;

    @FindBy(xpath = "//dl[@data-test-id='SHIPPING']/dd/span/span")
    WebElement shippingPrice;

    @FindBy(xpath = "//dl[@class='summary-item-list__last-item']/dd/span/span")
    WebElement taxPrice;
    
    @FindBy(xpath = "//dl[@data-test-id='TOTAL']/dd/span/span")
    WebElement totalPrice;

    double itemAmount;
    double shippingAmount;
    double taxAmount;
    double totalAmount;

    public void getDataFromCheckOut(){
//        System.out.println(itemPrice.getText() +"  "+shippingPrice.getText()+" "+taxPrice.getText()+" "+totalPrice.getText());
        itemAmount = Double.parseDouble(itemPrice.getText().substring(4));
        shippingAmount = Double.parseDouble(shippingPrice.getText().equals("Free") ? "0.0" : shippingPrice.getText().substring(4) );
        taxAmount = Double.parseDouble(taxPrice.getText().equals("Free") ? "0.0" : shippingPrice.getText().substring(4));
        totalAmount = Double.parseDouble(totalPrice.getText().substring(4));
    }

    public boolean verifyAmounts(){
        return (itemAmount+shippingAmount+taxAmount) == totalAmount;
    }
}
