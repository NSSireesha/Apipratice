package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.openqa.selenium.By.id;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class jstest {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/client");

        WebElement email= driver.findElement(id("userEmail"));

        JavascriptExecutor js= (JavascriptExecutor)driver;

        js.executeScript("argumnets[0].value='sireesha.n@cdf.com'", email);


        driver.findElement(with (By.xpath("")).above(email)).getText();


    }




}
