package userinterface;

import net.serenitybdd.core.pages.pageObject;
import net.serenitybdd.screenplay.targets.Target;

public class ChoucairPersonalPage {
    public static final Target INPUT_FIRST_NAME= Target.the( "where do we write the first name")
            .located(By.id("firstName"));
    public static final Target INPUT_LAST_NAME = Target.the( "where do we write the last name")
            .located(By.id("lastName"));
    public static final Target ENTER_EMAIL = Target.the( "where do we write the email")
            .located(By.id("email"));
    public static final Target SELECT_MONTH = Target.the( "select month")
            .located(By.selector("//select[contains(@name='birthMonth')]"));
    public static final Target SELECT_DAY = Target.the( "select day")
            .located(By.selector("//select[contains(@name='birthDay')]"));
    public static final Target SELECT_YEAR= Target.the( "select year")
            .located(By.selector("//select[contains(@name='birthYear')]"));
    public static final Target SELECT_SPOKEN = Target.the( "select spoken")
            .located(By.selector("////select[contains(@class='btn btn-primary')]"));
    public static final Target NEXT_LOCATION = Target.the(  "button that shows us the form to location")
            .located(By.xpath("//button[contains(@class='btn btn-blue')]"));
}
