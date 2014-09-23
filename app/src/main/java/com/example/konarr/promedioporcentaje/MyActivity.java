package com.example.konarr.promedioporcentaje;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MyActivity extends Activity {

    private TextView lbl_promedio;
    private EditText txt_nota1, txt_por1, txt_nota2, txt_por2, txt_nota3, txt_por3, txt_nota4, txt_por4, txt_nota5, txt_por5;
    private Button bt_calcular;

    //coment
    //two ultimo

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);

        lbl_promedio = (TextView) findViewById(R.id.lbl_promedio);
        txt_nota1 = (EditText) findViewById(R.id.txt_nota1);
        txt_por1 = (EditText) findViewById(R.id.txt_por1);
        txt_nota2 = (EditText) findViewById(R.id.txt_nota2);
        txt_por2 = (EditText) findViewById(R.id.txt_por2);
        txt_nota3 = (EditText) findViewById(R.id.txt_nota3);
        txt_por3 = (EditText) findViewById(R.id.txt_por3);
        txt_nota4 = (EditText) findViewById(R.id.txt_nota4);
        txt_por4 = (EditText) findViewById(R.id.txt_por4);
        txt_nota5 = (EditText) findViewById(R.id.txt_nota5);
        txt_por5 = (EditText) findViewById(R.id.txt_por5);
        bt_calcular = (Button) findViewById(R.id.bt_calcular);

    }

    public void onClickCalcular(View view){
        float nota1 = Float.valueOf(txt_nota1.getText().toString());
        float por1 = Float.valueOf(txt_por1.getText().toString());
        float nota2 = Float.valueOf(txt_nota2.getText().toString());
        float por2 = Float.valueOf(txt_por2.getText().toString());
        float nota3 = Float.valueOf(txt_nota3.getText().toString());
        float por3 = Float.valueOf(txt_por3.getText().toString());
        float nota4 = Float.valueOf(txt_nota4.getText().toString());
        float por4 = Float.valueOf(txt_por4.getText().toString());
        float nota5 = Float.valueOf(txt_nota5.getText().toString());
        float por5 = Float.valueOf(txt_por5.getText().toString());


        float resultado = ((nota1 * por1)/100) + ((nota2 * por2)/100) +
                ((nota3 * por3)/100) + ((nota4 * por4)/100) + ((nota5 * por5)/100);
        lbl_promedio.setText(String.valueOf(resultado));
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.my, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
