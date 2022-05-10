/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.rafaelcosta.library.persistence;

import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;

/**
 *
 * @author rafaelcosta
 */
public class JPAUtil {
    private static final EntityManagerFactory EMF = Persistence.createEntityManagerFactory("default");
    
    public static EntityManager getEntityManager(){
        return EMF.createEntityManager();
    }
}
