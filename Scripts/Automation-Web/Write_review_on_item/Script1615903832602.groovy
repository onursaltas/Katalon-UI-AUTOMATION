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

WebUI.navigateToUrl('www.automationpractice.com')

WebUI.click(findTestObject('My Store Page/Sign in input'))

WebUI.setText(findTestObject('Sign in page/Email address input'), '12345@yahoo.com')

WebUI.setText(findTestObject('Sign in page/Password input'), '12345')

WebUI.click(findTestObject('Sign in page/Sign in button'))

WebUI.click(findTestObject('Customer Account Page/Home button'))

WebUI.click(findTestObject('Item Inventory/Faded Short Sleeve T-shirts item'))

WebUI.click(findTestObject('null'))

WebUI.setText(findTestObject('null'), 'Review')

WebUI.setText(findTestObject('null'), 'This is a review.')

WebUI.click(findTestObject('null'))

WebUI.verifyElementText(findTestObject('null'), 'Your comment has been added and will be available once approved by a moderator')

WebUI.closeBrowser()

