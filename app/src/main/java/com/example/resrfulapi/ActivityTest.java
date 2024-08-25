package com.example.resrfulapi;

import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.example.resrfulapi.databinding.ActivityTestBinding;

public class ActivityTest extends AppCompatActivity {
    ActivityTestBinding binding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityTestBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnTest.setOnClickListener(v -> {
            binding.container.setVisibility(View.VISIBLE);

            FragmentTest fragmentTest = new FragmentTest();
            fragmentTest.setListener(() -> {
                getSupportFragmentManager().beginTransaction().remove(fragmentTest).commit();
                binding.container.setVisibility(View.GONE);
            });
            FragmentManager manager = getSupportFragmentManager();
            FragmentTransaction transaction = manager.beginTransaction();
            transaction.replace(R.id.container, fragmentTest, null);
            transaction.addToBackStack(null);
            transaction.commit();
        });
    }
}
