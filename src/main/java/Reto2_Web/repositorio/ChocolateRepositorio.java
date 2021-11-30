/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reto2_Web.repositorio;

import Reto2_Web.interfaces.InterfaceChocolate;
import Reto2_Web.modelo.Inventario;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author USUARIO
 */
@Repository
public class ChocolateRepositorio {
    @Autowired
    private InterfaceChocolate repository;

    public List<Inventario> getAll() {
        return repository.findAll();
    }

    public Optional<Inventario> getClothe(String reference) {
        return repository.findById(reference);
    }
    public Inventario create(Inventario clothe) {
        return repository.save(clothe);
    }

    public void update(Inventario clothe) {
        repository.save(clothe);
    }
    
    public void delete(Inventario clothe) {
        repository.delete(clothe);
    }
}
