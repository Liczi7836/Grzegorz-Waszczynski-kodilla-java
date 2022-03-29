package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {

    public static final String XPATH_NEWACCOUNT = "//div[contains(@class, \"_6luv _52jv\")]/form/div/button[2]";
    public static final String XPATH_DAY = "//div[contains(@class, \"_5k_5\")]/select[1]";
    public static final String XPATH_MONTH = "//div[contains(@class, \"_5k_5\")]/select[2]";
    public static final String XPATH_YEAR = "//div[contains(@class, \"_5k_5\")]/select[3]";

    public static void main(String[] args) {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://www.facebook.com/");

        driver.findElement(By.xpath("//button[2]")).click();
        driver.findElement(By.xpath("//button[2]")).click();
        //driver.findElement(By.xpath(XPATH_NEWACCOUNT)).click()

        WebElement selectCombo1 = driver.findElement(By.xpath(XPATH_DAY));
        Select selectDay = new Select(selectCombo1);
        selectDay.selectByValue("28");

        WebElement selectCombo2 = driver.findElement(By.xpath(XPATH_MONTH));
        Select selectMonth = new Select(selectCombo2);
        selectMonth.selectByIndex(9);

        WebElement selectCombo3 = driver.findElement(By.xpath(XPATH_YEAR));
        Select selectYear = new Select(selectCombo3);
        selectYear.selectByValue("1995");
    }
}
