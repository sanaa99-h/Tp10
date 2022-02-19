package ma.cigma.Presentation;

import ma.cigma.Modeless.Client;
import ma.cigma.Service.IClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller("ctrl1")
public class ClientControllers {
    @Autowired
    IClientService service;



    public void setService(IClientService service) {
        System.out.println("la couche presentation");
        this.service = service;
    }

  public  Client save(Client c){
        System.out.println("Presentation");
        return service.save(c);
    }
}
