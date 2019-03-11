package spencerstudios.com.uitestingapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SignInActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        if(getSupportActionBar()!=null) {
            getSupportActionBar().hide();
        }
    }
}
