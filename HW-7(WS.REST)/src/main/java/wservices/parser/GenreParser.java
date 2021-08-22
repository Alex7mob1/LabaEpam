package wservices.parser;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import wservices.models.genre.Genre;

import java.io.FileReader;
import java.io.IOException;

public class GenreParser {

    public Genre parse() {
        JSONParser parser = new JSONParser();
        Genre genre = new Genre();
        try {
            Object obj = parser.parse(new FileReader("src/test/resources/genreData.json"));
            JSONObject jsonObject = (JSONObject) obj;

            int genreId = Integer.parseInt(jsonObject.get("genreId").toString());
            String genreName = (String) jsonObject.get("genreName");
            String genreDescription = (String) jsonObject.get("genreDescription");

            genre.setGenreId(genreId);
            genre.setGenreName(genreName);
            genre.setGenreDescription(genreDescription);

        } catch (ParseException | IOException e) {
            e.printStackTrace();
        }
        return genre;
    }
}