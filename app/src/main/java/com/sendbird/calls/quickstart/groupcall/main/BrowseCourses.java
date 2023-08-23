package com.sendbird.calls.quickstart.groupcall.main;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.sendbird.calls.quickstart.groupcall.R;

public class BrowseCourses extends AppCompatActivity {
    WebView browseWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_browse_courses);
        browseWebView=findViewById(R.id.browseWebView);
        String url = "http://freightmanagement.xyz/The%20Mentor/android_home.php";

        WebSettings webSettings = browseWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);

       // WebViewClientImpl webViewClient = new WebViewClientImpl(this);
       // browseWebView.setWebViewClient(webViewClient);
        browseWebView.setWebViewClient(new WebViewClient() {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                return false;
            }
        });
        browseWebView.loadUrl(url);
    }
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if ((keyCode == KeyEvent.KEYCODE_BACK) && this.browseWebView.canGoBack()) {
            this.browseWebView.goBack();
            return true;
        }

        return super.onKeyDown(keyCode, event);
    }

    private class MyBrowser extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }
    }
}