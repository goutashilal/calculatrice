package vue;

import javax.swing.*;

public class PrincipalFrame extends JFrame {
    public   PrincipalFrame  ()
    {

        this.setSize(240, 350);
        this.setTitle("Calculette");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        buildComponenent();
        this.setVisible(true);
    }

    public void buildComponenent ()
    {
       CalculatorPanel   calculatorPanel = new CalculatorPanel();
       this.setContentPane(calculatorPanel);

    }
}
