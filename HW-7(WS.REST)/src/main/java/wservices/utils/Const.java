package wservices.utils;

public class Const {
    public static final String DEFAULT_URL = "http://localhost:8080/api/library";
    public static final String AUTHOR_URL = "/author";
    public static final String GENRE_URL = "/genre";
    public static final String GENRE_WITH_ID_URL = "/genre/%s";
    public static final String AUTHOR_WITH_ID_URL = "/author/%s";
    public static final String DELETE_URL_AUT = AUTHOR_URL + "/%s?forcibly=%s";
    public static final String DELETE_URL_GEN = GENRE_URL + "/%s?forcibly=%s";
}