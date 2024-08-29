package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Window {

    public static void main(String[] args) {

        WebDriver driver;
        WebDriverManager.chromedriver().setup();

        driver= new ChromeDriver();

        driver.get ("https://rahulshettyacademy.com/seleniumPractise/#/");

        driver.findElement(By.linkText("Top Deals")).click();

      String parent=  driver.getWindowHandle();

     Set<String> windows= driver.getWindowHandles();

    Iterator<String> it= windows.iterator();

    while(it.hasNext())
    {
       String child= it.next();


       System.out.println(driver.switchTo().window(child).getTitle());
    }


driver.switchTo().window(parent);

    List<WebElement> products=driver.findElements(By.xpath("//div/h4"));

    for (int i=0; i< products.size(); i++)
    {
        if (products.get(i).getText().contains("Brocolli"))
        {
            driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
        }
    }
    }
}
