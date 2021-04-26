package vue;

import model.AdditionalSymbolEnum;
import model.AdditionalSymbole2Enum;
import model.NumberEnum;
import utilities.FormuleUtilities;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NumberSectionPanel extends JPanel implements ActionListener,Ivue {


    JLabel   screenLabel;
    public NumberSectionPanel()
    {
        this.setPreferredSize(new Dimension(165, 225));
        buildComponent ();
    }

    public JLabel getScreenLabel() {
        return screenLabel;
    }

    public void setScreenLabel(JLabel screenLabel) {
        this.screenLabel = screenLabel;
    }

    @Override
    public void buildComponent ()
    {
        Dimension buttonDimension = new Dimension(50, 44);

        for ( AdditionalSymbole2Enum symb:AdditionalSymbole2Enum.values() )
        {
            JButton   buttonSymb= new JButton(symb.getSymbole()+"");
            buttonSymb.setPreferredSize(buttonDimension);
            add(buttonSymb);
            buttonSymb.addActionListener(this);
        }

        for ( NumberEnum   nbr:NumberEnum.values() )
        {
            JButton   buttonNbr= new JButton(nbr.getNumberChar()+"");
            buttonNbr.setPreferredSize(buttonDimension);
            add(buttonNbr);
            buttonNbr.addActionListener(this);
        }

        for ( AdditionalSymbolEnum symb:AdditionalSymbolEnum.values() )
        {
            JButton   buttonSymb= new JButton(symb.getSymbol()+"");
            buttonSymb.setPreferredSize(buttonDimension);
            add(buttonSymb);
            buttonSymb.addActionListener(this);
        }

    }

    @Override
    public void actionPerformed(ActionEvent e) {
         if ( screenLabel!=null)
         {
            if (e.getSource() instanceof  JButton)
            {

                JButton  button= (JButton) e.getSource();
                String   caseValue =button.getText();
                if (caseValue.equals("C"))
                {
                    screenLabel.setText("0");
                    System.out.println(" Reset Formula = "
                            + screenLabel.getText());
                }
                else if (caseValue.equals("="))
                {
                    try {
                       double  finalResult=     FormuleUtilities.calculateFormula(screenLabel.getText());
                       screenLabel.setText(finalResult+"");
                    } catch (Throwable throwable) {
                        throwable.printStackTrace();
                        screenLabel.setText("Formule incorrect");
                    }
                }
                else
                {
                    StringBuilder str;
                    if (screenLabel.getText().equals("0"))
                        str = new StringBuilder();
                    else
                        str = new StringBuilder(screenLabel.getText());

                    str.append(caseValue);
                    screenLabel.setText(str.toString());
                    System.out.println("Formula = "
                            + str.toString());

                }

            }
         }
    }
}
