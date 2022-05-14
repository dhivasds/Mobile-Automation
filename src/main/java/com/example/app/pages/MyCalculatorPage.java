package com.example.app.pages;

import com.example.app.base.BasePageObject;
import io.appium.java_client.MobileBy;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;

public class MyCalculatorPage extends BasePageObject {
//    Object

    By displayedCal() {return MobileBy.xpath("//android.view.View[@content-desc=\"Calculator\"]");}
    By buttonNumber(String number){ return MobileBy.AccessibilityId(number);}
    By buttonSum() {return MobileBy.xpath("//android.view.View[@content-desc=\" + \"]");}
    By buttonDistribution() {return MobileBy.xpath("//android.view.View[@content-desc=\" ÷ \"]");}
    By buttonMin() {return MobileBy.xpath("//android.view.View[@content-desc=\" - \"]");}
    By buttonEqual() {return MobileBy.xpath("//android.view.View[@content-desc=\"=\"]");}
    By verifyResult(int results){
        return MobileBy.AccessibilityId(String.valueOf(results));}

//
    public void isDisplayedCal(){isDisplayed(displayedCal());}

    public void clickButtonNumber(String number) {click(buttonNumber(number));}

    public void clickButtonSum(){click(buttonSum());}

    public void clickButtonMin(){click(buttonMin());}

    public void clickButtonDistribution(){click(buttonDistribution());}

    public void clickButtonEqual(){click(buttonEqual());}

    public void verifyResultDisplayed(int results){
        Assertions.assertTrue(find(verifyResult(results)).isDisplayed());
    }

    }




