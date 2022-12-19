package com.example.loginbot;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Context ctx=this;
        try {
            Intent i = ctx.getPackageManager().getLaunchIntentForPackage("com.pubg.imobile");
            ctx.startActivity(i);
        } catch (Exception e) {
            Log.d("Log",e.getMessage());
        }
    }

}