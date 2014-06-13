
package com.utpl.cajeroat.service;


public interface Cajero {

    
    
    void retirar(Integer idCustomer, double amount);
    
    
    void transferir(Integer idCustomer, double amount);
    
}
