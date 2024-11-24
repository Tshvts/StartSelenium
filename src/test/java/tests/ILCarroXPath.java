package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ILCarroXPath
{
    WebDriver driver = new ChromeDriver();

    @Test
    public void typeRegForm()
    {
        driver.get("https://ilcarro.web.app/registration?url=%2Fsearch");
        driver.manage().window().maximize();

        WebElement inpName = driver.findElement(By.xpath("//div/input[@id='name']"));
        inpName.sendKeys("Tanya");

        WebElement inpLName = driver.findElement(By.xpath("//div/input[@id='lastName']"));
        inpLName.sendKeys("Fidelman");

        WebElement inpEmail = driver.findElement(By.xpath("//div/input[@id='email']"));
        inpEmail.sendKeys("tdshvtstest@gmail.com");

        WebElement inpPWD = driver.findElement(By.xpath("//div/input[@id='password']"));
        inpPWD.sendKeys("Password123!");

        WebElement chb = driver.findElement(By.xpath("//div[@class='checkbox-container']"));
        chb.click();

        WebElement btnYalla = driver.findElement(By.xpath("//button[@type='submit']"));
        btnYalla.click();

        try
        {
            Thread.sleep(3000);
        }
        catch (InterruptedException e)
        {
            throw new RuntimeException(e);
        }

        driver.quit();
    }
}
