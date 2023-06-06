package com.example.dailybyte;

import java.util.ArrayList;

public class NewsModal {
    private String status;
    private int totalResults;
    private ArrayList<Articles> articles;

    public NewsModal(String status, int totalResults, ArrayList<Articles> articles) {
        this.status = status;
        this.totalResults = totalResults;
        this.articles = articles;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getTotalResults() {
        return totalResults;
    }

    public void setTotalResults(int totalResults) {
        this.totalResults = totalResults;
    }

    public ArrayList<Articles> getArticle() {
        return articles;
    }

    public void setArticle(ArrayList<Articles> articles) {
        this.articles = articles;
    }
}
