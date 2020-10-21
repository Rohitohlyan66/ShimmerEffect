package com.example.shimmereffect;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.facebook.shimmer.ShimmerFrameLayout;

public class MainActivity extends AppCompatActivity {

    ShimmerFrameLayout layout;
    ImageView imageView;
    TextView title,subtitle;

    Handler handler=new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        layout=findViewById(R.id.shimmer);
        imageView=findViewById(R.id.image_view);
        title=findViewById(R.id.title);
        subtitle=findViewById(R.id.subtitle);

        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                layout.stopShimmer();
                layout.hideShimmer();
                layout.setVisibility(View.GONE);


                imageView.setVisibility(View.VISIBLE);
                title.setVisibility(View.VISIBLE);
                subtitle.setVisibility(View.VISIBLE);
            }
        },8000);

    }
}