package com.example.daggertuts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.daggertuts.Di.DaggerMainViewModelInjector;
import com.example.daggertuts.basics.MainViewModel;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    Button connect;
    MainViewModel mainViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView  = findViewById(R.id.textView);
        connect  = findViewById(R.id.connect);
        mainViewModel =  DaggerMainViewModelInjector.create().getMainViewModel();
        connect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(mainViewModel.fetchData());
            }
        });
    }
}