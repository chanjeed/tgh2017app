package com.example.naoko.tabtest;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;


public class AnalyzeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_analyze);

        Button sendButton = (Button) findViewById(R.id.button);
        sendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplication(), IkemenadviceActivity.class);
                startActivity(intent);
            }
        });

        Intent intent=getIntent();
        //String imageId = intent.getStringExtra("imageID");
        int imageId = intent.getIntExtra("imageID", 0);

        if(imageId==0) {

        }
        else
        {
            switch (imageId){
                case R.id.imageViewScroll1: {
                    ImageView imageView = (ImageView) findViewById(R.id.imageView3);
                    imageView.setImageResource(R.drawable.scroll1);
                    break;
                }
                case R.id.imageViewScroll2: {
                    ImageView imageView = (ImageView) findViewById(R.id.imageView3);
                    imageView.setImageResource(R.drawable.scroll2);
                    break;
                }
                case R.id.imageViewScroll3: {
                    ImageView imageView = (ImageView) findViewById(R.id.imageView3);
                    imageView.setImageResource(R.drawable.scroll3);
                    break;
                }
                case R.id.imageViewScroll4: {
                    ImageView imageView = (ImageView) findViewById(R.id.imageView3);
                    imageView.setImageResource(R.drawable.scroll4);
                    break;
                }
                case R.id.imageViewScroll5: {
                    ImageView imageView = (ImageView) findViewById(R.id.imageView3);
                    imageView.setImageResource(R.drawable.scroll5);
                    break;
                }
                case R.id.imageViewScroll6: {
                    ImageView imageView = (ImageView) findViewById(R.id.imageView3);
                    imageView.setImageResource(R.drawable.scroll6);
                    break;
                }
                case R.id.imageViewScroll7: {
                    ImageView imageView = (ImageView) findViewById(R.id.imageView3);
                    imageView.setImageResource(R.drawable.scroll7);
                    break;
                }
                case R.id.imageViewScroll8: {
                    ImageView imageView = (ImageView) findViewById(R.id.imageView3);
                    imageView.setImageResource(R.drawable.scroll8);
                    break;
                }
                case R.id.imageViewScroll9: {
                    ImageView imageView = (ImageView) findViewById(R.id.imageView3);
                    imageView.setImageResource(R.drawable.scroll9);
                    break;
                }
                case R.id.imageViewScroll10: {
                    ImageView imageView = (ImageView) findViewById(R.id.imageView3);
                    imageView.setImageResource(R.drawable.scroll10);
                    break;
                }
                case R.id.imageViewScroll11: {
                    ImageView imageView = (ImageView) findViewById(R.id.imageView3);
                    imageView.setImageResource(R.drawable.scroll11);
                    break;
                }
                case R.id.imageViewScroll12: {
                    ImageView imageView = (ImageView) findViewById(R.id.imageView3);
                    imageView.setImageResource(R.drawable.scroll12);
                    break;
                }
            }


        }


        //String imageId = intent.getStringExtra("imageID");

        Bundle extras=getIntent().getExtras();
        if(extras!=null) {
            byte[] byteArray = extras.getByteArray("bytes");
            Bitmap bmp = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length);

            ImageView imageViewhikaru = (ImageView) findViewById(R.id.imageView4);
            imageViewhikaru.setImageBitmap(bmp);
        }

    }
}
