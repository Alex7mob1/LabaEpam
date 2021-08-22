package wservices.models.author;

import java.util.Date;

public class AuthorBirth {
    private String date;
    private String country;
    private String city;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "AuthorBirth{" +
                "date=" + date +
                ", country='" + country + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}