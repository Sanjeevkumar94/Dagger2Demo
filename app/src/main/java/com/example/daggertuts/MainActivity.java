package com.example.daggertuts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.daggertuts.Di.DaggerMainViewModelInjector;
import com.example.daggertuts.basics.MainViewModel;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    Button connect;

    @Inject
    MainViewModel mainViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView  = findViewById(R.id.textView);
        connect  = findViewById(R.id.connect);

        DaggerMainViewModelInjector.create().injectFields(this);

        connect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(mainViewModel.fetchData());
            }
        });
    }
}