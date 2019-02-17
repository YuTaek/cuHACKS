package com.example.moodytoons;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

public class MainActivity extends YouTubeBaseActivity{

    YouTubePlayerView youTubePlayerView;
    Button b;
    YouTubePlayer.OnInitializedListener onInitializedListener;

    private Button button;
    Bundle bundle;
    String value;
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        b = findViewById(R.id.bn);
//        youTubePlayerView= (YouTubePlayerView) findViewById(R.id.yt);
//        onInitializedListener = new YouTubePlayer.OnInitializedListener() {
//            @Override
//            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
//                youTubePlayer.loadVideo("C4tOK1ZVBBE");
//            }
//
//            @Override
//            public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {
//
//            }
//        };
//
//        b.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                youTubePlayerView.initialize(PlayerConfig.API_KEY,onInitializedListener);
//            }
//        });
        Button Happy = findViewById(R.id.happy);
        Happy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                youTubePlayerView= (YouTubePlayerView) findViewById(R.id.yt);
//                onInitializedListener = new YouTubePlayer.OnInitializedListener() {
//                    @Override
//                    public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
//                        youTubePlayer.loadVideo("c7rCyll5AeY");
//                    }
//
//                    @Override
//                    public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {
//
//                    }
//                };
//                youTubePlayerView.initialize(PlayerConfig.API_KEY,onInitializedListener);
                // TODO Auto-generated method stub
                // Get value from EditText from main_activity layout
                bundle.putString("value", value);

                /*
                 * Intent is just like glue which helps to navigate one activity
                 * to another.
                 */Intent intent = new Intent(MainActivity.this,
                        HappyActivity.class);
                // Pass data to AnotherActivity
                intent.putExtras(bundle);
                startActivity(intent); // startActivity allow you to move
            }
        });

//        button =  findViewById(R.id.happy);
//        // Initializing EditText view   // Bundle
//        bundle = new Bundle();
//        button.setOnClickListener(new OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                // TODO Auto-generated method stub
//                // Get value from EditText from main_activity layout
//               // bundle.putString("value", value);
//
//
////                 * Intent is just like glue which helps to navigate one activity
////                 * to another.
////                 Intent intent = new Intent(MainActivity.this,
////                        HappyActivity.class);
////                 Pass data to AnotherActivity
////                intent.putExtras(bundle);
////                startActivity(intent); // startActivity allow you to move
//                Button Happy = findViewById(R.id.happy);
//                youTubePlayerView= (YouTubePlayerView) findViewById(R.id.yt);
//                onInitializedListener = new YouTubePlayer.OnInitializedListener() {
//                    @Override
//                    public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
//                        youTubePlayer.loadVideo("c7rCyll5AeY");
//                    }
//
//                    @Override
//                    public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {
//
//                    }
//                };
//
//                Happy.setOnClickListener(new View.OnClickListener() {
//                    @Override
//                    public void onClick(View v) {
//                        youTubePlayerView.initialize(PlayerConfig.API_KEY,onInitializedListener);
//                    }
//                });
//
//            }
//        });

        button =  findViewById(R.id.sad);
        // Initializing EditText view   // Bundle
        bundle = new Bundle();
        button.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                // Get value from EditText from main_activity layout
                bundle.putString("value", value);

                /*
                 * Intent is just like glue which helps to navigate one activity
                 * to another.
                 */Intent intent = new Intent(MainActivity.this,
                        SadActivity.class);
                // Pass data to AnotherActivity
                intent.putExtras(bundle);
                startActivity(intent); // startActivity allow you to move
            }
        });

        button =  findViewById(R.id.Sleepy);
        // Initializing EditText view   // Bundle
        bundle = new Bundle();
        button.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                // Get value from EditText from main_activity layout
                bundle.putString("value", value);

                /*
                 * Intent is just like glue which helps to navigate one activity
                 * to another.
                 */Intent intent = new Intent(MainActivity.this,
                        SleepyActivity.class);
                // Pass data to AnotherActivity
                intent.putExtras(bundle);
                startActivity(intent); // startActivity allow you to move
            }
        });

        button =  findViewById(R.id.Angry);
        // Initializing EditText view   // Bundle
        bundle = new Bundle();
        button.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                // Get value from EditText from main_activity layout
                bundle.putString("value", value);

                /*
                 * Intent is just like glue which helps to navigate one activity
                 * to another.
                 */Intent intent = new Intent(MainActivity.this,
                        AngryActivity.class);
                // Pass data to AnotherActivity
                intent.putExtras(bundle);
                startActivity(intent); // startActivity allow you to move
            }
        });
    }

}
