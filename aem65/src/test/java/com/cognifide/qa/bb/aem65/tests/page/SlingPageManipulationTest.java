//package com.cognifide.qa.bb.aem65.tests.page;
//
//import static org.junit.jupiter.api.Assertions.assertTrue;
//
//import org.junit.jupiter.api.Test;
//
//import com.cognifide.qa.bb.aem.core.api.AemActions;
//import com.cognifide.qa.bb.aem.core.pages.sling.SlingDataXMLBuilder;
//import com.cognifide.qa.bb.aem.core.pages.sling.SlingPageData;
//import com.cognifide.qa.bb.aem65.tests.AbstractAemAuthorTest;
//import com.cognifide.qa.bb.aem65.tests.pages.TestPage;
//import com.cognifide.qa.bb.api.actions.ActionException;
//import com.cognifide.qa.bb.junit5.guice.Modules;
//import com.cognifide.qa.bb.modules.BobcatRunModule;
//
//import io.qameta.allure.Description;
//import io.qameta.allure.Epic;
//import io.qameta.allure.Feature;
//import io.qameta.allure.Story;
//
//@Modules(BobcatRunModule.class)
//@Epic("AEM 6.4 Base Tests")
//@Feature("Page Manipulation")
////public class SlingPageManipulationTest extends AbstractAemAuthorTest {
////
////  private static final String TEST_PAGE_PATH = "/content/we-retail/us/en/test";
////
//////  @Test
//////  @Story("Create and delete test page")
//////  @Description("Create and delete test page using sling controller")
//////  public void pageManipulationTest() throws ActionException {
//////
//////    controller.execute(AemActions.CREATE_PAGE_VIA_SLING, new SlingPageData(TEST_PAGE_PATH,
//////        SlingDataXMLBuilder.buildFromFile("testpages/pageTest.xml")));
//////    TestPage testPage = bobcatPageFactory.create(TEST_PAGE_PATH + ".html", TestPage.class);
//////    testPage.open();
//////    assertTrue(testPage.isDisplayed());
//////    controller.execute(AemActions.DELETE_PAGE_VIA_SLING, new SlingPageData(TEST_PAGE_PATH));
//////    testPage.open();
//////    assertTrue(testPage.isNotAvailable());
////
////  }
//
////}
