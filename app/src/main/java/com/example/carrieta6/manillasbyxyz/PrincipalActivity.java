package com.example.carrieta6.manillasbyxyz;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class PrincipalActivity extends AppCompatActivity {

    private Spinner sptipo;
    private Spinner spDivisa;
    private String arraysptipo[];
    private String arraysDivisa[];
    private Resources resources;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        sptipo = (Spinner) findViewById(R.id.spMetal);
        spDivisa = (Spinner) findViewById(R.id.spDivisa);
        resources  = this.getResources();
        arraysptipo = resources.getStringArray(R.array.sptipos);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,arraysptipo);
        sptipo.setAdapter(adapter);

        arraysDivisa = resources.getStringArray(R.array.spDivisa);
        ArrayAdapter<String> adapterDivisa = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,arraysDivisa);
        spDivisa.setAdapter(adapterDivisa);

    }
}
