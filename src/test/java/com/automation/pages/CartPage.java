package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.text.DecimalFormat;
import java.util.List;

public class CartPage extends BasePage{
    @FindBy(xpath = "//div[@class='item-price font-title-3']/span/span/span")
    List<WebElement> cartPrices;

    @FindBy(xpath = "//div[@data-test-id='ITEM_TOTAL']/span/span/span")
    WebElement itemPrice;

    @FindBy(xpath = "//div[@data-test-id='SHIPPING']/span/span/span")
    WebElement shippingPrice;

    @FindBy(xpath = "//div[@data-test-id='SUBTOTAL']/span/span/span")
    WebElement totalPrice;

    double totalListAmount;

    public void getCartPrices(){
       totalListAmount =  cartPrices.stream().mapToDouble(e -> Double.parseDouble(e.getText().substring(4))).sum();
    }


    public boolean verifyPrices() {
       double shipping =  Double.parseDouble(shippingPrice.getText().equals("Free") ? "0.0" : shippingPrice.getText().substring(4) );
       double item = Double.parseDouble(itemPrice.getText().substring(4));
       double total = Double.parseDouble(totalPrice.getText().substring(4));
       double tot = Double.sum(shipping,item);
       DecimalFormat df = new DecimalFormat("#.#");
       tot = Double.parseDouble(df.format(tot));
//        System.out.println(item+" "+totalListAmount);
//        System.out.println(shipping+" "+total);
//        System.out.println((shipping+item));
//        System.out.println(tot);

       return (tot == total) && (item == totalListAmount);
    }
}
