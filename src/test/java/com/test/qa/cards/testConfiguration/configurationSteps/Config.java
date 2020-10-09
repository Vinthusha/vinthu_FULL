package com.test.qa.cards.testConfiguration.configurationSteps;

import com.test.qa.cards.testConfiguration.testNV.AddTest;
import com.test.qa.utils.TestBase;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utils.MethodBase;
import utils.PageBase;

import java.util.logging.Logger;

public class Config extends TestBase {
    private static final Logger LOGGER = Logger.getLogger(String.valueOf(AddTest.class));

    @Test(priority = 1, groups = {"Smoke"})
    public void TestConfigure() throws Exception {
        softAssert = new SoftAssert();
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[2]/a[1]/div/div");// click confi
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/header/ul/ul/li[8]/a");
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]/div/div[3]/div");
        MethodBase.click_ByXpath("//*[@id=\"test\"]/div/div");
        PageBase.staticWait(5);
      //  MethodBase.hitEnter();
        MethodBase.selectDropDown("//*[@id=\"63ef49c8-e5f4-468e-9cf4-762c4e74a1eb\"]/ul/li[1]","Moisture Test");
        PageBase.staticWait(10);
        MethodBase.click_ByXpath("//*[@id=\"test_type\"]/div/div");
        PageBase.staticWait(5);
        MethodBase.hitEnter();
        MethodBase.setText_ByID("prefix","MT");
        MethodBase.click_ByXpath("//*[@id=\"main_category\"]/div/div");
        PageBase.staticWait(5);
        MethodBase.hitEnter();
        MethodBase.click_ByXpath("//*[@id=\"sub_category\"]/div/div");
        PageBase.staticWait(5);
        MethodBase.hitEnter();
        MethodBase.click_ByXpath("//*[@id=\"material\"]/div/div");
        PageBase.staticWait(5);
        MethodBase.hitEnter();
        MethodBase.setText_ByID("description","Des");
        MethodBase.setText_ByID("procedure","pro");
        MethodBase.click_ByXpath("//*[@id=\"report_format\"]/div/div");
        MethodBase.selectDropDown("//*[@id=\"77faf2fb-0db4-46fe-816f-8a004fb7135c\"]/ul/li[5]","DELIVERY_REPORT");
    }
    }
