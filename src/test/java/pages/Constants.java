package pages;

import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public class Constants {

    public static final By CONTINUE_BTN = MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.android.permissioncontroller:id/continue_button\")");
    public static final By APP_BTN = MobileBy.AndroidUIAutomator("new UiSelector().text(\"App\")");
    public static final By ACTION_BAR_BTN = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Action Bar\")");
    public static final By ACTION_BAR_TABS_BTN = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Action Bar Tabs\")");
    public static final By toggleTabPassive = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Tab 0\")");
    public static final By tab2 = MobileBy.AndroidUIAutomator("new UiSelector().text(\"TAB 2\")");
    public static final By ADD_NEW_TAB_BTN = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Add new tab\")");
    public static final By REMOVE_LAST_TAB_BTN = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Remove last tab\")");
    public static final By TOGGLE_TAB_MODE_BTN = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Toggle tab mode\")");
    public static final By REMOVE_ALL_TABS_BTN = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Remove all tabs\")");

    public static final By ACTIVITY_BTN = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Activity\")");
    public static final By CUSTOM_TITLE_BTN = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Custom Title\")");
    public static final By leftNavBar = MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.hmh.api:id/left_text\")");
    public static final By rightNavBar = MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.hmh.api:id/right_text\")");
    public static final By leftTextEdit = MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.hmh.api:id/left_text_edit\")");
    public static final By rightTextEdit = MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.hmh.api:id/right_text_edit\")");
    public static final By leftBoxBtn = MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.hmh.api:id/left_text_button\")");
    public static final By rightBoxBtn = MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.hmh.api:id/right_text_button\")");
    public static final By ALERT_DIALOG_BTN = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Alert Dialogs\")");
    public static final By LIST_DIALOG_BTN = MobileBy.AndroidUIAutomator("new UiSelector().text(\"List dialog\")");
    public static final By commandTwo = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Command two\")");
    public static final By commandMessage = MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"android:id/message\")");

    public static final By FRAGMENT_BTN = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Fragment\")");
    public static final By CONTEXT_MENU_BTN = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Context Menu\")");
    public static final By lpmButton = MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.hmh.api:id/long_press\")");
    public static final By menuA = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Menu A\")");
    public static final By menuB = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Menu B\")");
    public static final By HIDE_AND_SHOW = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Hide and Show\")");
    public static final By hide2Btn = MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.hmh.api:id/frag2hide\")");
    public static final By hide1Btn = MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.hmh.api:id/frag1hide\")");
    public static final By NOTIFICATION_BTN = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Notification\")");
    public static final By INCOMING_MESSAGE_BTN = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Incoming Message\")");
    public static final By showNotificationBtn = MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.hmh.api:id/notify\")");
    public static final By notificationRow = MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.android.systemui:id/expandableNotificationRow\")");
    public static final By message = MobileBy.AndroidUIAutomator("new UiSelector().text(\"App/Notification/IncomingMessageView\")");
    public static final By VIEWS_BTN = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Views\")");
    public static final By TABS_BTN = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Tabs\")");
    public static final By SCROLLABLE_BTN = MobileBy.AndroidUIAutomator("new UiSelector().text(\"5. Scrollable\")");
    public static final By lastTab = MobileBy.AndroidUIAutomator("new UiSelector().index(29)");
    public static final By tab30Btn = MobileBy.AndroidUIAutomator("new UiSelector().text(\"5. Scrollable\")");
    public static final By tab30Information = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Content for tab with tag Tab 30\")");
}
