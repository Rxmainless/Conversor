package ui;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import conversores.*;

import java.util.HashMap;
import java.util.Map;

public class ConversorApp extends Application {

    private Map<String, Conversor> conversores;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        inicializarConversores();

        primaryStage.setTitle("Conversor de Medidas");

        VBox vbox = new VBox();
        vbox.setSpacing(10);

        ComboBox<String> comboBox = new ComboBox<>();
        comboBox.getItems().addAll(
                "Metros para Kilometros",
                "Kilometros para Metros",
                "Metros para Milhas",
                "Milhas para Metros",
                "Centimetros para Metros",
                "Metros para Centimetros",
                "Polegadas para Metros",
                "Metros para Polegadas"
        );

        TextField inputField = new TextField();
        inputField.setPromptText("Digite o valor a ser convertido");

        Button convertButton = new Button("Converter");

        Label resultLabel = new Label();

        convertButton.setOnAction(e -> {
            String selectedConversion = comboBox.getValue();
            String inputValue = inputField.getText();

            try {
                double valor = Double.parseDouble(inputValue);
                Conversor conversor = conversores.get(selectedConversion);
                if (conversor != null) {
                    double resultado = conversor.converter(valor);
                    resultLabel.setText(String.format("%.4f %s são %.4f", valor, conversor.getUnidades(), resultado));
                } else {
                    resultLabel.setText("Selecione uma conversão válida.");
                }
            } catch (NumberFormatException ex) {
                resultLabel.setText("Digite um valor numérico válido.");
            }
        });

        vbox.getChildren().addAll(comboBox, inputField, convertButton, resultLabel);

        Scene scene = new Scene(vbox, 400, 200);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void inicializarConversores() {
        conversores = new HashMap<>();
        conversores.put("Metros para Kilometros", new MetrosParaKilometros());
        conversores.put("Kilometros para Metros", new KilometrosParaMetros());
        conversores.put("Metros para Milhas", new MetrosParaMilhas());
        conversores.put("Milhas para Metros", new MilhasParaMetros());
        conversores.put("Centimetros para Metros", new CentimetrosParaMetros());
        conversores.put("Metros para Centimetros", new MetrosParaCentimetros());
        conversores.put("Polegadas para Metros", new PolegadasParaMetros());
        conversores.put("Metros para Polegadas", new MetrosParaPolegadas());
    }
}
