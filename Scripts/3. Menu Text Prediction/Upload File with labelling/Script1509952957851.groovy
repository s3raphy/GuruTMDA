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

WebUI.openBrowser('')

'ขยายหน้าต่างเบราเซอร์'
WebUI.maximizeWindow(FailureHandling.STOP_ON_FAILURE)

WebUI.navigateToUrl('http://192.168.11.59/')

WebUI.click(findTestObject('Upload File with labelling//span_Login (1)'))

WebUI.setText(findTestObject('Upload File with labelling/input_ng-untouched ng-pristine'), 'piew')

WebUI.setText(findTestObject('Upload File with labelling/input_ng-untouched ng-pristine (1)'), 'piew')

WebUI.click(findTestObject('Upload File with labelling//button_Login (1)'))

WebUI.click(findTestObject('Upload File with labelling/a_Text Prediction'))

WebUI.click(findTestObject('Upload File with labelling//a_Upload File (1)'))

'ตรวจสอบปุ่ม Upload ไม่สามารถกดได้'
WebUI.verifyElementNotClickable(findTestObject('Page_Guru TMDA (5)/button_Upload'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.uploadFile(findTestObject('Upload File with labelling//input_upfile'), 'D:\\Penguins.jpg')

'รอให้ปุ่ม Upload สามารถกดได้'
WebUI.waitForElementClickable(findTestObject('Upload File with labelling//button_Upload (1)'), 10, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Upload File with labelling//button_Upload (1)'))

'รอให้แถบการดำเนินการหาย'
WebUI.waitForElementClickable(findTestObject('Upload File with labelling/div_progress-bar-zone'), 10)

WebUI.verifyElementPresent(findTestObject('Upload File with labelling/div_File Not Type of Excel'), 5)

WebUI.click(findTestObject('Upload File with labelling//button_'))

WebUI.waitForElementNotPresent(findTestObject('Upload File with labelling/div_File Not Type of Excel'), 5)

WebUI.uploadFile(findTestObject('Upload File with labelling//input_upfile'), 'D:\\test-Copy1.xlsx')

WebUI.click(findTestObject('Upload File with labelling//button_Upload (1)'))

'รอให้แถบดำเนินการหายไป'
WebUI.waitForElementNotPresent(findTestObject('Page_Guru TMDA (6)/Page_Guru TMDA (5)/Page_Guru TMDA/div_progress-bar-zone'), 
    5, FailureHandling.STOP_ON_FAILURE)

'กดปุ่มปิดการแจ้งเตือนกรณี API ผิดพลาด'
not_run: WebUI.click(findTestObject('Upload file without Labeling/Uploading/button_ (1)'), FailureHandling.OPTIONAL)

WebUI.selectOptionByIndex(findTestObject('Upload File with labelling/select_sheet'), '1', FailureHandling.STOP_ON_FAILURE)

'รอให้การแจ้งเตือนปรากฎ'
WebUI.waitForElementPresent(findTestObject('Upload File with labelling/div_w3-padding-32 w3-center'), 10, FailureHandling.CONTINUE_ON_FAILURE)

'ตรวจสอบการแจ้งเตือน Your file is not verified'
WebUI.verifyElementPresent(findTestObject('Upload file without Labeling/Uploading/div_Your file is not verified.'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'กดปุ่มปิดการแจ้งเตือน'
WebUI.click(findTestObject('Upload File with labelling/button_your file is not verified'))

'รอให้การแจ้งเตือนหายไป'
WebUI.waitForElementNotPresent(findTestObject('Upload File with labelling/button_your file is not verified'), 5)

not_run: WebUI.click(findTestObject('Upload File with labelling/a_'))

not_run: WebUI.click(findTestObject('Upload File with labelling/a_Text Prediction (1)'))

not_run: WebUI.click(findTestObject('Upload File with labelling//a_Upload File (1)'))

WebUI.uploadFile(findTestObject('Upload File with labelling/input_upfile'), 'D:\\test1.xlsx')

'ตรวจสอบปุ่ม Upload ไม่สามารถกดได้'
WebUI.verifyElementNotClickable(findTestObject('Upload File with labelling/button_Upload (1)'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Upload File with labelling//button_Upload (1)'))

'รอให้แถบดำเนินการหายไป'
WebUI.waitForElementNotPresent(findTestObject('Page_Guru TMDA (6)/Page_Guru TMDA (5)/Page_Guru TMDA/div_progress-bar-zone'), 
    5, FailureHandling.STOP_ON_FAILURE)

'กดปุ่มปิดการแจ้งเตือนกรณี API ผิดพลาด'
not_run: WebUI.click(findTestObject('Upload file without Labeling/Uploading/button_ (1)'), FailureHandling.OPTIONAL)

WebUI.selectOptionByIndex(findTestObject('Upload File with labelling/select_sheet (2)'), '1', FailureHandling.STOP_ON_FAILURE)

'รอให้การแจ้งเตือนปรากฎ'
WebUI.waitForElementPresent(findTestObject('Upload File with labelling/div_w3-padding-32 w3-center'), 10, FailureHandling.CONTINUE_ON_FAILURE)

'ตรวจสอบการแจ้งเตือน Your file is not verified'
WebUI.verifyElementPresent(findTestObject('Upload file without Labeling/Uploading/div_Your file is not verified.'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'กดปุ่มปิดการแจ้งเตือน'
WebUI.click(findTestObject('Upload File with labelling/button_your file is not verified'))

'รอให้การแจ้งเตือนหายไป'
WebUI.waitForElementNotPresent(findTestObject('Upload File with labelling/button_your file is not verified'), 5)

not_run: WebUI.click(findTestObject('Upload File with labelling/a_'))

not_run: WebUI.click(findTestObject('Upload File with labelling/a_Text Prediction'))

not_run: WebUI.click(findTestObject('Upload File with labelling//a_Upload File (1)'))

WebUI.uploadFile(findTestObject('Upload File with labelling/input_upfile'), 'D:\\test.xlsx')

WebUI.click(findTestObject('Upload File with labelling//button_Upload (1)'))

'รอให้แถบดำเนินการหายไป'
WebUI.waitForElementNotPresent(findTestObject('Page_Guru TMDA (6)/Page_Guru TMDA (5)/Page_Guru TMDA/div_progress-bar-zone'), 
    5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.selectOptionByIndex(findTestObject('Upload File with labelling/select_sheet'), '1', FailureHandling.STOP_ON_FAILURE)

'รอให้การแจ้งเตือนปรากฎขึ้นมา'
WebUI.waitForElementPresent(findTestObject('Upload File with labelling/div_w3-padding-32 w3-center'), 10, FailureHandling.CONTINUE_ON_FAILURE)

'ตรวจสอบการแจ้งเตือน Your file is verified'
WebUI.verifyElementPresent(findTestObject('Upload File with labelling//div_Your file is verified.'), 5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Upload File with labelling/button_your file is verified'))

'รอให้การแจ้งเตือนหายไป'
WebUI.waitForElementNotPresent(findTestObject('Upload File with labelling//div_w3-padding-32 w3-center'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'มีสัญลักษณ์เครื่องหมายถูกต้องสีเขียว'
WebUI.waitForElementPresent(findTestObject('Upload File with labelling/i_fa fa-check w3-text-green'), 10, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Upload File with labelling//button_Preview (1)'))

WebUI.verifyElementPresent(findTestObject('Upload File with labelling/div_excel-reader'), 5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Upload File with labelling/i_fa fa-times w3-xlarge w3-tex'))

'เลือกหน้าต่างมายังปุ่ม Start'
WebUI.scrollToElement(findTestObject('Upload File with labelling//button_Start (1)'), 2, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Upload File with labelling//button_Start (1)'))

WebUI.waitForElementNotPresent(findTestObject('Upload File with labelling//div_loader'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Upload File with labelling/div_row'), 5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.closeBrowser()

