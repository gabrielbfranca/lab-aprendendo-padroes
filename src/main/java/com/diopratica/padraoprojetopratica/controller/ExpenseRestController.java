package com.diopratica.padraoprojetopratica.controller;

import com.diopratica.padraoprojetopratica.model.Cliente;
import com.diopratica.padraoprojetopratica.model.Expense;
import com.diopratica.padraoprojetopratica.service.ExpenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("expenses")
public class ExpenseRestController {
    @Autowired
    private ExpenseService expenseService;

    @GetMapping
    public ResponseEntity<Iterable<Expense>> findByCliente(Cliente cliente) {
        return ResponseEntity.ok(expenseService.findAllExpenseByClienteId(cliente.getId()));
    }
    @PostMapping
    public ResponseEntity<Expense> insertExpense(@RequestBody Expense expense) {
        expenseService.addExpense(expense);
        return ResponseEntity.ok(expense);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Expense> atualizarExpense(@PathVariable Long id, @RequestBody Expense expense) {
        expenseService.updateExpense(id, expense);
        return ResponseEntity.ok(expense);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarExpense(@PathVariable Long id) {
        expenseService.deleteExpense(id);
        return ResponseEntity.ok().build();
    }
}
