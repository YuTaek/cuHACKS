package com.example.moodytoons;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

public class SleepyActivity extends YouTubeBaseActivity{

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
            setContentView(R.layout.activity_sleepy2);

            b = findViewById(R.id.play);
            youTubePlayerView= (YouTubePlayerView) findViewById(R.id.yt);
            onInitializedListener = new YouTubePlayer.OnInitializedListener() {
                @Override
                public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                    youTubePlayer.loadVideo("b-7qGd5jM2s");
                }

                @Override
                public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {

                }
            };

            b.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    youTubePlayerView.initialize(PlayerConfig.API_KEY,onInitializedListener);
                }
            });
        }
    }
