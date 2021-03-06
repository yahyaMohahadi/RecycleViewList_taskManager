package com.example.recycleviewlist.activity;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.recycleviewlist.fragment.LoginFragment;
import com.example.recycleviewlist.database.user.UserRepository;

public class LoginActivity extends SingleFragmentActivity {
    @Override
    Fragment newFragment() {
        return new LoginFragment();
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        UserRepository.getInstance(getApplicationContext());

    }
}
