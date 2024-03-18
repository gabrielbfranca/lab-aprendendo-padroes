package com.diopratica.padraoprojetopratica.model.repo;

import com.diopratica.padraoprojetopratica.model.Cliente;
import com.diopratica.padraoprojetopratica.model.Expense;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ExpenseRepository extends CrudRepository<Expense, Long> {
    List<Expense> findByCliente(Cliente cliente);

}
