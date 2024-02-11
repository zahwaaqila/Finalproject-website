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

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://advantageonlineshopping.com/#/register')

WebUI.click(findTestObject('Object Repository/Login/Register/Page_Advantage Shopping/div_UsernameUsername'))

WebUI.setText(findTestObject('Object Repository/Login/Register/Page_Advantage Shopping/input_usernameRegisterPage'), 'test12')

WebUI.setText(findTestObject('Object Repository/Login/Register/Page_Advantage Shopping/input_emailRegisterPage'), 'test12@gmail.com')

WebUI.click(findTestObject('Object Repository/Login/Register/Page_Advantage Shopping/label_Password'))

WebUI.setEncryptedText(findTestObject('Object Repository/Login/Register/Page_Advantage Shopping/input_passwordRegisterPage'), 
    'gxR0YZb+bo4=')

WebUI.setEncryptedText(findTestObject('Object Repository/Login/Register/Page_Advantage Shopping/input_confirm_passwordRegisterPage'), 
    'gxR0YZb+bo4=')

WebUI.click(findTestObject('Object Repository/Login/Register/Page_Advantage Shopping/input_i_agree'))

WebUI.click(findTestObject('Object Repository/Login/Register/Page_Advantage Shopping/button_REGISTER'))

WebUI.closeBrowser()

