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
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.testobject.TestObjectXpath as TestObjectXpath

// Data set

String url = "www.automationpractice.com";
String email = "12345@yahoo.com";
String password = "12345";
String sizeValue = "2";
String itemSize = "M";
String listItemAttributeName = "class";
String listItemAttributeValue = "selected";
String colorLinkAttributeName = "name";
String colorLinkAttributeValue = "Black";

WebUI.openBrowser(null);

WebUI.navigateToUrl(url);

WebUI.click(findTestObject("Object Repository/My Store Page/Sign in input"));

WebUI.setText(findTestObject("Object Repository/Sign in page/Email address input"), email);

WebUI.setText(findTestObject("Object Repository/Sign in page/Password input"), password);

WebUI.click(findTestObject("Object Repository/Sign in page/Sign in button"));

WebUI.click(findTestObject("Object Repository/Customer Account Page/Home button"));

WebUI.click(findTestObject("Object Repository/Item Inventory/Printed Summer Dress item"));

WebUI.selectOptionByValue(findTestObject("Object Repository/Item Page/Select size input"), sizeValue, false);

WebUI.verifyElementText(findTestObject("Object Repository/Item Page/Select size text"), itemSize);

WebUI.click(findTestObject("Object Repository/Item Page/Color black input"));

WebUI.delay(3);

WebUI.verifyElementAttributeValue(findTestObject("Object Repository/Item Page/Color Status"), listItemAttributeName, listItemAttributeValue, 5);

WebUI.verifyElementAttributeValue(findTestObject("Object Repository/Item Page/Color Link"), colorLinkAttributeName, colorLinkAttributeValue, 5);

WebUI.closeBrowser()
