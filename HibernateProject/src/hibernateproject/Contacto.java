/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernateproject;

import java.io.Serializable;

/**
 *
 * @author WuChenSEXT
 */
public class Contacto implements Serializable
{
    private long id;
    private String nombre;
    private String email;
    private String telefono;

    public Contacto()
    {
    }

    public Contacto(String nombre, String email, String telefono)
    {
        this.nombre = nombre;
        this.email = email;
        this.telefono = telefono;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public long getId()
    {
        return id;
    }

    private void setId(long id)
    {
        this.id = id;
    }

    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public String getTelefono()
    {
        return telefono;
    }

    public void setTelefono(String telefono)
    {
        this.telefono = telefono;
    }
}