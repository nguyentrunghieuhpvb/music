package com.nthieu.music_19;

public interface BasePresenter<T> {

    void setView(T view);

    void onStart();

    void onStop();
}
