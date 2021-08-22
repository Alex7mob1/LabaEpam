package wservices.clients;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;
import static wservices.utils.Const.*;

public class APIAuthor {

    public Response createClient(String body) {
        return given().body(body)
                .contentType(ContentType.JSON)
                .log().all()
                .when().post(AUTHOR_URL)
                .then().log().all()
                .extract().response();
    }

    public Response getClient(int id) {
        return given()
                .log().all()
                .get(String.format(AUTHOR_WITH_ID_URL, id))
                .then().log().all()
                .extract().response();
    }

    public Response updateClient(String body) {
        return given().body(body)
                .contentType(ContentType.JSON)
                .log().all()
                .when().put(AUTHOR_URL)
                .then().log().all()
                .extract().response();
    }

    public Response deleteClient(int id, boolean forcibly) {
        return given()
                .log().all()
                .delete(String.format(DELETE_URL_AUT, id, forcibly))
                .then().log().all()
                .extract().response();
    }
}