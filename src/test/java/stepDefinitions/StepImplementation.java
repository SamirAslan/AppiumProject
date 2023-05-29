package stepDefinitions;

import io.appium.java_client.AppiumDriver;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.remote.DesiredCapabilities;
import pages.AppPages;

import java.net.MalformedURLException;
import java.net.URL;

public class StepImplementation {

    AppPages appPage = new AppPages();

    @When("Permissions are given by default when the app is opened")
    public void permissionsAreGivenByDefaultWhenTheAppIsOpened() {
        appPage.clickContinue();
    }

    @Then("Verifying that the application is opened")
    public void verifyingThatTheApplicationIsOpened() {
        appPage.verifyingAppOpenen();
    }

    @When("Click App > Action Bar > Action Bar Tabs buttons")
    public void clickAppButton() {
        appPage.clickAppActionBarActionBarTabsBtn();
    }

    @And("Click Toggle tab mode button")
    public void clickToggleTabModeButton() {
        appPage.clickToggleTabModeBtn();
    }

    @Then("Verifying that the Toggle tab mode is passive.")
    public void verifyingThatTheToggleTabModeIsPassive() {
        appPage.verifyingToggleTabPassive();
    }
    @When("Click Add new tab button three times")
    public void clickAddNewTabButtonTimes() {
        appPage.clickAddNewTabBtn();
    }

    @Then("Verifying that tabs exist")
    public void verifyingThatTabsExist() {
        appPage.verifyingTabs();
    }

    @When("Click Remove last tab button")
    public void clickRemoveLastTabButton() {
        appPage.clickRemoveLastTabBtn();
    }

    @Then("Verifying that last tab is deleted")
    public void verifyingThatLastTabIsDeleted() {
        appPage.verifyingLastTabDeleted();
    }

    @When("Click Remove all tabs button")
    public void clickRemoveAllTabsButton() {
        appPage.clickRemoveAllTabsBtn();
    }
    @Then("Verifying that all tabs are deleted")
    public void verifyingThatAllTabsAreDeleted() {
        appPage.verifyingAllTabsDeleted();
    }
    @When("Click App > Activity > Custom Title buttons")
    public void clickAppActivityCustomTitleButtons() {
        appPage.clickAppActivityCustomTitleBtn();
    }
    @Then("Verifying that the default textBox and the Navigation Bar texts are checked")
    public void verifyingThatTheDefaultTextBoxAndTheNavigationBarTextsAreChecked() {
        appPage.verifyingTextBoxAndNavBar();
    }
    @When("Change left and right text")
    public void clickAndChangeLeftBox() {
        appPage.changeLeftAndRightText();
    }

    @When("Click App > Alert Dialogs > List dialog buttons")
    public void clickAppAlertDialogsListDialogButtons() {
        appPage.clickAppAlertListDialogsBtn();
    }

    @And("The Element is selected in the list dialog")
    public void theElementIsSelectedInTheListDialog() {
        appPage.selectElement();
    }

    @Then("Verifying that the order of the selected element and the name of the element is checked in the alert message.")
    public void verifyingThatTheOrderOfTheSelectedElementAndTheNameOfTheElementIsCheckedInTheAlertMessage() {
        appPage.verifyingElement();
    }

    @When("Click App > Fragment > Context Menu buttons")
    public void clickAppFragmentContextMenuButtons() {
        appPage.clickAppFragmentContextMenuBtn();
    }

    @When("Long pressing the long press me button.")
    public void longPressingTheLongPressMeButton() {
        appPage.clickLongPress();
    }

    @Then("Verifying that Menu A and Menu B elements are opened")
    public void verifyingThatMenuAAndMenuBElementsAreOpened() {
        appPage.verifyingElementsOfMenu();
    }

    @When("Click App > Fragment> Hide and Show buttons")
    public void clickAppFragmentHideAndShowButtons() {
        appPage.clickAppFragmentHideAndShowBtn();
    }

    @Then("Verifying that there are two Hide buttons")
    public void verifyingThatThereAreTwoHideButtons() {
        appPage.verifyingTwoHideBtn();
    }

    @When("Click second Hide button")
    public void clickSecondHideButton() {
        appPage.clickSecondHideBtn();
    }

    @Then("Verifying that the textBox field is Hide and the Hide button becomes Show")
    public void verifyingThatTheTextBoxFieldIsHideAndTheHideButtonBecomesShow() {
        appPage.verifyingShowBtn();
    }

    @When("Click Show button")
    public void clickShowButton() {
        appPage.clickShowBtn();
    }

    @Then("Verifying that the textBox is back and the button text is Hide.")
    public void verifyingThatTheTextBoxIsBackAndTheButtonTextIsHide() {
        appPage.verifyingHideBtn();
    }

    @When("Click App > Notification > Incoming Message buttons")
    public void clickAppNotificationIncomingMessageButtons() {
        appPage.clickAppNotificationIncomingMessageBtn();
    }

    @And("Click Show Notification button.")
    public void clickShowNotificationButton() {
        appPage.clickShowNotificationBtn();
    }

    @Then("Verifying that the notification detail opened and the text in the notification bar area contain each other.")
    public void verifyingThatTheNotificationDetailOpenedAndTheTextInTheNotificationBarAreaContainEachOther() {
        appPage.verifyingNotificationBarOpenedAndChecked();
    }
    @When("Click Views > Tabs menu > Scrollable buttons")
    public void clickViewsTabsMenuScrollableButtons() {
        appPage.ViewsTabsMenuScrollableBtn();
    }

    @When("Click last Tab")
    public void clickLastTab() {
        appPage.swipeLastTab();
    }
    @Then("Verifying that the opened page information belongs to Tab30.")
    public void verifyingThatTheOpenedPageInformationBelongsTo() {
        appPage.verifyingTab();
    }
}
