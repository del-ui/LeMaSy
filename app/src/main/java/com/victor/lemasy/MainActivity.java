package com.victor.lemasy;

import android.os.Bundle;
import android.view.KeyEvent;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    WebView web;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        web = findViewById(R.id.webView);
        WebSettings webSettings = web.getSettings();
        webSettings.setJavaScriptEnabled(true);
        web.setWebViewClient(new Callback());
        web.getSettings().setLoadWithOverviewMode(true);
        web.getSettings().setUseWideViewPort(true);

        web.loadUrl("http://vfabtech.rf.gd");

    }
        private static class Callback extends WebViewClient{
            @Override
            public boolean shouldOverrideKeyEvent(WebView view, KeyEvent event) {
                return false;
            }

        }

}