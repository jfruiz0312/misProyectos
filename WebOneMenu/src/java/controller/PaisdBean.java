
package controller;

import dao.PaisDao;
import impl.PaisDaoImp;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.faces.model.SelectItem;
import modelo.Paises;

@Named(value = "paisdBean")
@RequestScoped
public class PaisdBean implements Serializable{

    private List<SelectItem>listPaises;
    private Paises paise;
    
    public PaisdBean() {
        paise = new Paises();
    }

    public Paises getPaise() {
        return paise;
    }

    public void setPaise(Paises paise) {
        this.paise = paise;
    }

    public List<SelectItem> getListPaises() {
        
        this.listPaises= new ArrayList<SelectItem>();
        PaisDao pDao= new PaisDaoImp();
        List<Paises> p =pDao.listaPaies();
        listPaises.clear();
        
        for (Paises paises : p) {
            SelectItem paisItem= new SelectItem(paises.getIdPais(), paises.getNombrePais());
            this.listPaises.add(paisItem);
        }
        return listPaises;
    }
    
    
}
