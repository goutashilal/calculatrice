package vue;

import javax.swing.*;
import java.awt.*;

public class ScreenPanel extends JPanel {
JLabel   screenLabel;

    public JLabel getScreenLabel() {
        return screenLabel;
    }

    public void setScreenLabel(JLabel screenLabel) {
        this.screenLabel = screenLabel;
    }

    public ScreenPanel()
{
    Font police = new Font("Arial", Font.BOLD, 20);
    screenLabel  = new JLabel("0");
    screenLabel.setFont(police);
    screenLabel.setHorizontalAlignment(JLabel.RIGHT);
    screenLabel.setPreferredSize(new Dimension(220, 20));
    this.setPreferredSize(new Dimension(220, 30));
    setBorder(BorderFactory.createLineBorder(Color.blue));
    add(screenLabel);




}

    public   void buildComponent ()
    {

        add(screenLabel);
    }


}
