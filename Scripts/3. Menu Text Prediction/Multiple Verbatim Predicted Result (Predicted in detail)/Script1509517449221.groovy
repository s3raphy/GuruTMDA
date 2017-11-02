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

'เปิดเบราเซอร์'
WebUI.openBrowser('', FailureHandling.STOP_ON_FAILURE)

'ขยายหน้าต่างเบราเซอร์'
WebUI.maximizeWindow(FailureHandling.STOP_ON_FAILURE)

'เข้าสู่ URL'
WebUI.navigateToUrl('http://192.168.11.59/', FailureHandling.STOP_ON_FAILURE)

'กดปุ่ม Login'
WebUI.click(findTestObject('Page_Guru TMDA (3)/span_Login'), FailureHandling.STOP_ON_FAILURE)

'กรอก Username'
WebUI.setText(findTestObject('Page_Guru TMDA (4)/input_ng-untouched ng-valid ng'), 'piew', FailureHandling.STOP_ON_FAILURE)

'กรอกรหัสผ่าน'
WebUI.setText(findTestObject('Page_Guru TMDA (1)/input_ng-untouched ng-pristine'), 'piew', FailureHandling.STOP_ON_FAILURE)

'กดปุ่ม Login'
WebUI.click(findTestObject('Page_Guru TMDA (4)/button_Login'), FailureHandling.STOP_ON_FAILURE)

'คลิกเมนู Text Prediction'
WebUI.click(findTestObject('Page_Guru TMDA (3)/a_Text Prediction'), FailureHandling.STOP_ON_FAILURE)

'เลือก Upload file'
WebUI.click(findTestObject('Page_Guru TMDA (3)/a_Upload File'), FailureHandling.STOP_ON_FAILURE)

'เลือกไฟล์ Excel'
WebUI.uploadFile(findTestObject('Page_Guru TMDA (6)/Page_Guru TMDA (4)/input_upfile'), 'C:\\test-Copy.xlsx', FailureHandling.STOP_ON_FAILURE)

'กดปุ่ม Upload'
WebUI.click(findTestObject('Page_Guru TMDA (5)/button_Upload'), FailureHandling.STOP_ON_FAILURE)

'รอให้แถบดำเนินการหายไป'
WebUI.waitForElementNotPresent(findTestObject('Page_Guru TMDA (6)/Page_Guru TMDA (5)/Page_Guru TMDA/div_progress-bar-zone'), 
    5, FailureHandling.STOP_ON_FAILURE)

'กดปุ่มปิดการแจ้งเตือนกรณี API ผิดพลาด'
not_run: WebUI.click(findTestObject('Upload file without Labeling/Uploading/button_ (1)'), FailureHandling.OPTIONAL)

'เลือกประเภท Sheet'
WebUI.selectOptionByIndex(findTestObject('Page_Guru TMDA (5)/select_sheet'), '1')

'รอให้การแจ้งเตือนปรากฎขึ้นมา'
WebUI.waitForElementPresent(findTestObject('Page_Guru TMDA (6)/Page_Guru TMDA (1)/div_w3-padding-32 w3-center'), 10, FailureHandling.STOP_ON_FAILURE)

