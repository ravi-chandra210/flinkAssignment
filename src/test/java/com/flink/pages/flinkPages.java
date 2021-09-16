package com.flink.pages;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.flink.pages.flinkPages;
import com.flink.utils.utils;

public class flinkPages {
	/**
	 * @author : Srinivasa Ravi Chandra Muktavarapu
	 * @category : Flink Assignment
	 * @Task : Automation of given Scenario
	 * @date : 14/09/2021
	 */
	
	protected static RemoteWebDriver driver;

	/************************************************ Static variables to store Excel sheet data **************************************/
	static String testCaseID; 
	static String browser;
	static String url;
	static String email;
	static String cardNumber;
	static String date;
	static String cvc;
	static String plz;

	/************************************************** Flink Page Elements ******************************************************/

	String temp = "//span[@id='temperature']";
	String moist = "(//button[@class='btn btn-primary'])[1]";
	String sunscreen = "(//button[@class='btn btn-primary'])[2]";
	String cart = "//span[@id='cart']";
	String sunscreenCart = "//button[@class='thin-text nav-link']";
	String moistProducts = "//div[@class='text-center col-4']"; //has 6 products
	String moistNames = "//p[@class='font-weight-bold top-space-10']"; //has 6 products
	String prices = "//p[contains(text(),'Price')]"; //has 6 elements
	String add = "//button[contains(@class, 'btn btn-primary')]"; //has 6 elements for both options
	String payWithCard = "//button[@class='stripe-button-el']";
	String iFrame = "//iframe[@name='stripe_checkout_app']";
	String mailid = "//input[@id='email']";
	String cardNo = "//input[@id='card_number']";
	String cardDate = "//input[@id='cc-exp']";
	String cvv = "//input[@id='cc-csc']";
	String pinCode = "//input[@id='billing-zip']";
	String payNow = "//span[@class='iconTick']";
	String success = "//div[@class='row justify-content-center']//h2";

	/********************************************** Methods ******************************************************/

	/*..... Required class objects .....*/
	utils utilsOb = new utils();
	org.apache.logging.log4j.Logger log = LogManager.getLogger(flinkPages.class);


	/*..... Browser System properties .....*/
	static {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
	}

	/*..... This Method will read test data from provided excel sheet .....*/
	public void getSheetData(String testName){
		try {
			utils.getTestData(testName);
			testCaseID=utils.storeData("Test Case Name");
			log.info("Executing testCaseId...." + testCaseID );
			browser = utils.storeData("BROWSER");
			url = utils.storeData("URL");
			email = utils.storeData("EMAIL");
			cardNumber = utils.storeData("CARDNUMBER");
			date = utils.storeData("DATE");
			cvc = utils.storeData("CVC");
			plz = utils.storeData("PLZ");
		} catch (IOException e) {
			log.error("Error occured while reading the test data from excel sheet");
		}
	}

	/*.....This Method will Launch browser and launching flink test URL. 
	 * Browser name and Website URL is passed from Test data excel sheet .....*/
	public WebDriver launchflinkWebsite(){
		try {
			if(browser.equalsIgnoreCase("chrome")) {
				driver = new ChromeDriver();
			}else if(browser.equalsIgnoreCase("Firefox")) {
				driver = new FirefoxDriver();                      
			}
			utilsOb.waitForElm(3);
			driver.get(url);		
			driver.manage().window().maximize();
			//utilsOb.waitForElm(3);
			utilsOb.waitForGivenElem(driver, temp);
		} catch (Exception e) {
			log.error("Error occured while launching the flink test url in desired browser");
		}
		return driver;
	}
	
	/*....This Method will select the required product category according to the 
	 * temperature displayed on the screen....*/
	
	public void selectProductCategory() {
		String temp2= null;
		int tempNum = 0 ;
		WebElement t1 = driver.findElementByXPath(temp);
		//updateTemp("10");
		String temp1 = t1.getText();
		log.info(temp1);
		if(temp1.contains("°C")) {
			temp2 = (String) temp1.subSequence(0, 2); //String manipulation methods
			temp2 = temp2.trim();
			tempNum = Integer.parseInt(temp2);
		}
		
		log.info(temp2);
		if (tempNum <= 19) {
			driver.findElementByXPath(moist).click();
			log.info("Customer is navigating to Moisturizers products page");
		}
		else if(tempNum >= 34) {
			driver.findElementByXPath(sunscreen).click();
			log.info("Customer is navigating to Sunscreen products page");
		}
		else {
			log.info("There is nothing to purchase");
		}
	}
	
