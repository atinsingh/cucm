Business Need: To verify the course information
 Scenario Outline: Business User is trying to get course information
    Given User has access to course-info api at "<api>"
    When User calls api with id "<id>"
    Then Course info should return status code should be <code>
    And course code should be "<courseCode>"
    And uuid  should be "<uuid>"
   Examples:
     |api  |id | code | courseCode | uuid |
     | /api/course-info | 5f0b41be79202c7fd738a7f3| 200| DEVOPS|603d735b-de99-4ac9-8012-24e35a5d45ed|
     | /api/course-info | 5f0b3da979202c7fd738a7ee| 200| AWS-CSAA|a6037d68-9d34-4e92-aa7b-1ed3d66f020f|
