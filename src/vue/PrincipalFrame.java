package vue;

import javax.swing.*;

public class PrincipalFrame extends JFrame implements Ivue{
    public   PrincipalFrame  ()
    {

        this.setSize(242, 320);
        this.setTitle("Calculette");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        buildComponent();
        this.setVisible(true);
    }


    @Override
    public void buildComponent() {
        CalculatorPanel   calculatorPanel = new CalculatorPanel();
        this.setContentPane(calculatorPanel);
    }
}
