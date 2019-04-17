package org.umssdiplo.automationv01.core.utils;

import org.umssdiplo.automationv01.core.customwebdriver.ManageDriver;
import org.umssdiplo.automationv01.core.managepage.Machinery.Machinery;

public final class LoadMachineryPage {
    public static Machinery machineryPage() {
        ManageDriver.getInstance().getWebDriver()
                .navigate().to(PropertyAccessor.getInstance().getBaseUrl());
        return new Machinery();
    }
}
