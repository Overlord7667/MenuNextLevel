package com.betelgeuse.corp.menunextlevel.ui.favorites;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SlideshowViewModel1 extends ViewModel {

    private final MutableLiveData<String> mText;

    public SlideshowViewModel1() {
        mText = new MutableLiveData<>();
        mText.setValue("ИЗБРАННОЕ");
    }

    public LiveData<String> getText() {
        return mText;
    }
}