package com.example.zeilin.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity{
    private EditText editEmail;
    private EditText editPassword;
    private Button btnLogin;
    String username,pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initUI();
    }


    private void initUI() {
        editEmail = (EditText)findViewById(R.id.edtEmail);
        editEmail.getText();
        editPassword = (EditText)findViewById(R.id.edtPassword);
        editPassword.getText();
        btnLogin=(Button)findViewById(R.id.btn_login);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v==btnLogin){
                    if (editEmail.getText().toString().equals(username)&&
                            editPassword.getText().toString().equals(pass)){
                        Toast.makeText(MainActivity.this, "Login Berhasil", Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(getApplicationContext(),MenuActivity.class);
                        startActivity(intent);
                    }else {
                        Toast.makeText(MainActivity.this, "Login Gagal", Toast.LENGTH_SHORT).show();
                    }
                    }
                    }
        });
        username="banyumas";
        pass="banyumas";
        }
    public void registerb (View view){
        Intent intent = new Intent(getApplicationContext(),Register.class);
        startActivity(intent);
    }


}
