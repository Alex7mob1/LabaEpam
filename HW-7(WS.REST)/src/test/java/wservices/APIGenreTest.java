package wservices;

import com.google.gson.Gson;
import io.restassured.response.Response;
import org.apache.http.HttpStatus;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import wservices.clients.APIGenre;
import wservices.parser.GenreParser;
import wservices.parser.UpdateGenreParser;

public class APIGenreTest extends BaseTest {

    private APIGenre APIGenre;

    @BeforeTest
    public void field() {
        APIGenre = new APIGenre();
    }

    @Test(priority = 1)
    public void whenSuccessOnPostResponse() {
        Response response = APIGenre.createGenre(new Gson().toJson(new GenreParser().parse()));
        Assert.assertEquals(response.getStatusCode(), HttpStatus.SC_CREATED);
    }

    @Test(priority = 2)
    public void whenNegativeOnPostResponse() {
        Response response = APIGenre.createGenre(new Gson().toJson(new GenreParser().parse()));
        Assert.assertEquals(response.getStatusCode(), HttpStatus.SC_CONFLICT);
    }

    @Test(priority = 3)
    public void whenSuccessOnGetsResponse() {
        Response response = APIGenre.getGenre(new GenreParser().parse().getGenreId());
        Assert.assertEquals(response.getStatusCode(), HttpStatus.SC_OK);
        //body("genreName",equalTo("aaa"));
    }

    @Test(priority = 4)
    public void whenNegativeOnPutResponse() {
        Response response = APIGenre.updateGenre(new Gson().toJson(new GenreParser().parse()));
        Assert.assertEquals(response.getStatusCode(), HttpStatus.SC_OK);
    }

    @Test(priority = 5)
    public void whenSuccessOnPutResponse() {
        Response response = APIGenre.updateGenre(new Gson().toJson(new UpdateGenreParser().updateParse()));
        Assert.assertEquals(response.getStatusCode(), HttpStatus.SC_OK);
    }

    @Test(priority = 6)
    public void whenSuccessOnUpdateGetsResponse() {
        Response response = APIGenre.getGenre(new GenreParser().parse().getGenreId());
        Assert.assertEquals(response.getStatusCode(), HttpStatus.SC_OK);
        //Author actual = response.getBody();
        //Author expected = new GenreParser().parse();
        //body("genreName",equalTo("BBB"));
    }

    @Test(priority = 7)
    public void whenSuccessOnDeleteResponse() {
        Response response = APIGenre.deleteGenre(new GenreParser().parse().getGenreId(), false);
        Assert.assertEquals(response.getStatusCode(), HttpStatus.SC_NO_CONTENT);
    }

    @Test(priority = 8)
    public void whenNegativeOnDeleteResponse() {
        Response response = APIGenre.deleteGenre(new GenreParser().parse().getGenreId(), false);
        Assert.assertEquals(response.getStatusCode(), HttpStatus.SC_NOT_FOUND);
    }

    @Test(priority = 9)
    public void whenNegativeOnGetsResponse() {
        Response response = APIGenre.getGenre(new GenreParser().parse().getGenreId());
        Assert.assertEquals(response.getStatusCode(), HttpStatus.SC_NOT_FOUND);
    }
}