import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class CalculatorController implements ActionListener {
    private final CalculatorView view;
    private final CalculatorModel model;

    public CalculatorController(CalculatorView view, CalculatorModel model) {
        this.view = view;
        this.model = model;
        view.btnAdd.addActionListener(this);
        view.btnSub.addActionListener(this);
        view.btnMul.addActionListener(this);
        view.btnDiv.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            double a = Double.parseDouble(view.txtNum1.getText().trim());
            double b = Double.parseDouble(view.txtNum2.getText().trim());
            double result;

            if (e.getSource() == view.btnAdd) {
                result = model.add(a, b);
            } else if (e.getSource() == view.btnSub) {
                result = model.subtract(a, b);
            } else if (e.getSource() == view.btnMul) {
                result = model.multiply(a, b);
            } else if (e.getSource() == view.btnDiv) {
                result = model.divide(a, b);
            } else {
                return;
            }

            view.txtResult.setText(String.valueOf(result));
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(view,
                    "Please enter valid numbers in both fields.",
                    "Invalid input", JOptionPane.WARNING_MESSAGE);
        } catch (ArithmeticException ex) {
            JOptionPane.showMessageDialog(view, ex.getMessage(),
                    "Calculation error", JOptionPane.WARNING_MESSAGE);
        }
    }
}
