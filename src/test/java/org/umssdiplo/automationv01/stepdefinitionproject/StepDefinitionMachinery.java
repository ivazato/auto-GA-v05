package org.umssdiplo.automationv01.stepdefinitionproject;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.umssdiplo.automationv01.core.managepage.Machinery.Machinery;
import org.umssdiplo.automationv01.core.utils.LoadMachineryPage;

public class StepDefinitionMachinery {

    private Machinery machinery;

    @Given("^'Machinery' page is loaded$")
    public void machineryPageIsLoaded() throws Throwable {
        machinery = LoadMachineryPage.machineryPage();
    }

    @And("^enter the machinery registration page$")
    public void enterTheMachineryRegistrationPage() {
        machinery.pushBtn();
    }

    @And("^set machinery registration data$")
    public void setMachineryRegistrationData() throws Throwable {
        machinery.registerMachineryPage();
    }

    /* Eliminar Item*/

    @Given("^'MachineryRemove' catalog page is loaded$")
    public void machineryremoveCatalogPageIsLoaded() throws Throwable {
        machinery = LoadMachineryPage.machineryPage();
    }

    @And("^enter the machinery Category page$")
    public void enterTheMachineryCategoryPage() throws Throwable {
        machinery.categoryBtn();
    }

    @And("^enter the bobcats page$")
    public void enterTheBobcatsPage() throws Throwable {
        machinery.bobcatsBtn();
    }

    @And("^enter the select option$")
    public void enterTheSelectOption() throws Throwable {
        machinery.selectOption();
    }

    @And("^Select the option 'Remove' from the item$")
    public void selectTheOptionRemoveFromTheItem() {
        machinery.removeBtn();
    }
}
