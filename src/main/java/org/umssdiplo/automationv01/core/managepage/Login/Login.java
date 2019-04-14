package org.umssdiplo.automationv01.core.managepage.Login;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;
import org.umssdiplo.automationv01.core.utils.PropertyAccessor;

public class Login extends BasePage {

//    public static final String MYPATH_INPUT_CONTAINS_TEXT_S = "//*[@id=\"mat-select-0\"]/div/div[2]/div";

    @FindBy(name = "email")
    private WebElement usernameInputField;

    @FindBy(name = "password")
    private WebElement passwordInputField;

    @FindBy(css = ".btn-primary.btn-block")
    private WebElement loginBtn;

    // Boton Registrar
    @FindBy(xpath = "/html/body/app-root/app-catalog/div/mat-grid-list/div/mat-grid-tile[1]/figure/mat-nav-list/a[1]")
    private WebElement registerBtn;

    /* Buscando los campos de texto necesarios*/

    @FindBy(xpath = "//*[@id=\"mat-input-0\"]")
    private WebElement nameInputField;

    @FindBy(xpath = "//*[@id=\"mat-input-1\"]")
    private WebElement categoryInputField;

    @FindBy(xpath = "//*[@id=\"mat-input-2\"]")
    private WebElement modelInputField;

    @FindBy(xpath = "//*[@id=\"mat-input-3\"]")
    private WebElement brandInputField;

    @FindBy(xpath = "//*[@id=\"mat-input-4\"]")
    private WebElement capacityInputField;

    @FindBy(xpath = "//*[@id=\"mat-input-5\"]")
    private WebElement priceInputField;

    @FindBy(xpath = "//*[@id=\"mat-input-6\"]")
    private WebElement subcategoryInputField;

    //Boton Guardar
    @FindBy(xpath = "/html/body/app-root/app-catalog/div/mat-grid-list/div/mat-grid-tile[2]/figure/app-registrar/mat-grid-list/div/form/button")
    private WebElement guardarBtn;

    /*  eliminar */

    @FindBy(xpath = "/html/body/app-root/app-catalog/div/mat-grid-list/div/mat-grid-tile[1]/figure/mat-nav-list/a[2]")
    private WebElement categoryBtn;

    @FindBy(xpath = "/html/body/app-root/app-catalog/div/mat-grid-list/div/mat-grid-tile[2]/figure/app-category/mat-nav-list/mat-toolbar/span[1]/a")
    private WebElement bobcatsBtn;

    @FindBy(xpath = "/html/body/app-root/app-catalog/div/mat-grid-list/div/mat-grid-tile[2]/figure/app-category/mat-nav-list/div/app-bobcats/mat-grid-list/div/mat-grid-tile[1]/figure/div/mat-grid-tile-footer/mat-form-field")
    private WebElement selectOption;

    @FindBy(xpath = "//*[@id=\"mat-option-1\"]/span/button")
    private WebElement removeItem;


    public void setCredentials() {
        String username = PropertyAccessor.getInstance().getUser();
        String password = PropertyAccessor.getInstance().getPassword();
        CommonEvents.setInputField(usernameInputField, username);
        CommonEvents.setInputField(passwordInputField, password);
        CommonEvents.clickButton(loginBtn);
    }

    public void pushBtn() {
        CommonEvents.clickButton(registerBtn);
    }

    /* Accediendo a los campos de texto en el formulario de registro*/

    public void registerMachineryPage() {
        String nameItem = PropertyAccessor.getInstance().getItemName();
        String category = PropertyAccessor.getInstance().getCategory();
        String model = PropertyAccessor.getInstance().getModel();
        String brand = PropertyAccessor.getInstance().getBrand();
        String capacity = PropertyAccessor.getInstance().getCapacity();
        String price = PropertyAccessor.getInstance().getPrice();
        String subcategory = PropertyAccessor.getInstance().getSubcategory();

        CommonEvents.setInputField(nameInputField, nameItem);
        CommonEvents.setInputField(categoryInputField, category);
        CommonEvents.setInputField(modelInputField, model);
        CommonEvents.setInputField(brandInputField, brand);
        CommonEvents.setInputField(capacityInputField, capacity);
        CommonEvents.setInputField(priceInputField, price);
        CommonEvents.setInputField(subcategoryInputField, subcategory);

        CommonEvents.clickButton(guardarBtn);
    }

    public void categoryBtn() {
        CommonEvents.clickButton(categoryBtn);
    }

    public void bobcatsBtn() {
        CommonEvents.clickButton(bobcatsBtn);
    }

    public void selectOption() {
//        CommonEvents.clickButton(selectOption);

        /*By by = By.xpath(String.format(MYPATH_INPUT_CONTAINS_TEXT_S, option));
        CommonEvents.clickElement(by);*/

        CommonEvents.clickButton(selectOption);
    }

    public void removeBtn() {
        CommonEvents.clickButton(removeItem);
    }
}
