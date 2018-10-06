package com.example.naoko.tabtest;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.TextView;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IkemenadviceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ikemenadvice);

        TextView textView = (TextView) findViewById(R.id.ikemen_advice);
        setSpannableString(textView);
    }

    private void setSpannableString(TextView textView) {
        String message = "ひかるさん、頑張って理想に近づきましょう！　　　　　　コンタクトに変えるだけで印象がガラリと変わりますよ。　　　　　　　顔痩せ美顔器を使うのはどうでしょう？　　　　　　　安心かつ手軽に使えるアイプチもオススメです。　　　　　　　ヘア・眉毛カットの得意な美容院もご紹介しますよ！\n";
        Map<String, String> map = new HashMap<String, String>();
        map.put("コンタクト", "https://www.eyecity.jp");
        map.put("美顔器", "https://www.amazon.co.jp/s/?ie=UTF8&keywords=小顔美顔器&tag=googhydr-22&index=aps&jp-ad-ap=0&hvadid=217393718096&hvpos=1t3&hvnetw=g&hvrand=4413323735380776009&hvpone=&hvptwo=&hvqmt=b&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=1028853&hvtargid=kwd-13523084507&ref=pd_sl_29jelvzidg_b");
        map.put("アイプチ", "https://cp.mandm-ltd.jp/ec6biwmhgsp1204");
        map.put("美容院", "http://lipps.co.jp");

        SpannableString ss = createSpannableString(message, map);

        textView.setText(ss);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }

    private SpannableString createSpannableString(String message, Map<String, String> map) {

        SpannableString ss = new SpannableString(message);
        for (final Map.Entry<String, String> entry : map.entrySet()) {
            int start = 0;
            int end = 0;


            Pattern pattern = Pattern.compile(entry.getKey());
            Matcher matcher = pattern.matcher(message);
            while (matcher.find()) {
                start = matcher.start();
                end = matcher.end();
                break;
            }


            ss.setSpan(new ClickableSpan() {
                @Override
                public void onClick(View textView) {
                    String url = entry.getValue();
                    Uri uri = Uri.parse(url);
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent);
                }
            }, start, end, Spanned.SPAN_INCLUSIVE_INCLUSIVE);
        }

        return ss;
    }
}
