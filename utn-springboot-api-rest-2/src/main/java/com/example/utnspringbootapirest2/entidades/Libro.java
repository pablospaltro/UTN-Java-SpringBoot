package com.example.utnspringbootapirest2.entidades;


import java.util.List;

public class Libro {

    private String title;
    private String key;
    private AuthorInfo[] authors;
    private Type type;
    private String description;
    private int[] covers;
    private List<String> subjectPlaces;
    private List<String> subjects;
    private List<String> subjectPeople;
    private List<String> subjectTimes;
    private String location;
    private int latestRevision;
    private int revision;
    private DateTimeInfo created;
    private DateTimeInfo lastModified;

    public Libro() {
    }

    public Libro(String title, String key, AuthorInfo[] authors, Type type, String description, int[] covers, List<String> subjectPlaces, List<String> subjects, List<String> subjectPeople, List<String> subjectTimes, String location, int latestRevision, int revision, DateTimeInfo created, DateTimeInfo lastModified) {
        this.title = title;
        this.key = key;
        this.authors = authors;
        this.type = type;
        this.description = description;
        this.covers = covers;
        this.subjectPlaces = subjectPlaces;
        this.subjects = subjects;
        this.subjectPeople = subjectPeople;
        this.subjectTimes = subjectTimes;
        this.location = location;
        this.latestRevision = latestRevision;
        this.revision = revision;
        this.created = created;
        this.lastModified = lastModified;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public AuthorInfo[] getAuthors() {
        return authors;
    }

    public void setAuthors(AuthorInfo[] authors) {
        this.authors = authors;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int[] getCovers() {
        return covers;
    }

    public void setCovers(int[] covers) {
        this.covers = covers;
    }

    public List<String> getSubjectPlaces() {
        return subjectPlaces;
    }

    public void setSubjectPlaces(List<String> subjectPlaces) {
        this.subjectPlaces = subjectPlaces;
    }

    public List<String> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<String> subjects) {
        this.subjects = subjects;
    }

    public List<String> getSubjectPeople() {
        return subjectPeople;
    }

    public void setSubjectPeople(List<String> subjectPeople) {
        this.subjectPeople = subjectPeople;
    }

    public List<String> getSubjectTimes() {
        return subjectTimes;
    }

    public void setSubjectTimes(List<String> subjectTimes) {
        this.subjectTimes = subjectTimes;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getLatestRevision() {
        return latestRevision;
    }

    public void setLatestRevision(int latestRevision) {
        this.latestRevision = latestRevision;
    }

    public int getRevision() {
        return revision;
    }

    public void setRevision(int revision) {
        this.revision = revision;
    }

    public DateTimeInfo getCreated() {
        return created;
    }

    public void setCreated(DateTimeInfo created) {
        this.created = created;
    }

    public DateTimeInfo getLastModified() {
        return lastModified;
    }

    public void setLastModified(DateTimeInfo lastModified) {
        this.lastModified = lastModified;
    }
}
