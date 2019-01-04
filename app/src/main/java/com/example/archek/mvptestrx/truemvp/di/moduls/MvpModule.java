package com.example.archek.mvptestrx.truemvp.di.moduls;

import android.content.Context;


import com.example.archek.mvptestrx.truemvp.contracts.MainContract;
import com.example.archek.mvptestrx.truemvp.models.MainModel;
import com.example.archek.mvptestrx.truemvp.presenters.MainPresenter;
import com.example.archek.mvptestrx.truemvp.utils.net.RetrofitProvider;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;

@Module
public class MvpModule {
    Context context;
    public MvpModule(Context context){
        this.context = context;
    }

    @Provides
    @Singleton
    Context provideContext(){
        return context;
    }

    @Provides
    @Singleton
    MainContract.presenter provideMainContractPresenter(Context context){
        return new MainPresenter(context);
    }
    @Provides
    @Singleton
    MainContract.model provideMainContractModel(){
        return new MainModel(context);
    }

    @Provides
    @Singleton
    RetrofitProvider provideRetrofit(){
        return new RetrofitProvider();
    }
}
