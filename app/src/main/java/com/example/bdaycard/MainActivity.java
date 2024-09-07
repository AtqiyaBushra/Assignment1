package com.example.bdaycard;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find UI elements by their ID
        TextView birthdayMessage = findViewById(R.id.birthdayMessage);
        ImageView birthdayImage = findViewById(R.id.birthdayImage);
        Button birthdayButton = findViewById(R.id.birthdayButton);

        // Set the button click listener
        birthdayButton.setOnClickListener(v -> {
            // Show a Toast message when the button is clicked
            Toast.makeText(MainActivity.this, "Happy Birthday! 🎉🎂", Toast.LENGTH_SHORT).show();

            // Change the text of the birthday message to something sweeter
            birthdayMessage.setText("Wishing you all the happiness in the world!");

            // Optionally, change the image to another cute birthday image
            birthdayImage.setImageResource(R.drawable.balloons);
        });
    }
}
