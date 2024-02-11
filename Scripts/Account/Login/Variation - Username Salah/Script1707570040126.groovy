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

WebUI.navigateToUrl('https://advantageonlineshopping.com/')

WebUI.click(findTestObject('Object Repository/Login/Page_Advantage Shopping/svgmenuUser'))

WebUI.setText(findTestObject('Object Repository/Login/Page_Advantage Shopping/input_username'), 'lalaye')

WebUI.click(findTestObject('Object Repository/Login/Page_Advantage Shopping/label_Password'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Advantage Shopping/input_password'), 'bf9bMJMJS7K1kctm/RDkRQ==')

WebUI.click(findTestObject('Object Repository/Login/Page_Advantage Shopping/button_SIGN IN'))

if (WebUI.verifyElementText(findTestObject('Object Repository/Login/Page_Advantage Shopping/label_Incorrect user name or password'), 
    'Incorrect user name or password.') == true) {
    WebUI.setText(findTestObject('Object Repository/Login/Page_Advantage Shopping/input_username'), 'Lalayeye')

    WebUI.setEncryptedText(findTestObject('Object Repository/Login/Page_Advantage Shopping/input_password'), 'bf9bMJMJS7K1kctm/RDkRQ==')

    WebUI.click(findTestObject('Object Repository/Login/Page_Advantage Shopping/button_SIGN IN'))

    WebUI.verifyElementText(findTestObject('Object Repository/Login/Page_Advantage Shopping/span_Lalayeye'), 'Lalayeye')
} else {
    WebUI.verifyElementText(findTestObject('Object Repository/Login/Page_Advantage Shopping/span_Lalayeye'), 'Lalayeye')
}

WebUI.closeBrowser()

