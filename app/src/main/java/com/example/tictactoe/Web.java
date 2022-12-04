package com.example.tictactoe;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Web extends Activity {
    WebView ourBrow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);

        ourBrow = (WebView) findViewById(R.id.webView);
        ourBrow.setWebViewClient(new MyBrowser());
        ourBrow.getSettings().setJavaScriptEnabled(true);
//        ourBrow.loadUrl("https://imaginationgaming.co.uk/blog/5-reasons-why-playing-games-important-ig-perspective");
        ourBrow.loadUrl("https://www.cambridgeenglish.org/learning-english/parents-and-children/your-childs-interests/kids-are-here-to-play-the-importance-of-games/");


    }
    private class MyBrowser extends WebViewClient
    {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view,String url){
            view.loadUrl(url);
            return true;
        }
    }
}