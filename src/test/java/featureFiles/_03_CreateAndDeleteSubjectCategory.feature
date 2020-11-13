Feature: Create and Delete Functionality for Subject Categories

  Background:
    Given Navigate to basqar
    When User send the keys in the dialog content class
      | username | daulet2030@gmail.com |
      | password | TechnoStudy123@      |
    And User click on the element in the dialog content class
      | loginButton |
      | gotItBtn    |
    Then User should login successfully

  Scenario: Create and Delete a Subject Category
    When User click on the element in the leftNav class
      | education         |
      | setupEducation    |
      | subjectCategories |

    And User click on the element in the dialog content class
      | addButton |

    And User send the keys in the dialog content class
      | name | Science02 |
      | code | 102       |

    And User click on the element in the dialog content class
      | saveButton |

    Then User should see "successfully created" message

    When User delete "Science02"

    Then User should see "successfully deleted" message


  Scenario: Create and Delete a Subject
    When User click on the element in the leftNav class
      | education      |
      | setupEducation |
      | subjects       |

    And User click on the element in the dialog content class
      | addButton |

    And User send the keys in the dialog content class
      | name | Chemistry102 |
      | code | 102102       |

    And User click on the element in the dialog content class
      | subjectCategory |
      | randomSelect    |
      | style           |
      | randomSelect    |
      | saveButton      |

    Then User should see "successfully created" message

    When User delete "Chemistry102"

    Then User should see "successfully deleted" message


  Scenario: Create a Subject Category and a Subject and try to delete a Subject Category
    When User click on the element in the leftNav class
      | education         |
      | setupEducation    |
      | subjectCategories |

    And User click on the element in the dialog content class
      | addButton |

    And User send the keys in the dialog content class
      | name | Science02 |
      | code | 102       |

    And User click on the element in the dialog content class
      | saveButton |

    Then User should see "successfully created" message


    When User click on the element in the leftNav class
      | subjects |

    And User click on the element in the dialog content class
      | addButton |

    And User send the keys in the dialog content class
      | name | Chemistry102 |
      | code | 102102       |

    And User click on the element in the dialog content class
      | subjectCategory |
      | Science02       |
      | style           |
      | randomSelect    |
      | saveButton      |

    Then User should see "successfully created" message

# Parent daki scroll dan dolayi burayi goremedi
    When User click on the element in the leftNav class
      | subjectCategories |

    When User delete "Science02"

    Then User should see "error" message

#    Silinmeyen subject category ve subject silindi
    When User click on the element in the leftNav class
      | subjects |
    Then User delete "Chemistry102"

    When User click on the element in the leftNav class
      | subjectCategories |
    When User delete "Science02"
