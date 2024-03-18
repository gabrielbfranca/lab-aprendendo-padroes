package com.diopratica.padraoprojetopratica.model.repo;

import com.diopratica.padraoprojetopratica.model.Endereco;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecoRepository extends CrudRepository<Endereco, String> {

}
