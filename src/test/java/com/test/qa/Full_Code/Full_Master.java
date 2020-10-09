package com.test.qa.Full_Code;
import com.test.qa.cards.master.supplier.SupplierCategory;
import com.test.qa.utils.TestBase;
import org.testng.annotations.Test;
import utils.MethodBase;
import utils.PageBase;

import java.util.logging.Logger;

public class Full_Master extends TestBase {
    private static final Logger LOGGER = Logger.getLogger(String.valueOf((SupplierCategory.class)));

    /**
     * PlantNV
     */

    @Test(groups = {"Smoke"}, priority = 1)
    public static void addPlantSmokeTest() {

        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]/a[1]/div/div");//Master
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/header/ul/ul/li[4]/a");//Plant NV
        PageBase.staticWait(5);
//      MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/div[1]/div/div[1]");//Plant Field
        MethodBase.isDisplayed_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/div/div/div[1]/div/div[1]");//Plant Panel
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/div/div/div[1]/div/div[2]/button");//Add plant

        /*
        To Check Validation
         */

        MethodBase.setText_ByID("plant_code", "");//plant_code
        PageBase.staticWait(5);
        MethodBase.setText_ByID("plant_name", "");//plant_name
        MethodBase.setText_ByID("plant_address", "");//plant_address
        MethodBase.setText_ByID("plant_contactno", "");//plant_contactno
        MethodBase.setText_ByID("fax", "");//fax
        MethodBase.setText_ByID("plant_description", "");//plant_description
        PageBase.staticWait(8);
        MethodBase.click_ByXpath("//*[@style=\"background: rgb(0, 19, 40); color: white; border: none;\"]");//save
        PageBase.staticWait(8);
        MethodBase.assertEqual_Text_ByXpath("//div[text()=\"Code can't be empty\"]", "Code can't be empty");
        LOGGER.info("Code can't be empty");
        MethodBase.assertEqual_Text_ByXpath("//div[text()=\"Plant can't be empty\"]", "Plant can't be empty");
        LOGGER.info("Plant can't be empty");
        MethodBase.assertEqual_Text_ByXpath("//div[text()=\"Address can't be empty\"]", "Address can't be empty");
        LOGGER.info("Address can't be empty");
        MethodBase.assertEqual_Text_ByXpath("//div[text()=\"Contact Number can't be empty\"]", "Contact Number can't be empty");
        LOGGER.info("Contact Number can't be empty");
        MethodBase.assertEqual_Text_ByXpath("//div[text()=\"Fax Number can't be empty\"]", "Fax Number can't be empty");
        LOGGER.info("Fax Number can't be empty");

         /*
        Input Data
         */

        MethodBase.setText_ByID("plant_code", "VT");//plant_code
        PageBase.staticWait(5);
        MethodBase.setText_ByID("plant_name", "Vatala");//plant_name
        MethodBase.setText_ByID("plant_address", "Vatala");//plant_address
        MethodBase.setText_ByID("plant_contactno", "0777436123");//plant_contactno
        MethodBase.setText_ByID("fax", "0777156122");//fax
        MethodBase.setText_ByID("plant_description", "select plant");//plant_description
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("//*[@style=\"background: rgb(0, 19, 40); color: white; border: none;\"]");//save
        PageBase.staticWait(8);
        MethodBase.isDisplayed_ByXpath("/html/body/div[1]/div/section/section/main/div/div[2]/div/div/div/div/div[1]/div/div[1]");

    }

    @Test(groups = {"Smoke"}, priority = 2)
    public  static void editPlantSmokeTest() throws Exception {

        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]/a[1]/div/div");//Master
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/header/ul/ul/li[4]/a");//Plant NV
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div/div[1]");//Plant Field
        PageBase.staticWait(8);
        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/div[2]/div/div/div/div/div[2]/div/table/tbody/tr[6]/td[7]/span/a[1]/i");//edit button
        PageBase.staticWait(8);
//      MethodBase.clear_ById("plant_code", "APY");//plant_code
//      PageBase.staticWait(10);
//      MethodBase.assertEqual_Text_ByXpath("//div[text()=\"Only 3 characters long!\"]", "Only 3 characters long!");//to restrict 3 UpperCase
        MethodBase.clear_ById("plant_name", "Ampara");//plant_name
        PageBase.staticWait(8);
        MethodBase.clear_ById("plant_address", "Ampara");//plant_address
        PageBase.staticWait(8);
        MethodBase.clear_ById("plant_contactno", "07711111111");//plant_contactno
        PageBase.staticWait(8);
        MethodBase.clear_ById("fax", "07711111111");//fax
        PageBase.staticWait(8);
        MethodBase.clear_ById("plant_description", "select plant");//plant_description
        PageBase.staticWait(8);
        MethodBase.click_ByXpath("//*[@style=\"background: rgb(0, 19, 40); color: white; border: none;\"]");//save
        PageBase.staticWait(5);
        MethodBase.escape();

        /*
        Check Filter Option
         */


        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/div[2]/div/div/div/div/div[2]/div/table/thead/tr/th[1]/span[2]");//Click  Search icon
        MethodBase.setText_ByXpath("/html/body/div[3]/div/div/div/div/input", "BT");//Pass SENDKEY VALUE
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("/html/body/div[3]/div/div/div/div/div/button[1]");// Click Search Button
        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/div[2]/div/div/div/div/div[2]/div/table/thead/tr/th[2]/span[2]");//Click  Search icon
        MethodBase.setText_ByXpath("/html/body/div[4]/div/div/div/div/input", "Jaffna");//Pass SENDKEY VALUE
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("/html/body/div[4]/div/div/div/div/div/button[1]");// Click Search Button
        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/div[2]/div/div/div/div/div[2]/div/table/thead/tr/th[3]/span[2]");//Click  Search icon
        MethodBase.setText_ByXpath("/html/body/div[5]/div/div/div/div/input", "Matala");//Pass SENDKEY VALUE
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("/html/body/div[5]/div/div/div/div/div/button[1]");// Click Search Button
        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/div[2]/div/div/div/div/div[2]/div/table/thead/tr/th[4]/span[2]");//Click  Search icon
        MethodBase.setText_ByXpath("/html/body/div[6]/div/div/div/div/input", "07789654231");//Pass SENDKEY VALUE
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("/html/body/div[6]/div/div/div/div/div/button[1]");


        /*
        To View Description icon
         */

//        PageBase.staticWait(5);
//        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/div[2]/div/div/div/div/div[2]/div/table/tbody/tr[1]/td[6]/div/i");//Click View Descriptuion
//        PageBase.staticWait(5);
//        MethodBase.click_ByXpath("/html/body/div[7]/div/div[2]/div/div[2]/div[3]/button");
//        PageBase.staticWait(5);
    }

