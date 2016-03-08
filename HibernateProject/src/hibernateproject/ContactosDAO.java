/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernateproject;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List; 
/**
 *
 * @author WuChenSEXT
 */
public class ContactosDAO
{  
    private Session sesion; 
    private Transaction tx;  

    public long guardaContacto(Contacto contacto) throws HibernateException 
    { 
        long id = 0;  

        try 
        { 
            iniciaOperacion(); 
            id = (Long) sesion.save(contacto); 
            tx.commit(); 
        } catch (HibernateException he) 
        { 
            manejaExcepcion(he); 
            throw he; 
        } finally 
        { 
            if (sesion!= null) {
                sesion.close(); 
            }
        }  

        return id; 
    }  

    public void actualizaContacto(Contacto contacto) throws HibernateException 
    { 
        try 
        { 
            iniciaOperacion(); 
            sesion.update(contacto); 
            tx.commit(); 
        } catch (HibernateException he) 
        { 
            manejaExcepcion(he); 
            throw he; 
        } finally 
        { 
            if (sesion!= null) {
                sesion.close(); 
            }
        } 
    }  

    public void eliminaContacto(Contacto contacto) throws HibernateException 
    { 
        try 
        { 
            iniciaOperacion(); 
            sesion.delete(contacto); 
            tx.commit(); 
        } catch (HibernateException he) 
        { 
            manejaExcepcion(he); 
            throw he; 
        } finally 
        { 
            if (sesion!= null) {
                sesion.close(); 
            }
        } 
    }  

    public Contacto obtenContacto(long idContacto) throws HibernateException 
    { 
        Contacto contacto = null;  
        try 
        { 
            iniciaOperacion(); 
            contacto = (Contacto) sesion.get(Contacto.class, idContacto); 
        } finally 
        { 
            if (sesion!= null) {
                sesion.close(); 
            }
        }  

        return contacto; 
    }  

    public List<Contacto> obtenListaContactos() throws HibernateException 
    { 
        List<Contacto> listaContactos = null;  

        try 
        { 
            iniciaOperacion(); 
            listaContactos = sesion.createQuery("from Contacto").list(); 
        } finally 
        { 
            if (sesion!= null) {
                sesion.close(); 
            }
        }  

        return listaContactos; 
    }  

    private void iniciaOperacion() throws HibernateException 
    { 
        sesion = HibernateUtil.getSessionFactory().openSession(); 
        tx = sesion.beginTransaction(); 
    }  

    private void manejaExcepcion(HibernateException he) throws HibernateException 
    { 
        tx.rollback(); 
        throw new HibernateException("Ocurrió un error en la capa de acceso a datos", he); 
    } 
}
