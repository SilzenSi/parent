package src.main.webapp;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverInfo;
import org.openqa.selenium.remote.server.handler.SubmitElement;

public class seleniumTest {
    public static void main(String[] args) throws InterruptedException {
        //Create Chrome instance
        System.setProperty("webdriver.chrome.driver","/Users/cuimac/Downloads/chromedriver");
        WebDriver driver= new ChromeDriver();

        //Open BaiDu Homepage
        driver.get("https://www.baidu.com");

        //Max size the browser
        driver.manage().window().maximize();
        Thread.sleep(2000);

        //Find input box
        WebElement inputElement = driver.findElement(By.id("kw"));

        //Input search words
        inputElement.sendKeys("selenium");

        //Find click button
        WebElement submitBtnElement = driver.findElement(By.id("Su"));
        submitBtnElement.click();

        driver.get("https://m.baidu.com");
        driver.manage().window().setSize(new Dimension(480, 800));
        Thread.sleep(2000);

        System.out.println(driver.getTitle());
        driver.quit();
    }

}
