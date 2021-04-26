package vue;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import java.awt.*;

public class ScreenPanel extends JPanel implements  Ivue {
    public JLabel   screenLabel;
    public   boolean  formulaIsCalculate;


    public ScreenPanel()
{

    screenLabel  = new JLabel("0");
    screenLabel.setFont(new Font("Arial", Font.BOLD, 15));
    screenLabel.setHorizontalAlignment(JLabel.RIGHT);
    screenLabel.setPreferredSize(new Dimension(222, 23));
    this.setPreferredSize(new Dimension(225, 32));
  Border  border = BorderFactory.createLineBorder(Color.blue);
    setBorder(new CompoundBorder(
            BorderFactory.createLineBorder(Color.blue),
            BorderFactory.createEmptyBorder(1,1,1,1)));

    add(screenLabel);


}
    @Override
    public   void buildComponent ()
    {

        add(screenLabel);
    }

    public JLabel getScreenLabel() {
        return screenLabel;
    }

    public void setScreenLabel(JLabel screenLabel) {
        this.screenLabel = screenLabel;
    }
    public boolean isFormulaIsCalculate() {
        return formulaIsCalculate;
    }

    public void setFormulaIsCalculate(boolean formulaIsCalculate) {
        this.formulaIsCalculate = formulaIsCalculate;
    }
}
