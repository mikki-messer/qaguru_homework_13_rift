package com.mikkimesser.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

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
    public void openPage() {
        open(pageUrl);
    }

    public void scrollToSuccessRateBlock() {
        successRateBlock.scrollTo();
    }

    public void checkLionWidgetIsNotVisible() {
        lionWidget.shouldNotBe(Condition.visible);
    }

    public void checkLionWidgetIsVisible() {
        lionWidget.shouldBe(Condition.visible);
    }

    public void closeLionWidget() {
        lionWidgetCloseButton.click();
    }

    public void scrollToNewsLink() {
        newsMenuLink.scrollTo();
    }

    public void clickOnNewsLink() {
        newsMenuLink.click();
    }

    public void checkNewsPageHeader() {
        newsPageHeader.shouldHave(Condition.text(newsPageHeaderText));
    }

    public void clickOnJobsLink() {
        jobsMenuLink.click();
    }

    public void checkJobsPageHeader() {
        jobsPageHeader.shouldHave(Condition.text(jobsPageHeaderText));
    }

    public void scrollToContactsBlock() {
        contactsBlock.scrollTo();
    }

    public void checkContactInfoCardIsNotVisible() {
        contactInfoCard.shouldNotBe(Condition.visible);
    }

    public void checkFirstContactName() {
        contactName.shouldHave(Condition.text(ceoName));
    }

    public void hoverOnContactCard() {
        contactCard.hover();
    }

    public void checkContactsFirstLink() {
        firstLink.shouldHave(Condition.href(fbURL));
    }

    public void checkContactsSecondLink() {
        secondLink.shouldHave(Condition.href(lnURL));
    }
}

