package com.example.indin.tcc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TabHost;

public class cad extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cad);


        TabHost host = (TabHost)findViewById(R.id.tabHost);
        host.setup();

        //Tab 1
        TabHost.TabSpec spec = host.newTabSpec("Paciente");
        spec.setContent(R.id.tab1);
        spec.setIndicator("Pacientes");
        host.addTab(spec);

        //Tab 2
        spec = host.newTabSpec("Psicologo");
        spec.setContent(R.id.tab2);
        spec.setIndicator("Psicologo");
        host.addTab(spec);

    }
}
