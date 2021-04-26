package vue;

import javax.swing.*;
import java.awt.*;

public class ScreenSectionPanel extends JPanel {

    JLabel  labelScree;
    public ScreenSectionPanel()
    {
        labelScree=new JLabel("0");
        labelScree.setHorizontalAlignment(JLabel.RIGHT);
        labelScree.setPreferredSize(new Dimension(220, 20));
        this.setPreferredSize(new Dimension(220, 30));
    }


public   void buildComponent ()
{
    this.add(labelScree);
    this.setBorder(BorderFactory.createLineBorder(Color.black));
}

}
