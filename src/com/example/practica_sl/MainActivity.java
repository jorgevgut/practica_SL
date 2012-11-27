package com.example.practica_sl;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Handler_sqlite helper = new Handler_sqlite(this);
        
        TextView text = (TextView)findViewById(R.id.text);
        helper.abrir();
        //helper.insertarReg("Jorge", "12345");
        //helper.insertarReg("marco","polo");
       // helper.insertarReg("usuarioX", "passwordprueba");
        String x[] = helper.leer();
        text.setText(x[0]);
        helper.cerrar();
        
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
}
