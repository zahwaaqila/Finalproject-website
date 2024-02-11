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

globalVarCategory = 'laptops'

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://advantageonlineshopping.com/')

switch (globalVarCategory) {
	case globalVarCategory = 'laptops':
        WebUI.selectOptionByLabel(findTestObject('Object Repository/Login/Contact Us/Page_Advantage Shopping/select_Select CategoryLaptopsHeadphonesTabl_1ef56f'), 
           'Laptops', false)

        WebUI.selectOptionByLabel(findTestObject('Object Repository/Login/Contact Us/Page_Advantage Shopping/select_Select ProductHP Chromebook 14 G1(EN_361ba3'), 
            'HP Chromebook 14 G1(ES)', false)

        WebUI.setText(findTestObject('Object Repository/Login/Contact Us/Page_Advantage Shopping/input_emailContactUs'), 
            'test@gmail.com')

        WebUI.setText(findTestObject('Object Repository/Login/Contact Us/Page_Advantage Shopping/textarea_subjectTextareaContactUs'), 
            'test')

        WebUI.click(findTestObject('Object Repository/Login/Contact Us/Page_Advantage Shopping/button_SEND'))

        WebUI.verifyElementText(findTestObject('Object Repository/Login/Contact Us/Page_Advantage Shopping/p_Thank you for contacting Advantage support'), 
            'Thank you for contacting Advantage support.')

        WebUI.click(findTestObject('Object Repository/Login/Contact Us/Page_Advantage Shopping/a_CONTINUE SHOPPING'))
		
		break
		
	case globalVarCategory = 'headphones':
        WebUI.selectOptionByLabel(findTestObject('Object Repository/Login/Contact Us/Page_Advantage Shopping/select_Select CategoryLaptopsHeadphonesTabl_1ef56f'), 
            'Headphones', false)

        WebUI.selectOptionByLabel(findTestObject('Object Repository/Login/Contact Us/Page_Advantage Shopping/select_Select ProductBeats Studio 2 Over-Ea_81bad4'), 
            'Beats Studio 2 Over-Ear Matte Black Headphones', false)

        WebUI.setText(findTestObject('Object Repository/Login/Contact Us/Page_Advantage Shopping/input_emailContactUs'), 
            'test@gmail.com')

        WebUI.setText(findTestObject('Object Repository/Login/Contact Us/Page_Advantage Shopping/textarea_subjectTextareaContactUs'), 
            'test')

        WebUI.click(findTestObject('Object Repository/Login/Contact Us/Page_Advantage Shopping/button_SEND'))

        WebUI.verifyElementText(findTestObject('Object Repository/Login/Contact Us/Page_Advantage Shopping/p_Thank you for contacting Advantage support'), 
            'Thank you for contacting Advantage support.')

        WebUI.click(findTestObject('Object Repository/Login/Contact Us/Page_Advantage Shopping/a_CONTINUE SHOPPING'))
		break
		
	case globalVarCategory = 'tablets':
        WebUI.selectOptionByLabel(findTestObject('Object Repository/Login/Contact Us/Page_Advantage Shopping/select_Select CategoryLaptopsHeadphonesTabl_1ef56f'), 
            'Tablets', false)

        WebUI.selectOptionByLabel(findTestObject('Object Repository/Login/Contact Us/Page_Advantage Shopping/select_Select ProductHP ElitePad 1000 G2 Ta_18213c'), 
            'HP Pro Tablet 608 G1', false)

        WebUI.setText(findTestObject('Object Repository/Login/Contact Us/Page_Advantage Shopping/input_emailContactUs'), 
            'test@gmail.com')

        WebUI.setText(findTestObject('Object Repository/Login/Contact Us/Page_Advantage Shopping/textarea_subjectTextareaContactUs'), 
            'test')

        WebUI.click(findTestObject('Object Repository/Login/Contact Us/Page_Advantage Shopping/button_SEND'))

        WebUI.verifyElementText(findTestObject('Object Repository/Login/Contact Us/Page_Advantage Shopping/p_Thank you for contacting Advantage support'), 
            'Thank you for contacting Advantage support.')

        WebUI.click(findTestObject('Object Repository/Login/Contact Us/Page_Advantage Shopping/a_CONTINUE SHOPPING'))
		break
		
	default:
        break
}

WebUI.closeBrowser()

