Feature: Create, Edit and Delete Functionality for Cost Centers

  Background:
    Given Navigate to basqar

    When User send the keys in the dialog content class
      | username | daulet2030@gmail.com |
      | password | TechnoStudy123@      |

    And User click on the element in the dialog content class
      | loginButton |
      | gotItBtn    |

    Then User should login successfully

  Scenario:  Create, Edit and Delete a Cost Center

    When User click on the element in the leftNav class
      | budget      |
      | setupBudget |
      | costCenters |

    And User click on the element in the dialog content class
      | addButton |

    And User click on the element in the dialog content class
      | type               |
      | Operation          |
      | expenseAccPrefixes |
      | randomSelect       |

    And User send the keys in the dialog content class
      | name    | Administration |
      | code    | 00000010       |
      | orderNo | 10             |

    And User click on the element in the dialog content class
      | tabConstants |

    And User send the keys in the dialog content class
      | key           | Const-1 |
      | valueConstans | 12345   |

    And User click on the element in the dialog content class
      | addCost    |
      | saveButton |

    Then User should see "successfully created" message

    When User edit "Administration"
    And User click on the element in the dialog content class
      | type                     |
      | Service                  |
      | cancelExpenseAccPrefixes |
      | randomSelect             |

    And User send the keys in the dialog content class
      | name    | Educational activities |
      | code    | 00000011               |
      | orderNo | 11                     |

    And User click on the element in the dialog content class
      | tabConstants |

    And User edit "Const-1"
    And User send the keys in the dialog content class
      | key           | Const-2 |
      | valueConstans | 6789   |

    And User click on the element in the dialog content class
      | addCost    |
      | saveButton |

    Then User should see "successfully updated" message

    When User delete "Educational activities"

    Then User should see "successfully deleted" message
