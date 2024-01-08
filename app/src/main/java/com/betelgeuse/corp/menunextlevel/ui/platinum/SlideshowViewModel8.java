package com.betelgeuse.corp.menunextlevel.ui.platinum;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SlideshowViewModel8 extends ViewModel {
    private final MutableLiveData<String> mText;

    public SlideshowViewModel8() {
        mText = new MutableLiveData<>();
        mText.setValue("PLATINUM");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
