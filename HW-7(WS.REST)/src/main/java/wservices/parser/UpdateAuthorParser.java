package wservices.parser;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import wservices.models.author.Author;
import wservices.models.author.AuthorBirth;
import wservices.models.author.AuthorName;

import java.io.FileReader;
import java.io.IOException;

public class UpdateAuthorParser {
    public Author updateParse() {
        JSONParser parser = new JSONParser();
        Author author = new Author();
        try {
            Object obj = parser.parse(new FileReader("src/test/resources/updateAuthorData.json"));
            JSONObject jsonObject = (JSONObject) obj;

            int authorId = Integer.parseInt(jsonObject.get("authorId").toString());
            String nationality = (String) jsonObject.get("nationality");
            String authorDescription = (String) jsonObject.get("authorDescription");
            // loop array
            JSONObject authorName = (JSONObject) jsonObject.get("authorName");
            String first = String.valueOf(authorName.get("first"));
            String second = String.valueOf(authorName.get("second"));

            JSONObject birth = (JSONObject) jsonObject.get("birth");
            String date = String.valueOf(birth.get("date"));

            String country = String.valueOf(birth.get("country"));
            String city = String.valueOf(birth.get("city"));

            AuthorName authorNameModel = new AuthorName();
            AuthorBirth authorBirth = new AuthorBirth();

            authorNameModel.setFirst(first);
            authorNameModel.setSecond(second);

            authorBirth.setDate(date);
            authorBirth.setCountry(country);
            authorBirth.setCity(city);

            author.setAuthorId(authorId);
            author.setAuthorName(authorNameModel);
            author.setNationality(nationality);
            author.setBirth(authorBirth);
            author.setAuthorDescription(authorDescription);

        } catch (ParseException | IOException e) {
            e.printStackTrace();
        }
        return author;
    }
}
