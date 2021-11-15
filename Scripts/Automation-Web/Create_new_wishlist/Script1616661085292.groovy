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

//Data set

String wishlistName = "Evening Dresses";
String email = "12345@yahoo.com";
String password = "12345";
String url = "www.automationpractice.com";

WebUI.openBrowser(null);

WebUI.navigateToUrl(url);

WebUI.click(findTestObject("Object Repository/My Store Page/Sign in input"));

WebUI.setText(findTestObject("Object Repository/Sign in page/Email address input"), email);

WebUI.setText(findTestObject("Object Repository/Sign in page/Password input"), password);

WebUI.click(findTestObject("Object Repository/Sign in page/Sign in button"));

WebUI.click(findTestObject("Object Repository/Customer Account Page/My wishlists input"));

WebUI.setText(findTestObject("Object Repository/Customer Account Page/Name input"), wishlistName);

WebUI.click(findTestObject("Object Repository/Customer Account Page/Save button"));

WebUI.verifyElementText(findTestObject("Object Repository/Customer Account Page/Wishlist Title"), wishlistName);

WebUI.closeBrowser(null);
	
	