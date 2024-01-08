package com.betelgeuse.corp.menunextlevel.ui.dolby;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.betelgeuse.corp.menunextlevel.databinding.FragmentSlideshowBinding;

public class DolbyFragment extends Fragment {
    private FragmentSlideshowBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        SlideshowViewModel5 slideshowViewModel5 =
                new ViewModelProvider(this).get(SlideshowViewModel5.class);

        binding = com.betelgeuse.corp.menunextlevel.databinding.FragmentSlideshowBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textSlideshow;
        slideshowViewModel5.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}
