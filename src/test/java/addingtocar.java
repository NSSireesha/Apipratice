import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class addingtocar {

    public static void main(String[] args) {
       WebDriverManager.chromedriver().setup();

       WebDriver driver= new ChromeDriver();

       driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");

       driver.manage().window().maximize();
       List<WebElement> items= driver.findElements(By.xpath("//div/h4[@class='product-name']"));


       for (int i=0; i<items.size(); i++)
       {
           if(items.get(i).getText().contains("Cucumber"))

           {
               System.out.println(items.get(i).getText());
               driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();

           }
       }
      }
  }
