package com.diopratica.padraoprojetopratica.service;

import com.diopratica.padraoprojetopratica.model.Expense;

public interface ExpenseService {
    void addExpense(Expense expense);
    void updateExpense(Long id, Expense expense);
    void deleteExpense(Long id);
    Expense findExpenseById(Long id);
    Iterable<Expense> findAllExpenseByClienteId(Long id);

}
