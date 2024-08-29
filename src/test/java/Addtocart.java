import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.asList;

public class Addtocart {

    public static void main(String args[]) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
String [] veggies={"Cucumber", "Beetroot", "Brocolli"};
        List<WebElement> products = driver.findElements(By.xpath("//div/h4[@class='product-name']"));

//products.stream().filter(s->s.getText().contains("Cucumber")).findFirst().orElse(null)
     //   .findElement(By.xpath("//button[text()='ADD TO CART']")).click();

        List vegetables= Arrays.asList(veggies);


        products.stream().filter(s->s.getText().contains("Cucumber")).findFirst().orElse(null)
         .findElement(By.xpath("//button[text()='ADD TO CART']")).click();


        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

    }
}
