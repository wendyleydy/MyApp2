package com.example.myapp2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //PONER LOS COMPONENTES A UTILIZAR:
    private EditText et1;
    private EditText et2;
    private EditText et3;
    private TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //RECUPERAR LOS DATOS QUE EL USUARIO HA ASIGNADOD DENTRO DE CADA UNO DE LOS COMPONENTES:
        //HACER CASTING PARA TRATAR LOS DATOS DE TIPO EDIT TEXT
        et1 = (EditText)findViewById(R.id.txt_matematicas);
        et2 = (EditText)findViewById(R.id.txt_fisica);
        et3 = (EditText)findViewById(R.id.txt_quimica);
        tv1 = (TextView)findViewById(R.id.tv_estatus);
    }
    //VOID: RETORNA UN VALOR ESTE METODO, PUBLIC: ENCAPSULA PARA PODER IMPORTAR LA PARTE GRAFICA
    public  void estatus(View view){
   //CREAR LOS ESPACIOS EN MEMORIA:
        String Matematicas_String =et1.getText().toString();   //Matematicas_String: ES UNA VARIABLE CON ESE NOMBRE ARA IDENTIFICAR CUAL ES STRING Y CUAL ES ENTERO: Matematicas_String: ES STRING IGUAL AL OBJETO et1
        String Fisica_String =et2.getText().toString();
        String Quimica_String =et3.getText().toString();

        //PASAR LOS VALORES QUE EL USUARIO HA INTRODUCIDO A UN VALOR ENTERO
        int Matematicas_int = Integer.parseInt(Matematicas_String);
        int Fisica_int = Integer.parseInt(Fisica_String);
        int Quimica_int = Integer.parseInt(Quimica_String);

        //CALCULAR EL PROMEDIO
        int promedio = (Matematicas_int + Fisica_int + Quimica_int) /3;

        //ESTRUCTURA CONDICIONAL
        if (promedio >= 6){
            tv1.setText("Estatus aprobado con " + promedio);
        } else if (promedio <=5)    {
            tv1.setText("Estatus Reprobado con " + promedio);
        }
    }
}
