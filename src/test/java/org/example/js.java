package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class js {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver= new ChromeDriver();

        driver.get("https://google.com");

      WebElement  search= driver.findElement(By.xpath("//textarea[@class='gLFyf']"));

        JavascriptExecutor js= (JavascriptExecutor) driver;

       js.executeScript("arguments[0].value='test'", search);
    }
}
