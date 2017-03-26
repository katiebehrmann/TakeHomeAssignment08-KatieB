package com.example.android.takehomeassignment08_katieb;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    private FirebaseDatabase database = FirebaseDatabase.getInstance();
    private DatabaseReference infoRef = database.getReference("Movie Information");
    private DatabaseReference titleRef = database.getReference("Movie Title");
    private EditText movieTitle;
    private EditText addGenre;
    private EditText addMinutes;
    private CheckBox inStock;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        movieTitle = (EditText) findViewById(R.id.title_movie);
        addGenre = (EditText) findViewById(R.id.add_genre);
        addMinutes = (EditText) findViewById(R.id.add_minutes);
        inStock = (CheckBox) findViewById(R.id.in_stock);
    }

    public void title(View view) {
        titleRef.setValue(movieTitle.getText().toString());
    }

    public void add(View view) {
        String genre = addGenre.getText().toString();
        int minutes = Integer.parseInt(addMinutes.getText().toString());
        boolean in = inStock.isChecked();

        MovieSorter movie = new MovieSorter(in, minutes, genre);
        infoRef.push().setValue(movie);
    }
}
