package com.example.naoko.tabtest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import android.app.TabActivity;
import android.content.Intent;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

public class MainActivity extends TabActivity {

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TabHost tabHost = getTabHost();

        TabSpec tab1 = tabHost.newTabSpec("tab1");
        tab1.setIndicator("理想像");
        tab1.setContent(new Intent(this, facegenre.class));
        tabHost.addTab(tab1);

        TabSpec tab2 = tabHost.newTabSpec("tab2");
        tab2.setIndicator("MyPage");
        tab2.setContent(new Intent(this, MyfaceActivity.class));
        tabHost.addTab(tab2);

        TabSpec tab3 = tabHost.newTabSpec("tab3");
        tab3.setIndicator("分析");
        tab3.setContent(new Intent(this, AnalyzeActivity.class));
        tabHost.addTab(tab3);

        TabSpec tab4 = tabHost.newTabSpec("tab4");
        tab4.setIndicator("目標");
        tab4.setContent(new Intent(this, Graph.class));
        tabHost.addTab(tab4);
    }
}
