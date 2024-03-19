/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package mg.ituflavien.tpcustomerappflavienrakotoarison.jsf;

import jakarta.inject.Named;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Inject;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;  
import mg.ituflavien.tpcustomerappflavienrakotoarison.entity.Customer;
import mg.ituflavien.tpcustomerappflavienrakotoarison.service.CustomerManager;

/**
 *
 * @author flavi
 * Backing bean de la page customerList.xhtml.
 */
@Named(value = "customerBean")
@ViewScoped
public class CustomerBean implements Serializable {
    private List<Customer> customerList;  
    @Inject  
    private CustomerManager customerManager;

    /**
     * Creates a new instance of CustomerBean
     */
    public CustomerBean() {
    }
    
    /** 
   * Retourne la liste des clients pour affichage dans une DataTable.
     * @return La liste des clients.
   */  
    public List<Customer> getCustomers() {
      if (customerList == null) {
        customerList = customerManager.getAllCustomers();
      }
      return customerList;
    }  
}
