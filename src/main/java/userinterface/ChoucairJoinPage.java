package userinterface;

import net.serenitybdd.core.pages.pageObject;
import net.serenitybdd.screenplay.targets.Target;

public class ChoucairJoinPage extends pageObject{
    public static final Target JOIN_BUTTON = Target.the(  "button that shows us the form to join today")
            .located(By.xpath("//a[@class='unauthenticated-nav-bar__dropdown-menu-sign-up']//strong[contains(text(),'Join Today')]"));

}
