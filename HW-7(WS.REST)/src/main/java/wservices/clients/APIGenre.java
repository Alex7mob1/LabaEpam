package wservices.clients;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static wservices.utils.Const.*;

public class APIGenre {

    public Response createGenre(String body) {
        return given().body(body)
                .contentType(ContentType.JSON)
                .log().all()
                .when().post(GENRE_URL)
                .then().log().all()
                .extract().response();
    }

    public Response getGenre(int id) {
        return given()
                .log().all()
                .get(String.format(GENRE_WITH_ID_URL, id))
                .then().log().all()
                .extract().response();
    }

    public Response updateGenre(String body) {
        return given().body(body)
                .contentType(ContentType.JSON)
                .log().all()
                .when().put(GENRE_URL)
                .then().log().all()
                .extract().response();
    }

    public Response deleteGenre(int id, boolean forcibly) {
        return given()
                .log().all()
                .delete(String.format(DELETE_URL_GEN, id, forcibly))
                .then().log().all()
                .extract().response();
    }
}