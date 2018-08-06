package model;

import java.awt.Dimension;
import javax.swing.JInternalFrame;


public class unit {
    public static void setPositionCenter(JInternalFrame pInternalFrame){
        Dimension wDimension = pInternalFrame.getDesktopPane().getSize();
        pInternalFrame.setLocation((wDimension.width - pInternalFrame.getSize().width) / 2, 
                                   (wDimension.height - pInternalFrame.getSize().height) /2);
    }
}
