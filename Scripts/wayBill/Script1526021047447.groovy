import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.builtin.WaitForElementVisibleKeyword as WaitForElementVisibleKeyword
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.WebElement as WebElement

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:8080/home')

WebUI.doubleClick(findTestObject('Tmslite_Login/button_Login'))

WebUI.delay(3)

WebUI.setText(findTestObject('Tmslite_Login/Page_Sign In with Auth0/input_username'), 'testuser1')

WebUI.setText(findTestObject('Tmslite_Login/Page_Sign In with Auth0/input_password'), 'Testuser@1')

WebUI.click(findTestObject('Tmslite_Login/Page_Sign In with Auth0/span_Log In'))

WebUI.delay(10)

WebUI.executeJavaScript('document.querySelector("px-app-nav").shadowRoot.querySelector("#items > px-app-nav-item:nth-child(5)").click()', 
    null)
String ccc  = WebUI.executeJavaScript('return document.querySelector("px-app-nav").shadowRoot.querySelector("#items > px-app-nav-item:nth-child(5)").shadowRoot.querySelector("p").innerHTML', null)
 

println (ccc)

WebUI.click(findTestObject('Page_TMSlite/button_Add New Waybill'))

WebUI.delay(3)

WebUI.executeJavaScript('document.querySelector("px-modal").shadowRoot.querySelector("#accept-trigger-button").click()', 
    null)

WebUI.delay(2)

WebUI.executeJavaScript('document.querySelector("#root span.value.LabelValue-module_truncate_2eE5L > px-dropdown").shadowRoot.querySelector("#trigger").click()', 
    null)

WebUI.delay(2)

WebUI.executeJavaScript('document.querySelector("#root span.value.LabelValue-module_truncate_2eE5L > px-dropdown").shadowRoot.querySelector("#content").shadowRoot.querySelector("#dropdown div:nth-child(3)").click()', 
    null)

WebUI.delay(2)

WebUI.click(findTestObject('Page_TMSlite/button_Load More'))

WebUI.closeBrowser()

