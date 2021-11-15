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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

'Given user login backoffice lemonilo'
WebUI.openBrowser('https://www.lemonilo.com/')

'When user click button masuk on homepage'
WebUI.click(findTestObject('Object Repository/Lemonilo/Login Valid/button_masuk_homepage'))

'And user input email'
WebUI.setText(findTestObject('Object Repository/Lemonilo/Login Valid/input_email'), 'test14@mailinator.com')

'And user input password'
WebUI.setText(findTestObject('Object Repository/Lemonilo/Login Valid/input_password'), '123456')

'And user click button masuk'
WebUI.click(findTestObject('Object Repository/Lemonilo/Login Valid/button_masuk_login'))

'And user click button dropdown'
WebUI.click(findTestObject('Object Repository/Lemonilo/Logout/button_dropdown'))

'Then user will successfully to login'
WebUI.verifyElementPresent(findTestObject('Object Repository/Lemonilo/Login Valid/verify_user'), 10)

'Then close browser'
WebUI.closeBrowser()
