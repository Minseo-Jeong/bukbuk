package com.example.myapplication;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btnSound, btnQuiz, btnCheck;
    TextView textSummary,textName,sum;
    ImageView imageView, animalImage;
    MediaPlayer mediaPlayer;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSound = findViewById(R.id.btnSound);
        textSummary = findViewById(R.id.textSummary);
        textName = findViewById(R.id.textName);
        imageView = findViewById(R.id.imageView);
        editText = findViewById(R.id.editText);
        animalImage = findViewById(R.id.animalImage);
        sum = findViewById(R.id.sum);
        btnQuiz = findViewById(R.id.btnQuiz);
        btnCheck = findViewById(R.id.btnCheck);

        btnSound.setOnClickListener(new View.OnClickListener() {//설정화면
            @Override
            public void onClick(View v) {
                if(mediaPlayer != null){
                    IsPlaying();
                }
                else{
                    mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.no);
                    IsPlaying();
                }
            }

            public void IsPlaying() {
                if(!mediaPlayer.isPlaying()){
                    mediaPlayer.start();
                    btnSound.setText("정지");
                }
                else{
                    btnSound.setText("소리 듣기");
                    mediaPlayer.stop();
                    mediaPlayer.release();
                    mediaPlayer = null;
                }
            }

        });
    //---------------------------------------------------------------설명---------------------------------------------------------------
//     btnQuiz.setOnClickListener(new View.OnClickListener() {
//         @Override
//         public void onClick(View v) {
//             //음성 랜던 출력
//             if(mediaPlayer != null){
//                 IsPlaying();
//             }
//             else{
//                 mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.no);
//                 IsPlaying();
//             }
//         }
//         public void IsPlaying() {
//             if(!mediaPlayer.isPlaying()){
//                 mediaPlayer.start();
//             }
//             else{
//                 mediaPlayer.stop();
//                 mediaPlayer.release();
//                 mediaPlayer = null;
//             }
//         }
//     });

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (mediaPlayer != null){
            mediaPlayer.release();
            mediaPlayer = null;
        }
    }
    //소리 재생

}
