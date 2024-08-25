package com.example.resrfulapi;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.resrfulapi.databinding.FragmentTestBinding;

public class FragmentTest extends Fragment {
    private FragmentTestBinding fragmentTestBinding;
    private OnBackListener listener;

    public void setListener(OnBackListener listener) {
        this.listener = listener;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        fragmentTestBinding = FragmentTestBinding.inflate(inflater, container, false);
        return fragmentTestBinding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        init();
    }

    private void init() {
        fragmentTestBinding.btnBack.setOnClickListener(v -> {
            listener.onBack();
        });

        fragmentTestBinding.btnAction.setOnClickListener(v -> {
            Toast.makeText(getActivity(), "Em la bup mang non", Toast.LENGTH_SHORT).show();
        });
    }

    public interface OnBackListener {
        void onBack();
    }
}
