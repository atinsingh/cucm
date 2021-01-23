import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import static org.hamcrest.Matchers.*;

public class CourseInfoTest {
    private RestAssured restAssured;
    ValidatableResponse response;


    @Given("User has access to course-info api at {string}")
    public void userHasAccessToCourseInfoApiAt(String apiPath) {
        restAssured.baseURI = "https://pragra.io";
        restAssured.basePath = apiPath;
    }

    @When("User calls api with id {string}")
    public void userCallsApiWithId(String courseId) {
        response = restAssured
                .given()
                .when()
                .get("/{id}", courseId)
                .then();


    }

    @Then("Course info should return status code should be {int}")
    public void courseInfoShouldReturnStatusCodeShouldBe(int statusCode) {
        response.assertThat().statusCode(statusCode);
    }

    @And("course code should be {string}")
    public void courseCodeShouldBe(String courseCode) {
        response.body("courseCode", equalTo(courseCode));
    }

    @And("uuid  should be {string}")
    public void uuidShouldBe(String uuid) {
        response.body("uuid", equalTo(uuid));
    }
}
