Feature: Create, Edit and Delete Functionality for Position Salary

  Background:
    Given Navigate to basqar
    When User send the keys in the dialog content class
      | username | daulet2030@gmail.com |
      | password | TechnoStudy123@      |
    And User click on the element in the dialog content class
      | loginButton |
      | gotItBtn    |
    Then User should login successfully

  Scenario: Create, Edit and Delete a Position Salary
    When User click on the element in the leftNav class
      | humanResources |
      | setupHR        |
      | positionSalary |

    And User click on the element in the dialog content class
      | addButton |

    And User send the keys in the dialog content class
      | namePositionSalary | Expert, Assistant |

    And User click on the element in the dialog content class
      | saveButton |

    Then User should see "successfully created" message

    When User edit "Expert, Assistant"

    And User send the keys in the dialog content class
      | namePositionSalary | editedExpert, Assistant |

    And User click on the element in the dialog content class
      | saveButton |

    Then User should see "successfully updated" message

    When User delete "editedExpert, Assistant"

    Then User should see "successfully deleted" message


  Scenario: Create, Edit and Delete a Position
    When User click on the element in the leftNav class
      | humanResources |
      | setupHR        |
      | positions      |

    And User click on the element in the dialog content class
      | addButton |

    And User send the keys in the dialog content class
      | name      | Vice Director |
      | shortName | V.Dir         |

    And User click on the element in the dialog content class
      | saveButton |

    Then User should see "successfully created" message

    When User edit "Vice Director"

    And User send the keys in the dialog content class
      | name      | Vice Principal |
      | shortName | V.Pri          |

    And User click on the element in the dialog content class
      | saveButton |

    Then User should see "successfully updated" message

    When User delete "Vice Principal"

    Then User should see "successfully deleted" message
