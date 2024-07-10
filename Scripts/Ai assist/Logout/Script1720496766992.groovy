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

/*
*  Open a browser, navigate to a specific URL, maximize the window, and add a delay before proceeding.
*
*  1. Open a browser with no specific URL.
*  2. Navigate to the provided URL.
*  3. Maximize the window.
*  4. Add a delay of 3 seconds.
*
*/
WebUI.setText(findTestObject('Home page/username'), 'aldo')

WebUI.delay(3)

WebUI.setText(findTestObject('Home page/Passw'), 'indocyber')

WebUI.delay(3)

WebUI.click(findTestObject('Home page/Buton login'))

WebUI.click(findTestObject('Logout/logot'))

WebUI.takeScreenshotAsCheckpoint('menampilkan warning alert ')

WebUI.click(findTestObject('Logout/button yes'))

WebUI.takeScreenshotAsCheckpoint('kembali ke halaman login')
/*
*  Automate the login and logout process on a web page.
*
*  1. Set text 'aldo' in the username field.
*  2. Wait for 3 seconds.
*  3. Set text 'indocyber' in the password field.
*  4. Wait for 3 seconds.
*  5. Click on the login button.
*  6. Click on the logout button.
*  7. Take a screenshot as a checkpoint for displaying a warning alert.
*  8. Click on the 'Yes' button.
*  9. Take a screenshot as a checkpoint for returning to the login page.
*
*/

