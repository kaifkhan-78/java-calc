# Java Swing Calculator

A small desktop calculator built with Java Swing and the MVC (Model–View–Controller) pattern.

## Features

- Addition, subtraction, multiplication, and division
- Separate view, controller, and calculation model
- Simple Swing interface

## Requirements

- JDK 17 or later (a recent JDK should also work)

## Run

From the repository root:

```bash
javac Main.java CalculatorView.java CalculatorController.java CalculatorModel.java
java Main
```

## Structure

- `Main.java`: wires the MVC components together
- `CalculatorView.java`: Swing controls and layout
- `CalculatorController.java`: button events and input parsing
- `CalculatorModel.java`: arithmetic operations

## Notes / next steps

The current UI uses absolute positioning for simplicity. Follow-up improvements should include friendly handling of invalid numeric input, explicit divide-by-zero feedback, and automated tests for the model.
