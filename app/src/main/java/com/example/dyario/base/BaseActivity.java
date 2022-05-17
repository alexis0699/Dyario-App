package com.example.dyario.base;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewbinding.ViewBinding;

import com.example.dyario.R;


public abstract class BaseActivity<BINDING extends ViewBinding, VM extends BaseViewModel> extends AppCompatActivity {

    protected VM viewModel;
    protected BINDING binding;

    private ProgressDialog progressDialog;

    @NonNull
    protected abstract VM createViewModel();

    @NonNull
    protected abstract BINDING createViewBinding(LayoutInflater layoutInflater);

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = createViewBinding(LayoutInflater.from(this));
        setContentView(binding.getRoot());
        viewModel = createViewModel();
    }

    public void onPause() {
        super.onPause();
        dismissProgressDialog();
    }

    void initViews() {
        progressDialog = new ProgressDialog(this);
        progressDialog.setMessage(getString(R.string.loading));
    }

    void dismissProgressDialog() {
        if (progressDialog.isShowing()) {
            progressDialog.dismiss();
        }
    }

    void back() {
        onBackPressed();
    }

    void close() {
        finish();
    }
}