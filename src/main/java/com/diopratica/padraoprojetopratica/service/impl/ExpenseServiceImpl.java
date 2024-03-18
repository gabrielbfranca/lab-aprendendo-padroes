package com.diopratica.padraoprojetopratica.service.impl;

import com.diopratica.padraoprojetopratica.model.Expense;
import com.diopratica.padraoprojetopratica.model.repo.ClienteRepository;
import com.diopratica.padraoprojetopratica.model.repo.ExpenseRepository;
import com.diopratica.padraoprojetopratica.service.ExpenseService;
import org.springframework.beans.factory.annotation.Autowired;

public class ExpenseServiceImpl implements ExpenseService {
    @Autowired
    private ExpenseRepository expenseRepository;
    @Autowired
    private ClienteRepository clienteRepository;

    @Override
    public void addExpense(Expense expense) {
        expenseRepository.save(expense);
    }
    @Override
    public void updateExpense(Long id, Expense expense) {
        expenseRepository.save(expense);
    }
    @Override
    public void deleteExpense(Long id) {
        expenseRepository.deleteById(id);
    }
    @Override
    public Expense findExpenseById(Long id) {
        return expenseRepository.findById(id).orElse(null);
    }
    @Override
    public Iterable<Expense> findAllExpenseByClienteId(Long id) {
        return expenseRepository.findByCliente(clienteRepository.findById(id).orElse(null));
    }
}
