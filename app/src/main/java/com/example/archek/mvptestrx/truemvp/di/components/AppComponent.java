package com.example.archek.mvptestrx.truemvp.di.components;


import com.example.archek.mvptestrx.truemvp.di.moduls.MvpModule;
import com.example.archek.mvptestrx.truemvp.models.MainModel;
import com.example.archek.mvptestrx.truemvp.presenters.MainPresenter;
import com.example.archek.mvptestrx.truemvp.views.MainActivity;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {MvpModule.class})
public interface AppComponent {
    void inject(MainActivity activity);
    void inject(MainPresenter presenter);
    void inject(MainModel model);
}
