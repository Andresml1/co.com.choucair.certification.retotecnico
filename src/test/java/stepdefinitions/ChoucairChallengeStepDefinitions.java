package stepdefinitions;

import cucumber.api.java.en.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import model.ChallengeChoucairData;
import net.serenitbdd.screenplay.actors.OnlineCast;
import net.serenitbdd.screenplay.actors.OnStage;
import net.serenitbdd.screenplay.GivenWhenthen;
import tasks.OpenUp;
import userinterface.ChoucairAddressPage;
import userinterface.ChoucairDevicesPage;
import userinterface.ChoucairLastStep;
import userinterface.ChoucairPersonalPage;


public class ChoucairChallengeStepDefinitions {

    @Before
    public void setStage () { OnStage.setTheStage(new OnlineCast());
    }

    @Given("^than andres wants to learn automation at the challenge Choucair$")
    public void thanAndresWantsToLearnAutomationAtTheChallengeChoucair(list<ChallengeChoucairData> ChallengeChoucairData)
            throws Exception {
        OnStage.theActorCalled("Andres").wasAbleTo(OpenUp.thePage(), (ChoucairPersonalPage.
                onThePage(ChallengeChoucairData.get(0).getStrFirstName(), ChallengeChoucairData.get(0).getStrLastName(),
                        ChallengeChoucairData.get(0).getStrEmail(),ChallengeChoucairData.get(0).getStrMonth(),
                        ChallengeChoucairData.get(0).getStrDay(),ChallengeChoucairData.get(0).getStrYear(),
                        ChallengeChoucairData.get(0).getStrSpoken())));

    }

    @When("^he complete the forms (.*) on the choucair challenge platform$")
    public void heCompleteTheFormsChallengeTestingOnTheChoucairChallengePlatform(list<ChallengeChoucairData> ChallengeChoucairData)
            throws Exception  {
        OnStage.theActorCalled("Andres").wasAbleTo(OpenUp.thePage(),(ChoucairAddressPage.
                onThePage(ChallengeChoucairData.get(0).getStrCity(),ChallengeChoucairData.get(0).getStrStrZip(),
                        ChallengeChoucairData.get(0).getStrCountry())));

        OnStage.theActorCalled("Andres").wasAbleTo(OpenUp.thePage(), (ChoucairDevicesPage.
                onThePage(ChallengeChoucairData.get(0).getStrComputer(),ChallengeChoucairData.get(0).getStrLanguage(),
                        ChallengeChoucairData.get(0).getStrVersion(),ChallengeChoucairData.get(0).getStrMobileDevices()
                        ,ChallengeChoucairData.get(0).getStrModel(),ChallengeChoucairData.get(0).getStrSystem())));
    }

    @Then("^he finds the select called resources (.*)$")
    public void heFindsTheCourseCalledResourcesChallengeTesting(list<ChallengeChoucairData> ChallengeChoucairData)
            throws Exception  {
        OnStage.theActorCalled("Andres").wasAbleTo(OpenUp.thePage(), (ChoucairLastStep.
                onThePage(ChallengeChoucairData.get(0).getStrPassword(),ChallengeChoucairData.get(0).getStrConfirmPassword())));

        OnStage.theActorInTheSpotLigth().should(GivenWhenThen.seeThat(Answer.tothe(checkboxField)));
    }
}