//    @Test(groups = {"Smoke"}, priority = 3)
//    public static void deletePlantSmokeTest() {
//
//        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]/a[1]/div/div");//Master
//        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/header/ul/ul/li[4]/a");//Plant NV
//        PageBase.staticWait(5);
//        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div/div[1]");//Plant Field
//        PageBase.staticWait(6);
//        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/div[2]/div/div/div/div/div[2]/div/table/tbody/tr[1]/td[7]/span/a[2]/a/i");//delete
//        PageBase.staticWait(6);
//        MethodBase.click_ByXpath("/html/body/div[9]/div/div/div/div[2]/div/div/div[2]/button[2]/span");//confirm delete
//
//    }

    /**
     *EquipmentNV
     */

    @Test(groups = {"Smoke"}, priority = 4)
    public static void addEquipmentSmokeTest() throws Exception {

    MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]/a[1]/div/div");//Master
    MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/header/ul/ul/li[6]/a");//Equipment NV
    MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/div/div[1]/div/div[2]/button");//Add Equipment
        /*
        To Check Validation
         */

    MethodBase.setText_ByXpath("//*[@id=\"equipment_name\"]", "");//equipment_name
    MethodBase.setText_ByXpath("//*[@id=\"equipment_description\"]", "");//equipment_description
    MethodBase.click_ByXpath("  //*[@id=\"type\"]/div/div");//equipment type
    PageBase.staticWait(5);
    MethodBase.click_ByXpath("//*[@style=\"background: rgb(0, 19, 40); color: white; border: none;\"]");//save
        MethodBase.escape();
//  PageBase.staticWait((5));
//  MethodBase.assertEqual_Text_ByXpath("//div[text()=\"Name can't be empty\"]","Name can't be empty");
//  PageBase.staticWait((5));

        /*
        Data Input
         */
    PageBase.staticWait((5));
    MethodBase.setText_ByXpath("//*[@id=\"equipment_name\"]", "Compress Device");//equipment_name
    MethodBase.setText_ByXpath("//*[@id=\"equipment_description\"]", " Take Compress shaker");//equipment_description
    MethodBase.click_ByXpath("  //*[@id=\"type\"]/div/div");//equipment type
    PageBase.staticWait(5);
    MethodBase.hitEnter();
    PageBase.staticWait(5);
    MethodBase.click_ByXpath("//*[@style=\"background: rgb(0, 19, 40); color: white; border: none;\"]");//save
    PageBase.staticWait((5));
    MethodBase.escape();
}

    @Test(groups = {"Smoke"}, priority = 5)
    public static void editEquipmentSmokeTest() throws Exception {

        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]/a[1]/div/div");//Master
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/header/ul/ul/li[6]/a");//Equipment NV
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/div[2]/div/div/div/div[2]/div/table/tbody/tr[5]/td[4]/span/a[1]/i");//edit
        PageBase.staticWait(5);
        MethodBase.clear_ByXpath("//*[@id=\"equipment_name\"]", "Tool");//equipment_name
        MethodBase.clear_ByXpath("//*[@id=\"equipment_description\"]", " Take Tool");//equipment_description
        MethodBase.click_ByXpath("  //*[@id=\"type\"]/div/div");//equipment type
        PageBase.staticWait(5);
        MethodBase.hitEnter();
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("//*[@style=\"background: rgb(0, 19, 40); color: white; border: none;\"]");//save
        PageBase.staticWait((5));
        MethodBase.escape();

    }


//        @Test(groups = {"Smoke"}, priority = 6)
//        public static void deleteEquipmentSmokeTest() throws Exception {
//
//            MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]/a[1]/div/div");//Master
//            MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/header/ul/ul/li[6]/a");//Equipment NV
//            MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]/div[1]");// Equipment field
//            PageBase.staticWait(5);
//            MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/div[2]/div/div/div/div[2]/div/table/tbody/tr[2]/td[4]/span/a[2]/a/i");// delete btn
//            PageBase.staticWait(8);
//            MethodBase.click_ByXpath("/html/body/div[6]/div/div/div/div[2]/div/div/div[2]/button[2]");//ok confirm
//            PageBase.staticWait(6);
////          MethodBase.isDisplayed_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/div/div[2]/div/table/tbody/tr[1]/td[4]/span/a[2]/a/i");//verify  if deleted
////          LOGGER.info("verify  if deleted");

//    }

    @Test(groups = {"Smoke"}, priority = 7)
    public  static void addPlantEquipmentSmokeTest() throws Exception {

        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]/a[1]/div/div");//Master
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/header/ul/ul/li[6]/a");//Equipment NV
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[2]/div[1]");//Plant Equipment Field
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/div/div/div[1]/div/div[3]/button");//Add plant Equipment Field
      /*
      Validation Check
       */
        MethodBase.setText_ByXpath("//*[@id=\"serial_no\"]","");
        MethodBase.click_ByXpath("//*[@id=\"equipment\"]/div/div");
        PageBase.staticWait(5);
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("//*[@id=\"plant\"]/div/div");
        PageBase.staticWait(5);
        MethodBase.setText_ByXpath("//*[@id=\"brand_name\"]","");
        MethodBase.setText_ByXpath("//*[@id=\"model_name\"]","");
        MethodBase.setText_ByXpath("//*[@id=\"description\"]","");
        PageBase.staticWait((5));
        MethodBase.click_ByXpath("//*[@style=\"background: rgb(0, 19, 40); color: white; border: none;\"]");//save
        PageBase.staticWait((5));
        MethodBase.assertEqual_Text_ByXpath("//div[text()=\"Serial No can't be empty\"]","Serial No can't be empty");
        LOGGER.info("Serial No can't be empty");
        MethodBase.assertEqual_Text_ByXpath("//div[text()=\"Equipment can't be empty\"]","Equipment can't be empty");
        LOGGER.info("Equipment can't be empty");
        MethodBase.assertEqual_Text_ByXpath("//div[text()=\"Plant can't be empty\"]","Plant can't be empty");
        LOGGER.info("Plant can't be empty");
        MethodBase.assertEqual_Text_ByXpath("//div[text()=\"Brand can't be empty\"]","Brand can't be empty");
        LOGGER.info("Brand can't be empty");
        MethodBase.assertEqual_Text_ByXpath("//div[text()=\"Model can't be empty\"]","Model can't be empty");
        PageBase.staticWait((5));

         /*
      Data Input
       */

        MethodBase.setText_ByXpath("//*[@id=\"serial_no\"]","4569");
        MethodBase.click_ByXpath("//*[@id=\"equipment\"]/div/div");
        PageBase.staticWait(5);
        MethodBase.hitEnter();
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("//*[@id=\"plant\"]/div/div");
        PageBase.staticWait(5);
        MethodBase.hitEnter();
        MethodBase.setText_ByXpath("//*[@id=\"brand_name\"]","MOK");
        MethodBase.setText_ByXpath("//*[@id=\"model_name\"]","789dom");
        MethodBase.setText_ByXpath("//*[@id=\"description\"]","take equipment");
        MethodBase.click_ByXpath("//*[@id=\"calibrationExists\"]");
        MethodBase.click_ByXpath("//*[@style=\"background: rgb(0, 19, 40); color: white; border: none;\"]");//save
        PageBase.staticWait((5));

    }

    @Test(groups = {"Smoke"}, priority = 8)
    public static void editPlantEquipmentSmokeTest() throws Exception {

        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]/a[1]/div/div");//Master
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/header/ul/ul/li[6]/a");//Equipment NV
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[2]/div[1]");//Plant Equipment Field
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/div[2]/div/div/div/div/div[2]/div/table/tbody/tr[3]/td[8]/span/a[1]/i");//Edit plant Equipment Field
        MethodBase.click_ByXpath("//*[@id=\"equipment\"]/div/div");
        PageBase.staticWait(5);
        MethodBase.hitEnter();
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("//*[@id=\"plant\"]/div/div");
        PageBase.staticWait(5);
        MethodBase.hitEnter();
        MethodBase.clear_ByXpath("//*[@id=\"brand_name\"]","yokl");
        MethodBase.clear_ByXpath("//*[@id=\"model_name\"]","7896lkj");
        MethodBase.clear_ByXpath("//*[@id=\"description\"]"," equipment take");
        MethodBase.click_ByXpath("//*[@id=\"calibrationExists\"]");
        MethodBase.click_ByXpath("//*[@style=\"background: rgb(0, 19, 40); color: white; border: none;\"]");//save
        PageBase.staticWait((5));


