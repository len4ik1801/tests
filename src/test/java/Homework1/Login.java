package Homework1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Login {
    WebDriver driver = new ChromeDriver();

    @Test
    public void test1() throws InterruptedException {

        driver.manage().window().fullscreen();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("http://prestashop-automation.qatestlab.com.ua/admin147ajyvk0/");
        Assert.assertEquals("prestashop-automation > Панель администратора (PrestaShop™)", driver.getTitle());

        driver.findElement(By.cssSelector("#email")).sendKeys("webinar.test@gmail.com");
        driver.findElement(By.cssSelector("#passwd")).sendKeys("Xcg7299bnSmMuRLp9ITw");
        driver.findElement(By.name("submitLogin")).click();
        Assert.assertEquals("prestashop-automation > Панель администратора (PrestaShop™)", driver.getTitle());




        // orders
        driver.findElement(By.xpath(".//*[@id='subtab-AdminParentOrders']/a")).click();
        Assert.assertEquals("Заказы • prestashop-automation", driver.getTitle());
        //Thread.sleep(5000);


        //invoces;
        driver.findElement(By.xpath("//*[@id='subtab-AdminInvoices']/a")).click();
        Assert.assertEquals("Инвойсы • prestashop-automation", driver.getTitle());
        //Thread.sleep(5000);

        //adminSlip;
        driver.findElement(By.xpath("//*[@id=\"subtab-AdminSlip\"]/a")).click();
        Assert.assertEquals("Кредитные счета • prestashop-automation", driver.getTitle());
        //Thread.sleep(5000);

        //adminDeliverySlip;
        driver.findElement(By.xpath("//*[@id=\"subtab-AdminDeliverySlip\"]/a")).click();
        Assert.assertEquals("Счета на доставку • prestashop-automation", driver.getTitle());
        //Thread.sleep(5000);

        //adminCarts;
        driver.findElement(By.xpath("//*[@id=\"subtab-AdminCarts\"]/a")).click();
        Assert.assertEquals("Корзины • prestashop-automation", driver.getTitle());
        //Thread.sleep(5000);


        driver.findElement(By.xpath("//*[@id=\"employee_infos\"]/a/span/img")).click();
        driver.findElement(By.id("header_logout")).click();
        driver.quit();
    }

}


