package com.example.utnspringbootapirest2.entidades;

public class AuthorInfo {

    private Author author;
    private Type type;

    public AuthorInfo() {
    }

    public AuthorInfo(Author author, Type type) {
        this.author = author;
        this.type = type;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }
}
