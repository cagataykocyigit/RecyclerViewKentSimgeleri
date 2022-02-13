package com.example.recyclerviewkentsimgeleri;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.recyclerviewkentsimgeleri.databinding.ActivityDetailsBinding;
import com.example.recyclerviewkentsimgeleri.databinding.ActivityMainBinding;

public class DetailsActivity extends AppCompatActivity {

    public ActivityDetailsBinding binding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Binding
        binding = ActivityDetailsBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        Intent intent = getIntent();
        Landmark selectedLandmark = (Landmark) intent.getSerializableExtra("landmark");
        binding.imageView.setImageResource(selectedLandmark.image);
        binding.textView.setText(selectedLandmark.name);
        binding.textView2.setText(selectedLandmark.country);


    }
}
