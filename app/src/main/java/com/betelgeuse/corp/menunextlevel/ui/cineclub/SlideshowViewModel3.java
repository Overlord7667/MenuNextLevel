package com.betelgeuse.corp.menunextlevel.ui.cineclub;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SlideshowViewModel3 extends ViewModel {
    private final MutableLiveData<String> mText;

    public SlideshowViewModel3() {
        mText = new MutableLiveData<>();
        mText.setValue("CINECLUB");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
