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

WebUI.verifyElementVisible(findTestObject('Object Repository/SauceDemo-ObjectRepo/Page_Swag Labs/btn_Login'))

WebUI.setText(findTestObject('Object Repository/SauceDemo-ObjectRepo/Page_Swag Labs/input_Username'), GlobalVariable.username)

WebUI.setText(findTestObject('Object Repository/SauceDemo-ObjectRepo/Page_Swag Labs/input_Password'), GlobalVariable.password)

WebUI.click(findTestObject('Object Repository/SauceDemo-ObjectRepo/Page_Swag Labs/btn_Login'))

WebUI.verifyElementVisible(findTestObject('Object Repository/SauceDemo-ObjectRepo/Page_Swag Labs/txt_Products'))

WebUI.selectOptionByValue(findTestObject('Object Repository/SauceDemo-ObjectRepo/Page_Swag Labs/ddl'), 'lohi', false)

WebUI.click(findTestObject('Object Repository/SauceDemo-ObjectRepo/Page_Swag Labs/btn_AddToCartSauceLabsOnesie'))

WebUI.click(findTestObject('Object Repository/SauceDemo-ObjectRepo/Page_Swag Labs/btn_GoToCart'))

WebUI.click(findTestObject('Object Repository/SauceDemo-ObjectRepo/Page_Swag Labs/btn_Checkout'))

WebUI.setText(findTestObject('Object Repository/SauceDemo-ObjectRepo/Page_Swag Labs/input_FirstName'), GlobalVariable.firstName)

WebUI.setText(findTestObject('Object Repository/SauceDemo-ObjectRepo/Page_Swag Labs/input_LastName'), GlobalVariable.lastName)

WebUI.setText(findTestObject('Object Repository/SauceDemo-ObjectRepo/Page_Swag Labs/input_PostalCode'), GlobalVariable.postalCode)

WebUI.click(findTestObject('Object Repository/SauceDemo-ObjectRepo/Page_Swag Labs/btn_Continue'))

WebUI.verifyElementVisible(findTestObject('Object Repository/SauceDemo-ObjectRepo/Page_Swag Labs/txt_CheckoutOverview'))

WebUI.verifyElementText(findTestObject('SauceDemo-ObjectRepo/Page_Swag Labs/txt_TotalPrice'), GlobalVariable.price)

WebUI.click(findTestObject('Object Repository/SauceDemo-ObjectRepo/Page_Swag Labs/btn_Finish'))

WebUI.verifyElementText(findTestObject('Object Repository/SauceDemo-ObjectRepo/Page_Swag Labs/txt_ThankYouForYourOrder'), 'Thank you for your order!')

WebUI.click(findTestObject('Object Repository/SauceDemo-ObjectRepo/Page_Swag Labs/btn_BackHome'))

WebUI.click(findTestObject('Object Repository/SauceDemo-ObjectRepo/Page_Swag Labs/btn_Menu'))

WebUI.click(findTestObject('Object Repository/SauceDemo-ObjectRepo/Page_Swag Labs/btn_Logout'))

WebUI.verifyElementVisible(findTestObject('Object Repository/SauceDemo-ObjectRepo/Page_Swag Labs/btn_Login'))

