package com.api.controller;

import java.util.ArrayList;

import com.api.model.Contacto;


public class ControladorContactos {
    ArrayList<Contacto> contactos = new ArrayList<Contacto>();
    int idContacto=0;

    public void crearContacto(Contacto tempo)
    {
        tempo.setId(idContacto);
        idContacto++;
        contactos.add(tempo);         
    }

    public Contacto leerContacto(int id)
    {
        Contacto buscado= new Contacto(0,"nf","nf");
        for(Contacto tempo:contactos )
        {
            if(tempo.getId()==id)
            {
                buscado=tempo;
            }
        }
        return buscado;
    }

    public ArrayList<Contacto> leerContactos()
    {
        return contactos;
    }

    public void editarContacto(Contacto tempo)
    {
        for(int i=0;i<contactos.size();i++)
        {
            if(tempo.getId()==contactos.get(i).getId())
            {
                contactos.set(i,tempo);
            }
        }
    }

    public int elimarContacto(int id)
    {
        int flag=0;
        for(int i=0;i<contactos.size();i++)
        {
            if(id==contactos.get(i).getId())
            {
                contactos.remove(i);
                flag=1;
            }
        }
        return flag;
    }
}