//        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/div[2]/div/div/div/div/div[1]/div/button");//Click Export
//        PageBase.staticWait((5));
//        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/div[2]/div/div/div/div/div[1]/div/span/div[1]/span/button");//Click Import
//        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/div[2]/div/div/div/div/div[2]/div/table/tbody/tr[3]/td[7]/div/i");//View Description

    }

    /*
    To Check Delete
     */

//    @Test(groups = {"Smoke"}, priority = 9)
//    public  static void deletePlantEquipmentSmokeTest() throws Exception {
//        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]/a[1]/div/div");//Master
//        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/header/ul/ul/li[6]/a");//Equipment NV
//        PageBase.staticWait(8);
//        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/div[2]/div/div/div/div[2]/div/table/tbody/tr[1]/td[4]/span/a[2]/a/i");// delete
//        PageBase.staticWait(5);
//        MethodBase.click_ByXpath("/html/body/div[10]/div/div/div/div[2]/div/div/div[2]/button[2]");//ok confirm
//        MethodBase.isDisplayed_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/div/div/div[1]/div/div[1]");//verify if deleted
 //  }

    /**
     *MaterialNV
     */

    @Test(groups = {"Smoke"}, priority = 10)
    public  static void addMaterialCtaegorySmokeTest() throws Exception {
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]/a[1]/div/div");//Master
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/header/ul/ul/li[8]/a");//Material NV
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]/div[1]");//Material category field
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/div/div[1]/div/div[2]/button");//Add Material category
        MethodBase.isDisplayed_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/div/div[1]/div/div[1]");//Page Verify
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("//*[@style=\"background: rgb(0, 19, 40); color: white; border: none;\"]");//save
        MethodBase.click_ByXpath("//*[@style=\"background: rgb(0, 19, 40); color: white; border: none;\"]");//save
        MethodBase.click_ByXpath("//*[@style=\"background: rgb(0, 19, 40); color: white; border: none;\"]");//save
        MethodBase.setText_ByXpath("//*[@id=\"category_name\"]","");//category_name
        PageBase.staticWait(5);
        MethodBase.setText_ByXpath("//*[@id=\"prefix\"]","");//prefix
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("//*[@id=\"mainType\"]/div/div");//mainType
        PageBase.staticWait(8);
        MethodBase.assertEqual_Text_ByXpath("//div[text()=\"Name can't be empty\"]","Name can't be empty");
        LOGGER.info("Name can't be empty");
        MethodBase.assertEqual_Text_ByXpath("//div[text()=\"Prefix can't be empty\"]","Prefix can't be empty");
        LOGGER.info("Prefix can't be empty");
        MethodBase.assertEqual_Text_ByXpath("//div[text()=\"Main Type can't be empty\"]","Main Type can't be empty");
        LOGGER.info("Main Type can't be empty");
        PageBase.staticWait(5);

        /*
        Data Input
         */
        PageBase.staticWait(8);
        MethodBase.setText_ByXpath("//*[@id=\"category_name\"]","ceme");//category_name
        PageBase.staticWait(5);
        MethodBase.setText_ByXpath("//*[@id=\"prefix\"]","SD");//prefix
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("//*[@id=\"mainType\"]/div/div");//mainType
        PageBase.staticWait(5);
        MethodBase.hitEnter();
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("//*[@style=\"background: rgb(0, 19, 40); color: white; border: none;\"]");//save
        PageBase.staticWait((8));
        MethodBase.escape();

    }

    @Test(groups = {"Smoke"}, priority = 11)
    public static void editMaterialCtaegorySmokeTest() throws Exception {
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]/a[1]/div/div");//Master
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/header/ul/ul/li[8]/a");//Material NV
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]/div[1]");//Material category field
        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/div[2]/div/div/div/div[2]/div/table/tbody/tr[1]/td[5]/span/a[1]/i");//Edit Material category
        MethodBase.isDisplayed_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/div/div[1]/div/div[1]");
        MethodBase.clear_ByXpath("//*[@id=\"category_name\"]","Huge aggregate");//category_name
        PageBase.staticWait(5);
        MethodBase.hitEnter();
        PageBase.staticWait(5);
        MethodBase.clear_ByXpath("//*[@id=\"prefix\"]","BAS");//prefix
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("//*[@id=\"mainType\"]/div/div");//mainType
        MethodBase.hitEnter();
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("//*[@style=\"background: rgb(0, 19, 40); color: white; border: none;\"]");//save
        PageBase.staticWait((5));
    }

    /*
    To Check Delete
     */

//    @Test(groups = {"Smoke"}, priority = 12)
//    public static void deleteMaterialCtaegorySmokeTest() throws Exception {
//        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]/a[1]/div/div");//Master
//        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/header/ul/ul/li[8]/a");//Material NV
//        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]/div[1]");//Material category field
//        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/div/div[2]/div/table/tbody/tr[6]/td[5]/span/a[2]/a/i");//Delete
//        MethodBase.click_ByXpath("/html/body/div[6]/div/div/div/div[2]/div/div/div[2]/button[2]/span");
//   }

    @Test(groups = {"Smoke"}, priority = 13)
    public void addMaterialSubCategorySmokeTest() throws Exception {
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]/a[1]/div/div");//Master
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/header/ul/ul/li[8]/a");//Material NV
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[2]/div[1]");//Material SubCategory Field
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/div/div/div[1]/div/div[2]/button");// Add Material SubCategory

        /*
        To Check Validation
         */

        PageBase.staticWait(5);
        MethodBase.click_ByXpath("//*[@id=\"mainType\"]/div/div");//mainType
        PageBase.staticWait(5);
