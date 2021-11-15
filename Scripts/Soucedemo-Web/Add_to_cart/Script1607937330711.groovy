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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.saucedemo.com/index.html')

WebUI.setText(findTestObject('Login page/Username text input'), 'standard_user')

WebUI.setText(findTestObject('Login page/Password input'), 'secret_sauce')

WebUI.click(findTestObject('Login page/Login button'))

WebUI.click(findTestObject('Item Inventory/Sauce Labs Backpack item'))

WebUI.click(findTestObject('Item Page/Add to cart button'))

WebUI.click(findTestObject('Go to cart/Go to cart  input'))

WebUI.verifyElementText(findTestObject('Cart/Sauce Labs Backpack cart'), 'Sauce Labs Backpack')

WebUI.closeBrowser()

