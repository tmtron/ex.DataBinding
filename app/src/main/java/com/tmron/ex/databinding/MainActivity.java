package com.tmron.ex.databinding;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.tmron.ex.databinding.databinding.ActivityMainBinding;
import com.tmron.lib.LibClass;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        LibClass tmp = new LibClass("test from lib");

        binding.tvMain.setText(tmp.getValue());
    }
}
