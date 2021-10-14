package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AmazonPage {
    public AmazonPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(id = "sp-cc-accept")
    public WebElement cerez;

    @FindBy(id = "nav-link-accountList-nav-line-1")
    public WebElement loginOncesi ;

    @FindBy(xpath = "//input[@id='ap_email']")
    public WebElement ePosta;

    @FindBy(className = "a-button-input")
    public WebElement conButton;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement password;

    @FindBy(id = "signInSubmit")
    public WebElement signIn;

   @FindBy(id = "nav-link-accountList-nav-line-1")
public WebElement loginYazisiAssert;

   @FindBy(xpath = "//option[@value='search-alias=computers']")
   public WebElement bilgisayarAssert;
//    @FindBy(linkText = "Bilgisayar")
//    public WebElement bilgisayar;

    @FindBy(xpath = "//select[@id='searchDropdownBox']")
    public WebElement dropdown;

    @FindBy(id = "twotabsearchtextbox")
    public WebElement searchBox;

    @FindBy(className = "a-color-state a-text-bold")
    public WebElement msiYazisi;

    @FindBy(xpath = "//div[@class='a-section a-spacing-small a-spacing-top-small']")
    public WebElement sonucYazisiElementi;

    @FindBy(xpath = "//li[@class='a-normal']")
    public  WebElement ikinciSayfa;

    @FindBy(xpath = "//span[@class='a-letter-space']")
    public WebElement ikinciSayfaDogrulama1;

    @FindBy(xpath = "//div[@class='a-section a-spacing-small a-spacing-top-small']")
    public WebElement ikinciSayfaDogrulama;


    @FindBy(xpath = "(//img[@class='s-image'])[2]")
    public WebElement ikinciUrun;

  @FindBy(id = "add-to-wishlist-button")
  public WebElement ListeOlustur;


    @FindBy(xpath = "//input[@id='add-to-wishlist-button-submit']")
    public WebElement listeyeEkle;

    @FindBy(linkText = "Hesap ve Listeler")
    public WebElement listeler;

    @FindBy(xpath = "//span[@class='a-size-small atwl-hz-vertical-align-middle']")
    public WebElement yeniListeOlustur;

    @FindBy(xpath = "//input[@id='add-to-wishlist-button']")//add-to-wishlist-button
    public WebElement listeOlusturOku;

    @FindBy(xpath = "//input[@id='list-name']")
    public WebElement listeAdi;

    @FindBy(xpath = "//span[@class='a-button a-button-primary']")
    public WebElement listeOlusturButton;

    @FindBy(xpath = "(//a[@class='a-button-text'])[2]")
    public WebElement listeyiGoruntule1;

    @FindBy(xpath = "//a[@id='itemName_I55K7X1T5GM54']")
    public WebElement ikinciUrunDogrulama;


    @FindBy(id = "profile-list-name")
    public WebElement favoriListem;

    @FindBy(xpath = "//span[@class='w-button-text']")//(//a[@class='a-button-text'])[3]
    public WebElement listeyiGoruntule;

    @FindBy(xpath = "(//a[@class='a-link-normal'])[11]")
    public WebElement ikinciUrunGorunurlugu;
    ////div[@class='a-section a-spacing-small a-spacing-top-small']  ilk sayfa msi yazisi
    //a-section a-spacing-small a-spacing-top-small
}
