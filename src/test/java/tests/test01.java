package tests;


import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

import static utilities.JsUtil.scrollDownByJS;

public class test01 {
//    https://www.amazon.com.tr/ sitesi açılır.
//    o Ana sayfanın açıldığı kontrol edilir.
//    o  Çerez tercihlerinden Çerezleri kabul et seçilir.
//    o  Siteye login olunur.
//    o Login işlemi kontrol edilir.
//    o Arama butonu yanındaki kategoriler tabından bilgisayar seçilir.
//    o Bilgisayar kategorisi seçildiği kontrol edilir.
//    o Arama alanına msi yazılır ve arama yapılır.
//    o Arama yapıldığı kontrol edilir.
//    o Arama sonuçları sayfasından 2. sayfa açılır.
//    o 2. sayfanın açıldığı kontrol edilir.
//    o Sayfadaki 2. ürün favorilere eklenir.
//    o 2. Ürünün favorilere eklendiği kontrol edilir.
//    o Hesabım > Favori Listem sayfasına gidilir.

    AmazonPage amazonPage=new AmazonPage();
    @Test
    public void test01(){
        Driver.getDriver().get(ConfigReader.getProperty("amazon_url"));
        Assert.assertEquals(Driver.getDriver().getCurrentUrl(), ConfigReader.getProperty("amazon_url"));
        amazonPage.cerez.click();
        amazonPage.loginOncesi.click();
        amazonPage.ePosta.sendKeys(ConfigReader.getProperty("email"));
        amazonPage.conButton.click();
        amazonPage.password.sendKeys(ConfigReader.getProperty("password"));
        amazonPage.password.click();
        amazonPage.signIn.click();
        Assert.assertTrue(amazonPage.loginYazisiAssert.isDisplayed());
        Select select = new Select(amazonPage.dropdown);
        select.selectByIndex(3);
        Assert.assertTrue(amazonPage.bilgisayarAssert.isDisplayed());
        amazonPage.searchBox.sendKeys(ConfigReader.getProperty("arananUrun")+Keys.ENTER);
        Assert.assertTrue(amazonPage.sonucYazisiElementi.getText().contains("1-24"));
        scrollDownByJS();
        Actions actions=new Actions(Driver.getDriver());
        actions.
                sendKeys(Keys.PAGE_UP).
                sendKeys(Keys.PAGE_UP).
                perform();

        amazonPage.ikinciSayfa.click();

        Assert.assertTrue(amazonPage.ikinciSayfaDogrulama.getText().contains("Aranan"));
      //  Assert.assertFalse(amazonPage.ikinciSayfaDogrulama.isSelected());

        amazonPage.ikinciUrun.click();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        amazonPage.listeOlusturOku.click();
        amazonPage.yeniListeOlustur.click();
        amazonPage.listeAdi.sendKeys(ConfigReader.getProperty("listem")+Keys.ENTER);
        amazonPage.listeOlusturButton.click();
        amazonPage.listeyiGoruntule1.click();
//Assert.assertTrue(amazonPage.ikinciUrunDogrulama.isDisplayed());
//        amazonPage.listeyeEkle.click();
//

//        amazonPage.listeyiGoruntule.click();
        Assert.assertTrue(amazonPage.ikinciUrunGorunurlugu.isDisplayed());

        Assert.assertTrue(amazonPage.favoriListem.isDisplayed());

        Driver.closeDriver();


    }

}
