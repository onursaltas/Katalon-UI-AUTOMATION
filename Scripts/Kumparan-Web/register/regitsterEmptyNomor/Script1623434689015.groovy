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

'Verifikasi jika user tidak bisa mengkosongkan field nomor handphone jika register menggunakan nomor handphone'

'Given user membuka website kumparan'
WebUI.openBrowser('https://kumparan.com/')

'When user klik tidak pada popup notifications'
WebUI.click(findTestObject('seeNews/notificationTidak'))

'And user klik button profile'
WebUI.click(findTestObject('Object Repository/login/buttonProfile'))
WebUI.scrollToElement(findTestObject('Object Repository/register/buttonDaftarSekarang'), 0)

'And user klik button daftar sekarang'
WebUI.click(findTestObject('Object Repository/register/buttonDaftarSekarang'))

'And user klik button nomor handphone'
WebUI.click(findTestObject('Object Repository/register/buttonNomorHandphone'))

'And user input nomor handphnoe'
WebUI.setText(findTestObject('Object Repository/login/inputNomorHandphone'), '')

'And user klik button lanjutkan'
WebUI.click(findTestObject('Object Repository/login/buttonLanjutkan'))

'Then user akan melihat popup error'
WebUI.verifyElementPresent(findTestObject('Object Repository/login/labelEmptyEmail'), 0)