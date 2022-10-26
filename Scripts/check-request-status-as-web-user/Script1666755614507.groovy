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

WebUI.navigateToUrl('https://deliverinhour.com/')

WebUI.click(findTestObject('Object Repository/check-request-status-as-web-user/Page_Toronto Delivery Service  Same Day Del_3d9e3b/a_Login'))

WebUI.setText(findTestObject('Object Repository/check-request-status-as-web-user/Page_Sign In/input_Driver_email'), 'sergiy.prygara@yahoo.com')

WebUI.setEncryptedText(findTestObject('Object Repository/check-request-status-as-web-user/Page_Sign In/input_Driver_password'), 
    'wNvTdfHpFC2UgmYK5YlIyg==')

WebUI.click(findTestObject('Object Repository/check-request-status-as-web-user/Page_Sign In/input_Remember me_form-control'))

WebUI.click(findTestObject('Object Repository/check-request-status-as-web-user/Page_Home/a_Direct Request'))

WebUI.click(findTestObject('Object Repository/check-request-status-as-web-user/Page_Direct Request List/i_Pending_fa fa-chevron-down togfa'))

WebUI.click(findTestObject('Object Repository/check-request-status-as-web-user/Page_Direct Request List/span_Pending'))

WebUI.closeBrowser()

