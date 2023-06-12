import java.applet.Applet;
import java.awt.Graphics;

public class MyApplet extends Applet {
    public void paint(Graphics g) {
        g.drawString("Hello, Applet!", 20, 20);
    }
}

/*
<html>
  <body>
    <applet code="MyApplet.class" width="200" height="200"></applet>
  </body>
</html>
*/


/*
Passing Parameter to applet

1.java

import java.applet.Applet;
import java.awt.Graphics;

public class MyApplet extends Applet {
    private String param1;
    private String param2;

    public void init() {
        param1 = getParameter("param1");
        param2 = getParameter("param2");
    }

    public void paint(Graphics g) {
        g.drawString(param1 + ", " + param2 + "!", 20, 20);
    }
}

2.html
<html>
  <body>
    <applet code="MyApplet.class" width="200" height="200">
      <param name="param1" value="Hello">
      <param name="param2" value="World">
    </applet>
  </body>
</html>

 */