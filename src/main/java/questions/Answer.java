package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Answer  implements question<Boolean> {

    private String question;

    public Answer(String question) {
        this.question = question;
    }

    public Checkbox(final WebElement checkboxField) {
        this.checkboxField = checkboxField;
    }

    public void setChecked(final boolean value) {
        if (checkboxField.isSelected()) {
            clickToUnselect(value);
        } else {
            clickToSelect(value);
        }
    }

    private void clickToSelect(final boolean value) {
        if (value) {
            checkboxField.click();
        }
    }

    private void clickToUnselect(final boolean value) {
        if (!value) {
            checkboxField.click();
        }
    }

    public boolean isChecked() {
        return checkboxField.isSelected();
    }

}

}
