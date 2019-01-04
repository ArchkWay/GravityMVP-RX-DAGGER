package com.example.archek.mvptestrx.truemvp.contracts;

public interface Presenter<V> {
    void attachView(V view);
    void detachView();
}
