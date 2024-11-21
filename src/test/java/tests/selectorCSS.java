package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class selectorCSS
{
    WebDriver driver = new ChromeDriver();

    @Test
    public void elementsHeaderIlCarro()
    {
        driver.navigate().to("https://ilcarro.web.app/");
        driver.manage().window().maximize();

        try
        {
            Thread.sleep(3000);
        }
        catch (InterruptedException e)
        {
            throw new RuntimeException(e);
        }
        WebElement linkCar = driver.findElement(By.cssSelector("a[href='/let-car-work']"));
        linkCar.click();
        System.out.println("Text: " + linkCar.getText());

        try
        {
            Thread.sleep(3000);
        }
        catch (InterruptedException e)
        {
            throw new RuntimeException(e);
        }
        WebElement linkSearch = driver.findElement(By.cssSelector("a[href='/search']"));
        linkSearch.click();
        System.out.println("Text: " + linkSearch.getText());

        try
        {
            Thread.sleep(3000);
        }
        catch (InterruptedException e)
        {
            throw new RuntimeException(e);
        }
        WebElement linkTerms= driver.findElement(By.cssSelector("a[href='/terms-of-use']"));
        linkTerms.click();
        System.out.println("Text: " + linkTerms.getText());

        try
        {
            Thread.sleep(3000);
        }
        catch (InterruptedException e)
        {
            throw new RuntimeException(e);
        }
        WebElement linkSignUp= driver.findElement(By.cssSelector("a[href='/registration?url=%2Fterms-of-use']"));
        linkSignUp.click();
        System.out.println("Text: " + linkSignUp.getText());

        try
        {
            Thread.sleep(3000);
        }
        catch (InterruptedException e)
        {
            throw new RuntimeException(e);
        }
        WebElement linkLogIn= driver.findElement(By.cssSelector("a[href='/login?url=%2Fterms-of-use']"));
        linkLogIn.click();
        System.out.println("Text: " + linkLogIn.getText());

        try
        {
            Thread.sleep(3000);
        }
        catch (InterruptedException e)
        {
            throw new RuntimeException(e);
        }
        WebElement imgLogo = driver.findElement(By.cssSelector("img[alt='logo']"));
        imgLogo.click();

        driver.quit();
    }
}
