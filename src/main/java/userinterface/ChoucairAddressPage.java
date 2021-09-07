package userinterface;

import net.serenitybdd.core.pages.pageObject;
import net.serenitybdd.screenplay.targets.Target;

public class ChoucairAddressPage {

        public static final Target INPUT_CITY= Target.the( "where do we write the city")
                .located(By.id("city"));
        public static final Target INPUT_ZIP = Target.the( "where do we write the zip")
                .located(By.id("zip"));
        public static final Target SELECT_COUNTRY = Target.the( "where do we write the country")
                .located(By.selector("//select[contains(@class='ui-select-match-text pull-left')]"));
        public static final Target NEXT_DEVICES = Target.the(  "button that shows us the form to devices")
                 .located(By.xpath("//button[contains(@class='btn btn-blue pull-right')]"));

}
