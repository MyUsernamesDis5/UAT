package utilidades;

import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import java.awt.Dimension;

public class Libreria {
    
    public static void centrarFrame(JDesktopPane escritorio, JInternalFrame ventanaInterna) {
        Dimension desktopSize = escritorio.getSize();
        Dimension jInternalFrameSize = ventanaInterna.getSize();
        
        int width = (desktopSize.width - jInternalFrameSize.width) / 2;
        int height = (desktopSize.height - jInternalFrameSize.height) / 2;
        
        ventanaInterna.setLocation(width, height);
    }
}