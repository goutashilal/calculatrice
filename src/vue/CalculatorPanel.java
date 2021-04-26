package vue;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class CalculatorPanel extends JPanel  implements Ivue{


    public   CalculatorPanel()
    {
        this.setLayout(new BorderLayout());
        setBorder(new EmptyBorder(2,1,2,1));
        buildComponent();
    }



    @Override
    public void buildComponent() {
        ScreenPanel  screenPanel= new ScreenPanel();
        add(screenPanel,BorderLayout.NORTH);
        NumberSectionPanel  numberSectionPanel= new NumberSectionPanel();
        JLabel screenLabel = screenPanel.getScreenLabel();
        numberSectionPanel.setScreenLabel(screenLabel);
        add(numberSectionPanel,BorderLayout.CENTER);
        OperatorSectionPanel  operatorSectionPanel= new OperatorSectionPanel();
        operatorSectionPanel.setScreenLabel(screenLabel);
        add(operatorSectionPanel,BorderLayout.EAST);
    }
}
