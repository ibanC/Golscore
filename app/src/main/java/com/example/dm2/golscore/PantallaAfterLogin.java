package com.example.dm2.golscore;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;

public class PantallaAfterLogin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla_after_login);

    }
    public void salir(View v)
    {
        FirebaseAuth.getInstance().signOut();
        startActivity(new Intent(PantallaAfterLogin.this,LoginActivity.class));
    }
}
