package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.performable;
import net.serenitybdd.screenplay.Task;
import userinterface.ChoucairChallangePage;

public class OpenUp implements Task {
    private ChoucairChallangePage choucairChallangePage;
    public static Object thePage() {
        return Task.instrumented(OpenUp.class);
    }

    @Override
    public <T extends Actor> void performAs(T Actor){
        actor.attemptsTo(Open.browserOn(choucairChallangePage));
    }

}