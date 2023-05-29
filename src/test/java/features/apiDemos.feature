@Demo
Feature: API Demos
  Scenario: 1
    When Permissions are given by default when the app is opened
    Then Verifying that the application is opened
    When Click App > Action Bar > Action Bar Tabs buttons
    And Click Toggle tab mode button
    Then Verifying that the Toggle tab mode is passive.
    When Click Add new tab button three times
    Then Verifying that tabs exist
    When Click Remove last tab button
    Then Verifying that last tab is deleted
    When Click Remove all tabs button
    Then Verifying that all tabs are deleted

  Scenario: 2
    When Click App > Activity > Custom Title buttons
    Then Verifying that the default textBox and the Navigation Bar texts are checked
    When Change left and right text
    Then Verifying that the default textBox and the Navigation Bar texts are checked

  Scenario: 3
    When Click App > Alert Dialogs > List dialog buttons
    And The Element is selected in the list dialog
    Then Verifying that the order of the selected element and the name of the element is checked in the alert message.

  Scenario: 4
    When Click App > Fragment > Context Menu buttons
    When Long pressing the long press me button.
    Then Verifying that Menu A and Menu B elements are opened

  Scenario: 5
    When Click App > Fragment> Hide and Show buttons
    Then Verifying that there are two Hide buttons
    When Click second Hide button
    Then Verifying that the textBox field is Hide and the Hide button becomes Show
    When Click Show button
    Then Verifying that the textBox is back and the button text is Hide.

  Scenario: 6
    When Click App > Notification > Incoming Message buttons
    And Click Show Notification button.
    Then Verifying that the notification detail opened and the text in the notification bar area contain each other.

  Scenario: 7
    When Click Views > Tabs menu > Scrollable buttons
    When Click last Tab
    Then Verifying that the opened page information belongs to Tab30.