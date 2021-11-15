import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

// Data set

String url = "www.automationpractice.com";
String email = "12345@yahoo.com";
String password = "12345";
String firstName = "Lily";
String lastName = "White";
String streetName = "Melrose Avenue";
String cityName = "Los Angeles";
String stateValue = "5";
String zipCode = "93243";
String countryValue = "21";
String homePhoneNumber = "0000000000";
String addressTitle = "My address";

WebUI.openBrowser(null);

WebUI.navigateToUrl(url);

WebUI.click(findTestObject("Object Repository/My Store Page/Sign in input"));

WebUI.setText(findTestObject("Object Repository/Sign in page/Email address input"), email);

WebUI.setText(findTestObject("Object Repository/Sign in page/Password input"), password);

WebUI.click(findTestObject("Object Repository/Sign in page/Sign in button"));

WebUI.click(findTestObject("Object Repository/Customer Account Page/My Addresses input"));

WebUI.click(findTestObject("Object Repository/My Addresses Page/Add a new address button"));

WebUI.setText(findTestObject("Object Repository/My Addresses Page/First Name input"), firstName);

WebUI.setText(findTestObject("Object Repository/My Addresses Page/Last Name input"), lastName);

WebUI.setText(findTestObject("Object Repository/My Addresses Page/Address input"), streetName);

WebUI.setText(findTestObject("Object Repository/My Addresses Page/City input"), cityName);

WebUI.selectOptionByValue(findTestObject("Object Repository/My Addresses Page/State input"), stateValue, false);

WebUI.setText(findTestObject("Object Repository/My Addresses Page/Zip Code input"), zipCode);

WebUI.selectOptionByValue(findTestObject("Object Repository/My Addresses Page/Country input"), countryValue, false);

WebUI.setText(findTestObject("Object Repository/My Addresses Page/Home Phone input"), homePhoneNumber);

WebUI.setText(findTestObject("Object Repository/My Addresses Page/Address Title input"), addressTitle);

WebUI.click(findTestObject("Object Repository/My Addresses Page/Save button"));

WebUI.verifyElementPresent(findTestObject("Object Repository/My Addresses Page/Last Address Created"), 5, FailureHandling.STOP_ON_FAILURE);

WebUI.verifyElementText(findTestObject("Object Repository/My Addresses Page/Last Address Created"), addressTitle.toUpperCase());

WebUI.closeBrowser(null)