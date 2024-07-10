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

WebUI.click(findTestObject('Menu/Taskk'))

WebUI.takeScreenshotAsCheckpoint('Menampilkan dashboard')
/*
*  Open a browser, navigate to a specific URL, maximize the window, set text in username and password fields, click on login button, navigate to a task, and take a screenshot as a checkpoint.
*
*  1. Open a browser with an empty URL.
*  2. Navigate to a specific URL.
*  3. Maximize the window.
*  4. Set text 'aldo' in the username field.
*  5. Set text 'indocyber' in the password field.
*  6. Click on the login button.
*  7. Click on a task from the menu.
*  8. Take a screenshot as a checkpoint for displaying the dashboard.
*
*/

