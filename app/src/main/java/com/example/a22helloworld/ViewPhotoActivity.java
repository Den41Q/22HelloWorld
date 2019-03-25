package com.example.a22helloworld;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

import androidx.appcompat.app.AppCompatActivity;

public class ViewPhotoActivity extends AppCompatActivity {

    private Button button_next;
    private Button button_back;
    private TextView textView_number;
    Random random = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_photo);

        button_next = findViewById(R.id.button_next);
        button_back = findViewById(R.id.button_back);

        button_next.setOnClickListener(clickListener_next);
        button_back.setOnClickListener(clickListener_back);

        textView_number = findViewById(R.id.textView_number);
        nextActivity();
    }

    private View.OnClickListener clickListener_next = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(ViewPhotoActivity.this,
                    ViewPhotoActivity.class );
            startActivity(intent);
        }
    };

    private void nextActivity() {
        textView_number.setText("http://myfile.org/" +
                String.valueOf(random.nextInt(101)));
    }

    private View.OnClickListener clickListener_back = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            finish();
        }
    };
}