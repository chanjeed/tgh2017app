package com.example.naoko.tabtest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;


public class showface extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_showface);

        Intent intent=getIntent();
        //String imageId = intent.getStringExtra("imageID");
        int imageId = intent.getIntExtra("imageID", 0);

        if(imageId==0) {

        }
        else
        {
            switch (imageId){
                case R.id.imageViewScroll1: {
                    ImageView imageView = (ImageView) findViewById(R.id.imageViewShow);
                    imageView.setImageResource(R.drawable.scroll1);
                    break;
                }
                case R.id.imageViewScroll2: {
                    ImageView imageView = (ImageView) findViewById(R.id.imageViewShow);
                    imageView.setImageResource(R.drawable.scroll2);
                    break;
                }
                case R.id.imageViewScroll3: {
                    ImageView imageView = (ImageView) findViewById(R.id.imageViewShow);
                    imageView.setImageResource(R.drawable.scroll3);
                    break;
                }
                case R.id.imageViewScroll4: {
                    ImageView imageView = (ImageView) findViewById(R.id.imageViewShow);
                    imageView.setImageResource(R.drawable.scroll4);
                    break;
                }
                case R.id.imageViewScroll5: {
                    ImageView imageView = (ImageView) findViewById(R.id.imageViewShow);
                    imageView.setImageResource(R.drawable.scroll5);
                    break;
                }
                case R.id.imageViewScroll6: {
                    ImageView imageView = (ImageView) findViewById(R.id.imageViewShow);
                    imageView.setImageResource(R.drawable.scroll6);
                    break;
                }
                case R.id.imageViewScroll7: {
                    ImageView imageView = (ImageView) findViewById(R.id.imageViewShow);
                    imageView.setImageResource(R.drawable.scroll7);
                    break;
                }
                case R.id.imageViewScroll8: {
                    ImageView imageView = (ImageView) findViewById(R.id.imageViewShow);
                    imageView.setImageResource(R.drawable.scroll8);
                    break;
                }
                case R.id.imageViewScroll9: {
                    ImageView imageView = (ImageView) findViewById(R.id.imageViewShow);
                    imageView.setImageResource(R.drawable.scroll9);
                    break;
                }
                case R.id.imageViewScroll10: {
                    ImageView imageView = (ImageView) findViewById(R.id.imageViewShow);
                    imageView.setImageResource(R.drawable.scroll10);
                    break;
                }
                case R.id.imageViewScroll11: {
                    ImageView imageView = (ImageView) findViewById(R.id.imageViewShow);
                    imageView.setImageResource(R.drawable.scroll11);
                    break;
                }
                case R.id.imageViewScroll12: {
                    ImageView imageView = (ImageView) findViewById(R.id.imageViewShow);
                    imageView.setImageResource(R.drawable.scroll12);
                    break;
                }
            }


        }

    }


}
