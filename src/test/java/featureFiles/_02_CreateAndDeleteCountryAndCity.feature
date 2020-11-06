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
      | name | Group3Country5 |
      | code | 123            |

    And User click on the element in the dialog content class
      | saveButton |

    Then User should see "successfully created" message

    When User delete value
      | Group3Country5 |

    Then User should see "successfully deleted" message


  Scenario: Create and Delete a City
    When User click on the element in the leftNav class
      | setup      |
      | parameters |
      | cities     |

    And User click on the element in the dialog content class
      | addButton     |
      | country       |
      | randomCountry |


    And User send the keys in the dialog content class
      | name | Group3City5 |

    And User click on the element in the dialog content class
      | saveButton |

    Then User should see "successfully created" message

    When User delete value
      | Group3City5 |

    Then User should see "successfully deleted" message


  Scenario: Create and Delete a Country and a city
    When User click on the element in the leftNav class
      | setup      |
      | parameters |
      | countries  |

    And User click on the element in the dialog content class
      | addButton |

    And User send the keys in the dialog content class
      | name | Group3Country5 |
      | code | 123            |

    And User click on the element in the dialog content class
      | saveButton |

    Then User should see "successfully created" message


    When User click on the element in the leftNav class
      | cities |

    And User click on the element in the dialog content class
      | addButton      |
      | country        |
      | Group3Country5 |

    And User send the keys in the dialog content class
      | name | Group3City5 |

    And User click on the element in the dialog content class
      | saveButton |

    Then User should see "successfully created" message


    When User click on the element in the leftNav class
      | countries |

    When User delete value
      | Group3Country5 |

    Then User should see "error" message
