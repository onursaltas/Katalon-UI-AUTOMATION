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

'Open browser lemonilo'
WebUI.openBrowser('https://www.lemonilo.com/')

'Click button daftar on homepage'
WebUI.click(findTestObject('Object Repository/Lemonilo/Register Lemonilo/daftar_button'))

'User input email'
WebUI.setText(findTestObject('Object Repository/Lemonilo/Register Lemonilo/input_email'), 'test#mailinator.com')

'User input password'
WebUI.setText(findTestObject('Object Repository/Lemonilo/Register Lemonilo/input_password'), '123456')

'User input nama lengkap'
WebUI.setText(findTestObject('Object Repository/Lemonilo/Register Lemonilo/nama_lengkap'), 'test')

'User click button daftar'
WebUI.click(findTestObject('Object Repository/Lemonilo/Register Lemonilo/button_daftar'))

'user will seee erorr on field email'
WebUI.verifyElementPresent(findTestObject('Object Repository/Lemonilo/Register invalid email/invalid_email'), 6)

'Then close browser'
WebUI.closeBrowser()
