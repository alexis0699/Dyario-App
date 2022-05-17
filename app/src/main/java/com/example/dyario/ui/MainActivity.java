package com.example.dyario.ui;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;

import android.os.Bundle;
import android.view.LayoutInflater;

import com.example.dyario.R;
import com.example.dyario.base.BaseActivity;
import com.example.dyario.base.BaseViewModel;
import com.example.dyario.model.NewsHeadlines;
import com.example.dyario.response.NewsApiResponse;
import com.example.dyario.service.NewsArticleApi;
import com.example.dyario.ui.ArticleAdapter;
import com.example.dyario.ui.ArticleViewModel;

import org.jetbrains.annotations.NotNull;

import java.util.List;

import dagger.hilt.android.AndroidEntryPoint;
import retrofit2.Call;

@AndroidEntryPoint
public class MainActivity extends BaseActivity implements NewsArticleApi, Runnable {

    ArticleViewModel viewModel;

    RecyclerView recyclerView;
    ArticleAdapter articleAdapter;


    @NonNull
    @NotNull
    @Override
    protected BaseViewModel createViewModel() {
        return null;
    }

    @NonNull
    @NotNull
    @Override
    protected ViewBinding createViewBinding(LayoutInflater layoutInflater) {
        return null;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.rv_news);
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }

    @Override
    public Call<NewsApiResponse> callHeadlines(String country, String category, String query, String api_key) {
        return null;
    }

    @Override
    public void run() {

    }

    private void newsList() {
    }
}