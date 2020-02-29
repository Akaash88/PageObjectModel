package base;

import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;

import utilities.ExcelUtil;

public class Page {
	public static WebDriver driver;
	public void init_Browser() {
		if (Constant.browser.equalsIgnoreCase("Chrome")) {
			driver = new ChromeDriver();
		}
		else if(Constant.browser.equalsIgnoreCase("Firefox")) {
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.get(Constant.baseUrl);
		driver.manage().timeouts().implicitlyWait(Constant.implicitWait, TimeUnit.SECONDS);
	}
	
	
	public static void click(WebElement ele) {
		ele.click();
	}
	public  void type(WebElement ele ,String value) {
		ele.sendKeys(value);
	}
	public void select(WebElement ele, String value) {
		Select select = new Select(ele);
		select.selectByVisibleText(value);
	}
	
	public  Object[][] testData(String excelPath,String sheetName) {
		ExcelUtil excel = new ExcelUtil(excelPath, sheetName);
		int rowcount = excel.getRowCount(); 
		int colcount = excel.getColCount();

		Object data[][] = new Object[rowcount-1][colcount]; //Initializing array size.
		
		for(int i =1;i<rowcount;i++) {
			for(int j=0;j<colcount;j++) {
				String cellData = excel.getData(i, j);
				data[i-1][j] = cellData; 
			}
		}
		return data;
	}
	
	@DataProvider(name = "dp")
	public Object[][] getData(Method m) {
		String projectPath = System.getProperty("user.dir");
		String excelPath = projectPath+"/src/main/resources/excel/pomTestData.xlsx"; 
		Object data[][] =testData(excelPath, m.getName());
		return data;
	}
	public void alert_accept() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		Alert alert = wait.until(ExpectedConditions.alertIsPresent());
		alert.accept();
	}
	
	public void tearDown() {
		driver.quit();
	}
	
}



