package ma.cigma.DataAcessObject;

import ma.cigma.Modeless.Client;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;

@Repository
public class ClientDaoImpl implements IClientDao{


    @PersistenceContext
    private EntityManager entitymanager;
    @Override

    public Client save(Client p) {
 entitymanager.persist(p);
return null;
    }
    public ClientDaoImpl() {
        System.out.println("creation bean dao");
    }
}





