package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class ProductPage extends CommonMethods {

    @FindBy(id="//span[@class='p-menuitem-text' and text()='Products']")
    public static WebElement productsButton;

    @FindBy(css="input.p-inputtext.p-component[name='PRODUCT_CODE'][id='PRODUCT_CODE']")
    public static WebElement productCodeField ;


    @FindBy(xpath ="//span[@class='p-menuitem-text' and text()='Services Product']")
    public static WebElement serviceProductButton;

    @FindBy(css="input.p-inputtext.p-component[name='PRODUCT_NAME'][id='PRODUCT_NAME']")
    public static WebElement productNameField;

    @FindBy(xpath = "//span[@class='p-button-label p-c' and text()='Add New Data']")
    public static WebElement addNewDataButton;

    @FindBy(xpath = "//span[@class='p-button-label p-c' and @data-pc-section='label' and text()='Search']")
    public static WebElement searchButton;

    @FindBy(xpath="//a[@class='p-menuitem-link' and @role='menuitem' and @data-pc-section='action']//span[@class='p-menuitem-text' and @data-pc-section='label']")
    public static WebElement productBundle;

    @FindBy(css = "input.p-inputtext.p-component[name='PRODUCT_CODE'][id='PRODUCT_CODE']")
    public static WebElement productBundleName;

    @FindBy(id="PRODUCT_CODE")
    public static WebElement productBundleCode;

    @FindBy(xpath="//span[@class='p-button-label p-c' and @data-pc-section='label']")
    public static WebElement searchBundleProduct;

    @FindBy(xpath = "//span[@class='p-button-label p-c' and @data-pc-section='label' and text()='Add New Bundle']")
    public static WebElement addNewBundleButton;

    @FindBy(xpath="//span[@class='p-button-label p-c' and @data-pc-section='label' and text()='Add New Bundle Item']")
    public static WebElement addNewBundleItem;




    public ProductPage(){PageFactory.initElements(driver,this);
    }

}
