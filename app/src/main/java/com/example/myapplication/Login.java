package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Login extends AppCompatActivity {


    EditText edUserName;
    EditText edPassword;
    Button btn;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        edUserName = findViewById(R.id.editTextLoginUsername);
        edPassword = findViewById(R.id.editTextLoginPassword);
        btn = findViewById(R.id.buttonLogin);

        tv= findViewById(R.id.textViewNewUser);
        //                        startActivity(new Intent(LoginActivity.this, HomeActivity.class));

        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Login.this, SignUpActivity.class);
                startActivity(intent);
//                System.out.println("TTTTTTTTTTTTSFDSFgsdg;oidfl;gbjdlfigu");
//                        Toast.makeText(getApplicationContext(),"Wrong Password and UserName..",Toast.LENGTH_SHORT).show();


            }
        });






        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String userName = edUserName.getText().toString();
                String password = edPassword.getText().toString();
                Toast.makeText(
                        getApplicationContext(),
                        "User Name: " +userName +" Password: " + password,
                        Toast.LENGTH_SHORT
                ).show();

//                startActivity(new Intent(LoginActivity.this, HomeActivity.class));
//                if (userName.length()==0 || password.length()==0){
//                    Toast.makeText(getApplicationContext(),"Please Fill All The Data Field.",Toast.LENGTH_SHORT).show();
//                }else {
//                    if (db.login(userName,password)==1){
//                        Toast.makeText(getApplicationContext(),"Login Success Tex.",Toast.LENGTH_SHORT).show();
//                        SharedPreferences preferences = getSharedPreferences("shared_prefs", Context.MODE_PRIVATE);
//                        SharedPreferences.Editor editor = preferences.edit();
//                        editor.putString("usernamr",userName);
//                        editor.apply();
//                        startActivity(new Intent(LoginActivity.this, HomeActivity.class));
//                    }else {
//                        Toast.makeText(getApplicationContext(),"Wrong Password and UserName..",Toast.LENGTH_SHORT).show();
//                    }
//                }          ;
            }
        });






    }
}