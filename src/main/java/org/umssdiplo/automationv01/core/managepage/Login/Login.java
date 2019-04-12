package org.umssdiplo.automationv01.core.managepage.Login;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;
import org.umssdiplo.automationv01.core.utils.PropertyAccessor;

public class Login extends BasePage {
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
    }
}
