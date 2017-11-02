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
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

'à¹€à¸?à¸´à¸”à¹€à¸?à¸£à¸²à¹€à¸?à¸­à¸£à¹?'
WebUI.openBrowser('', FailureHandling.CONTINUE_ON_FAILURE)

'à¸?à¸¢à¸²à¸¢à¸«à¸?à¹?à¸²à¸•à¹?à¸²à¸? à¹€à¸?à¸£à¸²à¹€à¸?à¸­à¸£à¹?'
WebUI.maximizeWindow(FailureHandling.CONTINUE_ON_FAILURE)

'à¹€à¸?à¹?à¸²à¸ªà¸¹à¹? URL'
WebUI.navigateToUrl('192.168.11.59', FailureHandling.CONTINUE_ON_FAILURE)

'login'
WebUI.click(findTestObject('Page_Guru TMDA/span_Login'), FailureHandling.CONTINUE_ON_FAILURE)

'login'
WebUI.setText(findTestObject('Page_Guru TMDA (1)/input_ng-untouched ng-valid ng'), 'piew', FailureHandling.CONTINUE_ON_FAILURE)

'login'
WebUI.setText(findTestObject('Page_Guru TMDA (1)/input_ng-untouched ng-pristine'), 'piew', FailureHandling.CONTINUE_ON_FAILURE)

'login'
WebUI.submit(findTestObject('Page_Guru TMDA (1)/button_Login'), FailureHandling.CONTINUE_ON_FAILURE)

'à¸?à¸¥à¸´à¸?à¹€à¸¡à¸?à¸¹ User Management'
WebUI.click(findTestObject('Change role/Page_Guru TMDA/a_User Management'))

'à¸?à¸£à¸­à¸?à¸?à¹?à¸­à¸?à¸§à¸²à¸¡à¸¥à¸?à¹?à¸?à¸?à¹?à¸­à¸?à¸?à¹?à¸?à¸«à¸²'
WebUI.setText(findTestObject('Change role/Page_Guru TMDA (2)/input_ng-untouched ng-valid ng'), 'fortest')

'à¸?à¸”à¸?à¸¸à¹?à¸¡à¹?à¸?à¹?à¹?à¸? Profile'
WebUI.click(findTestObject('Edit user profile/list/i_fa fa-pencil-square-o'))

'à¸?à¸”à¸ªà¸±à¸?à¸¥à¸±à¸?à¸©à¸“à¹?à¸”à¸´à¸?à¸ªà¸­à¸«à¸¥à¸±à¸?à¸?à¸·à¹?à¸­'
WebUI.click(findTestObject('Edit user profile/Edit//i_fa fa-pencil name'))

'à¸?à¸”à¸ªà¸±à¸?à¸¥à¸±à¸?à¸©à¸“à¹?à¸”à¸´à¸?à¸ªà¸­à¸«à¸¥à¸±à¸?à¸­à¸µà¹€à¸¡à¸¥'
WebUI.click(findTestObject('Edit user profile/Edit/i_fa fa-pencil email'))

'à¸¥à¸?à¸?à¹?à¸­à¸?à¸§à¸²à¸¡à¹?à¸?à¸?à¸¥à¹?à¸­à¸?à¸?à¹?à¸­à¸?à¸§à¸²à¸¡ First name'
WebUI.setText(findTestObject('Edit user profile/Edit//input_firstname'), 'e')

'à¸¥à¸?à¸?à¹?à¸­à¸?à¸§à¸²à¸¡à¹?à¸?à¸?à¸¥à¹?à¸­à¸?à¸?à¹?à¸­à¸?à¸§à¸²à¸¡ First name'
WebUI.sendKeys(findTestObject('Edit user profile/Edit//input_firstname'), Keys.chord(Keys.BACK_SPACE), FailureHandling.STOP_ON_FAILURE)

'à¸•à¸£à¸§à¸?à¸ªà¸­à¸?à¸?à¸¸à¹?à¸¡ Submit à¹?à¸¡à¹?à¸ªà¸²à¸¡à¸²à¸£à¸–à¸?à¸”à¹?à¸”à¹?'
WebUI.verifyElementNotClickable(findTestObject('Edit user profile/Edit/button_SUBMIT'))

'à¸?à¸£à¸­à¸?à¸?à¸·à¹?à¸­à¹€à¸?à¹?à¸?à¸•à¸±à¸§à¹€à¸¥à¸?'
WebUI.setText(findTestObject('Edit user profile/Edit//input_firstname'), '55555')

'à¸•à¸£à¸§à¸?à¸ªà¸­à¸?à¸?à¸¸à¹?à¸¡ Submit à¹?à¸¡à¹?à¸ªà¸²à¸¡à¸²à¸£à¸–à¸?à¸”à¹?à¸”à¹?'
WebUI.verifyElementNotClickable(findTestObject('Edit user profile/Edit/button_SUBMIT'))

'à¸?à¸£à¸­à¸?à¸?à¸·à¹?à¸­à¸—à¸µà¹?à¸–à¸¹à¸?à¸£à¸¹à¸?à¹?à¸?à¸?'
WebUI.setText(findTestObject('Edit user profile/Edit//input_firstname'), 'Piratchana')

'à¸¥à¸?à¸?à¹?à¸­à¸?à¸§à¸²à¸¡à¹?à¸?à¸?à¸¥à¹?à¸­à¸?à¸?à¹?à¸­à¸?à¸§à¸²à¸¡ Last name'
WebUI.setText(findTestObject('Edit user profile/Edit//input_lastname'), 'e')