//        MethodBase.click_ByXpath("//*[@id=\"material_category\"]/div/div/div[1]");//material_category
//        PageBase.staticWait(5);
        MethodBase.setText_ByXpath("//*[@id=\"prefix\"]","");
        MethodBase.setText_ByXpath("//*[@id=\"subcategory_name\"]","");
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("//*[@style=\"background: rgb(0, 19, 40); color: white; border: none;\"]");//save
        PageBase.staticWait((5));
        MethodBase.assertEqual_Text_ByXpath("//div[text()=\"Prefix can't be empty\"]","Prefix can't be empty");
        PageBase.staticWait((5));
        LOGGER.info("Prefix can't be empty");
        MethodBase.assertEqual_Text_ByXpath("//div[text()=\"Name can't be empty\"]","Name can't be empty");
        PageBase.staticWait((5));
        LOGGER.info("Name can't be empty");

        /*
        Data Input
         */
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("//*[@id=\"mainType\"]/div/div");//mainType
        PageBase.staticWait(5);
        MethodBase.hitEnter();
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("//*[@id=\"material_category\"]/div/div/div[1]");//material_category
        PageBase.staticWait(5);
        MethodBase.hitEnter();
        MethodBase.setText_ByXpath("//*[@id=\"prefix\"]","MA");
        MethodBase.setText_ByXpath("//*[@id=\"subcategory_name\"]","Main Aggregate");
        MethodBase.click_ByXpath("//*[@style=\"background: rgb(0, 19, 40); color: white; border: none;\"]");//save
    }

    @Test(groups = {"Smoke"}, priority = 14)
    public static void editMaterialSubCategorySmokeTest() throws Exception {
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]/a[1]/div/div");//Master
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/header/ul/ul/li[8]/a");//Material NV
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[2]/div[1]");//Material SubCategory Field
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/div[2]/div/div/div/div/div[2]/div/table/tbody/tr[2]/td[5]/span/a[1]/i");// Edit Material SubCategory
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("//*[@style=\"background: rgb(0, 19, 40); color: white; border: none;\"]");//save
        MethodBase.click_ByXpath("//*[@id=\"mainType\"]/div/div");//mainType
        PageBase.staticWait(5);
        MethodBase.hitEnter();
        PageBase.staticWait(5);
//        MethodBase.click_ByXpath("/html/body/div[7]/div/div[2]/div/div[2]/div[2]/form/div[2]/div/div/div/div/div/div[3]/div/input");//material_category
//        PageBase.staticWait(5);
//        MethodBase.hitEnter();
        MethodBase.clear_ByXpath("//*[@id=\"prefix\"]","MR");
        MethodBase.clear_ByXpath("//*[@id=\"subcategory_name\"]","miner");
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("//*[@style=\"background: rgb(0, 19, 40); color: white; border: none;\"]");//save
        PageBase.staticWait((5));
    }

//    @Test(groups = {"Smoke"}, priority = 15)
//    public  static void deleteMaterialSubCategorySmokeTest() throws Exception {
//        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]/a[1]/div/div");//Master
//        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/header/ul/ul/li[8]/a");//Material NV
//        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[2]/div[1]");//Material SubCategory Field
//        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/div/div/div[2]/div/table/tbody/tr[5]/td[5]/span/a[2]/a/i");// delete Material SubCategory
//        MethodBase.click_ByXpath("/html/body/div[8]/div/div/div/div[2]/div/div/div[2]/button[2]/span");//ok Confirm
//   }

        @Test(groups = {"Smoke"}, priority = 16)
        public static void addMaterialSmokeTest() throws Exception {
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]/a[1]/div/div");//Master
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/header/ul/ul/li[8]/a");//Material NV
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[4]/div[1]");//Material Field
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/div/div/div[1]/div/div[2]/button");//Add Material
        PageBase.staticWait(5);

         /*
        To Check Validation
         */
//        MethodBase.click_ByXpath("//*[@style=\"background: rgb(0, 19, 40); color: white; border: none;\"]");//save
        MethodBase.click_ByXpath("//*[@id=\"sub_category\"]/div/div");//sub_category
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("/html/body/div[11]/div/div[2]/div/div[2]/div[2]/form/div[1]/div[2]/div/div[1]/div/div");//material_nature
        PageBase.staticWait(5);
        MethodBase.setText_ByXpath("//*[@id=\"material_name\"]", "");//material_name
        MethodBase.setText_ByXpath("//*[@id=\"prefix\"]", "");
        MethodBase.setText_ByXpath("//*[@id=\"description\"]", "");
        MethodBase.click_ByXpath("//*[@id=\"active\"]");
        PageBase.staticWait((5));
        MethodBase.click_ByXpath("//*[@style=\"background: rgb(0, 19, 40); color: white; border: none;\"]");//save
        PageBase.staticWait((5));
        MethodBase.assertEqual_Text_ByXpath("//div[text()=\"SubCategory can't be empty\"]", "SubCategory can't be empty");
        LOGGER.info("SubCategory can't be empty");
        MethodBase.assertEqual_Text_ByXpath("//div[text()=\"Name can't be empty\"]", "Name can't be empty");
        LOGGER.info("Name can't be empty");
        MethodBase.assertEqual_Text_ByXpath("//div[text()=\"Prefix can't be empty\"]", "Prefix can't be empty");
        LOGGER.info("Prefix can't be empty");

         /*
        To Data Input
         */
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("//*[@id=\"sub_category\"]/div/div");//sub_category
        PageBase.hitEnter();
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("/html/body/div[11]/div/div[2]/div/div[2]/div[2]/form/div[1]/div[2]/div/div[1]/div/div");//material_nature
        PageBase.staticWait(5);
        PageBase.hitEnter();
        PageBase.staticWait(5);
        MethodBase.setText_ByXpath("//*[@id=\"material_name\"]", "Optima-1717");//material_name
        MethodBase.setText_ByXpath("//*[@id=\"prefix\"]", "OPT");
        MethodBase.setText_ByXpath("//*[@id=\"description\"]", "Take material");
        MethodBase.click_ByXpath("//*[@id=\"active\"]");
        PageBase.staticWait((5));
        MethodBase.click_ByXpath("//*[@style=\"background: rgb(0, 19, 40); color: white; border: none;\"]");//save
        PageBase.staticWait((5));
        }

