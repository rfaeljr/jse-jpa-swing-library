package br.com.rafaelcosta.library.persistence;

import javax.persistence.EntityManager;
import br.com.rafaelcosta.library.entity.Author;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author rafaelcosta
 */
/*
    All entity will have your correspondents Persitence class
*/
public class AuthorPersistence {
    
    public static boolean save(List<Author> listOfAuthors) {
        boolean flag = false;
        // Create the EntityManager
        EntityManager em = JPAUtil.getEntityManager();
        //open transaction for control
        em.getTransaction().begin();
        
        for (Author obj : listOfAuthors) {
            //update, verify if object storage id from database
            if (obj.getId() != null) {
                em.merge(obj);
                flag = true;
            } //else insert command is actioned
            else {
                em.persist(obj);
                flag = true;
            }
        }
        //finished a transaction confirmed in database the operation
        em.getTransaction().commit();
        em.close();
        
        //return a flag for visual stack for control of de messages
        return flag;
    }
    
    public static List<Author> getFindAuthors(String document, String name) {
        EntityManager em = JPAUtil.getEntityManager();
        Query query = em.createQuery("select a from Author a where a.documentNumber like :document and  a.name like :name  ");
        
        
        if( document.replace(".", "").replace("-", "").trim().length() == 0  ){
            query.setParameter("document", "%%");
        }
        else{
            query.setParameter("document", "%"+document+"%");
        }       
        query.setParameter("name", "%" + name + "%");
                   
        //Validate input for search user, if nothing was digited then return only ten registers from database
        //Optimizing the resource of the database
        if( document.replace(".", "").replace("-", "").trim().length() == 0 && name.length() == 0 ){
            query.setMaxResults(10);  
        }
     
        return query.getResultList();
        
    }
    
    public static boolean delete(List<Author> listOfAuthors) {
        boolean flag = false;
        // Create the EntityManager
        EntityManager em = JPAUtil.getEntityManager();
        
        em.getTransaction().begin();
        
        for (Author obj : listOfAuthors) {
            //update
            if (obj.getId() != null) {
                em.remove( em.getReference(Author.class, obj.getId()) );
                flag = true;
            }
        }
        em.getTransaction().commit();
        em.close();
        
        return flag;
    }

}
