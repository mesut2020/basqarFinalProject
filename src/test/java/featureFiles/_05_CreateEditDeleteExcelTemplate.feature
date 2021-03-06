Feature: Create, Edit and Delete Functionality for Excel Template

  Scenario: Create, Edit and Delete an Excel Template
    Given Navigate to basqar
    When User send the keys in the dialog content class
      | username | daulet2030@gmail.com |
      | password | TechnoStudy123@      |
    And User click on the element in the dialog content class
      | loginButton |
      | gotItBtn    |
    Then User should login successfully

    When User click on the element in the leftNav class
      | reports       |
      | setupReports  |
      | excelTemplate |

    And User click on the element in the dialog content class
      | addButton |

    And User send the keys in the dialog content class
      | name        | LessonsTemp |
      | periodCount | 2           |

    And User click on the element in the dialog content class
      | saveButton |

    Then User should see "successfully created" message

    When User send the keys in the dialog content class
      | rowSize    | 2  |
      | columnSize | 10 |

    And User click on the element in the dialog content class
      | addVersionButton |
      | saveButton       |

    Then User should see "successfully updated" message

    And User click on the element in the dialog content class
      | closeDialogWindow |

    When User edit "LessonsTemp"

    And User send the keys in the dialog content class
      | name        | editedLessonsTemp |
      | periodCount | 4                 |

    And User click on the element in the dialog content class
      | exelTempVerTab |

    When User edit "1"
    When User send the keys in the dialog content class
      | rowSize    | 2  |
      | columnSize | 10 |

    And User click on the element in the dialog content class
      | saveButton        |

    Then User should see "successfully updated" message

    And User click on the element in the dialog content class
      | closeDialogWindow |

    When User delete "editedLessonsTemp"

    Then User should see "successfully deleted" message