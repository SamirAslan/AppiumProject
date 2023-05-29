package util;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.offset.ElementOption;
import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.Collection;
import java.util.concurrent.TimeUnit;

public class ElementHelper {
    AppiumDriver driver;
    WebDriverWait wait;
    Actions action;

    public ElementHelper(){
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        this.action = new Actions(driver);
    }
    public WebElement findElement(By key){
        wait.until(ExpectedConditions.presenceOfElementLocated(key));
        return driver.findElement(key);
    }
    public void click(By key){
        wait.until(ExpectedConditions.presenceOfElementLocated(key));
        findElement(key).click();
    }
    public void sendKey(By key, String text){
        findElement(key).sendKeys(text);
    }

    public void clear(By key){
        wait.until(ExpectedConditions.presenceOfElementLocated(key));
        findElement(key).clear();
    }
    public String getText(By key){
        wait.until(ExpectedConditions.presenceOfElementLocated(key));
        return findElement(key).getText();
    }
    public void checkVisible(By key){
        wait.until(ExpectedConditions.visibilityOfElementLocated(key));
    }

    public void checkInvisible(By key){
        wait.until(ExpectedConditions.invisibilityOfElementLocated(key));
    }

    public void assertionEqualText(By key, String text){
        String text1 = getText(key);
        Assert.assertEquals(text1,text);
    }

    public void assertionGetText(By key, By key1){
        String text1 = getText(key);
        String text2 = getText(key1);
        Assert.assertEquals(text1,text2);
    }
    public void assertionContainText(By key1, String text){
        String text1 = getText(key1);
        Assert.assertTrue(text1.contains(text));

    }

    public void longPressButton(By key){
        wait.until(ExpectedConditions.visibilityOfElementLocated(key));
        WebElement element = driver.findElement(key);
        LongPressOptions longPress = LongPressOptions.longPressOptions()
                .withElement(ElementOption.element(element)).withDuration(Duration.ofSeconds(3));
        driver.perform((Collection<Sequence>) longPress);
    }

    public void openNotification(){
//        AndroidDriver androidDriver = new AndroidDriver((Capabilities) driver);
        driver.notify();
    }

    public void swipeToElement(By element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        js.executeScript("arguments[0].scrollIntoView({behavior: \"auto\", block: \"center\", inline: \"center\"});", element);
        driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);

    }

    public void scrollDown() {
        try {
            int i = 0;
            for (; i <= 30; i++) {
                ((JavascriptExecutor) driver).executeScript(("window.scrollBy(0," + i + ")"), "");
            }
            for (; i > 0; i--) {
                ((JavascriptExecutor) driver).executeScript(("window.scrollBy(0," + i + ")"), "");
            }
        } catch (Exception ignored) {
        }
    }


}
