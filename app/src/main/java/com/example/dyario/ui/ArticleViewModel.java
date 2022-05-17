package com.example.dyario.ui;

import android.util.Log;

import androidx.lifecycle.MutableLiveData;

import com.example.dyario.base.BaseViewModel;
import com.example.dyario.model.NewsHeadlines;
import com.example.dyario.model.Source;
import com.example.dyario.service.NewsArticleApi;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import dagger.hilt.android.lifecycle.HiltViewModel;

@HiltViewModel
public class ArticleViewModel extends BaseViewModel {
    private MutableLiveData<NewsHeadlines> news = new MutableLiveData<>();
    private MutableLiveData<Source> newsSource = new MutableLiveData<>();

    private NewsHeadlines newsHeadLines;
    private Source source;
    private NewsArticleApi newsArticleApi;

    @Inject
    ArticleViewModel(Source source, NewsHeadlines newsHeadlines, NewsArticleApi newsArticleApi) {
        this.newsHeadLines = newsHeadlines;
        this.source = source;
        this.newsArticleApi = newsArticleApi;
    }


}
