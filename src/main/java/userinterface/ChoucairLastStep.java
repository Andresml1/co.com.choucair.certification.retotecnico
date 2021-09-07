package userinterface;

import net.serenitybdd.core.pages.pageObject;
import net.serenitybdd.screenplay.targets.Target;

public class ChoucairLastStep {
    public static final Target INPUT_PASSWORD = Target.the( "where do we write the password")
            .located(By.id("password"));
    public static final Target INPUT_CONFIRM_PASSWORD = Target.the( "where do we write the CONFIRM password")
            .located(By.id("password"));
    public static final Target CHECK_STAY = Target.the( "button to confirm check box")
            .located(By.xpath("//button[contains(@class='checkmark signup-consent__checkbox signup-consent__checkbox--highlight')]"));
    public static final Target CHECK_TERMS = Target.the( "button to confirm check box")
            .located(By.xpath("//button[contains(@class='checkmark signup-consent__checkbox error')]"));
    public static final Target CHECK_SECURITY = Target.the( "button to confirm check box")
            .located(By.xpath("//button[contains(@class='checkmark signup-consent__checkbox error')]"));
    public static final Target LAST_STEP = Target.the( "button to confirm last step")
            .located(By.xpath("//button[contains(@class='btn btn-blue')]"));

}
