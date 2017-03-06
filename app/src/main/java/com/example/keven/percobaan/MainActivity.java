package com.example.keven.percobaan;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    public void goTo1(View v)
    {
        setContentView(R.layout.menu1);
    }

    public void goTo2(View v)
    {
        setContentView(R.layout.menu2);
    }
    public void goTo3(View v)
    {
        setContentView(R.layout.menu3);
    }
    public void goTo4(View v)
    {
        setContentView(R.layout.menu4);
    }
    public void goTo5(View v)
    {
        setContentView(R.layout.menu5);
    }

    public void goTof(View v)
    {
        goToUrl("https://www.facebook.com/");
    }

    public void goTot(View v)
    {
        goToUrl("https://twitter.com/login");
    }

    public void goToi(View v)
    {
        goToUrl("https://www.instagram.com/?hl=en");
    }

    public void goToy(View v)
    {
        goToUrl("https://www.youtube.com/");
    }

    public void goBack(View v)
    {
        setContentView(R.layout.activity_main);
    }
    private void goToUrl (String url) {
        Uri uriUrl = Uri.parse(url);
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(launchBrowser);
    }

}
