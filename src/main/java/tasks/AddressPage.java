package tasks;

import com.sun.jmx.snmp.tasks.Task;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinterface.ChoucairAddressPage;

public class AddressPage implements Task {

    private String strCity;
    private String strZip;
    private String strCountry;

    public AddressPage(String strCity, String strZip, String strCountry) {
        this.strCity = strCity;
        this.strZip = strZip;
        this.strCountry = strCountry;
    }

    public static PersonalPage onThePage(String strCity, String strZip, String strCountry) {
        return Tasks.instrumented(PersonalPage.class, strCity,strZip, strCountry);
    }

    @Override
    public <T extends Actor> void performAs(T Actor) {
                Enter.theValue(strCity).into(ChoucairAddressPage.INPUT_CITY),
                Enter.theValue(strZip).into(ChoucairAddressPage.INPUT_ZIP),
                SelectFromOptions.byValue(strCountry).from(ChoucairAddressPage.SELECT_COUNTRY),
                actor.attepmtsTo(Click.on(ChoucairAddressPage.NEXT_DEVICES)

                );

    }
}
