package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://www.facebook.com/");

        driver.findElement(By.xpath("//button[2]")).click();
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/form/div[5]/a")).click();

        Thread.sleep(5000);

        WebElement selectCombo1 = driver.findElement(By.id("day"));
        Select selectDay = new Select(selectCombo1);
        selectDay.selectByValue("28");

        WebElement selectCombo2 = driver.findElement(By.id("month"));
        Select selectMonth = new Select(selectCombo2);
        selectMonth.selectByIndex(9);

        WebElement selectCombo3 = driver.findElement(By.id("year"));
        Select selectYear = new Select(selectCombo3);
        selectYear.selectByValue("1995");
    }
}
