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

WebUI.click(findTestObject('Customer Account Page/Contact us button'))

WebUI.selectOptionByValue(findTestObject('Customer Service Page/Subject heading select'), '2', false)

WebUI.setText(findTestObject('Customer Service Page/Email address input'), '12345@yahoo.com')

WebUI.selectOptionByValue(findTestObject('Customer Service Page/Order reference select'), '293598', false)

WebUI.selectOptionByValue(findTestObject('Customer Service Page/Product select'), '3', false)

WebUI.setText(findTestObject('Customer Service Page/Message box'), 'Message to customer service.')

WebUI.click(findTestObject('Customer Service Page/Send button'))

WebUI.verifyElementText(findTestObject('Customer Service Page/Message sent successfully alert'), 'Your message has been successfully sent to our team.')

WebUI.closeBrowser()

