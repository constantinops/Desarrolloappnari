package com.example.omar.nari;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import OpenHelper.SQLite_OpenHelper;




public class Registro extends AppCompatActivity {
    Button  registro;
    EditText txtNom,txtPass,txtCor;
    SQLite_OpenHelper helper=new SQLite_OpenHelper(this,"dbUsuario",null,1);



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);


        registro=(Button)findViewById(R.id.buttonRegistro);
        txtNom=(EditText)findViewById(R.id.txtNombre);
        txtPass=(EditText)findViewById(R.id.txtPassword);
        txtCor=(EditText)findViewById(R.id.txtCorreo);

        registro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                helper.abrir();
                helper.insertarReg(String.valueOf(txtNom.getText()),
                        String.valueOf(txtPass.getText()),
                        String.valueOf(txtCor.getText()));
                helper.cerrar();
                Toast.makeText(getApplicationContext(),"Registro almacenado con exito",
                        Toast.LENGTH_LONG).show();

                Intent i=new Intent(getApplicationContext(),login.class);
                startActivity(i);



            }
        });



    }


}
