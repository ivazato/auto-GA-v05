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

    /* LLenado de campos de texto en el formulario de registro*/
    @FindBy(xpath = "//*[@id=\"mat-input-0\"]")
    private WebElement nameInputField;



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

    public void registerMachineryPage() {
        String nameItem = PropertyAccessor.getInstance().getItemName();
        /*
        String category = PropertyAccessor.getInstance().getPassword();
        String model = PropertyAccessor.getInstance().getUser();
        String brand = PropertyAccessor.getInstance().getUser();
        String capacity = PropertyAccessor.getInstance().getUser();
        String price = PropertyAccessor.getInstance().getUser();
        String subcategory = PropertyAccessor.getInstance().getUser();
        */

        CommonEvents.setInputField(nameInputField, nameItem);

        //CommonEvents.setInputField(passwordInputField, password);
    }
}
