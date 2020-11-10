package com.example.ejemploconstraint;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


import java.util.ArrayList;
import java.util.Date;

public class MainActivity extends AppCompatActivity {
   ArrayList<Usuario> ar = new ArrayList<>();

    String nombre;
    String pass;
    Intent ii;

    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Button btnRegistro =(Button) findViewById(R.id.btnRegistro);
        //btnRegistro.setOnClickListener(new View.OnClickListener() {
          // @Override
            //public void onClick(View view) {
              //
            //}
        //});
         ii = new Intent(getApplicationContext(),Registro.class);
        startActivityForResult(ii,0);

    }
    public void IniciarSecion(View v){

        //DAOUsuarios dao = new DAOUsuarios(getApplicationContext());
        //Usuario usuarioAutenticado = dao.autenticar(new Usuario(
                //((EditText) findViewById(R.id.txtUser)).getText().toString(),
                //((EditText) findViewById(R.id.txtPass)).getText().toString()
        //));
        //if(usuarioAutenticado.getID()!=0){
          ///  Intent intent = new Intent(MainActivity.this, MainActivity);
        //}

        nombre = ((EditText) findViewById(R.id.txtUser)).getText().toString();
        pass = ((EditText) findViewById(R.id.txtPass)).getText().toString();
        ii = getIntent();
        Usuario u= ii.getParcelableExtra("u");
        if(nombre.equals(u.getNombre()) && pass.equals(u.getPass())){
           mToast();

        }

    }
    public void abrir(View v){
        Intent intent = new Intent(v.getContext(),Registro.class);
        startActivityForResult(intent,0);
    }
    public void mToast(){
        Toast.makeText(MainActivity.this,"Usuario Correcto",Toast.LENGTH_SHORT).show();
    }
    public void mAlert(View v){
        AlertDialog.Builder b = new AlertDialog.Builder(this);
        b.setCancelable(true);
        b.setTitle("OK");
        b.setMessage("Aun no te has registrado");
        b.show();
    }

}