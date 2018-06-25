package com.share;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainActivity extends AppCompatActivity {
    LinearLayout linearLayout;
    TextView tvSave;
    ImageView shareImg;
    RelativeLayout relContent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        linearLayout=findViewById(R.id.ll_content);
        tvSave=findViewById(R.id.save);
        shareImg=findViewById(R.id.shareimg);


         relContent=findViewById(R.id.rel_share_content);


        tvSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                linearLayout.setDrawingCacheEnabled(true);
//                linearLayout.measure(View.MeasureSpec.makeMeasureSpec(0, View.MeasureSpec.UNSPECIFIED),
//                        View.MeasureSpec.makeMeasureSpec(0, View.MeasureSpec.UNSPECIFIED));
//                linearLayout.layout(0, 0, linearLayout.getMeasuredWidth(), linearLayout.getMeasuredHeight());
//                Bitmap bitmap = Bitmap.createBitmap(linearLayout.getDrawingCache());
//                linearLayout.setDrawingCacheEnabled(false);
//                shareImg.setImageBitmap(bitmap);

                relContent.setDrawingCacheEnabled(true);
//                relContent.measure(View.MeasureSpec.makeMeasureSpec(0, View.MeasureSpec.UNSPECIFIED),
//                        View.MeasureSpec.makeMeasureSpec(0, View.MeasureSpec.UNSPECIFIED));


                Bitmap bitmap = Bitmap.createBitmap(relContent.getWidth(),relContent.getHeight(), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmap);
                relContent.draw(canvas);

                shareImg.setImageBitmap(bitmap);
            }
        });



    }



}
