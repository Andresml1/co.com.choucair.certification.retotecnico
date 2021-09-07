package tasks;

import com.sun.jmx.snmp.tasks.Task;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinterface.ChoucairDevicesPage;

public class DevicesPage implements Task {

    private String strComputer;
    private String strLanguage;
    private String strVersion;
    private String strMobileDevices;
    private String strModel;
    private String strSystem;


    public DevicesPage(String strComputer, String strLanguage,String strVersion ,String strMobileDevices, String strModel, String strSystem) {
        this.strComputer = strComputer;
        this.strVersion = strVersion;
        this.strLanguage = strLanguage;
        this.strMobileDevices = strMobileDevices;
        this.strModel = strModel;
        this.strSystem = strSystem;

    }

    public static PersonalPage onThePage(String strComputer, String strVersion, String strLanguage, String strMobileDevices, String strModel,
                                         String strSystem) {
        return Tasks.instrumented(PersonalPage.class, strComputer,strVersion, strLanguage, strMobileDevices, strModel, strSystem);
    }

    @Override
    public <T extends Actor> void performAs(T Actor) {
                SelectFromOptions.byValue(strComputer).from(ChoucairDevicesPage.SELECT_COMPUTER),
                SelectFromOptions.byValue(strVersion).from(ChoucairDevicesPage.SELECT_VERSION),
                SelectFromOptions.byValue(strLanguage).from(ChoucairDevicesPage.SELECT_LANGUAGE),
                SelectFromOptions.byValue(strMobileDevices).from(ChoucairDevicesPage.SELECT_MOBILE_DEVICES),
                SelectFromOptions.byValue(strModel).from(ChoucairDevicesPage.SELECT_MODEL),
                SelectFromOptions.byValue(strSystem).from(ChoucairDevicesPage.SELECT_SYSTEM),
                actor.attepmtsTo(Click.on(ChoucairDevicesPage.NEXT_LAST_STEP)
                );

    }

}
