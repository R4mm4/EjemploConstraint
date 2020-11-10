package com.example.ejemploconstraint;

import android.os.Parcel;
import android.os.Parcelable;

public class Usuario implements Parcelable {
    private  long ID;
    private  String Nombre,Correo, pass;
    private String Telefono;

    public Usuario(String nombre, String correo, String pass, String telefono) {
        Nombre = nombre;
        Correo = correo;
        this.pass = pass;
        Telefono = telefono;
    }
    public Usuario(String correo, String pass) {
        Correo = correo;
        this.pass = pass;
    }

    public Usuario(int ID, String nombre, String email, String pass,String tel) {
        this.ID = ID;
        this.Nombre= nombre;
        this.Correo = email;
        this.pass = pass;
        this.Telefono=tel;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String correo) {
        Correo = correo;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String telefono) {
        Telefono = telefono;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.Nombre);
        dest.writeString(this.Correo);
        dest.writeString(this.pass);
        dest.writeInt(Integer.parseInt(this.Telefono));
    }

    protected Usuario(Parcel in) {
        this.Nombre = in.readString();
        this.Correo = in.readString();
        this.pass = in.readString();
        this.Telefono = in.readString();
    }

    public static final Creator<Usuario> CREATOR = new Creator<Usuario>() {
        @Override
        public Usuario createFromParcel(Parcel source) {
            return new Usuario(source);
        }

        @Override
        public Usuario[] newArray(int size) {
            return new Usuario[size];
        }
    };

    public void setID(long id) {
        this.ID = id;
    }

    public long getID() {
        return ID;
    }
}
