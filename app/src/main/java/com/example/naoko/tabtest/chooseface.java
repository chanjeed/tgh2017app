package com.example.naoko.tabtest;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class chooseface extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chooseface);




        ImageView sendButtonScroll1 = (ImageView) findViewById(R.id.imageViewScroll1);
        sendButtonScroll1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int imageId = v.getId();
                Intent intent = new Intent(getApplication(), AnalyzeActivity.class);
                intent.putExtra("imageID", imageId);
                startActivity(intent);
            }
        });

        ImageView sendButtonScroll2 = (ImageView) findViewById(R.id.imageViewScroll2);
        sendButtonScroll2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int imageId = v.getId();
                Intent intent = new Intent(getApplication(), AnalyzeActivity.class);
                intent.putExtra("imageID", imageId);
                startActivity(intent);
            }
        });

        ImageView sendButtonScroll3 = (ImageView) findViewById(R.id.imageViewScroll3);
        sendButtonScroll3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int imageId = v.getId();
                Intent intent = new Intent(getApplication(),AnalyzeActivity.class);
                intent.putExtra("imageID", imageId);
                startActivity(intent);
            }
        });

        ImageView sendButtonScroll4 = (ImageView) findViewById(R.id.imageViewScroll4);
        sendButtonScroll4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int imageId = v.getId();
                Intent intent = new Intent(getApplication(), AnalyzeActivity.class);
                intent.putExtra("imageID", imageId);
                startActivity(intent);
            }
        });

        ImageView sendButtonScroll5 = (ImageView) findViewById(R.id.imageViewScroll5);
        sendButtonScroll5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int imageId = v.getId();
                Intent intent = new Intent(getApplication(), AnalyzeActivity.class);
                intent.putExtra("imageID", imageId);
                startActivity(intent);
            }
        });

        ImageView sendButtonScroll6 = (ImageView) findViewById(R.id.imageViewScroll6);
        sendButtonScroll6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int imageId = v.getId();
                Intent intent = new Intent(getApplication(), AnalyzeActivity.class);
                intent.putExtra("imageID", imageId);
                startActivity(intent);
            }
        });

        ImageView sendButtonScroll7 = (ImageView) findViewById(R.id.imageViewScroll7);
        sendButtonScroll7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int imageId = v.getId();
                Intent intent = new Intent(getApplication(), AnalyzeActivity.class);
                intent.putExtra("imageID", imageId);
                startActivity(intent);
            }
        });

        ImageView sendButtonScroll8 = (ImageView) findViewById(R.id.imageViewScroll8);
        sendButtonScroll8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int imageId = v.getId();
                Intent intent = new Intent(getApplication(), AnalyzeActivity.class);
                intent.putExtra("imageID", imageId);
                startActivity(intent);
            }
        });

        ImageView sendButtonScroll9 = (ImageView) findViewById(R.id.imageViewScroll9);
        sendButtonScroll9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int imageId = v.getId();
                Intent intent = new Intent(getApplication(), AnalyzeActivity.class);
                intent.putExtra("imageID", imageId);
                startActivity(intent);
            }
        });

        ImageView sendButtonScroll10 = (ImageView) findViewById(R.id.imageViewScroll10);
        sendButtonScroll10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int imageId = v.getId();
                Intent intent = new Intent(getApplication(), AnalyzeActivity.class);
                intent.putExtra("imageID", imageId);
                startActivity(intent);
            }
        });

        ImageView sendButtonScroll11 = (ImageView) findViewById(R.id.imageViewScroll11);
        sendButtonScroll11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int imageId = v.getId();
                Intent intent = new Intent(getApplication(), AnalyzeActivity.class);
                intent.putExtra("imageID", imageId);
                startActivity(intent);
            }
        });

        ImageView sendButtonScroll12 = (ImageView) findViewById(R.id.imageViewScroll12);
        sendButtonScroll12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int imageId = v.getId();
                Intent intent = new Intent(getApplication(), AnalyzeActivity.class);
                intent.putExtra("imageID", imageId);
                startActivity(intent);
            }
        });
    }
}
