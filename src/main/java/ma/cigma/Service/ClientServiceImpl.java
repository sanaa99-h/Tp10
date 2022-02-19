package ma.cigma.Service;

import ma.cigma.DataAcessObject.IClientDao;
import ma.cigma.Modeless.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class ClientServiceImpl implements IClientService{
    @Autowired
    IClientDao dao;


    public ClientServiceImpl(){

        System.out.println("la couche Service");
    }

   public Client save(Client c) {
        System.out.println("Service");
        return dao.save(c);
    }
}
