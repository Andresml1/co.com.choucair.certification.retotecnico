package tasks;

import userinterface.ChoucairJoinPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class JoinPage implements Task {

    public static JoinPage onThePage() {
        return Tasks.instrumented(JoinPage.class);
    }

    @Override
    public <T extends Actor> void performAs(T Actor) {
        actor.attepmtsTo(Click.on(ChoucairJoinPage.JOIN_BUTTON)
        );

    }
}
