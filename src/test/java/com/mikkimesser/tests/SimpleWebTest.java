package com.mikkimesser.tests;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byLinkText;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

/*
TODO
1. Сделать TestBase класс
2. Сделать PageObject класс
3. Расписать атомарные методы
4. Создать логические методы (если возможно)
5. Добавить аллюр
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
    @DisplayName("Базовая проверка льва")
    public void showLionTest() {
        Selenide.open("https://www.redrift.com/");
        $(byText("Success rate")).scrollTo();
        $(".leon__message").shouldBe(Condition.visible);
    }

    @Test
    @DisplayName("Закрыть льва")
    public void closeLionTest() {
        Selenide.open("/");
        $(byText("Success rate")).scrollTo();
        $(".btn-close").click();
        $(".leon__message").shouldNotBe(Condition.visible);
    }

    @Test
    @DisplayName("Проверка ссылки News")
    public void checkTest() {
        Selenide.open("/");
        $(byLinkText("news")).scrollTo().click();
        $(".page-inner__title").shouldHave(text("Blog & News"));
    }

    @Test
    @DisplayName("Проверка ссылки Join our team")
    public void checkJobsTest() {
        Selenide.open("/");
        $(byLinkText("join our team!")).scrollTo().click();
        $(".page-inner__title").shouldHave(text("Red Rift Awaits You Stranger"));
    }

    @Test
    @DisplayName("Появления Social Card")
    public void checkSocialCardTest() {
        Selenide.open("/");
        $(byText("Who We")).scrollTo();
        $(".worker-social-list").shouldNotBe(visible);
        $(".worker-card__description-name").shouldHave(text("Denis P."));
        $(".worker-card__addition-info").hover();
        $(".worker-social-list").shouldBe(visible);
        $(".worker-social-list").$(".worker-social-list__link").shouldHave(Condition.href("https://facebook.com/Denis.Puhleacov"));
        $(".worker-social-list").$(".worker-social-list__link").sibling(0).shouldHave(Condition.href("https://www.linkedin.com/in/denis-puhleacov/"));
    }


}

