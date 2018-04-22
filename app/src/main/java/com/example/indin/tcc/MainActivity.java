package com.example.indin.tcc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button btn_cad;
    private Button btn_entrar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_cad = (Button) findViewById(R.id.btn_cadastrar);
        btn_entrar = (Button) findViewById(R.id.btn_entrar);

        btn_cad.setOnClickListener(this);
        btn_entrar.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v==btn_cad){
            Intent it = new Intent(this, cad.class);
            startActivity(it);
        }
        if(v==btn_entrar)
        {
            Intent it = new Intent(this, home.class);
            startActivity(it);
        }
    }
}
