package com.mikkimesser.tests;

import com.mikkimesser.pages.RedRiftMainPage;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SimpleWebTest extends TestBase {

    @Test
    @DisplayName("Check if the lion widget appears on scrolling to the Success rate block")
    public void showLionTest() {
        RedRiftMainPage redRiftMainPage = new RedRiftMainPage();
        redRiftMainPage.openPage();
        redRiftMainPage.checkLionWidgetIsNotVisible();
        redRiftMainPage.scrollToSuccessRateBlock();
        redRiftMainPage.checkLionWidgetIsVisible();
    }

    @Test
    @DisplayName("Check closing of the lion widget")
    public void closeLionTest() {
        RedRiftMainPage redRiftMainPage = new RedRiftMainPage();
        redRiftMainPage.openPage();
        redRiftMainPage.scrollToSuccessRateBlock();
        redRiftMainPage.checkLionWidgetIsVisible();
        redRiftMainPage.closeLionWidget();
        redRiftMainPage.checkLionWidgetIsNotVisible();
    }

    @Test
    @DisplayName("Check the News link")
    public void newsLinkTest() {
        RedRiftMainPage redRiftMainPage = new RedRiftMainPage();
        redRiftMainPage.openPage();
        redRiftMainPage.clickOnNewsLink();
        redRiftMainPage.checkNewsPageHeader();
    }

    @Test
    @DisplayName("Check the Join our team link")
    public void jobsLinkTest() {
        RedRiftMainPage redRiftMainPage = new RedRiftMainPage();
        redRiftMainPage.openPage();
        redRiftMainPage.clickOnJobsLink();
        redRiftMainPage.checkJobsPageHeader();
    }

    @Test
    @DisplayName("Check display of the contact card for the first contace")
    public void showCEOContactsTest() {
        RedRiftMainPage redRiftMainPage = new RedRiftMainPage();
        redRiftMainPage.openPage();
        redRiftMainPage.scrollToContactsBlock();
        redRiftMainPage.checkContactInfoCardIsNotVisible();
        redRiftMainPage.checkFirstContactName();
        redRiftMainPage.hoverOnContactCard();
        redRiftMainPage.checkContactInfoCardIsVisible();
        redRiftMainPage.checkContactsFirstLink();
        redRiftMainPage.checkContactsSecondLink();
    }
}

