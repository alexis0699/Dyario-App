package com.example.dyario.response;

import com.example.dyario.model.NewsHeadlines;

import java.util.List;

public class NewsApiResponse {
    String Status;
    int totalResults;
    List<NewsHeadlines> articles;

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public int getTotalResults() {
        return totalResults;
    }

    public void setTotalResults(int totalResults) {
        this.totalResults = totalResults;
    }

    public List<NewsHeadlines> getArticles() {
        return articles;
    }

    public void setArticles(List<NewsHeadlines> articles) {
        this.articles = articles;
    }
}
