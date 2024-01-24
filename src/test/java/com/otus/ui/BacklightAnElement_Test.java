package com.otus.ui;

import com.otus.ui.anotations.Driver;
import com.otus.ui.extensions.DriverManagerExtensions;
import com.otus.ui.listeners.WebDriverListener;
import com.otus.ui.pages.MainPage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.WebDriver;
/**
 * Задание №2
 * Реализовать подсветку элементов перед нажатием.
 * <p>
 * В данном тестовом классе представлено несколько методов
 * демонстрирующих подсветку элементов перед методом click()
 */

@ExtendWith(DriverManagerExtensions.class)
public class BacklightAnElement_Test {

  @Driver
  private WebDriver driver;
  private MainPage mainPage;

  @BeforeEach
  public void setUp() {
    mainPage = new MainPage(driver);
    driver.get(MainPage.BASE_URL);
  }

  @Test
  void backlightAnElementPopular_Test() {
    mainPage.popularFirstCourseClick();
  }

  @Test
  void backlightAnElementSpecial_Test() {
    mainPage.specializationFirstCourseClick();
  }
}