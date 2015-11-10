package com.cameo;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/**
 * Created by Cameo on 10/27/2015.
 */
public class PetSurvey extends JFrame{
    private JPanel rootPanel;
    private JCheckBox dogCheckBox;
    private JCheckBox catCheckBox;
    private JCheckBox fishCheckBox;
    private JButton submitButton;
    private JLabel surveyResultsLabel;

    private boolean hasDogs;
    private boolean hasCats;
    private boolean hasFish;

    protected PetSurvey(){
        super("Pet Survey");
        setContentPane(rootPanel);
        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        fishCheckBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                hasFish = fishCheckBox.isSelected();
            }
        });
        catCheckBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                hasCats = catCheckBox.isSelected();
            }
        });
        dogCheckBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                hasDogs = dogCheckBox.isSelected();
            }
        });
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String dog = (hasDogs) ? "a dog" : "no dogs";
                String cat = (hasCats) ? "a cat" : "no cats";
                String fish = (hasFish) ? "a fish" : "no fish";

                String surveyResult = "User has " + dog + " and " + cat + " and " + fish;

                surveyResultsLabel.setText(surveyResult);
            }
        });
    }
}
