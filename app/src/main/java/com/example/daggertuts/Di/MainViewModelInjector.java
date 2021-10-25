package com.example.daggertuts.Di;

import com.example.daggertuts.basics.MainViewModel;

import dagger.Component;


@Component
public interface MainViewModelInjector {
    MainViewModel getMainViewModel();
}