'à¸¥à¸?à¸?à¹?à¸­à¸?à¸§à¸²à¸¡à¹?à¸?à¸?à¸¥à¹?à¸­à¸?à¸?à¹?à¸­à¸?à¸§à¸²à¸¡ Last name'
WebUI.sendKeys(findTestObject('Edit user profile/Edit//input_lastname'), Keys.chord(Keys.BACK_SPACE), FailureHandling.STOP_ON_FAILURE)

'à¸•à¸£à¸§à¸?à¸ªà¸­à¸?à¸?à¸¸à¹?à¸¡ Submit à¹?à¸¡à¹?à¸ªà¸²à¸¡à¸²à¸£à¸–à¸?à¸”à¹?à¸”à¹?'
WebUI.verifyElementNotClickable(findTestObject('Edit user profile/Edit/button_SUBMIT'))

'à¸?à¸£à¸­à¸?à¸?à¸²à¸¡à¸ªà¸?à¸¸à¸¥à¹€à¸?à¹?à¸?à¸•à¸±à¸§à¹€à¸¥à¸?'
WebUI.setText(findTestObject('Edit user profile/Edit//input_lastname'), '55555')

'à¸•à¸£à¸§à¸?à¸ªà¸­à¸?à¸?à¸¸à¹?à¸¡ Submit à¹?à¸¡à¹?à¸ªà¸²à¸¡à¸²à¸£à¸–à¸?à¸”à¹?à¸”à¹?'
WebUI.verifyElementNotClickable(findTestObject('Edit user profile/Edit/button_SUBMIT'))

'à¸?à¸£à¸­à¸?à¸?à¸²à¸¡à¸ªà¸?à¸¸à¸¥à¸—à¸µà¹?à¸–à¸¹à¸?à¸£à¸¹à¸?à¹?à¸?à¸?'
WebUI.setText(findTestObject('Edit user profile/Edit//input_lastname'), 'Maksub')

'à¸¥à¸?à¸?à¹?à¸­à¸?à¸§à¸²à¸¡à¹?à¸?à¸?à¸¥à¹?à¸­à¸?à¸?à¹?à¸­à¸?à¸§à¸²à¸¡ Email'
WebUI.setText(findTestObject('Edit user profile/Edit/input_email'), 'e')

'à¸¥à¸?à¸?à¹?à¸­à¸?à¸§à¸²à¸¡à¹?à¸?à¸?à¸¥à¹?à¸­à¸?à¸?à¹?à¸­à¸?à¸§à¸²à¸¡ Email'
WebUI.sendKeys(findTestObject('Edit user profile/Edit/input_email'), Keys.chord(Keys.BACK_SPACE), FailureHandling.STOP_ON_FAILURE)

'à¸•à¸£à¸§à¸?à¸ªà¸­à¸?à¸?à¸¸à¹?à¸¡ Submit à¹?à¸¡à¹?à¸ªà¸²à¸¡à¸²à¸£à¸–à¸?à¸”à¹?à¸”à¹?'
WebUI.verifyElementNotClickable(findTestObject('Edit user profile/Edit/button_SUBMIT'))

'à¸?à¸£à¸­à¸?à¸­à¸µà¹€à¸¡à¸¥à¹?à¸¡à¹?à¹?à¸ªà¹? @ à¹?à¸¥à¸°à¹?à¸¡à¹?à¸¡à¸µ .co'
WebUI.setText(findTestObject('Edit user profile/Edit/input_email'), 'Cremecreme')

'à¸•à¸£à¸§à¸?à¸ªà¸­à¸?à¸?à¸¸à¹?à¸¡ Submit à¹?à¸¡à¹?à¸ªà¸²à¸¡à¸²à¸£à¸–à¸?à¸”à¹?à¸”à¹?'
WebUI.verifyElementNotClickable(findTestObject('Edit user profile/Edit/button_SUBMIT'))

'à¸?à¸£à¸­à¸?à¸­à¸µà¹€à¸¡à¸¥à¸—à¸µà¹?à¸–à¸¹à¸?à¸£à¸¹à¸?à¹?à¸?à¸?'
WebUI.setText(findTestObject('Edit user profile/Edit/input_email'), 'Creme@mail.com')

'à¸?à¸”à¸?à¸¸à¹?à¸¡ Submit'
WebUI.click(findTestObject('Edit user profile/Edit/button_SUBMIT'))

'à¸•à¸£à¸§à¸?à¸ªà¸­à¸?à¸?à¸²à¸£à¹?à¸?à¹?à¸?à¹€à¸•à¸·à¸­à¸? Edit Profile Successful'
WebUI.verifyElementPresent(findTestObject('Edit user profile/Edit/div_Edit Profile Successful.'), 2, FailureHandling.CONTINUE_ON_FAILURE)

'à¸?à¸”à¸?à¸¸à¹?à¸¡à¸?à¸´à¸”à¸?à¸²à¸£à¹?à¸?à¹?à¸?à¹€à¸•à¸·à¸­à¸?'
WebUI.click(findTestObject('Edit user profile/Edit/button_'))

'à¸?à¸´à¸”à¹€à¸?à¸£à¸²à¹€à¸?à¸­à¸£à¹?'
WebUI.closeBrowser(FailureHandling.CONTINUE_ON_FAILURE)

