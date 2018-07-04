import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;

public class Chrome {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "D:\\JavaHW\\artifact\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.i.ua/");

        //Enter button
        WebElement enterButton = driver.findElement(By.xpath("/html/body/div[2]/div[3]/ul[1]/li[2]/a"));
        enterButton.click();

        //Login field
        WebElement loginField = driver.findElement(By.xpath("//*[@id=\"FloatLogin\"]/div/div/form/fieldset/p[1]/input"));
        loginField.sendKeys("testhw2@i.ua");

        //Password field
        WebElement passwordField = driver.findElement(By.xpath("//*[@id=\"FloatLogin\"]/div/div/form/fieldset/p[2]/input"));
        passwordField.sendKeys("123qwe1");

        //Login pop-up button
        WebElement loginButton = driver.findElement(By.xpath("//*[@id=\"FloatLogin\"]/div/div/form/input[6]"));
        loginButton.click();

        //Name of user
        WebElement userName = driver.findElement(By.xpath("/html/body/div[2]/div[3]/ul[1]/li[2]/a/b"));
        userName.getText().equals("test");

        ///Time of sleep
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //Closing of a driver
        driver.quit();
    }

}