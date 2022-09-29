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
Za njega napisati edge case-eve na koje naletite,
ili ispunite neka matematicka pravila (deljenje sa nulom, jedinicom, veliki/mali brojevi itd).
Napisati minimum 4 edge case-a po testnoj metodi, 16 ukupno (minimum), zanemarujuci Concatenate.
 */
public class BasicCalculatorEdgeCaseTest {
    private WebDriver driver;

    @BeforeClass
    public void setup (){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\jpbou\\IdeaProjects\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://testsheepnz.github.io/BasicCalculator.html");
    }
    @Test
    public void addWithZeroTest (){
        String expectedAnswer = "3";

        WebElement firstNumber = driver.findElement(By.id("number1Field"));
        firstNumber.clear();
        firstNumber.sendKeys("3");

        WebElement secondNumber = driver.findElement(By.id("number2Field"));
        secondNumber.clear();
        secondNumber.sendKeys("0");

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
    public void addWithHundredTest (){
        String expectedAnswer = "103";

        WebElement firstNumber = driver.findElement(By.id("number1Field"));
        firstNumber.clear();
        firstNumber.sendKeys("3");

        WebElement secondNumber = driver.findElement(By.id("number2Field"));
        secondNumber.clear();
        secondNumber.sendKeys("100");

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
    public void addWithThousandTest (){
        String expectedAnswer = "1003";

        WebElement firstNumber = driver.findElement(By.id("number1Field"));
        firstNumber.clear();
        firstNumber.sendKeys("3");

        WebElement secondNumber = driver.findElement(By.id("number2Field"));
        secondNumber.clear();
        secondNumber.sendKeys("1000");

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
    public void addWithTwoNegativesTest (){
        String expectedAnswer = "-7";

        WebElement firstNumber = driver.findElement(By.id("number1Field"));
        firstNumber.clear();
        firstNumber.sendKeys("-4");

        WebElement secondNumber = driver.findElement(By.id("number2Field"));
        secondNumber.clear();
        secondNumber.sendKeys("-3");

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
    public void subtractTwoPositiveNumbTest(){
        String expectedAnswer = "7";

        WebElement firstNumber = driver.findElement(By.id("number1Field"));
        firstNumber.clear();
        firstNumber.sendKeys("9");

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
    public void subtractTwoNegativeNumbTest(){
        String expectedAnswer = "3";

        WebElement firstNumber = driver.findElement(By.id("number1Field"));
        firstNumber.clear();
        firstNumber.sendKeys("-5");

        WebElement secondNumber = driver.findElement(By.id("number2Field"));
        secondNumber.clear();
        secondNumber.sendKeys("-8");

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
    public void subtractPositiveAndNegativeNumbTest(){
        String expectedAnswer = "14";

        WebElement firstNumber = driver.findElement(By.id("number1Field"));
        firstNumber.clear();
        firstNumber.sendKeys("9");

        WebElement secondNumber = driver.findElement(By.id("number2Field"));
        secondNumber.clear();
        secondNumber.sendKeys("-5");

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
    public void subtractWithZeroTest(){
        String expectedAnswer = "7";

        WebElement firstNumber = driver.findElement(By.id("number1Field"));
        firstNumber.clear();
        firstNumber.sendKeys("7");

        WebElement secondNumber = driver.findElement(By.id("number2Field"));
        secondNumber.clear();
        secondNumber.sendKeys("0");

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
    public void  multiplyWithZeroTest(){
        String expectedAnswer = "0";

        WebElement firstNumber = driver.findElement(By.id("number1Field"));
        firstNumber.clear();
        firstNumber.sendKeys("3");

        WebElement secondNumber = driver.findElement(By.id("number2Field"));
        secondNumber.clear();
        secondNumber.sendKeys("0");

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
    public void  multiplyWithOneTest(){
        String expectedAnswer = "55";

        WebElement firstNumber = driver.findElement(By.id("number1Field"));
        firstNumber.clear();
        firstNumber.sendKeys("55");

        WebElement secondNumber = driver.findElement(By.id("number2Field"));
        secondNumber.clear();
        secondNumber.sendKeys("1");

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
    public void  multiplyWithTenTest(){
        String expectedAnswer = "70";

        WebElement firstNumber = driver.findElement(By.id("number1Field"));
        firstNumber.clear();
        firstNumber.sendKeys("7");

        WebElement secondNumber = driver.findElement(By.id("number2Field"));
        secondNumber.clear();
        secondNumber.sendKeys("10");

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
    public void  multiplyPositAndNegatNumTest(){
        String expectedAnswer = "-20";

        WebElement firstNumber = driver.findElement(By.id("number1Field"));
        firstNumber.clear();
        firstNumber.sendKeys("4");

        WebElement secondNumber = driver.findElement(By.id("number2Field"));
        secondNumber.clear();
        secondNumber.sendKeys("-5");

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
    public void divideWithZeroTest(){
        String expectedAnswer = "0";

        WebElement firstNumber = driver.findElement(By.id("number1Field"));
        firstNumber.clear();
        firstNumber.sendKeys("8");

        WebElement secondNumber = driver.findElement(By.id("number2Field"));
        secondNumber.clear();
        secondNumber.sendKeys("0");

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
    public void divideWithOneTest(){
        String expectedAnswer = "33";

        WebElement firstNumber = driver.findElement(By.id("number1Field"));
        firstNumber.clear();
        firstNumber.sendKeys("33");

        WebElement secondNumber = driver.findElement(By.id("number2Field"));
        secondNumber.clear();
        secondNumber.sendKeys("1");

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
    public void divideTwoPozitiveNumbTest(){
        String expectedAnswer = "2";

        WebElement firstNumber = driver.findElement(By.id("number1Field"));
        firstNumber.clear();
        firstNumber.sendKeys("8");

        WebElement secondNumber = driver.findElement(By.id("number2Field"));
        secondNumber.clear();
        secondNumber.sendKeys("4");

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
    public void divideTwoNegativeNumbTest(){
        String expectedAnswer = "4";

        WebElement firstNumber = driver.findElement(By.id("number1Field"));
        firstNumber.clear();
        firstNumber.sendKeys("-8");

        WebElement secondNumber = driver.findElement(By.id("number2Field"));
        secondNumber.clear();
        secondNumber.sendKeys("-2");

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

    @AfterClass
    public void close (){
        driver.close();
    }
}
