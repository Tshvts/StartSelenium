package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class XpathSelectors
{
    WebDriver driver = new ChromeDriver();

    @Test
    public void methodXPath()
    {
        driver.get("https://telranedu.web.app/login");
        WebElement inputEmail = driver.findElement(By.xpath("//form/input[1]"));
        inputEmail.sendKeys("test902FT@gmail.com");

        WebElement inputPWD = driver.findElement(By.xpath("//form/input[@name='password']"));
        inputPWD.sendKeys("Password123!");

        WebElement btnReg = driver.findElement(By.xpath("//form/button[2]"));
        btnReg.click();

    }
}
