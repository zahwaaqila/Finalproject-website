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


WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/Login/Contact Us/Page_Advantage Shopping/a_CONTACT US'))

WebUI.delay(5)

WebUI.selectOptionByLabel(findTestObject('Object Repository/Login/Contact Us/Page_Advantage Shopping/select_Select CategoryLaptopsHeadphonesTabl_1ef56f'), 
    Category1, false)

WebUI.delay(5)


WebUI.selectOptionByLabel(findTestObject('Object Repository/Login/Contact Us/Page_Advantage Shopping/select_Select ProductHP Chromebook 14 G1(EN_361ba3'), 
    Product, false)

WebUI.clickOffset(findTestObject('Object Repository/Login/Contact Us/Page_Advantage Shopping/select_Select ProductHP Chromebook 14 G1(EN_361ba3'), 45, 45)

WebUI.delay(10)

WebUI.setText(findTestObject('Object Repository/Login/Contact Us/Page_Advantage Shopping/input_emailContactUs'), Email)

WebUI.setText(findTestObject('Object Repository/Login/Contact Us/Page_Advantage Shopping/textarea_subjectTextareaContactUs'), 
    Subject)

WebUI.click(findTestObject('Object Repository/Login/Contact Us/Page_Advantage Shopping/button_SEND'))

WebUI.verifyElementText(findTestObject('Object Repository/Login/Contact Us/Page_Advantage Shopping/p_Thank you for contacting Advantage support'),
			'Thank you for contacting Advantage support.')

WebUI.click(findTestObject('Object Repository/Login/Contact Us/Page_Advantage Shopping/a_CONTINUE SHOPPING'))

WebUI.closeBrowser()
