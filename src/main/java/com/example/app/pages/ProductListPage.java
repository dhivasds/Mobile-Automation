package com.example.app.pages;

import com.example.app.base.BasePageObject;
import io.appium.java_client.MobileBy;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;

public class ProductListPage extends BasePageObject {

//    Selector
    By buttonBeli(){ return MobileBy.xpath("(//android.widget.Button[@content-desc=\"Beli\"])[1]");}
    By buttonCart(){ return MobileBy.AccessibilityId("1");}

    public void clickButtonBeli(){click(buttonBeli());}
    public void verifyCartAdded(){ Assertions.assertTrue(find(buttonCart()).isDisplayed());}

}
