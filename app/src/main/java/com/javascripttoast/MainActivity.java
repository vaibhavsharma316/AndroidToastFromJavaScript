package com.javascripttoast;

import android.content.res.AssetManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

import java.io.InputStream;

public class MainActivity extends AppCompatActivity {

    private WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

            getReferences();
            loadBrowser();
    }



    private void getReferences()
    {

        webView= (WebView) findViewById(R.id.browser);

    }


    private void loadBrowser()
    {


        webView.getSettings().setJavaScriptEnabled(true);
        webView.addJavascriptInterface(new JavaScriptAppInterface(this),"nativeHelper");
        webView.loadUrl("file:///android_asset/index.html");


    }





}
