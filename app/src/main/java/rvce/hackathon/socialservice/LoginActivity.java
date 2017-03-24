package rvce.hackathon.socialservice;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener{

    EditText emailEt,passwordEt;
    Spinner userTypeSpn;
    ProgressDialog progressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        emailEt=(EditText)findViewById(R.id.emailEt);
        passwordEt=(EditText)findViewById(R.id.passwordEt);
        userTypeSpn=(Spinner)findViewById(R.id.userTypeSpn);
        findViewById(R.id.signInBtn).setOnClickListener(this);
        findViewById(R.id.googleSignInBtn).setOnClickListener(this);
        findViewById(R.id.createAccTv).setOnClickListener(this);
        progressDialog=new ProgressDialog(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.signInBtn:
                String email,password;
                email=emailEt.getText().toString();
                password=passwordEt.getText().toString();
                if(email.isEmpty()){
                    emailEt.setError("Please Enter Email");
                    passwordEt.requestFocus();
                    return;
                }
                 if(password.isEmpty()){
                     passwordEt.setError("Please Enter Password");
                     passwordEt.requestFocus();
                     return;
                 }

                break;
            case R.id.googleSignInBtn:
                break;
            case R.id.createAccTv:
                startActivity(new Intent(this,SignUpActivity.class));
                break;
        }
    }
}
