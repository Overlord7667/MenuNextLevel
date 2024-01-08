package com.betelgeuse.corp.menunextlevel.ui.message;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SlideshowViewModel7 extends ViewModel {
    private final MutableLiveData<String> mText;

    public SlideshowViewModel7() {
        mText = new MutableLiveData<>();
        mText.setValue("УВЕДОМЛЕНИЯ");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
