package com.example.android.newsfeedapp;


class News {

    String url;
    private String title;
    private String author;
    private String section;

    News(String url, String title, String author, String section) {
        this.url = url;
        this.author = author;
        this.title = title;
        this.section = section;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }


    String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    @Override
    public String toString() {
        return "News{" +
                "url='" + url + '\'' +
                ", author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", section='" + section + '\'' +
                '}';
    }
}