@Test(groups = {"Smoke"}, priority = 17)
public static  void editMaterialSmokeTest() throws Exception {

        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]/a[1]/div/div");//Master
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/header/ul/ul/li[8]/a");//Material NV
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[4]/div[1]");//Material Field
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/div[2]/div/div/div/div/div[2]/div/table/tbody/tr[5]/td[9]/span/a[1]/i");//Edit Material
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("//*[@id=\"sub_category\"]/div/div");//sub_category
        PageBase.hitEnter();
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("/html/body/div[11]/div/div[2]/div/div[2]/div[2]/form/div[1]/div[2]/div/div[1]/div/div");//material_nature
        PageBase.hitEnter();
        PageBase.staticWait(5);
        MethodBase.clear_ByXpath("//*[@id=\"material_name\"]", "Optima-999");//material_name
        MethodBase.clear_ByXpath("//*[@id=\"prefix\"]", "OPt");
        MethodBase.clear_ByXpath("//*[@id=\"description\"]", "Take material");
        MethodBase.click_ByXpath("//*[@id=\"active\"]");
        PageBase.staticWait((5));
        MethodBase.click_ByXpath("//*[@style=\"background: rgb(0, 19, 40); color: white; border: none;\"]");//save
        PageBase.staticWait((5));

        }

//@Test(groups = {"Smoke"}, priority = 18)
//public static void deleteMaterialSmokeTest() throws Exception {
//        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]/a[1]/div/div");//Master
//        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/header/ul/ul/li[8]/a");//Material NV
//        PageBase.staticWait(5);
//        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[4]/div[1]");//Material Field
//        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/div/div/div[2]/div/table/tbody/tr[3]/td[8]/span/a[2]/a/i");//Delete Material
//        MethodBase.click_ByXpath("//span[text()=\"OK\"]");//OK
//        MethodBase.escape();
//        }

    @Test(groups = {"Smoke"}, priority = 19)
    public static void addMaterialStateSmokeTest() throws Exception {
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]/a[1]/div/div");//Master
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/header/ul/ul/li[8]/a");//Material NV
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[3]/div[1]");//Material  State  Field
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/div/div[1]/div/div[2]/button");//Add Material  State

        /*
        Validation Check
         */

        MethodBase.setText_ByXpath("//*[@id=\"material_state\"]","");
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("//*[@style=\"background: rgb(0, 19, 40); color: white; border: none;\"]");//save
        PageBase.staticWait((5));
        MethodBase.assertEqual_Text_ByXpath("//div[text()=\"Material State can't be empty\"]","Material State can't be empty");
        LOGGER.info("Material State can't be empty");

          /*
      Input Data
         */


        MethodBase.setText_ByXpath("//*[@id=\"material_state\"]","Soli liquid Gas");
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("//*[@style=\"background: rgb(0, 19, 40); color: white; border: none;\"]");//save
        PageBase.staticWait((5));



    }

    @Test(groups = {"Smoke"}, priority = 20)
    public static void editMaterialStateSmokeTest() throws Exception {


        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]/a[1]/div/div");//Master
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/header/ul/ul/li[8]/a");//Material NV
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[3]/div[1]");//Material  State  Field
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/div[2]/div/div/div/div[2]/div/table/tbody/tr[1]/td[3]/span/a[1]/i");//Edit Material  State
        MethodBase.clear_ByXpath("//*[@id=\"material_state\"]"," Liquid");
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("//*[@style=\"background: rgb(0, 19, 40); color: white; border: none;\"]");//save
        PageBase.staticWait(5);


    }

//    @Test(groups = {"Smoke"}, priority = 21)
//    public static void deleteMaterialStateSmokeTest() throws Exception {
//        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]/a[1]/div/div");//Master
//        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/header/ul/ul/li[8]/a");//Material NV
//        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[3]/div[1]");//Material  State  Field
//        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/div[2]/div/div/div/div[2]/div/table/tbody/tr[3]/td[3]/span/a[2]/a/i");//delete Material  State
//        MethodBase.click_ByXpath("/html/body/div[5]/div/div/div/div[2]/div/div/div[2]/button[2]/span");//Confirm
//    }



    @Test(groups = {"Smoke"}, priority = 22)
    public static void addUnitSmokeTest() throws Exception {
        /*
To Check validation
         */


        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]/a[1]/div/div");//Master
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/header/ul/ul/li[8]/a");//Material NV
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[5]/div[1]");//unit field
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/div/div[1]/div/div[2]/button");//Add unit
        MethodBase.isDisplayed_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/div/div[1]/div/div[1]");// to verify the unit layout
        MethodBase.setText_ByXpath("//*[@id=\"unit_name\"]", "");//unit_name
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("//*[@style=\"background: rgb(0, 19, 40); color: white; border: none;\"]");//save
        PageBase.staticWait(5);
        MethodBase.assertEqual_Text_ByXpath("//div[text()=\"Unit can't be empty\"]","Unit can't be empty");
        LOGGER.info("Unit can't be empty");

        /*
    Data Input
         */

        MethodBase.setText_ByXpath("//*[@id=\"unit_name\"]", "Mo");//unit_name
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("//*[@style=\"background: rgb(0, 19, 40); color: white; border: none;\"]");//save
        PageBase.staticWait(5);

    }


    @Test(groups = {"Smoke"}, priority = 23)
    public static void editUnitSmokeTest() {
        /*
        TO edit Details
        */

        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]/a[1]/div/div");//Master
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/header/ul/ul/li[8]/a");//Material NV
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[5]/div[1]");//unit field
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/div[2]/div/div/div/div[2]/div/table/tbody/tr[1]/td[3]/span/a[1]/i");//Click edit icon
        MethodBase.clear_ByXpath("//*[@id=\"unit_name\"]","ML");// clear existing data
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("//*[@style=\"background: rgb(0, 19, 40); color: white; border: none;\"]");//save

    }


    @Test(groups = {"Smoke"}, priority = 24)
    public  static void deleteUnitSmokeTest()  {


///*
//TO Delete Details
// */
//
//        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]/a[1]/div/div");//Master
//        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/header/ul/ul/li[8]/a");//Material NV
//        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[5]/div[1]");//unit field
//        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/div/div[2]/div/table/tbody/tr[3]/td[3]/span/a[2]/a/i");//delete
//        MethodBase.click_ByXpath("//span[text()=\"OK\"]");//ok
//
   }

    /**
     *CustomerNV
     */

    @Test(groups = {"Smoke"}, priority = 26)
    public static void addcustomerSmokeTest() throws Exception {
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]/a[1]/div/div");//Master
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/header/ul/ul/li[10]/a");//Customer field
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]");//Customer
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/div/div[1]/div/div[3]/button");//Add Customer

        /*
       Validation Checking
         */

        PageBase.staticWait(5);
        MethodBase.click_ByXpath("//*[@style=\"background: rgb(0, 19, 40); color: white; border: none;\"]");//save
        MethodBase.click_ByXpath("//*[@id=\"customer_plant\"]/div/div/div");
        PageBase.staticWait(5);
        MethodBase.setText_ByXpath("//*[@id=\"customer_name\"]","");
        MethodBase.setText_ByXpath("//*[@id=\"customer_email\"]","");
        MethodBase.setText_ByXpath("//*[@id=\"customer_address\"]","");
        MethodBase.setText_ByXpath("//*[@id=\"customer_contactno\"]","");
        PageBase.staticWait(5);
        PageBase.staticWait(5);
        MethodBase.assertEqual_Text_ByXpath("//div[text()=\"Plant can't be empty\"]","Plant can't be empty");
        LOGGER.info("Plant can't be empty");
        MethodBase.assertEqual_Text_ByXpath("//div[text()=\"Name can't be empty\"]","Name can't be empty");
        LOGGER.info("Name can't be empty");
