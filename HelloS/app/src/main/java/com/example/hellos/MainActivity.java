package com.example.hellos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button buttonOk=findViewById(R.id.buttonOk);
        buttonOk.setOnClickListener(new MyOnClickListener());
    }

    class MyOnClickListener implements View.OnClickListener{
        @Override
        public void onClick(View view) {

            if(view.getId()==R.id.buttonOk){
                EditText editTextName=findViewById(R.id.editTextName);
                Toast.makeText(MainActivity.this,"欢迎您："+editTextName.getText(), Toast.LENGTH_SHORT).show();
            }
        }
    }

}