package org.example.view;

import org.example.controller.ExpenseController;
import javafx.geometry.Insets;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;

import java.time.LocalDate;

public class MainView {
    private final ExpenseController controller = new ExpenseController();

    private final TextField descriptionField = new TextField();
    private final TextField valueField = new TextField();
    private final ComboBox<String> categoryBox = new ComboBox<>();
    private final DatePicker datePicker = new DatePicker(LocalDate.now());
    private final Button addButton = new Button("Adicionar");

    public VBox build(){
        descriptionField.setPromptText("Descrição");
        valueField.setPromptText("Valor");

        categoryBox.getItems().addAll(
                "Alimentação",
                "Transporte",
                "Lazer",
                "Outros"
        );

        categoryBox.setPromptText("Categoria");

        addButton.setOnAction(e -> handleAdd());

        VBox layout = new VBox(10,
                descriptionField,
                valueField,
                categoryBox,
                datePicker,
                addButton
        );
        return layout;

    }

    private void handleAdd(){
        String desc = descriptionField.getText();
        double value = Double.parseDouble(valueField.getText());
        String category = categoryBox.getValue();
        LocalDate date = datePicker.getValue();

        controller.addExpense(desc, value, category, date);

        descriptionField.clear();
        valueField.clear();
        categoryBox.setValue(null);
    }


}
