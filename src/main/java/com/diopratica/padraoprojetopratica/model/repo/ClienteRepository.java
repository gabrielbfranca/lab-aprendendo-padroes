package com.diopratica.padraoprojetopratica.model.repo;

import com.diopratica.padraoprojetopratica.model.Cliente;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Long> {

}
