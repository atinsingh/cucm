Business Need: To verify the course information
  Scenario: Business User is trying to get course information
    Given User has access to course-info api at "/api/course-info"
    When User calls api with id "5f0b1d8216b5b97e87391483"
    Then Course info should return status code should be 200
    And course code should be "DATA-SCIENCE"
    And uuid  should be "b1c5de67-6f6c-4f9e-b4a4-f340c7819a61"
