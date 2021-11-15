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

WebUI.navigateToUrl('https://www.saucedemo.com/inventory.html')

WebUI.click(findTestObject('Item Inventory/Sauce Labs Bolt T-Shirt item'))

WebUI.click(findTestObject('Item Page/Add to cart button'))

WebUI.click(findTestObject('Go to cart/Go to cart  input'))

WebUI.verifyElementText(findTestObject('Cart/Sauce Labs Bolt T-Shirt cart'), 'Sauce Labs Bolt T-Shirt')

WebUI.click(findTestObject('Cart/Checkout button'))

WebUI.setText(findTestObject('Checkout info/First name input'), 'Lily')

WebUI.setText(findTestObject('Checkout info/Last name input'), 'White')

WebUI.setText(findTestObject('Checkout info/Zip code input'), '12345')

WebUI.click(findTestObject('Checkout info/Continue button'))

WebUI.verifyElementText(findTestObject('Checkout Overview/Sauce Labs Bolt T-Shirt Checkout'), 'Sauce Labs Bolt T-Shirt')

WebUI.click(findTestObject('Checkout Overview/Finish button'))

WebUI.verifyElementNotPresent(findTestObject('Thank you note/Checkout complete container'), 2)

WebUI.closeBrowser()
