import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

import static org.openqa.selenium.By.*;

public class ecommerceTest {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/client");

       WebElement email= driver.findElement(id("userEmail"));
      //  driver.findElement(id("userEmail")).sendKeys("sireesha.n@cdf.com");
        //JavascriptExecutor js= new JavascriptExecutor();
        // js.executeScript("arguments[0].value='sireesha.n@cdf.com'", )




        driver.findElement(id("userPassword")).sendKeys("Vihas@1308");

        driver.findElement(id("login")).click();

        driver.manage().window().maximize();
        Thread.sleep(500);

        List<WebElement> products = driver.findElements(cssSelector("div[class='card-body'] b"));


        //WebElement finalprod= products.stream().filter(s->s.getText().contains("ADIDAS")).findFirst().orElse(null);

        //System.out.println(finalprod.getText());
        //finalprod.findElement(By.xpath("//div[@class='card-body']/button[2])")).click();
        for (int i = 0; i < products.size(); i++) {

            System.out.println(products.get(i).getText());

            if (products.get(i).getText().contains("ADIDAS")) {


                driver.findElements(By.xpath("//div/button[2]")).get(i).click();
            }
        }
    }
}






