package tasks;

import com.sun.jmx.snmp.tasks.Task;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinterface.ChoucairPersonalPage;

public class PersonalPage implements Task{

    private String strFirstName;
    private String strLastName;
    private String strEmail;
    private String strMonth;
    private String strDay;
    private String strYear;
    private String strSpoken;

    public PersonalPage(String strFirstName, String strLastName, String strEmail, String strMonth, String strDay,
                        String strYear, String strSpoken) {
        this.strFirstName = strFirstName;
        this.strLastName = strLastName;
        this.strEmail = strEmail;
        this.strMonth = strMonth;
        this.strDay = strDay;
        this.strYear = strYear;
        this.strSpoken = strSpoken;
    }

    public static PersonalPage onThePage(String strFirstName, String strLastName, String strEmail, String strMonth, String strDay,
                                         String strYear, String strSpoken) {
        return Tasks.instrumented(PersonalPage.class, strFirstName,strLastName, strEmail, strMonth, strDay, strYear, strSpoken);
    }

    @Override
    public <T extends Actor> void performAs(T Actor) {
                Enter.theValue(strFirstName).into(ChoucairPersonalPage.INPUT_FIRST_NAME),
                Enter.theValue(strLastName).into(ChoucairPersonalPage.INPUT_LAST_NAME),
                Enter.theValue(strEmail).into(ChoucairPersonalPage.ENTER_EMAIL),
                SelectFromOptions.byValue(strMonth).from(ChoucairPersonalPage.SELECT_MONTH),
                SelectFromOptions.byValue(strDay).from(ChoucairPersonalPage.SELECT_DAY),
                SelectFromOptions.byValue(strYear).from(ChoucairPersonalPage.SELECT_YEAR),
                SelectFromOptions.byValue(strSpoken).from(ChoucairPersonalPage.SELECT_SPOKEN),
                actor.attepmtsTo(Click.on(ChoucairPersonalPage.NEXT_LOCATION)
        );

    }
}
