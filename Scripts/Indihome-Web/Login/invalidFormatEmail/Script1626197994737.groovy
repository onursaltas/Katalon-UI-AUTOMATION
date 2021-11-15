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

'Given user open website indihome'
WebUI.openBrowser('https://myih.telkom.co.id/')

'When user click button masuk/daftar'
WebUI.click(findTestObject('Object Repository/Login/buttonMasukDaftar'))

'And user click button masuk'
WebUI.click(findTestObject('Object Repository/Login/buttonMasuk'))

'And user input invalid format email'
WebUI.setText(findTestObject('Object Repository/Login/inputPonselEmail'), 'beniwinanto#gmail.com')

'Then user will see error message'
WebUI.verifyElementPresent(findTestObject('Object Repository/Login/labelerrorMessage'), 0)
WebUI.closeBrowser()