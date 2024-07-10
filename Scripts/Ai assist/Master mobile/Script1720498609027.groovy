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

WebUI.navigateToUrl('https://gpstqa-new.dipostar.org/dipo/')

WebUI.maximizeWindow()

WebUI.delay(3)

WebUI.setText(findTestObject('Home page/username'), 'aldo')

WebUI.delay(3)

WebUI.setText(findTestObject('Home page/Passw'), 'indocyber')

WebUI.delay(3)

WebUI.click(findTestObject('Home page/Buton login'))

WebUI.click(findTestObject('Menu/Masterrr'))

WebUI.click(findTestObject('Mobile printer/Button mobile printer'))

WebUI.takeScreenshotAsCheckpoint('menampilkan halaman mobile printer')

WebUI.setText(findTestObject('Mobile printer/Text search'), 'MP010')

WebUI.click(findTestObject('Mobile printer/Button search'))

WebUI.takeScreenshotAsCheckpoint('menampilkan pencarian')
/*
*  Automate the process of opening a browser, navigating to a specific URL, logging in, and performing actions on a web page.
*
*  1. Open a browser.
*  2. Navigate to a specific URL.
*  3. Maximize the window.
*  4. Set text in the username field.
*  5. Set text in the password field.
*  6. Click on the login button.
*  7. Click on a menu item.
*  8. Click on a button related to mobile printers.
*  9. Take a screenshot as a checkpoint for the mobile printer page.
*  10. Set text in the search field with 'MP010'.
*  11. Click on the search button.
*  12. Take a screenshot as a checkpoint for the search results page.
*
*/

