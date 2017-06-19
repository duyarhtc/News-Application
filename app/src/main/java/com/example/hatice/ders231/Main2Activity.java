package com.example.hatice.ders231;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Main2Activity extends AppCompatActivity {
    WebView wv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        WebView wv=(WebView)findViewById(R.id.webview_id);
        wv.getSettings().setJavaScriptEnabled(true);
        wv.setWebViewClient(new WebViewClient());
        wv.setWebChromeClient(new WebChromeClient());
        String site=getIntent().getStringExtra("site");

        if(site.equals("Oda Tv")){
            wv.loadUrl("http://www.odatv.com");
        }
        else if(site.equals("Sözcü")){
            wv.loadUrl("http://www.sozcu.com.tr");

        }
        else if(site.equals("NTV")){
            wv.loadUrl("http://www.ntv.com.tr");

        }
        else if(site.equals("CNN Türk")){
            wv.loadUrl("http://www.cnnturk.com");

        }
        else if(site.equals("BBC Türkçe")) {
            wv.loadUrl("http://www.bbc.com/turkce");

        }
        else if(site.equals("Akşam")) {
            wv.loadUrl("http://www.aksam.com.tr");

        }
        else if(site.equals("Sabah")) {
            wv.loadUrl("hhttp://www.sabah.com.tr");

        }
        else if(site.equals("Cumhuriyet")) {
            wv.loadUrl("http://www.cumhuriyet.com.tr");

        }
        else if(site.equals("Milliyet")) {
            wv.loadUrl("http://www.milliyet.com.tr");

        }
        else if(site.equals("Posta")) {
            wv.loadUrl("http://www.posta.com.tr");

        }


    }
}
