package com.example.dyario.ui;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.dyario.R;
import com.example.dyario.model.NewsHeadlines;
import com.example.dyario.response.NewsApiResponse;
import com.squareup.picasso.Picasso;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

    public class ArticleAdapter extends RecyclerView.Adapter<ArticleAdapter.ViewHolder> {

        private Context context;
        private List<NewsHeadlines> headlines;

        public ArticleAdapter(Context context, List<NewsHeadlines> headlines) {
            this.context = context;
            this.headlines = headlines;
        }

        @NonNull
        @Override
        public ViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {

            return new ViewHolder(LayoutInflater.from(context).inflate(R.layout.adapter_article, parent, false));
        }

        @Override
        public void onBindViewHolder(ViewHolder holder, int position) {

            holder.txtTitle.setText(headlines.get(position).getTitle());
            holder.txtArticle.setText(headlines.get(position).getSource().getName());

            if (headlines.get(position).getUrlToImage()!=null) {
                Picasso.get().load(headlines.get(position).getUrlToImage()).into(holder.imgArticle);
            }
        }

        public int getItemCount() {
            return headlines.size();
        }

        class ViewHolder extends RecyclerView.ViewHolder {
            TextView txtTitle, txtArticle;
            ImageView imgArticle;
            CardView cvArticle;

            public ViewHolder(@NonNull View itemView) {
                super(itemView);

                txtTitle = itemView.findViewById(R.id.txt_title);
                txtArticle = itemView.findViewById(R.id.txt_article);
                imgArticle = itemView.findViewById(R.id.img_article);
                cvArticle = itemView.findViewById(R.id.cv_article);
            }
        }

    }