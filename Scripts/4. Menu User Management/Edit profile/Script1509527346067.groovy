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

'ขยายหน้าต่าง เบราเซอร์'
WebUI.maximizeWindow(FailureHandling.CONTINUE_ON_FAILURE)

'เข้าสู่ URL'
WebUI.navigateToUrl('192.168.11.59', FailureHandling.CONTINUE_ON_FAILURE)

'login'
WebUI.click(findTestObject('Page_Guru TMDA/span_Login'), FailureHandling.CONTINUE_ON_FAILURE)

'login'
WebUI.setText(findTestObject('Page_Guru TMDA (1)/input_ng-untouched ng-valid ng'), 'piew', FailureHandling.CONTINUE_ON_FAILURE)

'login'
WebUI.setText(findTestObject('Page_Guru TMDA (1)/input_ng-untouched ng-pristine'), 'piew', FailureHandling.CONTINUE_ON_FAILURE)

'login'
WebUI.submit(findTestObject('Page_Guru TMDA (1)/button_Login'), FailureHandling.CONTINUE_ON_FAILURE)

'คลิปเมนู User Management'
WebUI.click(findTestObject('Change role/Page_Guru TMDA/a_User Management'))

'กรอกข้อความลงในช่องค้นหา'
WebUI.setText(findTestObject('Change role/Page_Guru TMDA (2)/input_ng-untouched ng-valid ng'), 'fortest')

'กดปุ่มแก้ไข Profile'
WebUI.click(findTestObject('Edit user profile/list/i_fa fa-pencil-square-o'))

'กดสัญลักษณ์ดินสอหลังชื่อ'
WebUI.click(findTestObject('Edit user profile/Edit//i_fa fa-pencil name'))

'กดสัญลักษณ์ดินสอหลังอีเมล'
WebUI.click(findTestObject('Edit user profile/Edit/i_fa fa-pencil email'))

'ลบข้อความในกล่องข้อความ First name'
WebUI.setText(findTestObject('Edit user profile/Edit//input_firstname'), 'e')

'ลบข้อความในกล่องข้อความ First name'
WebUI.sendKeys(findTestObject('Edit user profile/Edit//input_firstname'), Keys.chord(Keys.BACK_SPACE), FailureHandling.STOP_ON_FAILURE)

'ตรวจสอบปุ่ม Submit ไม่สามารถกดได้'
WebUI.verifyElementNotClickable(findTestObject('Edit user profile/Edit/button_SUBMIT'))

'กรอกชื่อเป็นตัวเลข'
WebUI.setText(findTestObject('Edit user profile/Edit//input_firstname'), '55555')

'ตรวจสอบปุ่ม Submit ไม่สามารถกดได้'
WebUI.verifyElementNotClickable(findTestObject('Edit user profile/Edit/button_SUBMIT'))

'กรอกชื่อที่ถูกรูปแบบ'
WebUI.setText(findTestObject('Edit user profile/Edit//input_firstname'), 'Piratchana')

'ลบข้อความในกล่องข้อความ Last name'
WebUI.setText(findTestObject('Edit user profile/Edit//input_lastname'), 'e')

'ลบข้อความในกล่องข้อความ Last name'
WebUI.sendKeys(findTestObject('Edit user profile/Edit//input_lastname'), Keys.chord(Keys.BACK_SPACE), FailureHandling.STOP_ON_FAILURE)

'ตรวจสอบปุ่ม Submit ไม่สามารถกดได้'
WebUI.verifyElementNotClickable(findTestObject('Edit user profile/Edit/button_SUBMIT'))

'กรอกนามสกุลเป็นตัวเลข'
WebUI.setText(findTestObject('Edit user profile/Edit//input_lastname'), '55555')

'ตรวจสอบปุ่ม Submit ไม่สามารถกดได้'
WebUI.verifyElementNotClickable(findTestObject('Edit user profile/Edit/button_SUBMIT'))

'กรอกนามสกุลที่ถูกรูปแบบ'
WebUI.setText(findTestObject('Edit user profile/Edit//input_lastname'), 'Maksub')

'ลบข้อความในกล่องข้อความ Email'
WebUI.setText(findTestObject('Edit user profile/Edit/input_email'), 'e')

'ลบข้อความในกล่องข้อความ Email'
WebUI.sendKeys(findTestObject('Edit user profile/Edit/input_email'), Keys.chord(Keys.BACK_SPACE), FailureHandling.STOP_ON_FAILURE)

'ตรวจสอบปุ่ม Submit ไม่สามารถกดได้'
WebUI.verifyElementNotClickable(findTestObject('Edit user profile/Edit/button_SUBMIT'))

'กรอกอีเมลไม่ใส่ @ และไม่มี .co'
WebUI.setText(findTestObject('Edit user profile/Edit/input_email'), 'Cremecreme')

'ตรวจสอบปุ่ม Submit ไม่สามารถกดได้'
WebUI.verifyElementNotClickable(findTestObject('Edit user profile/Edit/button_SUBMIT'))

'กรอกอีเมลที่ถูกรูปแบบ'
WebUI.setText(findTestObject('Edit user profile/Edit/input_email'), 'Creme@mail.com')

'กดปุ่ม Submit'
WebUI.click(findTestObject('Edit user profile/Edit/button_SUBMIT'))

'ตรวจสอบการแจ้งเตือน Edit Profile Successful'
WebUI.verifyElementPresent(findTestObject('Edit user profile/Edit/div_Edit Profile Successful.'), 2, FailureHandling.CONTINUE_ON_FAILURE)

'กดปุ่มปิดการแจ้งเตือน'
WebUI.click(findTestObject('Edit user profile/Edit/button_'))

'ปิดเบราเซอร์'
WebUI.closeBrowser(FailureHandling.CONTINUE_ON_FAILURE)

