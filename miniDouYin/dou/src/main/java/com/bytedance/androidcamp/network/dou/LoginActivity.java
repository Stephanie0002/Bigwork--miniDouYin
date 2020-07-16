package com.bytedance.androidcamp.network.dou;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {
    private EditText ed_studentID;
    private EditText ed_pass;
    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        initView();
    }

    private void initView(){
        ed_pass = findViewById(R.id.ed_pass);
        ed_studentID = findViewById(R.id.ed_ID);
        btn = findViewById(R.id.log_btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this,MainActivity.class);
                intent.putExtra("data", ed_studentID.getText().toString());
                startActivity(intent);
            }
        });
    }
}
