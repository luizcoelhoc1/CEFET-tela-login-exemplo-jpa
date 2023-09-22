/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplojpa;

import controller.LoginJpaController;
import controller.PerfilJpaController;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author alunos
 */
public class DAO {
    private LoginJpaController loginDAO;
    private PerfilJpaController perfilDAO;

    public DAO() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("ExemploJPAPU");
        loginDAO = new LoginJpaController(emf);
        perfilDAO = new PerfilJpaController(emf);
    }

    public LoginJpaController getLoginDAO() {
        return loginDAO;
    }

    public void setLoginDAO(LoginJpaController loginDAO) {
        this.loginDAO = loginDAO;
    }

    public PerfilJpaController getPerfilDAO() {
        return perfilDAO;
    }

    public void setPerfilDAO(PerfilJpaController perfilDAO) {
        this.perfilDAO = perfilDAO;
    }
    
    
    
}
