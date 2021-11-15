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

'Verifikasi jika user bisa klik button "lihat lainnya" di halaman trending'

'Given user membuka website kumparan'
WebUI.openBrowser('https://kumparan.com/')

'When user klik tidak pada popup notifications'
WebUI.click(findTestObject('seeNews/notificationTidak'))

'And user klik button news on toolbar'
WebUI.click(findTestObject('Object Repository/seeNews/buttonNews'))

'And user klik button lihat lainnya'
WebUI.click(findTestObject('Object Repository/seeNews/buttonLihatLainnya'))

'Then user memastikan bahwa sudah di halaman trending'
WebUI.verifyElementPresent(findTestObject('Object Repository/seeNews/labelTextTrending'), 3)

'Then user close browser'
WebUI.closeBrowser()