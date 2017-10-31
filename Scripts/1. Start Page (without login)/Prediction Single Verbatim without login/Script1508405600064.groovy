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

'เปิดเบราเซอร์'
WebUI.openBrowser('', FailureHandling.CONTINUE_ON_FAILURE)

'ขยายหน้าจอเบราเซอร์\r\n'
WebUI.maximizeWindow(FailureHandling.CONTINUE_ON_FAILURE)

'เข้าสู่ URL '
WebUI.navigateToUrl('192.168.11.59', FailureHandling.CONTINUE_ON_FAILURE)

'คลิกปุ่ม Predict'
WebUI.click(findTestObject('Page single/Page_Guru TMDA/button_btn btn-link'), FailureHandling.CONTINUE_ON_FAILURE)

'ตรวจสอบข้อความแจ้งเตือนกล่องข้อความว่าง\r\n'
WebUI.verifyElementPresent(findTestObject('Single verbatim without login/span_Verbatim is not null'), 2, FailureHandling.CONTINUE_ON_FAILURE)

'กรอกข้อความเพื่อ Predict '
WebUI.setText(findTestObject('Page_Guru TMDA (2)/input_input-text w3-large inpu'), 'บริการดี แต่รอคิวนาน', FailureHandling.CONTINUE_ON_FAILURE)

'กดปุ่ม Predict'
WebUI.click(findTestObject('Page single/Page_Guru TMDA/button_btn btn-link'), FailureHandling.CONTINUE_ON_FAILURE)

'ตรวจสอบผลลัพธ์การ Predict บรรทัดที่ 1'
WebUI.click(findTestObject('Page_Guru TMDA (2)/div_row'), FailureHandling.CONTINUE_ON_FAILURE)

'ตรวจสอบผลลัพธ์การ Predict บรรทัดที่ 2'
WebUI.click(findTestObject('Page_Guru TMDA (2)/div_predict-result'), FailureHandling.CONTINUE_ON_FAILURE)

'ปิดเบราเซอร์'
WebUI.closeBrowser(FailureHandling.CONTINUE_ON_FAILURE)

