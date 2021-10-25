package com.example.daggertuts.Di;

import com.example.daggertuts.MainActivity;
import com.example.daggertuts.basics.MainViewModel;

import dagger.Component;


@Component
public interface MainViewModelInjector {

    void injectFields(MainActivity mainActivity);
}
