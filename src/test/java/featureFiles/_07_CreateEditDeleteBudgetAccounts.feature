Feature: Create and Delete Functionality for BudgetAccounts

  Background:
    Given Navigate to basqar

    When User send the keys in the dialog content class
      | username | daulet2030@gmail.com |
      | password | TechnoStudy123@      |

    And User click on the element in the dialog content class
      | loginButton |
      | gotItBtn    |

    Then User should login successfully

  Scenario:  Create, Edit and Delete a Budget Account
    When User click on the element in the leftNav class
      | budget         |
      | budgetAccounts |

    And User click on the element in the dialog content class
      | addButton |

    And User send the keys in the dialog content class
      | code | 2.0.0    |
      | name | Personal |

    And User click on the element in the dialog content class
      | type         |
      | Group        |
      | category     |
      | Expense      |
      | balanceType1 |
      | Debit        |
      | currency     |
      | EUR          |
      | formula      |
      | addButton    |
      | budgetType   |
      | Current      |

    And User fill the "formulaList" with "JAN"

#    And User click on the element in the dialog content class
#      | saveFormulaList |
#    Actions save e ENTER ile kabul ediyor

    Then User should see "successfully added" message

    And User click on the element in the dialog content class
      | contraAcc    |
      | addContraAcc |

    And User send the keys in the dialog content class
      | codeAcc | 1070 |

    And User click on the element in the dialog content class
      | budgetType   |
      | Next Years   |
      | balanceType2 |
      | Debit        |

    And User send the keys in the dialog content class
      | order | 4 |

    And User fill the "formulaList" with "BALANCE"

    And User click on the element in the dialog content class
      | saveButton |

    Then User should see "successfully created" message

    When User click on the element in the leftNav class
      | budget         |
      | budgetAccounts |

    And User edit "Personal"

    And User send the keys in the dialog content class
      | name | development of educational activities |

    And User click on the element in the dialog content class
      | saveButton |

    Then User should see "successfully updated" message

    When User click on the element in the leftNav class
      | budget         |
      | budgetAccounts |

    And User delete "development of educational activities"

    Then User should see "successfully deleted" message