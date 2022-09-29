import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;
/*
Testirati rad kalkulatora https://testsheepnz.github.io/BasicCalculator.html
Testirati rad svih operacija posebno.
 */

public class BasicCalculatorTest {

    private WebDriver driver;

    @BeforeClass
    public void setup (){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\jpbou\\IdeaProjects\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://testsheepnz.github.io/BasicCalculator.html");
    }
    @Test
    public void addTest (){
        String expectedAnswer = "5";

        WebElement firstNumber = driver.findElement(By.id("number1Field"));
        firstNumber.clear();
        firstNumber.sendKeys("3");

        WebElement secondNumber = driver.findElement(By.id("number2Field"));
        secondNumber.clear();
        secondNumber.sendKeys("2");

        WebElement operation = driver.findElement(By.xpath("//*[@id=\"selectOperationDropdown\"]"));
        Select select = new Select(operation);
        select.selectByIndex(0);
        WebElement calculateBtn = driver.findElement(By.id("calculateButton"));
        calculateBtn.click();

        WebElement answerField = driver.findElement(By.id("numberAnswerField"));
        String actualAnswer = answerField.getAttribute("value");
        Assert.assertEquals(actualAnswer, expectedAnswer);

        WebElement clearBtn = driver.findElement(By.id("clearButton"));
        clearBtn.click();
    }



    @Test
    public void subtractTest(){
        String expectedAnswer = "1";

        WebElement firstNumber = driver.findElement(By.id("number1Field"));
        firstNumber.clear();
        firstNumber.sendKeys("3");

        WebElement secondNumber = driver.findElement(By.id("number2Field"));
        secondNumber.clear();
        secondNumber.sendKeys("2");

        WebElement operation = driver.findElement(By.xpath("//*[@id=\"selectOperationDropdown\"]"));
        Select select = new Select(operation);
        select.selectByIndex(1);
        WebElement calculateBtn = driver.findElement(By.id("calculateButton"));
        calculateBtn.click();

        WebElement answerField = driver.findElement(By.id("numberAnswerField"));
        String actualAnswer = answerField.getAttribute("value");
        Assert.assertEquals(actualAnswer, expectedAnswer);

        WebElement clearBtn = driver.findElement(By.id("clearButton"));
        clearBtn.click();
        }

    @Test
    public void  multiplyTest(){
        String expectedAnswer = "6";

        WebElement firstNumber = driver.findElement(By.id("number1Field"));
        firstNumber.clear();
        firstNumber.sendKeys("3");

        WebElement secondNumber = driver.findElement(By.id("number2Field"));
        secondNumber.clear();
        secondNumber.sendKeys("2");

        WebElement operation = driver.findElement(By.xpath("//*[@id=\"selectOperationDropdown\"]"));
        Select select = new Select(operation);
        select.selectByIndex(2);
        WebElement calculateBtn = driver.findElement(By.id("calculateButton"));
        calculateBtn.click();

        WebElement answerField = driver.findElement(By.id("numberAnswerField"));
        String actualAnswer = answerField.getAttribute("value");
        Assert.assertEquals(actualAnswer, expectedAnswer);

        WebElement clearBtn = driver.findElement(By.id("clearButton"));
        clearBtn.click();
    }

    @Test
    public void divideTest(){
        String expectedAnswer = "1";

        WebElement firstNumber = driver.findElement(By.id("number1Field"));
        firstNumber.clear();
        firstNumber.sendKeys("3");

        WebElement secondNumber = driver.findElement(By.id("number2Field"));
        secondNumber.clear();
        secondNumber.sendKeys("3");

        WebElement operation = driver.findElement(By.xpath("//*[@id=\"selectOperationDropdown\"]"));
        Select select = new Select(operation);
        select.selectByIndex(3);
        WebElement calculateBtn = driver.findElement(By.id("calculateButton"));
        calculateBtn.click();

        WebElement answerField = driver.findElement(By.id("numberAnswerField"));
        String actualAnswer = answerField.getAttribute("value");
        Assert.assertEquals(actualAnswer, expectedAnswer);

        WebElement clearBtn = driver.findElement(By.id("clearButton"));
        clearBtn.click();
    }

    @Test
    public void concatenateTest(){
        String expectedAnswer = "32";

        WebElement firstNumber = driver.findElement(By.id("number1Field"));
        firstNumber.clear();
        firstNumber.sendKeys("3");

        WebElement secondNumber = driver.findElement(By.id("number2Field"));
        secondNumber.clear();
        secondNumber.sendKeys("2");

        WebElement operation = driver.findElement(By.xpath("//*[@id=\"selectOperationDropdown\"]"));
        Select select = new Select(operation);
        select.selectByIndex(4);
        WebElement calculateBtn = driver.findElement(By.id("calculateButton"));
        calculateBtn.click();

        WebElement answerField = driver.findElement(By.id("numberAnswerField"));
        String actualAnswer = answerField.getAttribute("value");
        Assert.assertEquals(actualAnswer, expectedAnswer);

        WebElement clearBtn = driver.findElement(By.id("clearButton"));
        clearBtn.click();

    }
    @AfterClass
    public void close (){
        driver.close();
    }

}

