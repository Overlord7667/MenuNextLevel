package com.betelgeuse.corp.menunextlevel.ui.about;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SlideshowViewModel2 extends ViewModel {
    private final MutableLiveData<String> mText;

    public SlideshowViewModel2() {
        mText = new MutableLiveData<>();
        mText.setValue("О НАС");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
