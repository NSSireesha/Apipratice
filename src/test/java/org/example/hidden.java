package org.example;

import com.beust.ah.A;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class hidden {

    public static void main(String[] args) {


        WebDriverManager.chromedriver().setup();

        WebDriver driver= new ChromeDriver();

        driver.get("https://rahulshettyacademy.com/angularpractice/");

    WebElement namebox= driver.findElement(By.name("name"));


     //  JavascriptExecutor js= (JavascriptExecutor) driver;

       //js.executeScript("arguments[0].value='test'",namebox );

        Actions a= new Actions(driver);
        a.sendKeys(namebox, "actionstest").build().perform();
    }


}
