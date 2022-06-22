package com.browserstack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SingleTest extends BrowserStackTestNGTest {

    @Test
    public void test() throws Exception {
        driver.get("http://34.246.169.246:8080/");
        WebElement element = driver.findElement(By.name("j_username"));
        element.sendKeys("hbaaqeil");
        WebElement element = driver.findElement(By.name("j_password"));
        element.sendKeys("Hba@@--01");
        element.submit();
        Thread.sleep(5000);

        Assert.assertEquals("Dashboard [Jenkins]", driver.getTitle());
    }
}
