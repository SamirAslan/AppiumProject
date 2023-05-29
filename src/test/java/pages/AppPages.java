package pages;

import util.ElementHelper;

import static pages.Constants.*;


public class AppPages extends ElementHelper {
    public AppPages() {
        super();
    }

    //Scenario:1
    public void clickContinue() {
        click(CONTINUE_BTN);
    }
    public void verifyingAppOpenen() {
        checkVisible(APP_BTN);
    }
    public void clickAppActionBarActionBarTabsBtn() {
        click(APP_BTN);
        click(ACTION_BAR_BTN);
        click(ACTION_BAR_TABS_BTN);
    }
    public void clickToggleTabModeBtn() {
        click(TOGGLE_TAB_MODE_BTN);
    }
    public void verifyingToggleTabPassive() {
        checkVisible(toggleTabPassive);
    }

    public void clickAddNewTabBtn() {
        for (int i=0;i<3;i++){
            click(ADD_NEW_TAB_BTN);
        }
    }
    public void verifyingTabs() {
        click(tab2);
        checkVisible(tab2);
    }
    public void clickRemoveLastTabBtn() {
        click(REMOVE_LAST_TAB_BTN);
    }
    public void verifyingLastTabDeleted() {
        checkInvisible(tab2);
    }

    public void clickRemoveAllTabsBtn() {
        click(REMOVE_ALL_TABS_BTN);
    }
    public void verifyingAllTabsDeleted() {
        checkInvisible(toggleTabPassive);
    }

    //Scenario:2
    public void clickAppActivityCustomTitleBtn() {
        click(APP_BTN);
        click(ACTIVITY_BTN);
        click(CUSTOM_TITLE_BTN);
    }

    public void verifyingTextBoxAndNavBar() {
        assertionGetText(leftNavBar,leftTextEdit);
        assertionGetText(rightNavBar,rightTextEdit);
    }

    public void changeLeftAndRightText() {
        clear(leftTextEdit);
        sendKey(leftTextEdit,"Left is bad");
        click(leftBoxBtn);
        clear(rightTextEdit);
        sendKey(rightTextEdit,"Rİght is not left");
        click(rightBoxBtn);
    }

    //Scenario:3
    public void clickAppAlertListDialogsBtn() {
        click(APP_BTN);
        click(ALERT_DIALOG_BTN);
        click(LIST_DIALOG_BTN);
    }
    public void selectElement() {
        click(commandTwo);
    }
    public void verifyingElement() {
        assertionGetText(commandTwo, commandMessage);
    }

    //Scenario:4
    public void clickAppFragmentContextMenuBtn() {
        click(APP_BTN);
        click(FRAGMENT_BTN);
        click(CONTEXT_MENU_BTN);
    }
    public void clickLongPress() {
        longPressButton(lpmButton);
    }
    public void verifyingElementsOfMenu() {
        assertionEqualText(menuA,"Menu A");
        assertionEqualText(menuB,"Menu B");
    }

    //Scenario:5
    public void clickAppFragmentHideAndShowBtn() {
        click(APP_BTN);
        click(FRAGMENT_BTN);
        click(HIDE_AND_SHOW);
    }
    public void verifyingTwoHideBtn() {
        assertionEqualText(hide1Btn,"Hide");
        assertionEqualText(hide2Btn,"Hide");
    }
    public void clickSecondHideBtn() {
        click(hide2Btn);
    }
    public void verifyingShowBtn() {
        assertionEqualText(hide2Btn,"Show");
    }
    public void clickShowBtn() {
        click(hide2Btn);
    }
    public void verifyingHideBtn() {
        assertionEqualText(hide2Btn,"Hide");
    }

    //Scenario:6
    public void clickAppNotificationIncomingMessageBtn() {
        click(APP_BTN);
        click(NOTIFICATION_BTN);
        click(INCOMING_MESSAGE_BTN);
    }
    public void clickShowNotificationBtn() {
        click(showNotificationBtn);
    }
    public void verifyingNotificationBarOpenedAndChecked() {
        openNotification();
        click(notificationRow);
        assertionEqualText(message, "App/Notification/IncomingMessageView");
    }

    //Scenario:7
    public void ViewsTabsMenuScrollableBtn() {
        click(VIEWS_BTN);
        scrollDown();
        click(TABS_BTN);
        click(SCROLLABLE_BTN);
    }
    public void swipeLastTab() {
        swipeToElement(lastTab);
        click(tab30Btn);
    }
    public void verifyingTab() {
        assertionContainText(tab30Information,"Tab 30");
    }

}
