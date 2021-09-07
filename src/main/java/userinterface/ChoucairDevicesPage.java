package userinterface;

import net.serenitybdd.core.pages.pageObject;
import net.serenitybdd.screenplay.targets.Target;

public class ChoucairDevicesPage {
    public static final Target SELECT_COMPUTER = Target.the( "select computer")
            .located(By.selector("//select[contains(@class='form-control ui-select-search ng-pristine ng-valid ng-empty ng-touched')]"));
    public static final Target SELECT_VERSION = Target.the( "select version")
            .located(By.selector("//select[contains(@class='form-control ui-select-search ng-pristine ng-valid ng-empty ng-touched ng-hide')]"));
    public static final Target SELECT_LANGUAGE= Target.the( "select language")
            .located(By.selector("//select[contains(@class='form-control ui-select-search ng-pristine ng-valid ng-empty ng-touched')]"));
    public static final Target SELECT_MOBILE_DEVICES = Target.the( "select mobile devices")
            .located(By.selector("////select[contains(@class='form-control ui-select-search ng-valid ng-touched ng-dirty ng-valid-parse ng-empty')]"));
    public static final Target SELECT_MODEL= Target.the( "select model")
            .located(By.selector("//select[contains(@class='btn btn-default form-control ui-select-toggle']//strong[contains(text(),'Select a Model')]"));
    public static final Target SELECT_SYSTEM = Target.the( "select system")
            .located(By.selector("////select[contains(@class='btn btn-default form-control ui-select-toggle']//strong[contains(text(),'Select OS')]"))
    public static final Target NEXT_LAST_STEP = Target.the(  "button that shows us the form to last step")
            .located(By.xpath("//button[contains(@class='btn btn-blue pull-right')]"));
}
