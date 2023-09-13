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

WebUI.click(findTestObject('Website/Home Page/Button_Masuk_Header'))

WebUI.setText(findTestObject('Website/Login Page/Field_Email'), GlobalVariable.LoginEmail)

WebUI.setText(findTestObject('Website/Login Page/Field_Password'), GlobalVariable.LoginPassword)

WebUI.click(findTestObject('Website/Login Page/Button_Login'))

WebUI.click(findTestObject('Object Repository/Website/Page_Be a Profressional Talent with Coding.ID/i_Kontak_fas fa-user-alt'))

WebUI.click(findTestObject('Object Repository/Website/Page_Be a Profressional Talent with Coding.ID/a_My Account'))

WebUI.click(findTestObject('Object Repository/Website/Page_Coding.ID - Dashboard/a_Profil'))

WebUI.click(findTestObject('Object Repository/Website/My Profile Page/a_Edit Profile'))

WebUI.uploadFile(findTestObject('Website/My Profile Page/img_L_avatar-icon'), GlobalVariable.FotoExcel)

WebUI.click(findTestObject('Website/My Profile Page/button_Save Changes'))

WebUI.verifyElementClickable(findTestObject('Website/My Profile Page/button_OK'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Website/My Profile Page/button_OK'))

WebUI.closeBrowser()

