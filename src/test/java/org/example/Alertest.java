package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertest {

    public static void main(String[] args) {
        WebDriver driver;
        WebDriverManager.chromedriver().setup();

        driver= new ChromeDriver();
        driver.get("http://rahulshettyacademy.com/AutomationPractice/");
                driver.findElement(By.xpath("//input[@id='alertbtn']")).click();

       System.out.println(driver.switchTo().alert().getText());

       driver.switchTo().alert().accept();


    }



}

