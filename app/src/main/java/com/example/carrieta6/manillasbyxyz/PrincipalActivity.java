package com.example.carrieta6.manillasbyxyz;

import android.app.job.JobScheduler;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;

public class PrincipalActivity extends AppCompatActivity {

    private Spinner sptipo;
    private Spinner spDivisa;
    private String arraysptipo[];
    private String arraysDivisa[];
    private Resources resources;
    private EditText numManillas;
    private RadioButton rbCuero;
    private RadioButton rbCuerda;
    private RadioButton rbMartillo;
    private RadioButton rbAncla;
    private EditText resultado;



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

        numManillas = (EditText) findViewById(R.id.txtNumManilla);
        resultado = (EditText) findViewById(R.id.txtValorLiquidar);
        rbCuero = (RadioButton) findViewById(R.id.rbCuero);
        rbCuerda = (RadioButton) findViewById(R.id.rbAncla);




    }

    public void liquidar(View v){
        int cantidad = Integer.parseInt(numManillas.getText().toString());
        int moneda = spDivisa.getSelectedItemPosition();
        int metal = sptipo.getSelectedItemPosition();

        if(rbCuero.isChecked()==true && rbMartillo.isChecked()==true && (metal==0 || metal==1) && moneda==1){

            resultado.setText("holi");
        }




    }
}
