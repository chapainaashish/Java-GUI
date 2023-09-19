package Theory;

import java.applet.Applet;
import java.awt.Graphics;

public class AppletLifeCycle extends Applet {

    // Initialization
    public void init() {
        // Initialization code here
    }

    // Start
    public void start() {
        // Start any threads or processes here
    }

    // User Interaction
    public void paint(Graphics g) {
        // Drawing code here
    }

    public void update(Graphics g) {
        // Avoid flickering by double buffering
    }

    // Stop
    public void stop() {
        // Stop any ongoing processes or threads here
    }

    // Cleanup
    public void destroy() {
        // Clean up resources here
    }
}

