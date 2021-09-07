package tasks;

import com.sun.jmx.snmp.tasks.Task;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinterface.ChoucairLastStep;

public class LastStep implements Task{

    private String strPassword;
    private String strConfirmPassword;

    public DevicesPage(String strPassword, String strConfirmPassword) {
        this.strPassword = strPassword;
        this.strConfirmPassword = strConfirmPassword;

    }

    public static PersonalPage onThePage(String strPassword, String strConfirmPassword) {
        return Tasks.instrumented(PersonalPage.class, strPassword,strConfirmPassword);
    }

    @Override
    public <T extends Actor> void performAs(T Actor) {
                Enter.theValue(strPassword).into(ChoucairLastStep.INPUT_PASSWORD),
                Enter.theValue(strConfirmPassword).into(ChoucairLastStep.INPUT_CONFIRM_PASSWORD),
                actor.attepmtsTo(Click.on(ChoucairLastStep.LAST_STEP)
                );

    }
}
