package vue;

import model.OperateurEnum;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OperatorSectionPanel extends JPanel implements ActionListener {

    JLabel   screenLabel;

    public JLabel getScreenLabel() {
        return screenLabel;
    }

    public void setScreenLabel(JLabel screenLabel) {
        this.screenLabel = screenLabel;
    }

    OperatorSectionPanel()
    {
        this.setPreferredSize(new Dimension(55, 225));
        buildComponent ();
    }

    public   void buildComponent ()
    {
        Dimension buttonDimension = new Dimension(50, 40);
        for (OperateurEnum   ope: OperateurEnum.values())
        {
            JButton  button= new JButton(ope.getSymbole()+"");
            button.setPreferredSize(buttonDimension);
            button.addActionListener(this);
            this.add(button);
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
