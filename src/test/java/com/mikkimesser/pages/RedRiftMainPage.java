package com.mikkimesser.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selectors.byLinkText;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class RedRiftMainPage {
    //locators
    SelenideElement successRateBlock = $(byText("Success rate"));
    SelenideElement lionWidget = $(".leon__message");
    SelenideElement lionWidgetCloseButton = $(".btn-close");
    SelenideElement newsMenuLink = $(byLinkText("news"));
    SelenideElement newsPageHeader = $(".page-inner__title");
    SelenideElement jobsMenuLink = $(byLinkText("join our team!"));
    SelenideElement jobsPageHeader = $(".page-inner__title");
    SelenideElement contactsBlock = $(byText("Who We"));
    SelenideElement contactInfoCard = $(".worker-social-list");
    SelenideElement contactName = $(".worker-card__description-name");
    SelenideElement contactCard = $(".worker-card__addition-info");
    SelenideElement firstLink = contactCard.$(".worker-social-list__link");
    SelenideElement secondLink = firstLink.sibling(0);
    //url
    String pageUrl = "/";
    //labels
    String newsPageHeaderText = "Blog & News";
    String jobsPageHeaderText = "Red Rift Awaits You Stranger";
    String fbURL = "https://facebook.com/Denis.Puhleacov";
    String lnURL = "https://www.linkedin.com/in/denis-puhleacov/";
    String ceoName = "Denis P.";
    //actions
    @Step("Opening the page")
    public void openPage() {
        open(pageUrl);
    }

    @Step("Scrolling to the Success Rate block")
    public void scrollToSuccessRateBlock() {
        successRateBlock.scrollTo();
    }

    @Step("Checking if the lion widget is invisible")
    public void checkLionWidgetIsNotVisible() {
        lionWidget.shouldNotBe(Condition.visible);
    }

    @Step("Checking if the lion widget is visible")
    public void checkLionWidgetIsVisible() {
        lionWidget.shouldBe(Condition.visible);
    }

    @Step("Closing the lion widget")
    public void closeLionWidget() {
        lionWidgetCloseButton.click();
    }

    @Step("Clicking the news link")
    public void clickOnNewsLink() {
        newsMenuLink.click();
    }

    @Step("Checking if the lion widget is invisible")
    public void checkNewsPageHeader() {
        newsPageHeader.shouldHave(Condition.text(newsPageHeaderText));
    }

    @Step("Clicking on the jobs link")
    public void clickOnJobsLink() {
        jobsMenuLink.click();
    }

    @Step("Checking the jobs page header")
    public void checkJobsPageHeader() {
        jobsPageHeader.shouldHave(Condition.text(jobsPageHeaderText));
    }

    @Step("Scrolling to the contacts block")
    public void scrollToContactsBlock() {
        contactsBlock.scrollTo();
    }

    @Step("Checking if the contact info card is invisible")
    public void checkContactInfoCardIsNotVisible() {
        contactInfoCard.shouldNotBe(Condition.visible);
    }

    @Step("Checking if the contact info card is invisible")
    public void checkContactInfoCardIsVisible() {
        contactInfoCard.shouldBe(Condition.visible);
    }

    @Step("Checking the name of the first contact")
    public void checkFirstContactName() {
        contactName.shouldHave(Condition.text(ceoName));
    }

    @Step("Hovering on the first contact card")
    public void hoverOnContactCard() {
        contactCard.hover();
    }

    @Step("Checking the first link on the contact card")
    public void checkContactsFirstLink() {
        firstLink.shouldHave(Condition.href(fbURL));
    }

    @Step("Checking the second link on the contact card")
    public void checkContactsSecondLink() {
        secondLink.shouldHave(Condition.href(lnURL));
    }
}

