Feature: Create and Delete Functionality for Countries and Cities

  Background:
    Given Navigate to basqar
    When User send the keys in the dialog content class
      | username | daulet2030@gmail.com |
      | password | TechnoStudy123@      |
    And User click on the element in the dialog content class
      | loginButton |
      | gotItBtn    |
    Then User should login successfully

  Scenario: Create and Delete a Country
    When User click on the element in the leftNav class
      | setup      |
      | parameters |
      | countries  |

    And User click on the element in the dialog content class
      | addButton |

    And User send the keys in the dialog content class
      | name | MngMongolia |
      | code | 169         |

    And User click on the element in the dialog content class
      | saveButton |

    Then User should see "successfully created" message

    When User delete "MngMongolia"

    Then User should see "successfully deleted" message


  Scenario: Create and Delete a City
    When User click on the element in the leftNav class
      | setup      |
      | parameters |
      | cities     |

    And User click on the element in the dialog content class
      | addButton     |
      | country       |
      | randomSelect |


    And User send the keys in the dialog content class
      | name | Darkhan |

    And User click on the element in the dialog content class
      | saveButton |

    Then User should see "successfully created" message

    When User delete "Darkhan"

    Then User should see "successfully deleted" message


  Scenario: Create a Country and a city and delete Country
    When User click on the element in the leftNav class
      | setup      |
      | parameters |
      | countries  |

    And User click on the element in the dialog content class
      | addButton |

    And User send the keys in the dialog content class
      | name | MngMongolia |
      | code | 169         |

    And User click on the element in the dialog content class
      | saveButton |

    Then User should see "successfully created" message


    When User click on the element in the leftNav class
      | cities |

    And User click on the element in the dialog content class
      | addButton   |
      | country     |
      | MngMongolia |

    And User send the keys in the dialog content class
      | name | Darkhan |

    And User click on the element in the dialog content class
      | saveButton |

    Then User should see "successfully created" message


    When User click on the element in the leftNav class
      | countries |

    And User delete "MngMongolia"

    Then User should see "error" message

#    the following codes are to delete city and country to add them again
    When User click on the element in the leftNav class
      | cities |

    Then User delete "Darkhan"

    When User click on the element in the leftNav class
      | countries |

    Then User delete "MngMongolia"