//        MethodBase.assertEqual_Text_ByXpath("//div[text()=\"Address can't be empty\"]","Address can't be empty");
//        LOGGER.info("Address can't be empty");
//        MethodBase.assertEqual_Text_ByXpath("//div[text()=\"Contact No can't be empty\"]","Contact No can't be empty");
//        LOGGER.info("Contact No can't be empty");


         /*
         Data Input
          */

        PageBase.staticWait(5);
        MethodBase.click_ByXpath("//*[@id=\"customer_plant\"]/div/div/div");
        PageBase.staticWait(5);
        MethodBase.hitEnter();
        MethodBase.setText_ByXpath("//*[@id=\"customer_name\"]","Ano");
        MethodBase.setText_ByXpath("//*[@id=\"customer_email\"]","ano@gmail.com");
        MethodBase.setText_ByXpath("//*[@id=\"customer_address\"]","jaffna");
        MethodBase.setText_ByXpath("//*[@id=\"customer_contactno\"]","07789654231");
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("//*[@style=\"background: rgb(0, 19, 40); color: white; border: none;\"]");//save
        PageBase.staticWait(5);
//        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/div/div[1]/div/button");

        /*
        View Plant Description
         */
//        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/div/div[2]/div/table/tbody/tr[2]/td[2]/span/i");//View descrition of plant
//        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/div[2]/div/div/div/div[2]/div/table/tbody/tr[1]/td[8]/span/i");// Other plant
//        MethodBase.click_ByXpath("/html/body/div[7]/div/div[2]/div/div[2]/div[2]/div/label[1]/span[1]/input");//Check box plants
//        MethodBase.click_ByXpath("//span[text()=\"OK\"]");
    }


    @Test(groups = {"Smoke"}, priority = 27)
    public static void editcustomerSmokeTest() throws Exception {

        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]/a[1]/div/div");//Master
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/header/ul/ul/li[10]/a");//Customer field
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]");//Customer
//        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/div/div[2]/div/table/tbody/tr[1]/td[2]/span/i");//View card Plant
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/div[2]/div/div/div/div[2]/div/table/tbody/tr[3]/td[9]/span/a[1]/i");//Edit Icon
        MethodBase.clear_ByXpath("//*[@id=\"customer_name\"]","Const");
        MethodBase.clear_ByXpath("//*[@id=\"customer_email\"]","Const@gmai.com");
        MethodBase.clear_ByXpath("//*[@id=\"customer_address\"]","Jaffna");
        MethodBase.clear_ByXpath("//*[@id=\"customer_contactno\"]","0771165321");
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("//*[@style=\"background: rgb(0, 19, 40); color: white; border: none;\"]");//save
        PageBase.staticWait(5);
//        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/div/div[1]/div/button");
//        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/div/div[2]/div/table/tbody/tr[3]/td[8]/span/i");//Allocate Plant view
    }

//    @Test(groups = {"Smoke"}, priority = 28)
//    public static void deletecustomerSmokeTest() throws Exception {
//        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]/a[1]/div/div");//Master
//        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/header/ul/ul/li[10]/a");//Customer field
//        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]");//Customer
//        PageBase.staticWait(5);
//       MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/div/div[2]/div/table/tbody/tr[2]/td[9]/span/a[2]/a/i");//delete buuton
//        PageBase.staticWait(5);
//        MethodBase.click_ByXpath("/html/body/div[6]/div/div/div/div[2]/div/div/div[2]/button[2]");//Delete Confirm
//
//    }

    @Test(groups = {"Smoke"}, priority = 29)
    public static void addprojectSmokeTest() throws Exception {


        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]/a[1]/div/div");//Master
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/header/ul/ul/li[10]/a");//Customer
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[2]");//Project Field
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/div/div[1]/div/div[3]/button");//Add Project


        /*
        Validation Checking
         */
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("//*[@id=\"plant\"]/div/div");//Plant
        PageBase.staticWait(5);
        MethodBase.setText_ByID("project_name","");//project
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("//*[@id=\"customer\"]/div/div");//customer
        PageBase.staticWait(5);
        MethodBase.setText_ByXpath("//*[@id=\"contact_person\"]","");//contact_person
        PageBase.staticWait(5);
        MethodBase.setText_ByXpath("//*[@id=\"contact_no\"]","");//contact_no
        MethodBase.click_ByXpath("//*[@id=\"start_date\"]/div/input");
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("//*[@style=\"background: rgb(0, 19, 40); color: white; border: none;\"]");//save
        PageBase.staticWait((8));
        MethodBase.assertEqual_Text_ByXpath("//div[text()=\"Name can't be empty\"]", "Name can't be empty");
        LOGGER.info("Name can't be empty");
        MethodBase.assertEqual_Text_ByXpath("//div[text()=\"Customer can't be empty\"]", "Customer can't be empty");
        LOGGER.info("Customer can't be empty");
        MethodBase.assertEqual_Text_ByXpath("//div[text()=\"Contact Person can't be empty\"]", "Contact Person can't be empty");
        LOGGER.info("Contact Person can't be empty");
        MethodBase.assertEqual_Text_ByXpath("//div[text()=\"Contact No can't be empty\"]", "Contact No can't be empty");
        LOGGER.info("Contact No can't be empty");

        /*
       Data Input
         */
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("//*[@id=\"plant\"]/div/div");//Plant
        MethodBase.setText_ByID("project_name","AVD project");//project
        MethodBase.click_ByXpath("//*[@id=\"customer\"]/div/div");//customer
        PageBase.staticWait(5);
        MethodBase.hitEnter();
        MethodBase.setText_ByXpath("//*[@id=\"contact_person\"]","meera");//contact_person
        MethodBase.setText_ByXpath("//*[@id=\"contact_no\"]","0778965423");//contact_no
        MethodBase.click_ByXpath("//*[@id=\"start_date\"]/div/input");
        PageBase.staticWait(5);
        MethodBase.hitEnter();
        PageBase.staticWait((5));
        MethodBase.click_ByXpath("//*[@style=\"background: rgb(0, 19, 40); color: white; border: none;\"]");//save
        PageBase.staticWait((5));
    }

    @Test(groups = {"Smoke"}, priority = 30)
    public static void editprojectSmokeTest() throws Exception {

        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]/a[1]/div/div");//Master
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/header/ul/ul/li[10]/a");//Customer
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[2]");//Project Field
        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/div[2]/div/div/div/div[2]/div/table/tbody/tr[3]/td[10]/span/a[1]/i");//Edit Project
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("//*[@id=\"plant\"]/div/div");//Plant
        PageBase.staticWait(5);
        MethodBase.hitEnter();
        PageBase.staticWait(5);
        MethodBase.clear_ById("project_name", "Gram");//project
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("//*[@id=\"customer\"]/div/div");//customer
        PageBase.staticWait(5);
        MethodBase.hitEnter();
        PageBase.staticWait(5);
        MethodBase.clear_ByXpath("//*[@id=\"contact_person\"]", "");//contact_person
        PageBase.staticWait(5);
        MethodBase.clear_ByXpath("//*[@id=\"contact_no\"]", "0789653214");//contact_no
        MethodBase.click_ByXpath("//*[@id=\"start_date\"]/div/input");
        MethodBase.hitEnter();
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("//*[@style=\"background: rgb(0, 19, 40); color: white; border: none;\"]");//save
        PageBase.staticWait((8));
    }



