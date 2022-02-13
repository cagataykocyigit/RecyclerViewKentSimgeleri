package com.example.recyclerviewkentsimgeleri;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;

import com.example.recyclerviewkentsimgeleri.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class MainActivity extends AppCompatActivity {

    public ActivityMainBinding binding;
    ArrayList<Landmark> landmarkArrayList ;



    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Binding
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        landmarkArrayList = new ArrayList<>();

        //Data
        Landmark pissa = new Landmark("pissa","Italy",R.drawable.pissa);
        Landmark eifel = new Landmark("eifel","France",R.drawable.eiffel);

        landmarkArrayList.add(pissa);
        landmarkArrayList.add(eifel);

        /*
        //Adapter
        ArrayAdapter adapter = new ArrayAdapter(this,
                android.R.layout.simple_list_item_1,
                landmarkArrayList.stream().map(landmark -> landmark.name).collect(Collectors.toList()));
        binding.selam.setAdapter(adapter);


        binding.selam.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(MainActivity.this,DetailsActivity.class);
                intent.putExtra("landmark",landmarkArrayList.get(i));
                startActivity(intent);
            }
        });
        */


        binding.recyclerView.setLayoutManager(new LinearLayoutManager(this));
       LandmarkAdapter landmarkAdapter = new LandmarkAdapter(landmarkArrayList);
       binding.recyclerView.setAdapter(landmarkAdapter);



    }
}