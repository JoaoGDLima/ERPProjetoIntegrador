package model.util;

import java.awt.Dimension;
import javax.swing.JInternalFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;


public class unit {
    public static void setPositionCenter(JInternalFrame pInternalFrame){
        Dimension wDimension = pInternalFrame.getDesktopPane().getSize();
        pInternalFrame.setLocation((wDimension.width - pInternalFrame.getSize().width) / 2, 
                                   (wDimension.height - pInternalFrame.getSize().height) /2);
    }
    
    public static void setPositionRight(JInternalFrame pInternalFrame){
        Dimension wDimension = pInternalFrame.getDesktopPane().getSize();
        pInternalFrame.setLocation((wDimension.width- pInternalFrame.getSize().width), 
                                   0);
    }
}
