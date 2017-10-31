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

WebUI.maximizeWindow()

WebUI.navigateToUrl('192.168.11.59')

WebUI.click(findTestObject('Page_Guru TMDA/span_Login'))

WebUI.setText(findTestObject('Page_Guru TMDA (1)/input_ng-untouched ng-valid ng'), 'piew')

WebUI.setText(findTestObject('Page_Guru TMDA (1)/input_ng-untouched ng-pristine'), 'piew')

WebUI.submit(findTestObject('Page_Guru TMDA (1)/button_Login'))

WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/a_Log'))

WebUI.mouseOver(findTestObject('Search history log/search history log/span_2'))

WebUI.verifyElementPresent(findTestObject('Search history log/search history log/div_ngxp__container ngxp__anim'), 5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/button_Preview'))

WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/i_fa fa-times w3-xlarge w3-tex'))

WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/input_ng-untouched ng-pristine'))

WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/button_Export'))

WebUI.selectOptionByValue(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/select_serach_type'), 
    '1', true)

WebUI.mouseOver(findTestObject('Search history log/search history log//span_2'))

WebUI.verifyElementPresent(findTestObject('Search history log/search history log/div_ngxp__container ngxp__anim_1'), 5, 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/input_ng-valid ng-dirty ng-tou'))

WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/button_Export'))

WebUI.selectOptionByValue(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/select_serach_type'), 
    '2', true)

WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/button_Preview'))

WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/i_fa fa-times w3-xlarge w3-tex'))

WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/input_ng-valid ng-dirty ng-tou'))

WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/button_Export'))

WebUI.selectOptionByIndex(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/select_serach_type'), 
    '0', FailureHandling.STOP_ON_FAILURE)

WebUI.mouseOver(findTestObject('Search history log/search history log//span_2'))

WebUI.verifyElementPresent(findTestObject('Search history log/search history log/div_ngxp__container ngxp__anim'), 5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/button_Preview'))

WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/i_fa fa-times w3-xlarge w3-tex'))

WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/input_ng-valid ng-dirty ng-tou'))

WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/button_Export'))

WebUI.selectOptionByValue(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/select_serach_type'), 
    '1', true)

WebUI.mouseOver(findTestObject('Search history log/search history log//span_2'))

WebUI.verifyElementPresent(findTestObject('Search history log/search history log/div_ngxp__container 007'), 5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/input_ng-valid ng-dirty ng-tou'))

WebUI.selectOptionByValue(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/select_serach_type'), 
    '2', true)

WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/button_Preview'))

WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/i_fa fa-times w3-xlarge w3-tex'))

WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/input_ng-valid ng-dirty ng-tou'))

WebUI.selectOptionByIndex(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/select_serach_type'), 
    '0', FailureHandling.STOP_ON_FAILURE)

WebUI.mouseOver(findTestObject('Search history log/search history log//span_2'))

WebUI.verifyElementPresent(findTestObject('Search history log/search history log/div_ngxp__container ngxp__anim'), 5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/button_Preview'))

WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/i_fa fa-times w3-xlarge w3-tex'))

WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/button_Export'))

WebUI.selectOptionByValue(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/select_serach_type'), 
    '1', true)

WebUI.mouseOver(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/span_'))

WebUI.verifyElementPresent(findTestObject('Search history log/search history log/div_ngxp__container 007'), 5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/button_Export'))

WebUI.selectOptionByValue(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/select_serach_type'), 
    '2', true)

WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/button_Preview'))

WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/div_close'))

WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/button_Export'))

WebUI.setText(findTestObject('Search history log/search history log/input_selection ng-untouched n'), '11/10/2017')

WebUI.selectOptionByIndex(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/select_serach_type'), 
    '0', FailureHandling.STOP_ON_FAILURE)

WebUI.mouseOver(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/span_ (1)'))

WebUI.verifyElementPresent(findTestObject('Search history log/search history log/div_ngxp__container ngxp__008'), 5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.mouseOver(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/span_ (1)'))

WebUI.verifyElementPresent(findTestObject('Search history log/search history log/div_ngxp__container ngxp__008'), 5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/button_Preview'))

WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/i_fa fa-times w3-xlarge w3-tex'))

WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/input_ng-valid ng-dirty ng-tou'))

WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/button_Export'))

WebUI.selectOptionByValue(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/select_serach_type'), 
    '1', true)

WebUI.mouseOver(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/span_ (1)'))

WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/input_ng-valid ng-dirty ng-tou'))

WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/button_Export'))

WebUI.selectOptionByValue(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/select_serach_type'), 
    '2', true)

WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/button_Preview'))

WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/i_fa fa-times w3-xlarge w3-tex'))

WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/input_ng-valid ng-dirty ng-tou'))

WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/button_Export'))

WebUI.selectOptionByIndex(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/select_serach_type'), 
    '0', FailureHandling.STOP_ON_FAILURE)

WebUI.mouseOver(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/span_ (1)'))

WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/button_Preview'))

WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/i_fa fa-times w3-xlarge w3-tex'))

WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/input_ng-valid ng-dirty ng-tou'))

WebUI.selectOptionByValue(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/select_serach_type'), 
    '1', true)

WebUI.mouseOver(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/span_ (1)'))

WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/input_ng-valid ng-dirty ng-tou'))

WebUI.selectOptionByValue(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/select_serach_type'), 
    '2', true)

WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/button_Preview'))

WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/i_fa fa-times w3-xlarge w3-tex'))

WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/input_ng-valid ng-dirty ng-tou'))

WebUI.selectOptionByIndex(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/select_serach_type'), 
    '0', FailureHandling.STOP_ON_FAILURE)

WebUI.mouseOver(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/span_ (1)'))

WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/button_Preview'))

WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/i_fa fa-times w3-xlarge w3-tex'))

WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/button_Export'))

WebUI.selectOptionByValue(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/select_serach_type'), 
    '1', true)

WebUI.mouseOver(findTestObject('Search history log/search history log/span_ 12345689'))

WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/button_Export'))

WebUI.selectOptionByValue(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/select_serach_type'), 
    '2', true)

WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/button_Preview'))

WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/i_fa fa-times w3-xlarge w3-tex'))

WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/button_Export'))

WebUI.setText(findTestObject('Search history log/search history log/input_selection ng-untouched n (1)'), '31/10/2017')

WebUI.selectOptionByIndex(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/select_serach_type'), 
    '0', FailureHandling.STOP_ON_FAILURE)

WebUI.mouseOver(findTestObject('Search history log/search history log/span_4'))

WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/button_Preview'))

WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/i_fa fa-times w3-xlarge w3-tex'))

WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/input_ng-valid ng-dirty ng-tou'))

WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/button_Export'))

WebUI.selectOptionByValue(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/select_serach_type'), 
    '1', true)

WebUI.mouseOver(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/span_'))

WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/input_ng-valid ng-dirty ng-tou'))

WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/button_Export'))

WebUI.selectOptionByValue(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/select_serach_type'), 
    '2', true)

WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/button_Preview'))

WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/i_fa fa-times w3-xlarge w3-tex'))

WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/input_ng-valid ng-dirty ng-tou'))

WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/button_Export'))

not_run: WebUI.selectOptionByIndex(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/select_serach_type'), 
    '0', FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.mouseOver(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/span_'))

not_run: WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/button_Preview'))

not_run: WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/i_fa fa-times w3-xlarge w3-tex'))

not_run: WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/input_ng-valid ng-dirty ng-tou'))

not_run: WebUI.selectOptionByValue(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/select_serach_type'), 
    '1', true)

not_run: WebUI.mouseOver(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/span_ (1)'))

not_run: WebUI.mouseOver(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/span_'))

not_run: WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/input_ng-valid ng-dirty ng-tou'))

not_run: WebUI.selectOptionByValue(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/select_serach_type'), 
    '2', true)

not_run: WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/button_Preview'))

not_run: WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/i_fa fa-times w3-xlarge w3-tex'))

not_run: WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/button_Preview'))

not_run: WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/i_fa fa-times w3-xlarge w3-tex'))

not_run: WebUI.selectOptionByIndex(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/select_serach_type'), 
    '0', FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.mouseOver(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/span_'))

not_run: WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/button_Preview'))

not_run: WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/i_fa fa-times w3-xlarge w3-tex'))

not_run: WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/button_Export'))

not_run: WebUI.selectOptionByValue(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/select_serach_type'), 
    '1', true)

not_run: WebUI.mouseOver(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/span_'))

not_run: WebUI.mouseOver(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/span_ (1)'))

not_run: WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/button_Export'))

not_run: WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/div_w3-padding-16'))

not_run: WebUI.selectOptionByValue(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/select_serach_type'), 
    '2', true)

not_run: WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/button_Preview'))

not_run: WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/i_fa fa-times w3-xlarge w3-tex'))

not_run: WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/button_Preview'))

not_run: WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/i_fa fa-times w3-xlarge w3-tex'))

not_run: WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/button_Export'))

not_run: WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/span_mydpicon icon-mydpremove'))

not_run: WebUI.setText(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/input_selection ng-valid ng-di'), 
    '3')

not_run: WebUI.setText(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/input_selection ng-valid ng-di'), 
    '11/10/2017')

not_run: WebUI.selectOptionByValue(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/select_serach_type'), 
    'All', true)

not_run: WebUI.closeBrowser()

