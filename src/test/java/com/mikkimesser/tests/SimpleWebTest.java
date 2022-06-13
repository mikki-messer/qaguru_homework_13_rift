package com.mikkimesser.tests;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.mikkimesser.pages.RedRiftMainPage;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byLinkText;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

/*
TODO
1. Сделать TestBase класс +
2. Сделать PageObject класс +
3. Расписать атомарные методы +
4. Создать логические методы (если возможно) +
5. Добавить аллюр +
6. Добавить аллюр лиснер + степы
7. Добавить теги
8. Добавить remote
9. Добавить аттачи
10. Owner
11. Сгенерировать проект на autotests.cloud
12. Уведомления в телегу
13. Дженкинс настроить
14. Readme.md
 */

public class SimpleWebTest extends TestBase {

    @Test
    @DisplayName("Проверка, что при скролле к словам Success rate появляется виджет в виде льва")
    public void showLionTest() {
        RedRiftMainPage redRiftMainPage = new RedRiftMainPage();
        redRiftMainPage.openPage();
        redRiftMainPage.checkLionWidgetIsNotVisible();
        redRiftMainPage.scrollToSuccessRateBlock();
        redRiftMainPage.checkLionWidgetIsVisible();
    }

    @Test
    @DisplayName("Проверка закрытия виджета льва")
    public void closeLionTest() {
        RedRiftMainPage redRiftMainPage = new RedRiftMainPage();
        redRiftMainPage.openPage();
        redRiftMainPage.scrollToSuccessRateBlock();
        redRiftMainPage.checkLionWidgetIsVisible();
        redRiftMainPage.closeLionWidget();
        redRiftMainPage.checkLionWidgetIsNotVisible();
    }

    @Test
    @DisplayName("Проверка ссылки News")
    public void newsLinkTest() {
        RedRiftMainPage redRiftMainPage = new RedRiftMainPage();
        redRiftMainPage.openPage();
        redRiftMainPage.clickOnNewsLink();
        redRiftMainPage.checkNewsPageHeader();
    }

    @Test
    @DisplayName("Проверка ссылки Join our team")
    public void jobsLinkTest() {
        RedRiftMainPage redRiftMainPage = new RedRiftMainPage();
        redRiftMainPage.openPage();
        redRiftMainPage.clickOnJobsLink();
        redRiftMainPage.checkJobsPageHeader();
    }

    @Test
    @DisplayName("Проверка появления всплывающей визитки c контактами CEO")
    public void showCEOContactsTest() {
        RedRiftMainPage redRiftMainPage = new RedRiftMainPage();
        redRiftMainPage.openPage();
        redRiftMainPage.scrollToContactsBlock();
        redRiftMainPage.checkContactInfoCardIsNotVisible();
        redRiftMainPage.hoverOnContactCard();
        redRiftMainPage.checkContactInfoCardIsVisible();
        redRiftMainPage.checkContactsFirstLink();
        redRiftMainPage.checkContactsSecondLink();
    }


}

