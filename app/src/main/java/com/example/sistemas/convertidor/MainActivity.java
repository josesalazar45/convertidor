package com.example.sistemas.convertidor;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText editText1;
    private RadioButton radioButton1, radioButton2, radioButton3, radioButton4, radioButton5, radioButton6;
    private TextView textView3;

    public final static double dolar = 2858.88;
    public final static double euro = 3541.363;
    public final static double libras_esterlinas = 3973.033;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText1 = (EditText) findViewById(R.id.et1);
        radioButton1 = (RadioButton) findViewById(R.id.rb1);
        radioButton2 = (RadioButton) findViewById(R.id.rb2);
        radioButton3 = (RadioButton) findViewById(R.id.rb3);
        radioButton4 = (RadioButton) findViewById(R.id.rb4);
        radioButton5 = (RadioButton) findViewById(R.id.rb5);
        radioButton6 = (RadioButton) findViewById(R.id.rb6);
        textView3 = (TextView) findViewById(R.id.tv3);

    }

    public void conversiones(View view) {
        Context context = getApplicationContext();
        int d = Toast.LENGTH_SHORT;
        String cantidad = editText1.getText().toString();

        int numero1 = Integer.parseInt(cantidad);

        if (radioButton1.isChecked() == true) {
            double valor = numero1 * dolar;
            String resultado = String.valueOf(valor);
            String n1 = (String) getText(R.string.text1);
            textView3.setText(resultado);
            Toast toast = Toast.makeText(context, cantidad + n1 + resultado + " Pesos", d);
            toast.show();

        } else if (radioButton2.isChecked() == true) {
            double valor = numero1 / dolar;
            String resultado = String.valueOf(valor);
            String n1 = (String) getText(R.string.text2);
            textView3.setText(resultado);
            Toast toast = Toast.makeText(context, cantidad + n1 + resultado + " dollars", d);
            toast.show();

        } else if (radioButton3.isChecked() == true) {
            double valor = Math.round((numero1 * euro) * 100d) / 100d;
            String resultado = String.valueOf(valor);
            String n1 = (String) getText(R.string.text3);
            textView3.setText(resultado);
            Toast toast = Toast.makeText(context, cantidad + n1 + resultado + " Pesos", d);
            toast.show();

        } else if (radioButton4.isChecked() == true) {
            double valor = Math.round((numero1 / euro) * 100d) / 100d;
            String resultado = String.valueOf(valor);
            String n1 = (String) getText(R.string.text4);
            textView3.setText(resultado);
            Toast toast = Toast.makeText(context, cantidad + n1 + resultado + " euros", d);
            toast.show();

        } else if (radioButton5.isChecked() == true) {
            double valor = Math.round((numero1 * libras_esterlinas) * 100d) / 100d;
            String resultado = String.valueOf(valor);
            String n1 = (String) getText(R.string.text5);
            textView3.setText(resultado);
            Toast toast = Toast.makeText(context, cantidad + n1 + resultado + " pesos", d);
            toast.show();

        } else if (radioButton6.isChecked() == true) {
            double valor = Math.round((numero1 / libras_esterlinas) * 100d) / 100d;
            String resultado = String.valueOf(valor);
            String n1 = (String) getText(R.string.text6);
            textView3.setText(resultado);
            Toast toast = Toast.makeText(context, cantidad + n1 + resultado + " sterling", d);
            toast.show();
        }
    }

    public void acerca(View view) {
        Intent i = new Intent(this, Acerca_de.class);
        startActivity(i);
    }
}