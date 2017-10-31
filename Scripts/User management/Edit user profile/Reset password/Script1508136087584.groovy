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

not_run: WebUI.openBrowser('')

not_run: WebUI.maximizeWindow()

not_run: WebUI.navigateToUrl('192.168.11.59')

not_run: WebUI.click(findTestObject('Page_Guru TMDA/span_Login'))

not_run: WebUI.setText(findTestObject('Page_Guru TMDA (1)/input_ng-untouched ng-valid ng'), 'piew')

not_run: WebUI.setText(findTestObject('Page_Guru TMDA (1)/input_ng-untouched ng-pristine'), 'piew')

not_run: WebUI.submit(findTestObject('Page_Guru TMDA (1)/button_Login'))

WebUI.click(findTestObject('reset password/menu/a_User Management'))

WebUI.setText(findTestObject('reset password/list/input_ng-untouched ng-valid ng'), 'fortest', FailureHandling.OPTIONAL)

WebUI.click(findTestObject('reset password/list/i_fa fa-pencil-square-o'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('reset password/reset/a_Reset Password'))

WebUI.click(findTestObject('reset password/reset/button_Yes'))

WebUI.setText(findTestObject('reset password/reset/input_ng-untouched ng-valid ng'), 'fortest')

WebUI.scrollToElement(findTestObject('reset password/reset/button_SUBMIT'), 3)

WebUI.setText(findTestObject('reset password/reset/Page_Guru TMDA/input_ng-untouched ng-pristine'), 'fortest')

WebUI.sendKeys(findTestObject('reset password/reset/Page_Guru TMDA/input_ng-untouched ng-pristine'), Keys.chord(Keys.TAB))

WebUI.setText(findTestObject('reset password/reset/Page_Guru TMDA/input_ng-pristine ng-valid ng-1'), 'fortest')

WebUI.click(findTestObject('reset password/reset/button_SUBMIT'))

WebUI.verifyElementPresent(findTestObject('reset password/reset/div_Edit Profile Successful.'), 2, FailureHandling.CONTINUE_ON_FAILURE)

not_run: if (false) {
    not_run: WebUI.click(findTestObject('reset password/reset/button_'))

    not_run: WebUI.verifyElementPresent(findTestObject('reset password/reset/div_Edit Profile Successful.'), 2, FailureHandling.STOP_ON_FAILURE)
}

WebUI.click(findTestObject('reset password/reset/button_'))

not_run: WebUI.closeBrowser()

