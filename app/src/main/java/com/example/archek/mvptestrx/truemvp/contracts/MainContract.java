package com.example.archek.mvptestrx.truemvp.contracts;

import com.example.archek.mvptestrx.truemvp.utils.net.Mock;

import java.util.List;

import io.reactivex.Observable;

public interface MainContract {
    interface view{
        void setMocks(List<Mock> mocks);

    }
    interface presenter extends Presenter<view>{

    }

    interface model {
        Observable <List<Mock>> getMocks();
    }
}
