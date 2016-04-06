package ru.krylovanton.quoteextension;



/**
 * Created by Антон on 06.04.2016.
 */
public class Quote {

    private String author;
    private String quote;

    public Quote(String author, String quote){

        this.author = author;
        this.quote = quote;

    }

    public String getAuthor() {
        return author;
    }

    public String getQuote() {
        return quote;
    }
}