	/*....This method is add moisturiser products to the cart....*/
	public void getCheapestProduct(String prdctType) {
		try {
				String key = null;
				String value = null;
				int val = 0;
				List <WebElement> lst_moistProduct = driver.findElements(By.xpath(moistNames));
				List <WebElement> lst_moistPrices = driver.findElements(By.xpath(prices));
				List <WebElement> lst_addButton = driver.findElements(By.xpath(add));		
				Map<String, Integer> moistNames = new HashMap<String, Integer>();
			//	Map<String, WebElement> moistAddBtn = new HashMap<String, WebElement>();
				if(lst_moistProduct.size()>0 && lst_moistPrices.size()>0) {
					for(int i=0;i<lst_moistProduct.size();i++){
						key = lst_moistProduct.get(i).getText();
						value = lst_moistPrices.get(i).getText();
						//log.info("key is " + key + " value is " + value);
						int strLng = value.length();
						value = utilsOb.brkString(value, strLng-3);
						//log.info("Price of the product is : "+value);
						val = utilsOb.convertStringInt(value);
						if(key.contains(prdctType)) {
							moistNames.put(key, val);
						}else {
							log.info(" Product is type "+ prdctType );
						}
						
						// moistAddBtn.put(key, lst_addButton.get(i));	
						log.info("Search result is found as : " + moistNames);
					} 
				}else {
					log.info("product list is empty ");
				}
				String  cheapstPrdct = utilsOb.getMinValKeyofMap(moistNames);
				log.info("Cheapest available product is :" + cheapstPrdct);
				log.info("Cheapest available product is :" + cheapstPrdct);
				for(int k=0;k<lst_moistProduct.size();k++){
					WebElement currElem = lst_moistProduct.get(k);
					String curPrdct = currElem.getText();
					if(curPrdct.contains(cheapstPrdct)) {
						lst_addButton.get(k).click();
						log.info("Cheapest product has been added to the cart ");
					}
					else {}
			} 
			
		} catch (Exception e) {
		}
	}
	
	/*....This method is to click cart after entering the products....*/
	public void clickCart() {
		utilsOb.waitAndClick(driver, 1, cart);
	}
	
	/*....This method is to click pay with card....*/
	public void clickCard() {
		utilsOb.waitAndClick(driver, 1, payWithCard);
	}
	
	/*....This method is to enter mail id and credit card details and click pay now....*/
	public void clickPay() throws InterruptedException {
		WebElement iframe = driver.findElementByXPath(iFrame);
		driver.switchTo().frame(iframe);
		Thread.sleep(5000);
		utilsOb.sendInput(driver, mailid, email);
		new Actions(driver).moveToElement(driver.findElementByXPath(cardNo)).click().sendKeys(cardNumber).build().perform();
		new Actions(driver).moveToElement(driver.findElementByXPath(cardDate)).click().sendKeys(date).build().perform();
		utilsOb.sendInput(driver, cvv, cvc);
		utilsOb.sendInput(driver, pinCode, plz);
		utilsOb.selectElement(driver, payNow).click();
		Thread.sleep(10000);
		driver.switchTo().defaultContent();
	}
	
	/*....This method is to validate successful payment....*/
	public void successfulPayment() {
		String m1 = utilsOb.getElemText(driver, success);
		if(m1.contains("PAYMENT SUCCESS")) {
			log.info("The Payment of selected products is a success");
		}
		else {
			log.info("The Payment for the selected products is failed");
		}
	}

	/*..... This Method will close all the active sessions of browser .....*/
	public void closeBrowser() {
		driver.quit();
	}
	
	/*....unused methods....*/
//	public void updateTemp(String setTemp) {
//	JavascriptExecutor js = (JavascriptExecutor) driver;
//	js.executeScript("document.getElementById('temperature').innerHTML='"+setTemp+"'");
//}

}
