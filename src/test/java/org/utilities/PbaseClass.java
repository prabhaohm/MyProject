package org.utilities;


	import java.awt.AWTException;
	import java.awt.Robot;
	import java.awt.event.KeyEvent;
	import java.io.File;
	import java.io.FileInputStream;
	import java.io.IOException;
	import java.text.SimpleDateFormat;
	import java.time.Duration;
	import java.util.Date;
	import java.util.List;
	import java.util.Set;

	import org.apache.commons.io.FileUtils;
	import org.apache.poi.ss.usermodel.Cell;
	import org.apache.poi.ss.usermodel.DateUtil;
	import org.apache.poi.ss.usermodel.Row;
	import org.apache.poi.ss.usermodel.Sheet;
	import org.apache.poi.ss.usermodel.Workbook;
	import org.apache.poi.xssf.usermodel.XSSFWorkbook;
	import org.openqa.selenium.Alert;
	import org.openqa.selenium.By;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.FluentWait;
	import org.openqa.selenium.support.ui.Select;
	import org.openqa.selenium.support.ui.WebDriverWait;

	import io.github.bonigarcia.wdm.WebDriverManager;

	public class PbaseClass {
		public static WebDriver driver;

		// 1
		public static void launchChrome() {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}

		// 2
		public static void winMax() {
			driver.manage().window().maximize();

		}

		// 3
		public static void loadUrl(String siteName) {
			driver.get(siteName);

		}

		// 4
		public static void printTitle() {
			System.out.println(driver.getTitle());
		}

		// 5
		public static void printCurrentUrl() {
			System.out.println(driver.getCurrentUrl());
		}

		// 6
		public static void fill(WebElement ele, String v) {
			ele.sendKeys(v);
		}

		// 7
		public static void clean(WebElement ele, String value) {
			ele.clear();
		}

		// 8
		public static void printAttr(WebElement ele) {
			System.out.println(ele.getAttribute("value"));

		}

		// 9
		public static void sub(WebElement ele, String value) {
			ele.submit();

		}

		// 10
		public static void srchclick(WebElement ele) {
			ele.click();

		}

		// 11
		public static void closeChrome() {
			driver.close();

		}

		// 12
		public static void refreshPage() {
			driver.navigate().refresh();
		}

		// 13
		public static void printText(WebElement ele, String value) {
			System.out.println(ele.getText());
		}

		// 14
		public static void loadt(int i) throws InterruptedException {
			Thread.sleep(5000);
		}

		// 15
		public static void backward() {
			driver.navigate().back();
		}

		// 16
		public static void movforward() {
			driver.navigate().forward();
		}

		// 17
		public static void display(WebElement ele) {
			System.out.println(ele.isDisplayed());
		}

		// 18
		public static void amove(WebElement ele) {
			Actions a = new Actions(driver);
			a.moveToElement(ele).perform();
		}

		// 19
		public static void doublec(WebElement ele) {
			Actions a = new Actions(driver);
			a.doubleClick().perform();
		}

		// 20
		public static void rightclick(WebElement ele) {
			Actions a = new Actions(driver);
			a.contextClick().perform();
		}

		// 21
		public static void aclick(WebElement ele) {
			Actions a = new Actions(driver);
			a.click(ele).perform();
		}

		// 22
		public static void fillAction(WebElement ele, String value) {
			Actions a = new Actions(driver);
			a.sendKeys(value).build().perform();

		}

		// 23
		public static void ssPage(WebElement ele, String value) throws IOException {
			ele.sendKeys(value);
			TakesScreenshot tk = (TakesScreenshot) driver;

			File src = tk.getScreenshotAs(OutputType.FILE);

			File dsc = new File("C:\\Users\\PK\\eclipse-workspace\\Selinium\\Screenshot\\brake.jpg");

			FileUtils.copyFile(src, dsc);
		}

		// 24
		public static void scrollf(WebElement ele) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView(false)", ele);
		}

		// 25
		public static void scrollT(WebElement ele) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView(true)", ele);
		}

		// 26
		public static void filljs(WebElement ele, String value) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('value', 'Clutch plate')", ele);
		}

		// 27
		public static void clickjs(WebElement ele) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click()", ele);
		}

		// 28
		public static void handleWin() {
			String handle = driver.getWindowHandle();
		}

		// 29
		public static void enabled(WebElement ele) {
			System.out.println(ele.isEnabled());
		}

		// 30
		public static void selected(WebElement ele) {
			System.out.println(ele.isSelected());
		}

		// 31
		public static void valueselect(WebElement ele) {
			Select s = new Select(ele);
			s.selectByValue("DZA");
		}

		// 32
		public static void visibleSelect(WebElement ele, String string) {
			Select s = new Select(ele);
			s.selectByVisibleText("Algeria");
			
		}

		// 34
		public static void indexSelect(WebElement ele, int i) {
			Select s = new Select(ele);
			s.selectByIndex(4);
		}

		// 35
		public static void multipleSelect(WebElement ele) {
			Select s = new Select(ele);
			s.selectByIndex(4);
			boolean multi = s.isMultiple();
			System.out.println(multi);
		}

		// 36
		public static void getAllvalue(WebElement ele) {
			Select s = new Select(ele);
			List<WebElement> li = s.getOptions();
			for (int i = 0; i < li.size(); i++) {
				WebElement element = li.get(i);
				String text = element.getText();
				System.out.println(text);
			}
		}

		// 37
		public static void firstSelected(WebElement ele) {
			Select s = new Select(ele);
			WebElement element = s.getFirstSelectedOption();
			System.out.println(element.getText());
		}

		// 38
		public static void valuedeselect(WebElement ele) {
			Select s = new Select(ele);
			s.selectByValue("grape");
			s.selectByIndex(1);
			s.selectByVisibleText("Orange");
			s.deselectByValue("grape");

		}

		// 39
		public static void allSelectedoption(WebElement ele) {
			Select s = new Select(ele);
			s.selectByValue("grape");
			s.selectByIndex(1);
			s.selectByVisibleText("Orange");
			List<WebElement> li = s.getAllSelectedOptions();
			for (WebElement x : li) {
				System.out.println(x.getText());
			}
		}

		// 40
		public static void indexdeselect(WebElement ele) {
			Select s = new Select(ele);
			s.selectByValue("grape");
			s.selectByIndex(1);
			s.selectByVisibleText("Orange");
			s.deselectByIndex(1);
		}

		// 41
		public static void visibledeselect(WebElement ele) {
			Select s = new Select(ele);
			s.selectByValue("grape");
			s.selectByIndex(1);
			s.selectByVisibleText("Orange");
			s.deselectByVisibleText("Orange");
		}

		// 42
		public static void alldeselect(WebElement ele) {
			Select s = new Select(ele);
			s.selectByValue("grape");
			s.selectByIndex(1);
			s.selectByVisibleText("Orange");
			s.deselectAll();
		}

		// 43
		public static void toNavigate(String siteName) {
			driver.navigate().to(siteName);
		}

		// 44
		public static void acceptAlert(WebElement ele) {
			Alert a = driver.switchTo().alert();
			a.accept();
		}

		// 45
		public static void dismissAlert(WebElement ele) {
			Alert a = driver.switchTo().alert();
			a.dismiss();
		}

		// 46
		public static void fillAlert(WebElement ele, String value) {
			Alert a = driver.switchTo().alert();
			a.sendKeys(value);
		}

		// 47
		public static void printAlert(WebElement ele) {
			Alert a = driver.switchTo().alert();
			System.out.println(a.getText());
		}

		// 48
		public static void pressShiftKey(WebElement ele) {
			Actions a = new Actions(driver);
			a.keyDown(ele, Keys.SHIFT).perform();
		}

		// 49
		public static void releaseShift(WebElement ele) {
			Actions a = new Actions(driver);
			a.keyUp(Keys.SHIFT).perform();
		}

		// 50
		public static void toCopy() throws AWTException {
			Robot r = new Robot();
			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyPress(KeyEvent.VK_C);
			r.keyRelease(KeyEvent.VK_CONTROL);
			r.keyRelease(KeyEvent.VK_C);
		}

		// 51
		public static void toPaste() throws AWTException {
			Robot r = new Robot();
			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyPress(KeyEvent.VK_V);
			r.keyRelease(KeyEvent.VK_CONTROL);
			r.keyRelease(KeyEvent.VK_V);
		}

		// 52
		public static void toSelectAll() throws AWTException {
			Robot r = new Robot();
			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyPress(KeyEvent.VK_A);
			r.keyRelease(KeyEvent.VK_CONTROL);
			r.keyRelease(KeyEvent.VK_A);
		}

		// 53
		public static void downArrow() throws AWTException {
			Robot r = new Robot();
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
		}

		// 54
		public static void upArrow() throws AWTException {
			Robot r = new Robot();
			r.keyPress(KeyEvent.VK_KP_UP);
			r.keyRelease(KeyEvent.VK_KP_UP);
		}

		// 55
		public static void toUndo() throws AWTException {
			Robot r = new Robot();
			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyPress(KeyEvent.VK_Z);
			r.keyRelease(KeyEvent.VK_CONTROL);
			r.keyRelease(KeyEvent.VK_Z);
		}

		// 56
		public static void toSave() throws AWTException {
			Robot r = new Robot();
			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyPress(KeyEvent.VK_S);
			r.keyRelease(KeyEvent.VK_CONTROL);
			r.keyRelease(KeyEvent.VK_S);
		}

		// 57
		public static void toDelete() throws AWTException {
			Robot r = new Robot();
			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyPress(KeyEvent.VK_DELETE);
			r.keyRelease(KeyEvent.VK_CONTROL);
			r.keyRelease(KeyEvent.VK_DELETE);
		}

		// 59
		public static void toCut() throws AWTException {
			Robot r = new Robot();
			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyPress(KeyEvent.VK_X);
			r.keyRelease(KeyEvent.VK_CONTROL);
			r.keyRelease(KeyEvent.VK_X);
		}

		// 60
		public void toSpace() throws AWTException {
			Robot r = new Robot();
			r.keyPress(KeyEvent.VK_SPACE);
			r.keyRelease(KeyEvent.VK_SPACE);
		}

		// 61
		public void toBackSpace() throws AWTException {
			Robot r = new Robot();
			r.keyPress(KeyEvent.VK_BACK_SPACE);
			r.keyRelease(KeyEvent.VK_BACK_SPACE);
		}

		// 62
		public void capsOn() throws AWTException {
			Robot r = new Robot();
			r.keyPress(KeyEvent.VK_CAPS_LOCK);
		}

		// 63
		public void capsOff() throws AWTException {
			Robot r = new Robot();
			r.keyRelease(KeyEvent.VK_CAPS_LOCK);
		}

		// 64
		public void toenter() throws AWTException {
			Robot r = new Robot();
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
		}

		// 65
		public void toTab() throws AWTException {
			Robot r = new Robot();
			r.keyPress(KeyEvent.VK_TAB);
			r.keyRelease(KeyEvent.VK_TAB);
		}

		// 67
		public static void intFrame(int index) {
			driver.switchTo().frame(index);
		}

		// 68
		public static void stringFrame(String nameorid) {
			driver.switchTo().frame(nameorid);
		}

		// 69
		public static void webFrame(WebElement ele) {
			driver.switchTo().frame(ele);
		}

		// 70
		public static void defaultframe() {
			driver.switchTo().defaultContent();
		}

		// 71
		public static void handleWins() {
			String handle = driver.getWindowHandle();
			Set<String> allwindId = driver.getWindowHandles();
			for (String eachId : allwindId) {

				if (!eachId.equals(handle)) {
					driver.switchTo().window(eachId);
				}
			}
		}

		// 72
		public static void waitElementClickable(By locator, int timeoutInSeconds) {
			WebDriverWait w = new WebDriverWait(driver, timeoutInSeconds);
			w.until(ExpectedConditions.elementToBeClickable(locator));
		}

		// 73
		
		public static void waitElementVisible(By string, int timeoutInSeconds) {
			WebDriverWait w = new WebDriverWait(driver, timeoutInSeconds);
			w.until(ExpectedConditions.visibilityOfElementLocated(string));
		}

		// 74
		public static void fluentWait(By locator, int timeoutInSeconds, int pollingIntervalInSeconds) {
			FluentWait<WebDriver> w = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(timeoutInSeconds))
					.pollingEvery(Duration.ofSeconds(pollingIntervalInSeconds)).ignoring(Throwable.class);
			w.until(ExpectedConditions.presenceOfElementLocated(locator));
		}

		// 75
		public static void closeBrowser() {
			driver.quit();
		}
		//76
	public static String getData(int rowNumber, int cellNumber) throws IOException {
			
			//1.Declare the location
			File f = new File("C:\\Users\\PK\\eclipse-workspace\\MavenProject\\target\\TestData\\Myprojecthire.xlsx");
			
			//2.Read the Data from excel format
			FileInputStream fin = new FileInputStream(f);
			
			//3.Type of workbook
			Workbook w = new XSSFWorkbook(fin);
			
			//4.get the specific sheet
			Sheet s = w.getSheet("hirepage");
			
		
			Row row = s.getRow(rowNumber);
			
			Cell cell = row.getCell(cellNumber);
			
			int cellType = cell.getCellType();
			
			String value="";
			if (cellType==1) {
				 value = cell.getStringCellValue();
			}
			else if (DateUtil.isCellDateFormatted(cell)) {
				Date d = cell.getDateCellValue();
				SimpleDateFormat sim = new SimpleDateFormat("dd,MMMM,yyyy");
				value = sim.format(d);
			}
			else {
				double d = cell.getNumericCellValue();
				//Convert Double to Long
				
				long l = (long) d;
				
				 value = String.valueOf(l);

			}
			return value;
	}
	
	//77
		public static void screenshot( String name) throws IOException {
			
			TakesScreenshot tk = (TakesScreenshot)driver;

			File src = tk.getScreenshotAs(OutputType.FILE);

			File dsc = new File("C:\\Users\\PK\\eclipse-workspace\\MyProject\\target\\Screenshot"+name+".jpg");

			FileUtils.copyFile(src, dsc);
		}

	}


































