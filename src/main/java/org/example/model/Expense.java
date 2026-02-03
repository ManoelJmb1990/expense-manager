package org.example.model;
import java.time.LocalDate;


public class Expense {
    private String description;
    private double value;
    private String category;
    private LocalDate date;

    public Expense(String description, double value, String category, LocalDate date){
        this.description = description;
        this.value = value;
        this.category = category;
        this.date = date;
    }

    public String getDescription(){
        return description;
    }
    public double getValue(){
        return value;

    }
    public String getCategory(){
        return category;
    }
    public LocalDate getDate(){
        return date;
    }



}
