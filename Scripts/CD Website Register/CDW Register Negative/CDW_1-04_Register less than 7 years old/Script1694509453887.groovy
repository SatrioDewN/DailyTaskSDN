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

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.Url)

WebUI.click(findTestObject('Object Repository/Website/Home Page/Button_Buat Akun'))

WebUI.setText(findTestObject('Website/Make Account Page/Field_Name'), GlobalVariable.RegisterNama)

WebUI.setText(findTestObject('Website/Make Account Page/Field_Birth Date'), GlobalVariable.RegisterTanggalLahirNegative)

WebUI.setText(findTestObject('Website/Make Account Page/Field_Email'), GlobalVariable.RegisterEmail)

WebUI.setText(findTestObject('Website/Make Account Page/Field_Whatsapp'), GlobalVariable.RegisterWhatsapp)

WebUI.setText(findTestObject('Website/Make Account Page/Field_Password'), GlobalVariable.RegisterPassword)

WebUI.setText(findTestObject('Website/Make Account Page/Field_Password Confirmation'), GlobalVariable.RegisterPassword)

WebUI.click(findTestObject('Website/Make Account Page/Checkbox_Terms and condition'))

WebUI.click(findTestObject('Website/Make Account Page/Button_Daftar'))

WebUI.verifyElementText(findTestObject('Website/Make Account Page/Text_less than 7 year'), 'Umur harus minimal 7 tahun')

WebUI.closeBrowser()