//    @Test(groups = {"Smoke"}, priority = 31)
//    public  static void deleteprojectSmokeTest() throws Exception {
//
//        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]/a[1]/div/div");//Master
//        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/header/ul/ul/li[10]/a");//Customer
//        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[2]");//Project Field
//        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/div/div[2]/div/table/tbody/tr[3]/td[10]/span/a[2]/a/i");//Delete
//        MethodBase.click_ByXpath("//span[text()=\"OK\"]");//Ok confirm
//
//    }

    @Test(groups = {"Smoke"}, priority = 32)
    public static void adddeliveryCycleSmokeTest() throws Exception {


        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]/a[1]/div/div");//Master
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/header/ul/ul/li[10]/a");//Customer
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[3]");//deliveryCycle Field
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/div/div[1]/div/div[2]/button");//Add pour

        /*
        Check Validation
         */

        MethodBase.setText_ByXpath("//*[@id=\"pour_name\"]","");
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("//*[@id=\"project\"]/div/div");
        PageBase.staticWait(5);
        MethodBase.setText_ByXpath("//*[@id=\"description\"]","");
        PageBase.staticWait((5));
        MethodBase.click_ByXpath("//*[@style=\"background: rgb(0, 19, 40); color: white; border: none;\"]");//save
        PageBase.staticWait((5));
        MethodBase.assertEqual_Text_ByXpath("//div[text()=\"Pour No can't be empty\"]","Pour No can't be empty");
        LOGGER.info("Unit can't be empty");
        MethodBase.assertEqual_Text_ByXpath("//div[text()=\"Project can't be empty\"]","Project can't be empty");
        LOGGER.info("Project can't be empty");

        /*
       Input Data
         */

        MethodBase.setText_ByXpath("//*[@id=\"pour_name\"]","Plliar-09");
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("//*[@id=\"project\"]/div/div");
        PageBase.hitEnter();
        PageBase.staticWait(5);
        MethodBase.hitEnter();
        MethodBase.setText_ByXpath("//*[@id=\"description\"]","project_entry");
        PageBase.staticWait((5));
        MethodBase.click_ByXpath("//*[@style=\"background: rgb(0, 19, 40); color: white; border: none;\"]");//save
        PageBase.staticWait((5));
    }

    @Test(groups = {"Smoke"}, priority = 33)
    public static void editdeliveryCycleSmokeTest() throws Exception {
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]/a[1]/div/div");//Master
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/header/ul/ul/li[10]/a");//Customer
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[3]");//deliveryCycle Field
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/div[2]/div/div/div/div[2]/div/table/tbody/tr[2]/td[4]/span/a[1]/i");//edit
        MethodBase.clear_ByXpath("//*[@id=\"pour_name\"]","p006");
        MethodBase.click_ByXpath("//*[@id=\"project\"]/div/div");
        PageBase.staticWait(5);
        MethodBase.hitEnter();
        MethodBase.clear_ByXpath("//*[@id=\"description\"]","project descp");
        PageBase.staticWait((5));
        MethodBase.click_ByXpath("//*[@style=\"background: rgb(0, 19, 40); color: white; border: none;\"]");//save
        PageBase.staticWait((5));
    }

//    @Test(groups = {"Smoke"}, priority = 34)
//    public  static void deletedeliveryCycleSmokeTest() throws Exception {
//
//        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]/a[1]/div/div");//Master
//        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/header/ul/ul/li[10]/a");//Customer
//        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[3]");//deliveryCycle Field
//        PageBase.staticWait(5);
//        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/div/div[2]/div/table/tbody/tr[2]/td[4]/span/a[2]/a/i");//delete
//        PageBase.staticWait(2);
//        MethodBase.click_ByXpath("/html/body/div[8]/div/div/div/div[2]/div/div/div[2]/button[2]");// confirm
//        PageBase.staticWait(5);
//    }


    /**
     *SupplierNV
     */

    @Test(groups = {"Smoke"}, priority = 38)
    public static void  addsupplierCategorySmokeTest() throws Exception {
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]/a[1]/div/div");//Master
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/header/ul/ul/li[12]/a");//Supplier NV
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]/div[2]/i");//Supplier
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/div/div[1]/div/div[2]/button");//Add Supplier

        /*
        Check Validation
         */
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("//*[@style=\"background: rgb(0, 19, 40); color: white; border: none;\"]");//save
        MethodBase.setText_ByXpath("//*[@id=\"supplier_category\"]","");//supplier_category
        MethodBase.setText_ByXpath("//*[@id=\"supplierCategory_description\"]","");//supplierCategory_description
        PageBase.staticWait((5));
        MethodBase.assertEqual_Text_ByXpath("//div[text()=\"Category can't be empty\"]","Category can't be empty");
        LOGGER.info("Category can't be empty");
/*
 Data Input
  */
        MethodBase.setText_ByXpath("//*[@id=\"supplier_category\"]","chem supplier");//supplier_category
        MethodBase.setText_ByXpath("//*[@id=\"supplierCategory_description\"]","description");//supplierCategory_description
        PageBase.staticWait((5));
        MethodBase.click_ByXpath("//*[@style=\"background: rgb(0, 19, 40); color: white; border: none;\"]");//save
        PageBase.staticWait((5));
    }

    @Test(groups = {"Smoke"}, priority = 39)
    public  static  void  editsupplierCategorySmokeTest() throws Exception {

        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]/a[1]/div/div");//Master
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/header/ul/ul/li[12]/a");//Supplier NV
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]/div[2]/i");//Supplier
        MethodBase.click_ByXpath("/html/body/div/div/section/section/main/div/div[2]/div/div/div/div[2]/div/table/tbody/tr[4]/td[3]/span/a[1]/i");//Edit Supplier
        MethodBase.clear_ByXpath("//*[@id=\"supplier_category\"]","Raw material supplier");//supplier_category
        MethodBase.clear_ByXpath("//*[@id=\"supplierCategory_description\"]","description chem supplier");//supplierCategory_description
        PageBase.staticWait((5));
        MethodBase.click_ByXpath("//*[@style=\"background: rgb(0, 19, 40); color: white; border: none;\"]");//save
        PageBase.staticWait((5));
