package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.myapplication.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

//    TextView tvHelloWorld;
    MyClickHandlers myClickHandlers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
        ActivityMainBinding activityMainBinding= DataBindingUtil.setContentView(this,R.layout.activity_main);
//        tvHelloWorld=(findViewById(R.id.tvHelloWorld));
        User user=new User("Fazil","9047833240");
//        tvHelloWorld.setText(user.getName());


        activityMainBinding.setUser(user);

        myClickHandlers=new MyClickHandlers(this);
        activityMainBinding.setHandler(myClickHandlers);
    }

    public class MyClickHandlers{
        Context context;
        public MyClickHandlers(Context context) {
        }

        public void onClick(View view)
        {
            Toast.makeText(getApplicationContext(), "FAB clicked!", Toast.LENGTH_SHORT).show();
        }
    }
}
