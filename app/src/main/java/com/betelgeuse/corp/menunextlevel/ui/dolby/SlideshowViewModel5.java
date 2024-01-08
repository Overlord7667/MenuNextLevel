package com.betelgeuse.corp.menunextlevel.ui.dolby;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SlideshowViewModel5 extends ViewModel {
    private final MutableLiveData<String> mText;

    public SlideshowViewModel5() {
        mText = new MutableLiveData<>();
        mText.setValue("DOLBY DIGITAL");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
