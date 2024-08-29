package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class Streamstest {

    public static void main(String[] args) {

        //System.setProperty("webdriver.chrome.driver" , "C:\\Users\\sireesha_narakuchi\\OneDrive - EPAM\\Pictures\\QE\\Automation\\chromedriver_win32\\chromedriver.exe");
        ChromeOptions opt = new ChromeOptions();
        opt.addArguments("--remote-allow-origins=*");
        WebDriverManager.chromedriver().clearDriverCache().setup();
        WebDriverManager.chromedriver().clearResolutionCache().setup();
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(opt);

        driver.get("rahulshettyacademy.com/seleniumPractise/#/offers");
        driver.findElement(By.xpath("//tr/th[1]")).click();

        List<WebElement> items = driver.findElements(By.xpath("//tr/td[1]"));



        List<String> sortedlist = items.stream().map(s -> s.getText()).collect(toList());
        sortedlist.forEach(s->System.out.println(s));

        List<String> expected = sortedlist.stream().sorted().collect(toList());
        Assert.assertEquals(sortedlist, expected);
        System.out.println("match");


     List<String> priceofitem= items.stream().filter(s->s.getText().contains("Banana")).map(s->getprice(s)).collect(Collectors.toList());

        priceofitem.forEach(s->System.out.println(s));
    }

    private static String getprice(WebElement s) {
      String price=  s.findElement(By.xpath("following-sibling::td[1]")).getText();
      System.out.println(price);

      return price;

    }


}
