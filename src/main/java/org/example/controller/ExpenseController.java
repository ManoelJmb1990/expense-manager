package org.example.controller;

import org.example.model.Expense;
import org.example.service.ExpenseService;

import java.time.LocalDate;
import java.util.List;



public class ExpenseController {

    private ExpenseService service;

    public ExpenseController(){
        this.service = new ExpenseService();
    }

    public void addExpense(String description, double value, String category, LocalDate date){
        Expense expense = new Expense(description, value, category, date);
        service.addExpense(expense);
    }
    public List<Expense> getExpenses(){
        return service.getAllExpenses();
    }
    public double getTotal(){
        return service.getTotal();
    }

}