//        MethodBase.assertEqual_Text_ByXpath("/html/body/div[3]/div/div[2]/div/div[2]/div[2]/form/div[1]/div[2]","Category can't be empty");
//        LOGGER.info("Category can't be empty");
    }

//    @Test(groups = {"Smoke"}, priority = 40)
//    public static void  deletesupplierCategorySmokeTest() throws Exception {
//        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]/a[1]/div/div");//Master
//        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/header/ul/ul/li[12]/a");//Supplier NV
//        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]/div[2]/i");//Supplier
//        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/div/div[2]/div/table/tbody/tr[5]/td[3]/span/a[2]/a/i");//Delete Supplier
//        MethodBase.click_ByXpath("/html/body/div[5]/div/div/div/div[2]/div/div/div[2]/button[2]");//Delete confirm Supplier
//    }

    @Test(groups = {"Smoke"}, priority = 35)
    public  static void  addsupplierSmokeTest() throws Exception {
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]/a[1]/div/div");//Master
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/header/ul/ul/li[12]/a");//Supplier Nv
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[2]/div[1]");//Supplier Field
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/div/div[1]/div/div[3]/div/button");//Add supplier
        /*
        Validation Check
         */
        MethodBase.click_ByXpath("//*[@style=\"background: rgb(0, 19, 40); color: white; border: none;\"]");//save
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("//*[@id=\"supplier_category\"]/div/div");//supplier_category
        PageBase.staticWait(5);
        MethodBase.setText_ByXpath("//*[@id=\"supplier_name\"]","");
        MethodBase.click_ByXpath("//*[@id=\"supplier_plant\"]/div/div");
        PageBase.staticWait(5);
        MethodBase.setText_ByXpath("//*[@id=\"supplier_contactno\"]","");//supplier_contactno
        MethodBase.setText_ByXpath("//*[@id=\"supplier_email\"]","");//supplier_email
        MethodBase.setText_ByXpath("//*[@id=\"supplier_address\"]","");//supplier_address
        PageBase.staticWait((5));
        MethodBase.assertEqual_Text_ByXpath("//div[text()=\"Category can't be empty\"]","Category can't be empty");
        LOGGER.info("Category can't be empty");
        MethodBase.assertEqual_Text_ByXpath("//div[text()=\"Name can't be empty\"]","Name can't be empty");
        LOGGER.info("Name can't be empty");
        MethodBase.assertEqual_Text_ByXpath("//div[text()=\"Plant can't be empty\"]","Plant can't be empty");
        LOGGER.info("Plant can't be empty");
        MethodBase.assertEqual_Text_ByXpath("//div[text()=\"Contact Number can't be empty\"]","Contact Number can't be empty");
        LOGGER.info("Contact Number can't be empty");
        MethodBase.assertEqual_Text_ByXpath("//div[text()=\"Email can't be empty\"]","Email can't be empty");
        LOGGER.info("Email can't be empty");
        MethodBase.assertEqual_Text_ByXpath("//div[text()=\"Address can't be empty\"]","Address can't be empty");
        LOGGER.info("Address can't be empty");

        /*
        Data Input
         */

        PageBase.staticWait(5);
        MethodBase.click_ByXpath("//*[@id=\"supplier_category\"]/div/div");//supplier_category
        MethodBase.hitEnter();
        PageBase.staticWait(5);
        MethodBase.setText_ByXpath("//*[@id=\"supplier_name\"]","Mural");
        MethodBase.click_ByXpath("//*[@id=\"supplier_plant\"]/div/div");
        MethodBase.hitEnter();
        PageBase.staticWait(5);
        MethodBase.setText_ByXpath("//*[@id=\"supplier_contactno\"]","0774563219");//supplier_contactno
        MethodBase.setText_ByXpath("//*[@id=\"supplier_email\"]","Mural@gmail.com");//supplier_email
        MethodBase.setText_ByXpath("//*[@id=\"supplier_address\"]","colombo");//supplier_address
        MethodBase.click_ByXpath("//*[@style=\"background: rgb(0, 19, 40); color: white; border: none;\"]");//save
        PageBase.staticWait((5));
    }

    @Test(groups = {"Smoke"}, priority = 36)
    public static void  editsupplierSmokeTest() throws Exception {
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]/a[1]/div/div");//Master
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/header/ul/ul/li[12]/a");//Supplier Nv
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[2]/div[1]");//Supplier Field
        PageBase.staticWait(5);
        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/div[2]/div/div/div/div[2]/div/table/tbody/tr[2]/td[9]/span/a[1]/i");//Edit Button
        PageBase.staticWait(5);
//      MethodBase.isDisplayed_ByXpath("/html/body/div[1]/div/section/section/main/div/div[2]/div/div/div/div/div[1]/div/div[3]/button/span");//Validation work
//      MethodBase.click_ByXpath("/html/body/div[7]/div/div[2]/div/div[2]/div[2]/form/div/div[1]/div[1]/div/div[1]/div/div");//supplier_category
//      MethodBase.selectMaterialDrop("/html/body/div[7]/div/div[2]/div/div[2]/div[2]/form/div/div[1]/div[1]/div/div[1]/div/div",1);
        PageBase.staticWait(5);
        MethodBase.clear_ByXpath("//*[@id=\"supplier_name\"]","Mano");
        MethodBase.click_ByXpath("//*[@id=\"supplier_plant\"]/div/div");
        MethodBase.hitEnter();
        PageBase.staticWait(5);
        PageBase.staticWait((5));
        MethodBase.clear_ByXpath("//*[@id=\"supplier_contactno\"]","0774563219");//supplier_contactno
        MethodBase.clear_ByXpath("//*[@id=\"supplier_email\"]","Mano@gmail.com");//supplier_email
        MethodBase.clear_ByXpath("//*[@id=\"supplier_address\"]","colombo");//supplier_address
        PageBase.staticWait((5));
        MethodBase.click_ByXpath("//*[@style=\"background: rgb(0, 19, 40); color: white; border: none;\"]");//save
        PageBase.staticWait((5));
    }

//    @Test(groups = {"Smoke"}, priority = 37)
//    public  static void  deletesupplierSmokeTest() throws Exception {
//        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]/a[1]/div/div");//Master
//        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/header/ul/ul/li[12]/a");//Supplier Nv
//        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[2]/div[1]");//Supplier Field
//        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/div[2]/div/div/div/div[1]/div/span/div[1]/span/button");
//        MethodBase.escape();
//        PageBase.staticWait(5);
//        MethodBase.click_ByXpath("/html/body/div[1]/div/section/section/main/div/div[2]/div/div/div/div/div[1]/div/button");
//        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/div/div[2]/div/table/tbody/tr[2]/td[3]/span/a[2]/a/i");
//        MethodBase.click_ByXpath("//span[text()=\"OK\"]");
//    }

}
