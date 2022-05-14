package com.example.app.pages;

import com.example.app.base.BasePageObject;
import org.openqa.selenium.By;

public class LogoutPage extends BasePageObject {

//    Selector
    By buttonSignout(){ return By.xpath("//android.widget.Button");}

    public void clickButtonSignout() { click(buttonSignout());}

}
