package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.widget.TextView;

import com.example.myapplication.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    TextView tvHelloWorld;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
        ActivityMainBinding activityMainBinding= DataBindingUtil.setContentView(this,R.layout.activity_main);
//        tvHelloWorld=(findViewById(R.id.tvHelloWorld));
        User user=new User("Fazil","9047833240");
//        tvHelloWorld.setText(user.getName());
        activityMainBinding.setUser(user);
    }
}
