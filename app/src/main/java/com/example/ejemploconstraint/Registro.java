package com.example.ejemploconstraint;

import androidx.annotation.MainThread;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class Registro extends AppCompatActivity {
    String nombre,correo,pass;
    String telefono;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_registro);
        Button btnGuardar = (Button)findViewById(R.id.btnAgregar);
        btnGuardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Registro.this,MainActivity.class);
                i.putExtra("u",u);
                nombre = ((EditText) findViewById(R.id.txtNombre)).getText().toString();
                telefono= ((EditText) findViewById(R.id.txtTelefono)).getText().toString();
                correo = ((EditText) findViewById(R.id.txtEmail)).getText().toString();
                pass = ((EditText) findViewById(R.id.txtContrasena)).getText().toString();}
                Usuario u = new Usuario(nombre,correo,pass,telefono);
        });
    }
   // public  void Guardar(View v){
    //Intent it = new Intent(Registro.this,MainActivity.class);
    //it.putExtra("u",user());
    //startActivity(it);
       // DAOUsuarios dao = new DAOUsuarios(getApplicationContext());

        //if (dao.insert(user())!=-1);{

        //}
    //}
    public Usuario user(){
        nombre = ((EditText) findViewById(R.id.txtNombre)).getText().toString();
        telefono= ((EditText) findViewById(R.id.txtTelefono)).getText().toString();
        correo = ((EditText) findViewById(R.id.txtEmail)).getText().toString();
        pass = ((EditText) findViewById(R.id.txtContrasena)).getText().toString();
        Usuario u = new Usuario(nombre,correo,pass,telefono);
    return u;
    }
}