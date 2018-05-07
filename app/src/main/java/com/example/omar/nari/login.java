package com.example.omar.nari;

import android.content.Intent;
import android.database.Cursor;
import android.database.SQLException;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import OpenHelper.SQLite_OpenHelper;

public class login extends AppCompatActivity {
    TextView registrate;
    Button ingresar;

    SQLite_OpenHelper helper=new SQLite_OpenHelper(this,"dbUsuario",null,1);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        registrate=(TextView)findViewById(R.id.textRegistro);
        registrate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent x=new Intent(getApplicationContext(),Registro.class);
                startActivity(x);
            }
        });




        ingresar=(Button)findViewById(R.id.bottonAcceder);
        ingresar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                EditText txtusu=(EditText)findViewById(R.id.editNombre);
                EditText txtpas=(EditText)findViewById(R.id.editPassword);

                try {

                    Cursor cursor= helper.consultarUsuario(txtusu.getText().toString(), txtpas.getText().toString());
                    if(cursor.getCount()>0){
                        Intent x=new Intent(getApplicationContext(),abcActivity.class);
                        startActivity(x);

                    }else{
                        Toast.makeText(getApplicationContext(),"Usuario y/o Contraseña Incorrecto",Toast.LENGTH_LONG).show();

                    }

                    txtusu.setText("");
                    txtpas.setText("");
                    txtusu.findFocus();

                }catch (SQLException e){
                    e.printStackTrace();


                }

            }
        });



    }
}
