package rvce.hackathon.socialservice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Spinner;

public class SignUpActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        findViewById(R.id.userTypeSg).setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        RadioButton r=(RadioButton)v;
        r.setChecked(true);
    }
}
