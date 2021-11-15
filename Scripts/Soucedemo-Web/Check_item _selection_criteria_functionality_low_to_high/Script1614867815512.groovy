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
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.saucedemo.com/')

WebUI.setText(findTestObject('Login page/Username text input'), 'standard_user')

WebUI.setText(findTestObject('Login page/Password input'), 'secret_sauce')

WebUI.click(findTestObject('Login page/Login button'))

WebUI.selectOptionByValue(findTestObject('Item Inventory/Sorting dropdown input'), 'lohi', false)

List<WebElement> prices = WebUiCommonHelper.findWebElements(findTestObject('Item Inventory/Price'), 5)

float previousPrice = 0

for (WebElement currentPrice : prices) {
    if (Float.parseFloat(currentPrice.text.substring(1)) < previousPrice) {
        KeywordUtil.markFailed()
    }
    
    previousPrice = Float.parseFloat(currentPrice.text.substring(1))
}

WebUI.closeBrowser()

