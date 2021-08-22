package wservices;

import com.google.gson.Gson;
import io.restassured.response.Response;
import org.apache.http.HttpStatus;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import wservices.clients.APIAuthor;
import wservices.parser.AuthorParser;
import wservices.parser.UpdateAuthorParser;

public class APIAuthorTest extends BaseTest {

    private APIAuthor APIAuthor;

    @BeforeTest
    public void field() {
        APIAuthor = new APIAuthor();
    }

    @Test(priority = 1)
    public void whenSuccessOnPostResponse() {
        Response response = APIAuthor.createClient(new Gson().toJson(new AuthorParser().parse()));
        Assert.assertEquals(response.getStatusCode(), HttpStatus.SC_CREATED);
    }

    @Test(priority = 2)
    public void whenNegativeOnPostResponse() {
        Response response = APIAuthor.createClient(new Gson().toJson(new AuthorParser().parse()));
        Assert.assertEquals(response.getStatusCode(), HttpStatus.SC_CONFLICT);
    }

    @Test(priority = 3)
    public void whenSuccessOnGetsResponse() {
        Response response = APIAuthor.getClient(new AuthorParser().parse().getAuthorId());
        Assert.assertEquals(response.getStatusCode(), HttpStatus.SC_OK);
        //body("birth.date",equalTo("2000-09-10")).body("authorName.first", hasItems("Alex"));
    }

    @Test(priority = 4)
    public void whenNegativeOnPutResponse() {
        Response response = APIAuthor.updateClient(new Gson().toJson(new AuthorParser().parse()));
        Assert.assertEquals(response.getStatusCode(), HttpStatus.SC_OK);
    }

    @Test(priority = 5)
    public void whenSuccessOnPutResponse() {
        Response response = APIAuthor.updateClient(new Gson().toJson(new UpdateAuthorParser().updateParse()));
        Assert.assertEquals(response.getStatusCode(), HttpStatus.SC_OK);
    }

    @Test(priority = 6)
    public void whenSuccessOnUpdateGetsResponse() {
        Response response = APIAuthor.getClient(new AuthorParser().parse().getAuthorId());
        Assert.assertEquals(response.getStatusCode(), HttpStatus.SC_OK);
        //body("birth.date",equalTo("2000-09-09"));
    }

    @Test(priority = 7)
    public void whenSuccessOnDeleteResponse() {
        Response response = APIAuthor.deleteClient(new AuthorParser().parse().getAuthorId(), false);
        Assert.assertEquals(response.getStatusCode(), HttpStatus.SC_NO_CONTENT);

    }

    @Test(priority = 8)
    public void whenNegativeOnDeleteResponse() {
        Response response = APIAuthor.deleteClient(new AuthorParser().parse().getAuthorId(), false);
        Assert.assertEquals(response.getStatusCode(), HttpStatus.SC_NOT_FOUND);

    }

    @Test(priority = 9)
    public void whenNegativeOnGetsResponse() {
        Response response = APIAuthor.getClient(new AuthorParser().parse().getAuthorId());
        Assert.assertEquals(response.getStatusCode(), HttpStatus.SC_NOT_FOUND);
    }
}