'ตรวจสอบการแจ้งเตือน Your file is verified'
WebUI.verifyElementPresent(findTestObject('Upload file without Labeling/Uploading/div_Your file is verified.'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'กดปุ่มปิดการแจ้งเตือน'
WebUI.click(findTestObject('Page_Guru TMDA (6)/Page_Guru TMDA (3)/button_'), FailureHandling.STOP_ON_FAILURE)

'รอให้การแจ้งเตือนหายไป'
WebUI.waitForElementNotPresent(findTestObject('Page_Guru TMDA (6)/Page_Guru TMDA (1)/div_w3-padding-32 w3-center'), 5, FailureHandling.STOP_ON_FAILURE)

'มีสัญลักษณ์เครื่องหมายถูกต้องสีเขียว'
WebUI.waitForElementPresent(findTestObject('Page_Guru TMDA (6)/Page_Guru TMDA (2)/i_fa fa-check w3-text-green'), 10, FailureHandling.STOP_ON_FAILURE)

'เลือกหน้าต่างมายังปุ่ม Start'
WebUI.scrollToElement(findTestObject('Page_Guru TMDA (16)/button_Start'), 2, FailureHandling.STOP_ON_FAILURE)

'กดปุ่ม Start'
WebUI.click(findTestObject('Page_Guru TMDA (5)/button_Start'), FailureHandling.STOP_ON_FAILURE)

'รอจนกว่าการโหลดเสร็จสิ้น'
WebUI.waitForElementNotPresent(findTestObject('Upload file without Labeling/div_loader'), 60, FailureHandling.STOP_ON_FAILURE)

'รอ Select All ปรากฎ'
WebUI.waitForElementPresent(findTestObject('Display select all list/Page_Guru TMDA (2)/label_Select All'), 7)

'Un-Check  Select all'
WebUI.click(findTestObject('Display select all list/Page_Guru TMDA (2)/label_Select All'), FailureHandling.STOP_ON_FAILURE)

'ตรวจสอบแสดงรายการ Predict ไม่แสดง'
WebUI.verifyElementNotPresent(findTestObject('Upload file without Labeling/list/div_row'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'กดปุ่ม Export'
WebUI.click(findTestObject('Predicted in details/Button_Export'), FailureHandling.STOP_ON_FAILURE)

'Check  Select all'
WebUI.click(findTestObject('Display select all list/Page_Guru TMDA (2)/label_Select All'), FailureHandling.STOP_ON_FAILURE)

'ตรวจสอบแสดง Accessibility'
WebUI.verifyElementPresent(findTestObject('Predicted in details/Show All Multiple Verbatim Predicted Result//span_Accessibility'), 
    5, FailureHandling.CONTINUE_ON_FAILURE)

'กดปุ่มรายการข้อความถัดไป'
WebUI.click(findTestObject('Predicted in details/Show All Multiple Verbatim Predicted Result//a_page-link'))

'ตรวจสอบแสดง Private Reason'
WebUI.verifyElementPresent(findTestObject('Predicted in details/Show All Multiple Verbatim Predicted Result//span_Private Reason'), 
    5, FailureHandling.CONTINUE_ON_FAILURE)

'ตรวจสอบแสดง Company Brand'
WebUI.verifyElementPresent(findTestObject('Predicted in details/Show All Multiple Verbatim Predicted Result//span_Company Brand'), 
    5, FailureHandling.CONTINUE_ON_FAILURE)

'ตรวจสอบแสดง Process'
WebUI.verifyElementPresent(findTestObject('Predicted in details/Show All Multiple Verbatim Predicted Result//span_Process'), 
    5, FailureHandling.CONTINUE_ON_FAILURE)

'กดปุ่มรายการข้อความถัดไป'
WebUI.click(findTestObject('Predicted in details/Show All Multiple Verbatim Predicted Result//a_page-link'))

'ตรวจสอบแสดง Product Feature'
WebUI.verifyElementPresent(findTestObject('Predicted in details/Show All Multiple Verbatim Predicted Result//span_Product Feature'), 
    5, FailureHandling.CONTINUE_ON_FAILURE)

'ตรวจสอบแสดง Timing'
WebUI.verifyElementPresent(findTestObject('Predicted in details/Show All Multiple Verbatim Predicted Result//span_Timing'), 
    5, FailureHandling.CONTINUE_ON_FAILURE)

'กดปุ่มรายการข้อความถัดไป'
WebUI.click(findTestObject('Predicted in details/Show All Multiple Verbatim Predicted Result//a_page-link'))

'กดปุ่มรายการข้อความถัดไป'
WebUI.click(findTestObject('Predicted in details/Show All Multiple Verbatim Predicted Result//a_page-link'))

'ตรวจสอบแสดง Staff Quality'
WebUI.verifyElementPresent(findTestObject('Predicted in details/Show All Multiple Verbatim Predicted Result//span_Staff Quality'), 
    5, FailureHandling.CONTINUE_ON_FAILURE)

'กดปุ่มรายการข้อความถัดไป'
WebUI.click(findTestObject('Predicted in details/Show All Multiple Verbatim Predicted Result//a_page-link'))

'ตรวจสอบแสดง Competitors'
WebUI.verifyElementPresent(findTestObject('Predicted in details/Show All Multiple Verbatim Predicted Result/span_Competitors'), 
    5, FailureHandling.CONTINUE_ON_FAILURE)

'กดปุ่ม Export'
WebUI.click(findTestObject('Predicted in details/Button_Export'), FailureHandling.STOP_ON_FAILURE)

'ปิดเบราเซอร์'
WebUI.closeBrowser(FailureHandling.STOP_ON_FAILURE)

