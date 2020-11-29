Feature: Create, Edit and Delete Functionality for Salary Types, Modifiers and Constants

  Scenario: Create, Edit and Delete Salary Types
    Given Navigate to basqar
    When User send the keys in the dialog content class
      | username | daulet2030@gmail.com |
      | password | TechnoStudy123@      |
    And User click on the element in the dialog content class
      | loginButton |
      | gotItBtn    |
    Then User should login successfully

    When User click on the element in the leftNav class
      | humanResources |
      | setupHR        |
      | salaryTypes    |

    And User click on the element in the dialog content class
      | addButton |

    And User send the keys in the dialog content class
      | name | Staff |

    And User click on the element in the dialog content class
      | userType     |
      | randomSelect |
      | saveButton   |

    Then User should see "successfully created" message

    When User edit "Staff"

    And User send the keys in the dialog content class
      | name | editedStaff |

    And User click on the element in the dialog content class
      | cancelUserType |
      | userType       |
      | randomSelect   |
      | saveButton     |

    Then User should see "successfully updated" message

    When User delete "editedStaff"

    Then User should see "successfully deleted" message


  Scenario: Create, Edit and Delete Salary Modifiers
    When User click on the element in the leftNav class
      | salaryModifiers |

    And User click on the element in the dialog content class
      | addButton |

    And User send the keys in the dialog content class
      | description | Olympiad Success |
      | variable    | Olymp            |
      | priority    | 15               |
      | amount      | 500              |

    And User click on the element in the dialog content class
      | saveButton |

    Then User should see "successfully created" message

    When User click on the element in the leftNav class
      | humanResources  |
      | setupHR         |
      | salaryModifiers |

    And User edit "Olympiad Success"

    And User send the keys in the dialog content class
      | description | Olympiad Achievement |
      | variable    | OlympAch             |
      | priority    | 25                   |
      | amount      | 700                  |

    And User click on the element in the dialog content class
      | saveButton |

    Then User should see "successfully updated" message

    When User click on the element in the leftNav class
      | humanResources  |
      | setupHR         |
      | salaryModifiers |

    And User delete "Olympiad Achievement"

    Then User should see "successfully deleted" message


  Scenario: Create, Edit and Delete Salary Constants

    When User click on the element in the leftNav class
      | salaryConstants |

    And User click on the element in the dialog content class
      | addButton    |
      | openCalendar |
      | selectDate   |

    And User send the keys in the dialog content class
      | salaryConstantName | Minimum Wage |
      | key                | MW           |
      | valueConstans      | 1260         |

    And User click on the element in the dialog content class
      | saveButton |

    Then User should see "successfully created" message

    When User edit "Minimum Wage"

    And User click on the element in the dialog content class
      | openCalendar |
      | selectDate   |

    And User send the keys in the dialog content class
      | salaryConstantName | Mindestlohn |
      | key                | MLN         |
      | valueConstans      | 1540        |

    And User click on the element in the dialog content class
      | saveButton |

    Then User should see "successfully updated" message

    When User delete "Mindestlohn"

    Then User should see "successfully deleted" message
