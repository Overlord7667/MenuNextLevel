package com.betelgeuse.corp.menunextlevel.ui.contacts;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SlideshowViewModel4 extends ViewModel {
    private final MutableLiveData<String> mText;

    public SlideshowViewModel4() {
        mText = new MutableLiveData<>();
        mText.setValue("КОНТАКТЫ");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
