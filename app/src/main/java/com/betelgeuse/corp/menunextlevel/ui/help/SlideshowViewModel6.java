package com.betelgeuse.corp.menunextlevel.ui.help;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SlideshowViewModel6 extends ViewModel {
    private final MutableLiveData<String> mText;

    public SlideshowViewModel6() {
        mText = new MutableLiveData<>();
        mText.setValue("ПОМОЩ");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
