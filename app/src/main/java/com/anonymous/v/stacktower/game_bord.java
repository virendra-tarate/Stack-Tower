package com.anonymous.v.stacktower;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Context;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.LinearLayout;

import com.unity3d.ads.UnityAds;
import com.unity3d.services.banners.BannerView;
import com.unity3d.services.banners.UnityBannerSize;

public class game_bord extends AppCompatActivity {



    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_bord);


        WebView g = (WebView) findViewById(R.id.game);
        g.getSettings().setPluginState(WebSettings.PluginState.ON);
        g.getSettings().setAllowFileAccess(true);
        g.getSettings().setAllowContentAccess(true);
        g.getSettings().setAllowFileAccessFromFileURLs(true);
        g.getSettings().setAllowUniversalAccessFromFileURLs(true);
        g.getSettings().setJavaScriptEnabled(true);
        g.setWebViewClient(new WebViewClient());
        g.loadUrl("file:///android_asset/index.html");

    }
}